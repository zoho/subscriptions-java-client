
package com.zoho.zs.client.api.net;

public class QueryParams extends GenericParams
{
	public void add(String key, String value)
	{
		qParams.put(key, value);
	}
}
