
package com.zoho.zs.client.api.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zoho.zs.client.api.exception.ZSAPIException;
import com.zoho.zs.client.api.net.RequestUtil;
import com.zoho.zs.client.api.net.Resource;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Payload extends Resource
{

	String eventId;

	String productName;

	String eventType;

	Date eventTime;

	Data data;

	public String getEventId()
	{
		return eventId;
	}

	public void setEventId(String eventId)
	{
		this.eventId = eventId;
	}

	public String getProductName()
	{
		return productName;
	}

	public void setProductName(String productName)
	{
		this.productName = productName;
	}

	public String getEventType()
	{
		return eventType;
	}

	public void setEventType(String eventType)
	{
		this.eventType = eventType;
	}

	public Date getEventTime()
	{
		return eventTime;
	}

	public void setEventTime(Date eventTime)
	{
		this.eventTime = eventTime;
	}

	public Data getData()
	{
		return data;
	}

	public void setData(Data data)
	{
		this.data = data;
	}

	public static Payload getInstance(String json) throws ZSAPIException
	{
		ObjectMapper mapper = RequestUtil.getMapper();
		try
		{
			return mapper.readValue(json, Payload.class);
		}
		catch (Exception e)
		{
			throw new ZSAPIException(e);
		}

	}

	@JsonIgnoreProperties(ignoreUnknown = true)
	public static class Data
	{
		Subscription subscription;

		Payment payment;

		public Subscription getSubscription()
		{
			return subscription;
		}

		public void setSubscription(Subscription subscription)
		{
			this.subscription = subscription;
		}

		public Payment getPayment()
		{
			return payment;
		}

		public void setPayment(Payment payment)
		{
			this.payment = payment;
		}

	}
}
