
package com.zoho.zs.client.api.net;

import java.util.List;
import java.util.Map;

public class Response
{
	private int httpStatus;

	private Object body;

	private boolean error;

	private Map<String, List<String>> headerFields;

	public Response(int code, Object b, Map<String, List<String>> headerFields)
	{
		this.httpStatus = code;
		this.error = (this.httpStatus < 200 || this.httpStatus > 299);
		this.body = b;
		this.headerFields = headerFields;
	}

	public int getHttpStatus()
	{
		return httpStatus;
	}

	public boolean isError()
	{
		return this.error;
	}

	public Object getBody()
	{
		return body;
	}

	public Map<String, List<String>> getHeaderFields()
	{
		return headerFields;
	}

}
