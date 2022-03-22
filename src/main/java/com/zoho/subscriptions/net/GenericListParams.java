
package com.zoho.zs.client.api.net;

public class GenericListParams extends GenericParams
{
	private static GenericListParams defaultParams = null;

	public GenericListParams()
	{
		setPage(1);
		setPerPage(200);// TODO Auto-generated constructor stub
	}

	public void setPage(int page)
	{
		qParams.put("page", page);
	}

	public void setPerPage(int per_page)
	{
		qParams.put("per_page", per_page);
	}

	public static GenericListParams getDefaults()
	{
		if (defaultParams == null)
		{
			defaultParams = new GenericListParams();
		}
		return defaultParams;
	}
}
