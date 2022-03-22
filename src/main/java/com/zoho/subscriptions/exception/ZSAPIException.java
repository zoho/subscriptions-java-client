

package com.zoho.zs.client.api.exception;

public class ZSAPIException extends Exception
{
	private int code = -1;

	public ZSAPIException(Throwable e)
	{
		super(e);
	}

	public ZSAPIException(String message)
	{
		super(message);
	}

	public ZSAPIException(int c, String message)
	{
		super(message);
		this.code = c;
	}

	public ZSAPIException(String message, Throwable e)
	{
		super(message, e);
	}

	public int getCode()
	{
		return this.code;
	}
}
