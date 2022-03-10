
package com.zoho.zs.client.api.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.zoho.zs.client.api.exception.ZSAPIException;
import com.zoho.zs.client.api.net.GenericListParams;
import com.zoho.zs.client.api.net.ListResponse;
import com.zoho.zs.client.api.net.Resource;
import com.zoho.zs.client.api.net.ResourceUtil;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Coupon extends Resource
{
	String name;

	String description;

	Integer maxRedemption;

	String expiryAt;

	String couponCode;

	String type;

	String discountBy;

	BigDecimal discountValue;

	String productId;

	String applyToPlans;

	List<Plan> plans;

	String applyToAddons;

	List<Addon> addons;

	@JsonIgnore
	String couponId;

	@JsonIgnore
	String status;

	@JsonIgnore
	Integer redemptionCount;

	@JsonIgnore
	Date createdTime;

	@JsonIgnore
	Date updatedTime;

	Integer duration;

	public static Coupon retrieve(String id) throws ZSAPIException
	{
		return ResourceUtil.process(RequestMethod.GET, instancePath(Coupon.class, id), Coupon.class);
	}

	public static ListResponse<Coupon> list() throws ZSAPIException
	{
		return list(GenericListParams.getDefaults());
	}

	public static ListResponse<Coupon> list(GenericListParams params) throws ZSAPIException
	{
		return ResourceUtil.list(RequestMethod.GET, classPath(Coupon.class), Coupon.class, params);
	}

	public static Coupon create(Coupon coupon) throws ZSAPIException
	{
		return ResourceUtil.process(RequestMethod.POST, classPath(Coupon.class), Coupon.class, coupon);
	}

	public static Coupon update(Coupon coupon, String id) throws ZSAPIException
	{
		return ResourceUtil.process(RequestMethod.PUT, instancePath(Coupon.class, id), Coupon.class, coupon);
	}

	public static void markAsActive(String id) throws ZSAPIException
	{
		ResourceUtil.process(RequestMethod.POST, instancePath(Coupon.class, id) + "/markasactive", Coupon.class);
	}

	public static void markAsInactive(String id) throws ZSAPIException
	{
		ResourceUtil.process(RequestMethod.POST, instancePath(Coupon.class, id) + "/markasinactive", Coupon.class);
	}

	public static void delete(String id) throws ZSAPIException
	{
		ResourceUtil.process(RequestMethod.DELETE, instancePath(Coupon.class, id), Coupon.class);
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return name;
	}

	public void setCouponCode(String couponCode)
	{
		this.couponCode = couponCode;
	}

	public String getCouponCode()
	{
		return couponCode;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

	public String getDescription()
	{
		return description;
	}

	public void setProductId(String productId)
	{
		this.productId = productId;
	}

	public String getProductId()
	{
		return productId;
	}

	public void setType(String type)
	{
		this.type = type;
	}

	public String getType()
	{
		return type;
	}

	public void setDiscountBy(String discountBy)
	{
		this.discountBy = discountBy;
	}

	public String getDiscountBy()
	{
		return discountBy;
	}

	public void setDiscountValue(BigDecimal discountValue)
	{
		this.discountValue = discountValue;
	}

	public BigDecimal getDiscountValue()
	{
		return discountValue;
	}

	public void setApplyToPlans(String applyToPlans)
	{
		this.applyToPlans = applyToPlans;
	}

	public String getApplyToPlans()
	{
		return applyToPlans;
	}

	public void setPlans(List<Plan> plans)
	{
		this.plans = plans;
	}

	public List<Plan> getPlans()
	{
		return plans;
	}

	public void setApplyToAddons(String applyToAddons)
	{
		this.applyToAddons = applyToAddons;
	}

	public String getApplyToAddons()
	{
		return applyToAddons;
	}

	public void setAddons(List<Addon> addons)
	{
		this.addons = addons;
	}

	public List<Addon> getAddons()
	{
		return addons;
	}

	public void setMaxRedemption(Integer maxRedemption)
	{
		this.maxRedemption = maxRedemption;
	}

	public Integer getMaxRedemption()
	{
		return maxRedemption;
	}

	public void setExpiryAt(String expiryAt)
	{
		this.expiryAt = expiryAt;
	}

	public String getExpiryAt()
	{
		return expiryAt;
	}

	@JsonProperty
	public void setCouponId(String couponId)
	{
		this.couponId = couponId;
	}

	@JsonIgnore
	public String getCouponId()
	{
		return couponId;
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
	public void setRedemptionCount(Integer redemptionCount)
	{
		this.redemptionCount = redemptionCount;
	}

	@JsonIgnore
	public Integer getRedemptionCount()
	{
		return redemptionCount;
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

	@JsonIgnore
	public Date getUpdatedTime()
	{
		return updatedTime;
	}

	public void setDuration(Integer duration)
	{
		this.duration = duration;
	}

	public Integer getDuration()
	{
		return duration;
	}

	@JsonIgnoreProperties(ignoreUnknown = true)
	public static class Plan extends Resource
	{
		String planCode;

		@JsonIgnore
		String name;

		public void setPlanCode(String planCode)
		{
			this.planCode = planCode;
		}

		public String getPlanCode()
		{
			return planCode;
		}

		@JsonProperty
		public void setName(String name)
		{
			this.name = name;
		}

		@JsonIgnore
		public String getName()
		{
			return name;
		}

	}

	@JsonIgnoreProperties(ignoreUnknown = true)
	public static class Addon extends Resource
	{
		public Addon()
		{
		}

		String addonCode;

		@JsonIgnore
		String name;

		public void setAddonCode(String addonCode)
		{
			this.addonCode = addonCode;
		}

		public String getAddonCode()
		{
			return addonCode;
		}

		@JsonProperty
		public void setName(String name)
		{
			this.name = name;
		}

		@JsonIgnore
		public String getName()
		{
			return name;
		}

	}
}