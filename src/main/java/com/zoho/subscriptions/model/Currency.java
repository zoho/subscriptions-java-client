
package com.zoho.zs.client.api.model;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.zoho.zs.client.api.exception.ZSAPIException;
import com.zoho.zs.client.api.net.GenericListParams;
import com.zoho.zs.client.api.net.ListResponse;
import com.zoho.zs.client.api.net.Resource;
import com.zoho.zs.client.api.net.ResourceUtil;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Currency extends Resource
{

	String currencyCode;

	String currencySymbol;

	Integer pricePrecision;

	String currencyFormat;

	@JsonIgnore
	String currencyId;

	@JsonIgnore
	String currencyName;

	@JsonIgnore
	Boolean isBaseCurrency;

	@JsonIgnore
	BigDecimal exchangeRate;

	@JsonIgnore
	String effectiveDate;

	public static ListResponse<Currency> list() throws ZSAPIException
	{
		return list(GenericListParams.getDefaults());
	}

	public static ListResponse<Currency> list(GenericListParams params) throws ZSAPIException
	{
		return ResourceUtil.list(RequestMethod.GET, getSettingsPath() + classPath(Currency.class), Currency.class, params);
	}

	public String getCurrencyCode()
	{
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode)
	{
		this.currencyCode = currencyCode;
	}

	public String getCurrencySymbol()
	{
		return currencySymbol;
	}

	public void setCurrencySymbol(String currencySymbol)
	{
		this.currencySymbol = currencySymbol;
	}

	public Integer getPricePrecision()
	{
		return pricePrecision;
	}

	public void setPricePrecision(Integer pricePrecision)
	{
		this.pricePrecision = pricePrecision;
	}

	public String getCurrencyFormat()
	{
		return currencyFormat;
	}

	public void setCurrencyFormat(String currencyFormat)
	{
		this.currencyFormat = currencyFormat;
	}

	@JsonIgnore
	public String getCurrencyId()
	{
		return currencyId;
	}

	@JsonProperty
	public void setCurrencyId(String currencyId)
	{
		this.currencyId = currencyId;
	}

	@JsonIgnore
	public String getCurrencyName()
	{
		return currencyName;
	}

	@JsonProperty
	public void setCurrencyName(String currencyName)
	{
		this.currencyName = currencyName;
	}

	@JsonIgnore
	public Boolean getIsBaseCurrency()
	{
		return isBaseCurrency;
	}

	@JsonProperty
	public void setIsBaseCurrency(Boolean isBaseCurrency)
	{
		this.isBaseCurrency = isBaseCurrency;
	}

	@JsonIgnore
	public BigDecimal getExchangeRate()
	{
		return exchangeRate;
	}

	@JsonProperty
	public void setExchangeRate(BigDecimal exchangeRate)
	{
		this.exchangeRate = exchangeRate;
	}

	@JsonIgnore
	public String getEffectiveDate()
	{
		return effectiveDate;
	}

	@JsonProperty
	public void setEffectiveDate(String effectiveDate)
	{
		this.effectiveDate = effectiveDate;
	}

}
