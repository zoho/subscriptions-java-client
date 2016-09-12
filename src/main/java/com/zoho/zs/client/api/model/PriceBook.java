
package com.zoho.zs.client.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.zoho.zs.client.api.exception.ZSAPIException;
import com.zoho.zs.client.api.net.GenericListParams;
import com.zoho.zs.client.api.net.ListResponse;
import com.zoho.zs.client.api.net.Resource;
import com.zoho.zs.client.api.net.ResourceUtil;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PriceBook extends Resource
{

	@JsonIgnore
	String pricebookId;

	String name;

	String description;

	String currencyId;

	@JsonIgnore
	String currencyCode;

	@JsonIgnore
	String status;

	public static ListResponse<PriceBook> list() throws ZSAPIException
	{
		return list(GenericListParams.getDefaults());
	}

	public static ListResponse<PriceBook> list(GenericListParams params) throws ZSAPIException
	{
		return ResourceUtil.list(RequestMethod.GET, classPath(PriceBook.class), PriceBook.class, params);
	}

	public static PriceBook create(PriceBook priceBook) throws ZSAPIException
	{
		return ResourceUtil.process(RequestMethod.POST, classPath(PriceBook.class), PriceBook.class, priceBook);
	}

	@JsonIgnore
	public String getPricebookId()
	{
		return pricebookId;
	}

	@JsonProperty
	public void setPricebookId(String pricebookId)
	{
		this.pricebookId = pricebookId;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

	public String getCurrencyId()
	{
		return currencyId;
	}

	public void setCurrencyId(String currencyId)
	{
		this.currencyId = currencyId;
	}

	@JsonIgnore
	public String getCurrencyCode()
	{
		return currencyCode;
	}

	@JsonProperty
	public void setCurrencyCode(String currencyCode)
	{
		this.currencyCode = currencyCode;
	}

	@JsonIgnore
	public String getStatus()
	{
		return status;
	}

	@JsonProperty
	public void setStatus(String status)
	{
		this.status = status;
	}

}
