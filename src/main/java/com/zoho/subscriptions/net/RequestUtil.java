
package com.zoho.zs.client.api.net;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Map;
import java.util.Map.Entry;
import java.util.logging.Logger;
import java.util.zip.GZIPInputStream;

import javax.naming.AuthenticationException;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.zoho.zs.client.api.exception.APIConnectionException;
import com.zoho.zs.client.api.exception.InvalidRequestException;
import com.zoho.zs.client.api.exception.ZSAPIException;
import com.zoho.zs.client.api.net.Resource.RequestMethod;

public class RequestUtil
{
	private static final Logger LOGGER = Logger.getLogger(RequestUtil.class.getName());

	private static ObjectMapper mapper = new ObjectMapper();
	static
	{
		mapper.setPropertyNamingStrategy(PropertyNamingStrategy.CAMEL_CASE_TO_LOWER_CASE_WITH_UNDERSCORES);
		mapper.setSerializationInclusion(Include.NON_NULL);
	}

	public static Response request(RequestMethod method, String path) throws ZSAPIException
	{
		return request(method, path, null, null, null);
	}

	public static Response request(RequestMethod method, String path, Resource classObj, Class clazz, GenericParams params) throws ZSAPIException
	{
		return execute(method, path, classObj, clazz, params);
	}

	private static Response execute(RequestMethod method, String path, Resource classObj, Class clazz, GenericParams params) throws ZSAPIException
	{
		HttpURLConnection connection = null;

		String url = String.format("%s/%s", ZSClient.getBaseUrl(), path);
		try
		{
			String queryStr = constructQuery(classObj, params);

			switch (method)
			{
				case GET:
				case DELETE:
				case OPTIONS:
					connection = createURLConnection(method, url, queryStr);
					break;
				case PUT:
				case POST:
					connection = createWriteConnection(method, url, queryStr);
					break;
			}
			return constructResponse(connection, clazz);

		}
		catch (IOException ioe)
		{
			LOGGER.severe("Unable to connect to " + url + " due to " + ioe);
			throw new APIConnectionException(String.format("Unable to connect %s", url), ioe);
		}
		catch (Exception e)
		{
			throw new ZSAPIException(e);
		}
		finally
		{
			if (connection != null)
			{
				connection.disconnect();
			}
		}
	}

	private static HttpURLConnection createURLConnection(RequestMethod method, String url, String qryStr) throws Exception
	{
		String reqUrl = String.format("%s?%s", url, qryStr);
		return createConnection(method, reqUrl);
	}

	private static HttpURLConnection createWriteConnection(RequestMethod method, String reqUrl, String qryStr) throws Exception
	{
		HttpURLConnection connection = createConnection(method, reqUrl);

		connection.setRequestProperty("Content-Type", "application/json");
		connection.setDoOutput(true);

		writeQueryString(connection, qryStr);

		return connection;
	}

	private static void writeQueryString(HttpURLConnection connection, String qryStr) throws IOException
	{
		OutputStream os = null;
		try
		{
			os = connection.getOutputStream();
			os.write(qryStr.getBytes(ZSClient.CHARSET));
		}
		finally
		{
			if (os != null)
			{
				os.close();
			}
		}
	}

	private static HttpURLConnection createConnection(RequestMethod method, String url) throws Exception
	{
		URL reqURL = new URL(url);
		HttpURLConnection connection = (HttpURLConnection) reqURL.openConnection();
		connection.setRequestMethod(method.name());

		//Connection Params
		connection.setConnectTimeout(300000); // 30 seconds
		connection.setReadTimeout(3000000); // 300 seconds
		connection.setUseCaches(false);

		//Connection Headers
		connection.setRequestProperty("Accept-Charset", ZSClient.CHARSET);
		connection.setRequestProperty("Accept", ZSClient.DEFAULT_ACCEPT_HEADER);
		connection.setRequestProperty("User-Agent", ZSClient.getUserAgentName());
		connection.setRequestProperty("Authorization", "Zoho-oauthtoken " + ZSClient.getOauthtoken());
		connection.setRequestProperty("X-com-zoho-subscriptions-organizationid", ZSClient.getOrganizationId());
		return connection;
	}

	private static Response constructResponse(HttpURLConnection conn, Class clazz) throws Exception
	{

		InputStream is = null;
		int resCode = conn.getResponseCode();
		Object body;

		try
		{
			if (resCode == 401)
			{
				throw new AuthenticationException();
			}
			is = (resCode >= 200 && resCode < 300) ? conn.getInputStream() : conn.getErrorStream();
			if ("gzip".equalsIgnoreCase(conn.getContentEncoding()))
			{
				is = new GZIPInputStream(is);
			}

			if (clazz == Response.class)
			{
				body = getByteArray(is);
			}
			else
			{
				InputStreamReader reader = new InputStreamReader(is, ZSClient.CHARSET);
				StringBuilder buffer = new StringBuilder();
				char[] bytes = new char[1024];
				int bytesRead;
				while ((bytesRead = reader.read(bytes, 0, bytes.length)) > 0)
				{
					buffer.append(bytes, 0, bytesRead);
				}
				body = buffer.toString();
			}
		}
		finally
		{
			if (is != null)
			{
				is.close();
			}
		}

		return new Response(resCode, body, conn.getHeaderFields());
	}

	private static String constructQuery(Resource classObj, GenericParams params) throws Exception
	{
		StringBuilder sb = new StringBuilder();

		if (classObj != null)
		{
			return generateJSONString(classObj);
		}

		if (params != null)
		{
			sb = constructParameters(sb, params);
		}
		String query = sb.toString();
		if (query.isEmpty())
		{
			return "";
		}
		return query.substring(1);
	}

	private static String generateJSONString(Resource classObj) throws Exception
	{
		return getMapper().writeValueAsString(classObj);
	}

	private static StringBuilder constructParameters(StringBuilder sb, GenericParams params) throws InvalidRequestException
	{
		Map<String, Object> queryMap = params.getQueryParams();
		for (Entry<String, Object> entry : queryMap.entrySet())
		{
			sb.append(encodeParam(entry.getKey(), entry.getValue().toString()));
		}

		return sb;
	}

	public static String encodeParam(String pName, String pValue) throws InvalidRequestException
	{
		try
		{
			return String.format("&%s=%s", URLEncoder.encode(pName, ZSClient.CHARSET), URLEncoder.encode(pValue, ZSClient.CHARSET));
		}
		catch (UnsupportedEncodingException e)
		{
			throw new InvalidRequestException("Unable to encode the parameters to " + ZSClient.CHARSET, e, pName);
		}
	}

	public static ObjectMapper getMapper()
	{
		return mapper;
	}

	private static byte[] getByteArray(InputStream is) throws Exception
	{
		if (is == null)
		{
			return null;
		}

		int size = 1024;
		byte[] byteBuff = new byte[size];

		int bytesRead = 0;

		ByteArrayOutputStream baos = null;

		byte[] lDataBytes = null;
		try
		{
			baos = new ByteArrayOutputStream(size * 2);
			while ((bytesRead = is.read(byteBuff)) != -1)
			{
				baos.write(byteBuff, 0, bytesRead);
			}
			lDataBytes = baos.toByteArray();
		}
		finally
		{
			if (is != null)
			{
				is.close();
			}

			if (baos != null)
			{
				baos.close();
			}
		}
		return lDataBytes;
	}
}
