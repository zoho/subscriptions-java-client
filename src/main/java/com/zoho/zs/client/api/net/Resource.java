
package com.zoho.zs.client.api.net;

public abstract class Resource
{
	public enum RequestMethod
	{
		GET, POST, PUT, DELETE, OPTIONS
	};

	public Resource()
	{
	}

	protected static String className(Class clazz)
	{
		String className = clazz.getSimpleName().toLowerCase();
		if (className.endsWith("y"))
		{
			className = className.substring(0, className.length() - 1) + "ie";
		}
		return className + "s";
	}

	protected static String instancePath(Class clazz, String id)
	{
		return String.format("%s/%s", classPath(clazz), id);
	}

	protected static String classPath(Class clazz)
	{
		return className(clazz);
	}

	protected static String getSettingsPath()
	{
		return "settings/";
	}
}
