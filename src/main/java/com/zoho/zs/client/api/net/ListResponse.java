
package com.zoho.zs.client.api.net;

import java.util.Collection;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.zoho.zs.client.api.exception.ZSAPIException;

public class ListResponse<T>
{
	private Collection<T> data;

	private PageContext pageContext;

	public <U> ListResponse(Response response, Class<U> clazz) throws ZSAPIException
	{
		construstListResponse(response, clazz);
	}

	private <U> void construstListResponse(Response response, Class<U> clazz) throws ZSAPIException
	{
		try
		{
			String dataNodeName = getDataNodeName(clazz);

			ObjectMapper mapper = RequestUtil.getMapper();
			JsonNode rootNode = mapper.readTree((String) response.getBody());
			JsonNode dataNode = rootNode.get(dataNodeName);

			JavaType type = TypeFactory.defaultInstance().constructParametricType(Collection.class, clazz);
			Collection<T> list = mapper.readValue(dataNode.toString(), type);
			this.data = list;

			JsonNode pageContextNode = rootNode.get("page_context");
			if (pageContextNode != null)
			{
				PageContext pageContext = mapper.readValue(pageContextNode.toString(), PageContext.class);
				this.pageContext = pageContext;
			}
		}
		catch (Exception e)
		{
			throw new ZSAPIException(e);
		}
	}

	public Collection<T> getData()
	{
		return data;
	}

	public PageContext getPageContext()
	{
		return pageContext;
	}

	public void setPageContext(PageContext pageContext)
	{
		this.pageContext = pageContext;
	}

	private static String getDataNodeName(Class clazz)
	{
		String nodeName = clazz.getSimpleName().toLowerCase();
		int length = nodeName.length();
		if (length <= 1)
		{
			return nodeName + "'s";
		}
		char lastLetter = nodeName.charAt(length - 1);
		char secondLast = nodeName.charAt(length - 2);
		if ("sxzo".indexOf(lastLetter) >= 0 || (lastLetter == 'h' && (secondLast == 's' || secondLast == 'c')))
		{
			return nodeName + "es";
		}
		if (lastLetter == 'y')
		{
			if ("aeiou".indexOf(secondLast) >= 0)
			{
				return nodeName + "s";
			}
			else
			{
				return nodeName.substring(0, length - 1) + "ies";
			}
		}
		return nodeName + "s";
	}
}
