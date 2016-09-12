
package com.zoho.zs.client.api.model;

import java.math.BigDecimal;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.zoho.zs.client.api.exception.ZSAPIException;
import com.zoho.zs.client.api.net.Resource;
import com.zoho.zs.client.api.net.ResourceUtil;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Estimate extends Resource
{
	String subscriptionId;
	String taxId;
	String taxName;
	BigDecimal taxPercentage;
	String taxExemptionId;
	String taxExemptionCode;
	String isTaxable;
	String taxAuthorityId;
	String taxAuthorityName;

	List<RecurringChargeItem> recurringChargeItems;
	List<RecurringTaxes> recurringTaxes;
	List<InitialTaxes> initialTaxes;
	BillingAddress billingAddress;
	BigDecimal recurringChargeTotal;
	String customerName;
	String email;
	List<RecurringApplicableCoupon> recurringApplicableCoupons;
	String salesPersonName;
	BigDecimal recurringDiscount;

	BigDecimal recurringChargeAmount;

	String invoiceId;
	String status;

	List<InitialChargeItem> initialChargeItems;

	String initialChargeDate;

	BigDecimal initialChargeTotal;

	List<InitialApplicableCoupon> initialApplicableCoupons;

	BigDecimal initialDiscount;

	List<CreditsItem> creditsItems;

	BigDecimal creditsTotal;

	BigDecimal initialChargeAmount;

	BigDecimal recurringChargeSubtotal;

	BigDecimal initialChargeSubtotal;

	String nextBillingAt;

	String cardMandatory;
	Boolean isDiscountBeforeTax;
	@JsonIgnore
	List<Gateway> paymentGateways;
	Boolean isBankAccountApplicable;

	String couponCode;

	public static Estimate estimate(Subscription subscription) throws ZSAPIException
	{
		return ResourceUtil.process(RequestMethod.POST, classPath(Subscription.class) + "/compute", Estimate.class, "subscription", subscription, null);
	}

	public void setSubscriptionId(String subscriptionId)
	{
		this.subscriptionId = subscriptionId;
	}

	public String getSubscriptionId()
	{
		return subscriptionId;
	}

	public String getStatus()
	{
		return status;
	}

	public void setStatus(String status)
	{
		this.status = status;
	}

	public void setRecurringChargeItems(List<RecurringChargeItem> recurringChargeItems)
	{
		this.recurringChargeItems = recurringChargeItems;
	}

	public List<RecurringChargeItem> getRecurringChargeItems()
	{
		return recurringChargeItems;
	}

	public void setRecurringTaxes(List<RecurringTaxes> recurringTaxes)
	{
		this.recurringTaxes = recurringTaxes;
	}

	public List<RecurringTaxes> getRecurringTaxes()
	{
		return recurringTaxes;
	}

	public void setInitialTaxes(List<InitialTaxes> initialTaxes)
	{
		this.initialTaxes = initialTaxes;
	}

	public List<InitialTaxes> getInitialTaxes()
	{
		return initialTaxes;
	}

	public void setRecurringChargeTotal(BigDecimal recurringChargeTotal)
	{
		this.recurringChargeTotal = recurringChargeTotal;
	}

	public BigDecimal getRecurringChargeTotal()
	{
		return recurringChargeTotal;
	}

	public void setRecurringApplicableCoupons(List<RecurringApplicableCoupon> recurringApplicableCoupons)
	{
		this.recurringApplicableCoupons = recurringApplicableCoupons;
	}

	public List<RecurringApplicableCoupon> getRecurringApplicableCoupons()
	{
		return recurringApplicableCoupons;
	}

	public void setRecurringDiscount(BigDecimal recurringDiscount)
	{
		this.recurringDiscount = recurringDiscount;
	}

	public BigDecimal getRecurringDiscount()
	{
		return recurringDiscount;
	}

	public void setRecurringChargeAmount(BigDecimal recurringChargeAmount)
	{
		this.recurringChargeAmount = recurringChargeAmount;
	}

	public BigDecimal getRecurringChargeAmount()
	{
		return recurringChargeAmount;
	}

	public void setInvoiceId(String invoiceId)
	{
		this.invoiceId = invoiceId;
	}

	public String getInvoiceId()
	{
		return invoiceId;
	}

	public void setInitialChargeItems(List<InitialChargeItem> initialChargeItems)
	{
		this.initialChargeItems = initialChargeItems;
	}

	public List<InitialChargeItem> getInitialChargeItems()
	{
		return initialChargeItems;
	}

	public void setInitialChargeDate(String initialChargeDate)
	{
		this.initialChargeDate = initialChargeDate;
	}

	public String getInitialChargeDate()
	{
		return initialChargeDate;
	}

	public void setInitialChargeTotal(BigDecimal initialChargeTotal)
	{
		this.initialChargeTotal = initialChargeTotal;
	}

	public BigDecimal getInitialChargeTotal()
	{
		return initialChargeTotal;
	}

	public void setInitialApplicableCoupons(List<InitialApplicableCoupon> initialApplicableCoupons)
	{
		this.initialApplicableCoupons = initialApplicableCoupons;
	}

	public List<InitialApplicableCoupon> getInitialApplicableCoupons()
	{
		return initialApplicableCoupons;
	}

	public void setInitialDiscount(BigDecimal initialDiscount)
	{
		this.initialDiscount = initialDiscount;
	}

	public BigDecimal getInitialDiscount()
	{
		return initialDiscount;
	}

	public void setCreditsItems(List<CreditsItem> creditsItems)
	{
		this.creditsItems = creditsItems;
	}

	public List<CreditsItem> getCreditsItems()
	{
		return creditsItems;
	}

	public void setCreditsTotal(BigDecimal creditsTotal)
	{
		this.creditsTotal = creditsTotal;
	}

	public BigDecimal getCreditsTotal()
	{
		return creditsTotal;
	}

	public void setInitialChargeAmount(BigDecimal initialChargeAmount)
	{
		this.initialChargeAmount = initialChargeAmount;
	}

	public BigDecimal getInitialChargeAmount()
	{
		return initialChargeAmount;
	}

	public BigDecimal getRecurringChargeSubtotal()
	{
		return recurringChargeSubtotal;
	}

	public void setRecurringChargeSubtotal(BigDecimal recurringChargeSubtotal)
	{
		this.recurringChargeSubtotal = recurringChargeSubtotal;
	}

	public BigDecimal getInitialChargeSubtotal()
	{
		return initialChargeSubtotal;
	}

	public void setInitialChargeSubtotal(BigDecimal initialChargeSubtotal)
	{
		this.initialChargeSubtotal = initialChargeSubtotal;
	}

	public void setNextBillingAt(String nextBillingAt)
	{
		this.nextBillingAt = nextBillingAt;
	}

	public String getNextBillingAt()
	{
		return nextBillingAt;
	}

	public void setBillingAddress(BillingAddress billingAddress)
	{
		this.billingAddress = billingAddress;
	}

	public BillingAddress getBillingAddress()
	{
		return billingAddress;
	}

	public void setCardMandatory(String cardMandatory)
	{
		this.cardMandatory = cardMandatory;
	}

	public String getCardMandatory()
	{
		return cardMandatory;
	}

	public void setCustomerName(String customerName)
	{
		this.customerName = customerName;
	}

	public String getCustomerName()
	{
		return customerName;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public String getEmail()
	{
		return email;
	}

	public void setIsDiscountBeforeTax(Boolean isDiscountBeforeTax)
	{
		this.isDiscountBeforeTax = isDiscountBeforeTax;
	}

	public Boolean getIsDiscountBeforeTax()
	{
		return isDiscountBeforeTax;
	}

	public String getTaxId()
	{
		return taxId;
	}

	public void setTaxId(String taxId)
	{
		this.taxId = taxId;
	}

	public String getTaxName()
	{
		return taxName;
	}

	public void setTaxName(String taxName)
	{
		this.taxName = taxName;
	}

	public BigDecimal getTaxPercentage()
	{
		return taxPercentage;
	}

	public void setTaxPercentage(BigDecimal taxPercentage)
	{
		this.taxPercentage = taxPercentage;
	}

	public String getTaxExemptionId()
	{
		return taxExemptionId;
	}

	public void setTaxExemptionId(String taxExemptionId)
	{
		this.taxExemptionId = taxExemptionId;
	}

	public String getTaxExemptionCode()
	{
		return taxExemptionCode;
	}

	public void setTaxExemptionCode(String taxExemptionCode)
	{
		this.taxExemptionCode = taxExemptionCode;
	}

	public String getIsTaxable()
	{
		return isTaxable;
	}

	public void setIsTaxable(String isTaxable)
	{
		this.isTaxable = isTaxable;
	}

	public String getTaxAuthorityId()
	{
		return taxAuthorityId;
	}

	public void setTaxAuthorityId(String taxAuthorityId)
	{
		this.taxAuthorityId = taxAuthorityId;
	}

	public String getTaxAuthorityName()
	{
		return taxAuthorityName;
	}

	public void setTaxAuthorityName(String taxAuthorityName)
	{
		this.taxAuthorityName = taxAuthorityName;
	}

	@JsonProperty
	public void setPaymentGateways(List<Gateway> paymentGateways)
	{
		this.paymentGateways = paymentGateways;
	}

	@JsonIgnore
	public List<Gateway> getPaymentGateways()
	{
		return paymentGateways;
	}

	@JsonProperty
	public void setSalesPersonName(String salesPersonName)
	{
		this.salesPersonName = salesPersonName;
	}

	@JsonIgnore
	public String getSalesPersonName()
	{
		return salesPersonName;
	}

	@JsonProperty
	public void setIsBankAccountApplicable(Boolean isBankAccountApplicable)
	{
		this.isBankAccountApplicable = isBankAccountApplicable;
	}

	@JsonIgnore
	public Boolean getIsBankAccountApplicable()
	{
		return isBankAccountApplicable;
	}

	public String getCouponCode()
	{
		return this.couponCode;
	}

	public void setCouponCode(String couponCode)
	{
		this.couponCode = couponCode;
	}

	@JsonIgnoreProperties(ignoreUnknown = true)
	public static class RecurringTaxes extends Resource
	{
		String taxId;
		String taxName;
		String taxAmount;

		public void setTaxID(String taxId)
		{
			this.taxId = taxId;
		}

		public String getTaxID()
		{
			return taxId;
		}

		public void setTaxName(String taxName)
		{
			this.taxName = taxName;
		}

		public String getTaxName()
		{
			return taxName;
		}

		public void setTaxAmount(String taxAmount)
		{
			this.taxAmount = taxAmount;
		}

		public String getTaxAmount()
		{
			return taxAmount;
		}
	}

	@JsonIgnoreProperties(ignoreUnknown = true)
	public static class InitialTaxes extends Resource
	{
		String taxId;
		String taxName;
		String taxAmount;

		public void setTaxID(String taxId)
		{
			this.taxId = taxId;
		}

		public String getTaxID()
		{
			return taxId;
		}

		public void setTaxName(String taxName)
		{
			this.taxName = taxName;
		}

		public String getTaxName()
		{
			return taxName;
		}

		public void setTaxAmount(String taxAmount)
		{
			this.taxAmount = taxAmount;
		}

		public String getTaxAmount()
		{
			return taxAmount;
		}
	}

	@JsonIgnoreProperties(ignoreUnknown = true)
	public static class RecurringChargeItem extends Resource
	{
		String name;

		BigDecimal price;
		String description;
		String taxId;
		String taxType;
		String taxName;
		BigDecimal taxPercentage;
		String taxExemptionId;
		String taxExemptionCode;
		String isTaxable;
		String productExemptionId;
		String productExemptionCode;

		public void setName(String name)
		{
			this.name = name;
		}

		public String getName()
		{
			return name;
		}

		@JsonProperty
		public void setItemDescription(String description)
		{
			this.description = description;
		}

		@JsonIgnore
		public String getItemDescription()
		{
			return description;
		}

		public void setPrice(BigDecimal price)
		{
			this.price = price;
		}

		public BigDecimal getPrice()
		{
			return price;
		}

		public void setTaxExemptionID(String taxExemptionId)
		{
			this.taxExemptionId = taxExemptionId;
		}

		public String getTaxExemptionID()
		{
			return taxExemptionId;
		}

		public void setTaxExemptionCode(String taxExemptionCode)
		{
			this.taxExemptionCode = taxExemptionCode;
		}

		public String getTaxExemptionCode()
		{
			return taxExemptionCode;
		}

		public void setProductExemptionID(String productExemptionId)
		{
			this.productExemptionId = productExemptionId;
		}

		public String getProductExemptionID()
		{
			return productExemptionId;
		}

		public void setProductExemptionCode(String productExemptionCode)
		{
			this.productExemptionCode = productExemptionCode;
		}

		public String getProductExemptionCode()
		{
			return productExemptionCode;
		}

		public void setIsTaxable(String isTaxable)
		{
			this.isTaxable = isTaxable;
		}

		public String getIsTaxable()
		{
			return isTaxable;
		}

		public void setTaxID(String taxId)
		{
			this.taxId = taxId;
		}

		public String getTaxID()
		{
			return taxId;
		}

		public void setTaxName(String taxName)
		{
			this.taxName = taxName;
		}

		public String getTaxName()
		{
			return taxName;
		}

		public void setTaxType(String taxType)
		{
			this.taxType = taxType;
		}

		public String getTaxType()
		{
			return taxType;
		}

		public void setTaxPercentage(BigDecimal taxPercentage)
		{
			this.taxPercentage = taxPercentage;
		}

		public BigDecimal getTaxPercentage()
		{
			return taxPercentage;
		}

	}

	@JsonIgnoreProperties(ignoreUnknown = true)
	public static class RecurringApplicableCoupon extends Resource
	{
		String couponCode;

		BigDecimal discountAmount;

		public void setCouponCode(String couponCode)
		{
			this.couponCode = couponCode;
		}

		public String getCouponCode()
		{
			return couponCode;
		}

		public void setDiscountAmount(BigDecimal discountAmount)
		{
			this.discountAmount = discountAmount;
		}

		public BigDecimal getDiscountAmount()
		{
			return discountAmount;
		}
	}

	@JsonIgnoreProperties(ignoreUnknown = true)
	public static class InitialChargeItem extends Resource
	{
		String name;
		String taxExemptionId;
		String taxExemptionCode;
		Boolean isTaxable;
		String productExemptionId;
		String productExemptionCode;
		BigDecimal price;
		String itemDescription;
		String taxId;
		String taxType;
		String taxName;
		BigDecimal taxPercentage;

		public void setName(String name)
		{
			this.name = name;
		}

		public String getName()
		{
			return name;
		}

		@JsonProperty
		public void setItemDescription(String itemDescription)
		{
			this.itemDescription = itemDescription;
		}

		@JsonIgnore
		public String getItemDescription()
		{
			return itemDescription;
		}

		public void setPrice(BigDecimal price)
		{
			this.price = price;
		}

		public BigDecimal getPrice()
		{
			return price;
		}

		public void setTaxExemptionID(String taxExemptionId)
		{
			this.taxExemptionId = taxExemptionId;
		}

		public String getTaxExemptionID()
		{
			return taxExemptionId;
		}

		public void setTaxExemptionCode(String taxExemptionCode)
		{
			this.taxExemptionCode = taxExemptionCode;
		}

		public String getTaxExemptionCode()
		{
			return taxExemptionCode;
		}

		public void setProductExemptionID(String productExemptionId)
		{
			this.productExemptionId = productExemptionId;
		}

		public String getProductExemptionID()
		{
			return productExemptionId;
		}

		public void setProductExemptionCode(String productExemptionCode)
		{
			this.productExemptionCode = productExemptionCode;
		}

		public String getProductExemptionCode()
		{
			return productExemptionCode;
		}

		public void setIsTaxable(Boolean isTaxable)
		{
			this.isTaxable = isTaxable;
		}

		public Boolean getIsTaxable()
		{
			return isTaxable;
		}

		public void setTaxID(String taxId)
		{
			this.taxId = taxId;
		}

		public String getTaxID()
		{
			return taxId;
		}

		public void setTaxName(String taxName)
		{
			this.taxName = taxName;
		}

		public String getTaxName()
		{
			return taxName;
		}

		public void setTaxType(String taxType)
		{
			this.taxType = taxType;
		}

		public String getTaxType()
		{
			return taxType;
		}

		public void setTaxPercentage(BigDecimal taxPercentage)
		{
			this.taxPercentage = taxPercentage;
		}

		public BigDecimal getTaxPercentage()
		{
			return taxPercentage;
		}
	}

	@JsonIgnoreProperties(ignoreUnknown = true)
	public static class InitialApplicableCoupon extends Resource
	{
		String couponCode;

		BigDecimal discountAmount;

		public void setCouponCode(String couponCode)
		{
			this.couponCode = couponCode;
		}

		public String getCouponCode()
		{
			return couponCode;
		}

		public void setDiscountAmount(BigDecimal discountAmount)
		{
			this.discountAmount = discountAmount;
		}

		public BigDecimal getDiscountAmount()
		{
			return discountAmount;
		}
	}

	@JsonIgnoreProperties(ignoreUnknown = true)
	public static class CreditsItem extends Resource
	{
		String name;

		BigDecimal price;

		public void setName(String name)
		{
			this.name = name;
		}

		public String getName()
		{
			return name;
		}

		public void setPrice(BigDecimal price)
		{
			this.price = price;
		}

		public BigDecimal getPrice()
		{
			return price;
		}
	}

	@JsonIgnoreProperties(ignoreUnknown = true)
	public static class Gateway extends Resource
	{
		@JsonIgnore
		String paymenGateway;

		@JsonIgnore
		Boolean isConfigured;
		@JsonIgnore
		Boolean isBankAccountEnabled;

		@JsonProperty
		public void setGatewayName(String paymenGateway)
		{
			this.paymenGateway = paymenGateway;
		}

		@JsonIgnore
		public String getGatewayName()
		{
			return paymenGateway;
		}

		@JsonProperty
		public void setIsConfigured(Boolean isConfigured)
		{
			this.isConfigured = isConfigured;
		}

		@JsonIgnore
		public Boolean getIsConfigured()
		{
			return isConfigured;
		}

		@JsonProperty
		public void setIsBankAccountEnabled(Boolean isBankAccountEnabled)
		{
			this.isBankAccountEnabled = isBankAccountEnabled;
		}

		@JsonIgnore
		public Boolean getIsBankAccountEnabled()
		{
			return isBankAccountEnabled;
		}
	}

	@JsonIgnoreProperties(ignoreUnknown = true)
	public static class BillingAddress extends Resource
	{
		String street;

		String city;

		String state;

		String zip;

		String country;

		String fax;

		public void setStreet(String street)
		{
			this.street = street;
		}

		public String getStreet()
		{
			return street;
		}

		public void setCity(String city)
		{
			this.city = city;
		}

		public String getCity()
		{
			return city;
		}

		public void setState(String state)
		{
			this.state = state;
		}

		public String getState()
		{
			return state;
		}

		public void setZip(String zip)
		{
			this.zip = zip;
		}

		public String getZip()
		{
			return zip;
		}

		public void setCountry(String country)
		{
			this.country = country;
		}

		public String getCountry()
		{
			return country;
		}

		public void setFax(String fax)
		{
			this.fax = fax;
		}

		public String getFax()
		{
			return fax;
		}
	}

}