
package com.zoho.zs.client.api.net;

import java.util.HashMap;
import java.util.Map;

public abstract class GenericParams
{
	protected Map<String, Object> qParams = new HashMap<String, Object>();

	public Map<String, Object> getQueryParams()
	{
		return this.qParams;
	}

	public void set(String key, Object value)
	{
		this.qParams.put(key, value);
	}
}
