
package com.zoho.zs.client.api.net;

import java.io.IOException;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zoho.zs.client.api.exception.ZSAPIException;
import com.zoho.zs.client.api.net.Resource.RequestMethod;

public class ResourceUtil
{
	public static <T> T process(RequestMethod method, String path, Class<T> clazz) throws ZSAPIException
	{
		return process(method, path, clazz, (Resource) null);
	}

	public static <T> ListResponse<T> list(RequestMethod method, String path, Class<T> clazz, GenericParams params) throws ZSAPIException
	{
		Response response = handleRequest(method, path, null, null, params);
		return new ListResponse<T>(response, clazz);
	}

	public static <T> T process(RequestMethod method, String path, Class<T> clazz, Resource classObj) throws ZSAPIException
	{
		return process(method, path, clazz, null, classObj, null);
	}

	public static <T> T process(RequestMethod method, String path, Class<T> clazz, GenericParams params) throws ZSAPIException
	{
		return process(method, path, clazz, null, null, params);
	}

	public static <T> T process(RequestMethod method, String path, Class<T> clazz, String className, Resource classObj, GenericParams params) throws ZSAPIException
	{
		Response response = handleRequest(method, path, classObj, clazz, params);
		if (method == RequestMethod.DELETE)
		{
			//No body
			return null;
		}

		try
		{
			Object body = response.getBody();
			if (!(body instanceof String))
			{
				return (T) response;
			}
			ObjectMapper mapper = RequestUtil.getMapper();
			JsonNode root = mapper.readTree((String) body);
			JsonNode dataNode = root.get(className != null ? className : clazz.getSimpleName().toLowerCase());
			if (dataNode == null)
			{
				return null;
			}
			return mapper.readValue(dataNode.toString(), clazz);
		}
		catch (Exception e)
		{
			throw new ZSAPIException(e);
		}
	}

	public static Response process(RequestMethod method, String path, GenericParams params) throws ZSAPIException
	{
		return handleRequest(method, path, null, null, params);

	}

	public static Response handleRequest(RequestMethod method, String path, Resource classObj, Class clazz, GenericParams params) throws ZSAPIException
	{
		Response response = RequestUtil.request(method, path, classObj, clazz, params);

		if (response.isError())
		{
			//Will throw Exception
			handleError(response);
		}
		return response;
	}

	private static void handleError(Response response) throws ZSAPIException
	{
		ResourceUtil.Error e = null;
		try
		{
			ObjectMapper mapper = RequestUtil.getMapper();
			e = mapper.readValue((String) response.getBody(), ResourceUtil.Error.class);
			throw new ZSAPIException(e.code, e.message);
		}
		catch (JsonProcessingException jsonex)
		{
			throw new ZSAPIException(jsonex);
		}
		catch (IOException ioe)
		{
			throw new ZSAPIException(ioe);
		}
	}

	@JsonIgnoreProperties(ignoreUnknown = true)
	private static class Error
	{
		@JsonProperty("code")
		int code;

		@JsonProperty("message")
		String message;

	}
}
