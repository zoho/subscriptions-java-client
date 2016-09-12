
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
public class Product extends Resource
{
	String name;

	String description;

	String redirectUrl;

	String emailIds;

	@JsonIgnore
	String productId;

	@JsonIgnore
	String status;

	@JsonIgnore
	Date createdTime;

	@JsonIgnore
	Date updatedTime;

	@JsonIgnore
	Integer plansCount;

	@JsonIgnore
	Integer addonsCount;

	@JsonIgnore
	Integer couponsCount;

	public static Product retrieve(String id) throws ZSAPIException
	{
		return ResourceUtil.process(RequestMethod.GET, instancePath(Product.class, id), Product.class);
	}

	public static ListResponse<Product> list() throws ZSAPIException
	{
		return list(GenericListParams.getDefaults());
	}

	public static ListResponse<Product> list(GenericListParams params) throws ZSAPIException
	{
		return ResourceUtil.list(RequestMethod.GET, classPath(Product.class), Product.class, params);
	}

	public static Product create(Product product) throws ZSAPIException
	{
		return ResourceUtil.process(RequestMethod.POST, classPath(Product.class), Product.class, product);
	}

	public static Product update(Product product, String id) throws ZSAPIException
	{
		return ResourceUtil.process(RequestMethod.PUT, instancePath(Product.class, id), Product.class, product);
	}

	public static Product markAsActive(String id) throws ZSAPIException
	{
		return ResourceUtil.process(RequestMethod.POST, instancePath(Product.class, id) + "/markasactive", Product.class);
	}

	public static Product markAsInactive(String id) throws ZSAPIException
	{
		return ResourceUtil.process(RequestMethod.POST, instancePath(Product.class, id) + "/markasinactive", Product.class);
	}

	public static void delete(String id) throws ZSAPIException
	{
		ResourceUtil.process(RequestMethod.DELETE, instancePath(Product.class, id), Product.class);
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return name;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

	public String getDescription()
	{
		return description;
	}

	public void setRedirectUrl(String redirectUrl)
	{
		this.redirectUrl = redirectUrl;
	}

	public String getRedirectUrl()
	{
		return redirectUrl;
	}
	
	public String getEmailIds() {
		return emailIds;
	}

	public void setEmailIds(String emailIds) {
		this.emailIds = emailIds;
	}

	@JsonProperty
	public void setProductId(String productId)
	{
		this.productId = productId;
	}

	@JsonIgnore
	public String getProductId()
	{
		return productId;
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
	public void setCreatedTime(Date createdTime)
	{
		this.createdTime = createdTime;
	}

	@JsonIgnore
	public Date getCreatedTime()
	{
		return createdTime;
	}

	@JsonProperty
	public void setUpdatedTime(Date updatedTime)
	{
		this.updatedTime = updatedTime;
	}

	@JsonIgnore
	public Date getUpdatedTime()
	{
		return updatedTime;
	}

	@JsonProperty
	public void setPlansCount(Integer plansCount)
	{
		this.plansCount = plansCount;
	}

	@JsonIgnore
	public Integer getPlansCount()
	{
		return plansCount;
	}

	@JsonProperty
	public void setAddonsCount(Integer addonsCount)
	{
		this.addonsCount = addonsCount;
	}

	@JsonIgnore
	public Integer getAddonsCount()
	{
		return addonsCount;
	}

	@JsonProperty
	public void setCouponsCount(Integer couponsCount)
	{
		this.couponsCount = couponsCount;
	}

	@JsonIgnore
	public Integer getCouponsCount()
	{
		return couponsCount;
	}
}