
package com.zoho.zs.client.api.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.zoho.zs.client.api.exception.ZSAPIException;
import com.zoho.zs.client.api.net.GenericListParams;
import com.zoho.zs.client.api.net.ListResponse;
import com.zoho.zs.client.api.net.Resource;
import com.zoho.zs.client.api.net.ResourceUtil;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Hostedpage extends Resource
{
	@JsonIgnore
	String hostedpageId;

	@JsonIgnore
	Date startsAt;

	@JsonIgnore
	String additionalParam;

	@JsonIgnore
	String status;

	@JsonIgnore
	String url;

	@JsonIgnore
	String action;

	@JsonIgnore
	Date expiringTime;

	@JsonIgnore
	Date createdTime;

	public static Hostedpage retrieve(String id) throws ZSAPIException
	{
		return ResourceUtil.process(RequestMethod.GET, instancePath(Hostedpage.class, id), Hostedpage.class);
	}

	public static ListResponse<Hostedpage> list() throws ZSAPIException
	{
		return list(GenericListParams.getDefaults());
	}

	public static ListResponse<Hostedpage> list(GenericListParams params) throws ZSAPIException
	{
		return ResourceUtil.list(RequestMethod.GET, classPath(Hostedpage.class), Hostedpage.class, params);
	}

	public static Hostedpage createSubscription(Subscription subscription) throws ZSAPIException
	{
		return ResourceUtil.process(RequestMethod.POST, classPath(Hostedpage.class) + "/newsubscription", Hostedpage.class, subscription);
	}

	public static Hostedpage updateSubscription(Subscription subscription) throws ZSAPIException
	{
		return ResourceUtil.process(RequestMethod.POST, classPath(Hostedpage.class) + "/updatesubscription", Hostedpage.class, subscription);
	}

	public static Hostedpage updateCard(Subscription subscription) throws ZSAPIException
	{
		return ResourceUtil.process(RequestMethod.POST, classPath(Hostedpage.class) + "/updatecard", Hostedpage.class, subscription);
	}

	public static Hostedpage reactivateSubscription(Subscription subscription) throws ZSAPIException
	{
		return ResourceUtil.process(RequestMethod.POST, classPath(Hostedpage.class) + "/updatesubscription", Hostedpage.class, subscription);
	}

	public static Hostedpage buyOneTimeAddon(Subscription subscription) throws ZSAPIException
	{
		return ResourceUtil.process(RequestMethod.POST, classPath(Hostedpage.class) + "/buyonetimeaddon", Hostedpage.class, subscription);
	}

	@JsonProperty
	public void setHostedpageId(String hostedpageId)
	{
		this.hostedpageId = hostedpageId;
	}

	@JsonIgnore
	public String getHostedpageId()
	{
		return hostedpageId;
	}

	@JsonProperty
	public void setStartsAt(Date startsAt)
	{
		this.startsAt = startsAt;
	}

	@JsonIgnore
	public Date getStartsAt()
	{
		return startsAt;
	}

	@JsonProperty
	public void setAdditionalParam(String additionalParam)
	{
		this.additionalParam = additionalParam;
	}

	@JsonIgnore
	public String getAdditionalParam()
	{
		return additionalParam;
	}

	@JsonProperty
	public void setStatus(String status)
	{
		this.status = status;
	}

	@JsonIgnore
	public String getStatus()
	{
		return status;
	}

	@JsonProperty
	public void setUrl(String url)
	{
		this.url = url;
	}

	@JsonIgnore
	public String getUrl()
	{
		return url;
	}

	@JsonProperty
	public void setAction(String action)
	{
		this.action = action;
	}

	@JsonIgnore
	public String getAction()
	{
		return action;
	}

	@JsonProperty
	public void setExpiringTime(Date expiringTime)
	{
		this.expiringTime = expiringTime;
	}

	@JsonIgnore
	public Date getExpiringTime()
	{
		return expiringTime;
	}

	@JsonProperty
	public void setCreatedTime(Date createdTime)
	{
		this.createdTime = createdTime;
	}

	@JsonIgnore
	public Date getCreatedTime()
	{
		return createdTime;
	}
}