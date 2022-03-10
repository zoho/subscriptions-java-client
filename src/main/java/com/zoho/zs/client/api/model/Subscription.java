
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
import com.zoho.zs.client.api.net.QueryParams;
import com.zoho.zs.client.api.net.Resource;
import com.zoho.zs.client.api.net.ResourceUtil;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Subscription extends Resource
{
	Customer customer;

	List<Contactperson> contactpersons;

	Card card;


	String cardId;

	Subscription.Plan plan;

	List<Subscription.Addon> addons;

	String couponCode;

	String referenceId;

	BigDecimal exchangeRate;

	String customerId;

	Boolean autoCollect;

	String startsAt;

	BigDecimal maxAmount;

	String subscriptionId;
	@JsonIgnore
	String taxId;

	@JsonIgnore
	String taxExemptionCode;

	@JsonIgnore
	String name;

	@JsonIgnore
	String status;

	BigDecimal amount;

	@JsonIgnore
	String initiatedAt;

	@JsonIgnore
	String trialStartsAt;

	@JsonIgnore
	String trialEndsAt;

	@JsonIgnore
	String currentTermStartsAt;

	@JsonIgnore
	String currentTermEndsAt;

	@JsonIgnore
	String nextBillingAt;

	@JsonIgnore
	String lastBillingAt;

	@JsonIgnore
	String cancelledAt;

	@JsonIgnore
	String expiresAt;

	@JsonIgnore
	String nextRetryAt;

	@JsonIgnore
	Integer interval;

	@JsonIgnore
	String intervalUnit;

	@JsonIgnore
	Date createdTime;

	@JsonIgnore
	Date updatedTime;

	@JsonIgnore
	String productId;

	@JsonIgnore
	List<Note> notes;

	String description;

	String renewalAt;
	@JsonIgnore
	String childInvoiceId;
	String additionalParam;
	Boolean prorate;
	Boolean endOfTerm;

	@JsonIgnore
	String source;

	@JsonIgnore
	String activatedAt;

	@JsonIgnore
	Integer trialRemainingDays;

	@JsonIgnore
	String currencyCode;

	@JsonIgnore
	String currencySymbol;

	@JsonIgnore
	String productName;

	@JsonIgnore
	Coupon coupon;

	BankAccount bankAccount;
	List<Subscription.Customfield> customFields;
	Integer paymentTerms;
	String paymentTermsLabel;
	String salespersonName;

	@JsonIgnore
	String gatewayTransactionId;
	@JsonIgnore
	String gatewayErrorMessage;
	@JsonIgnore
	String reference;

	@JsonIgnore
	List<Tax> taxes;
	@JsonIgnore
	String isTaxable;
	@JsonIgnore
	String taxName;
	@JsonIgnore
	BigDecimal taxPercentage;
	@JsonIgnore
	String taxAuthorityId;
	@JsonIgnore
	String taxAuthorityName;
	@JsonIgnore
	String taxExemptionId;

	List<PaymentGateway> paymentGateways;

	public static Subscription retrieve(String id) throws ZSAPIException
	{
		return ResourceUtil.process(RequestMethod.GET, instancePath(Subscription.class, id), Subscription.class);
	}

	public static ListResponse<Subscription> list() throws ZSAPIException
	{
		return list(GenericListParams.getDefaults());
	}

	public static ListResponse<Subscription> list(GenericListParams params) throws ZSAPIException
	{
		return ResourceUtil.list(RequestMethod.GET, classPath(Subscription.class), Subscription.class, params);
	}

	public static ListResponse<Activity> getRecentActivities(String subscriptionId) throws ZSAPIException
	{
		return getRecentActivities(subscriptionId, GenericListParams.getDefaults());
	}

	public static ListResponse<Activity> getRecentActivities(String subscriptionId, GenericListParams params) throws ZSAPIException
	{
		return ResourceUtil.list(RequestMethod.GET, instancePath(Subscription.class, subscriptionId) + "/recentactivities", Activity.class, params);
	}

	public static Subscription create(Subscription subscription) throws ZSAPIException
	{
		subscription.setSubscriptionId(null);
		return ResourceUtil.process(RequestMethod.POST, classPath(Subscription.class), Subscription.class, subscription);
	}

	public static Subscription update(Subscription subscription, String id) throws ZSAPIException
	{
		subscription.setSubscriptionId(null);
		return ResourceUtil.process(RequestMethod.PUT, instancePath(Subscription.class, id), Subscription.class, subscription);
	}

	public static Subscription autoCharge(Subscription subscription, String id) throws ZSAPIException
	{
		subscription.setSubscriptionId(null);
		return ResourceUtil.process(RequestMethod.POST, instancePath(Subscription.class, id) + "/autocollect", Subscription.class, subscription);
	}

	public static Invoice buyOnetimeAddon(Subscription subscription, String id) throws ZSAPIException
	{
		subscription.setSubscriptionId(null);
		return ResourceUtil.process(RequestMethod.POST, instancePath(Subscription.class, id) + "/buyonetimeaddon", Invoice.class, subscription);
	}

	public static Subscription cancelAtEnd(String id) throws ZSAPIException
	{
		QueryParams params = new QueryParams();
		params.set("cancel_at_end", true);
		return ResourceUtil.process(RequestMethod.POST, instancePath(Subscription.class, id) + "/cancel", Subscription.class, params);
	}

	public static Subscription cancelNow(String id) throws ZSAPIException
	{
		QueryParams params = new QueryParams();
		params.set("cancel_at_end", false);
		return ResourceUtil.process(RequestMethod.POST, instancePath(Subscription.class, id) + "/cancel", Subscription.class, params);
	}

	public static Subscription updateCard(Subscription subscription, String id) throws ZSAPIException
	{
		subscription.setSubscriptionId(null);
		return ResourceUtil.process(RequestMethod.POST, instancePath(Subscription.class, id) + "/card", Subscription.class, subscription);
	}

	public static Subscription updateBankAccount(Subscription subscription, String id) throws ZSAPIException
	{
		subscription.setSubscriptionId(null);
		return ResourceUtil.process(RequestMethod.POST, instancePath(Subscription.class, id) + "/bankaccount", Subscription.class, subscription);
	}

	public static Invoice charge(Subscription subscription, String id) throws ZSAPIException
	{
		subscription.setSubscriptionId(null);
		return ResourceUtil.process(RequestMethod.POST, instancePath(Subscription.class, id) + "/charge", Invoice.class, subscription);
	}

	public static Subscription updateContactperson(Subscription subscription, String id) throws ZSAPIException
	{
		subscription.setSubscriptionId(null);
		return ResourceUtil.process(RequestMethod.POST, instancePath(Subscription.class, id) + "/contactpersons", Subscription.class, subscription);
	}

	public static Subscription addCoupon(String subscriptionId, String couponCode) throws ZSAPIException
	{
		return ResourceUtil.process(RequestMethod.POST, instancePath(Subscription.class, subscriptionId) + "/" + instancePath(Coupon.class, couponCode), Subscription.class);
	}

	public static Subscription reactivate(String id) throws ZSAPIException
	{
		return ResourceUtil.process(RequestMethod.POST, instancePath(Subscription.class, id) + "/reactivate", Subscription.class);
	}

	public static Subscription changeRenewal(Subscription subscription, String id) throws ZSAPIException
	{
		return ResourceUtil.process(RequestMethod.POST, instancePath(Subscription.class, id) + "/postpone", Subscription.class, subscription);
	}

	public static Subscription deleteCoupon(String subscriptionId, String couponCode) throws ZSAPIException
	{
		return ResourceUtil.process(RequestMethod.DELETE, instancePath(Subscription.class, subscriptionId) + "/" + instancePath(Coupon.class, couponCode), Subscription.class);
	}

	public void setCustomer(Customer customer)
	{
		this.customer = customer;
	}

	public Customer getCustomer()
	{
		return customer;
	}

	public void setContactpersons(List<Contactperson> contactpersons)
	{
		this.contactpersons = contactpersons;
	}

	public List<Contactperson> getContactpersons()
	{
		return contactpersons;
	}

	public void setCard(Card card)
	{
		this.card = card;
	}

	public Card getCard()
	{
		return card;
	}

	public void setCardId(String cardId)
	{
		this.cardId = cardId;
	}

	public String getCardId()
	{
		return cardId;
	}

	public void setPlan(Subscription.Plan plan)
	{
		this.plan = plan;
	}

	public Subscription.Plan getPlan()
	{
		return plan;
	}

	public void setAddons(List<Subscription.Addon> addons)
	{
		this.addons = addons;
	}

	public List<Subscription.Addon> getAddons()
	{
		return addons;
	}

	public void setCouponCode(String couponCode)
	{
		this.couponCode = couponCode;
	}

	public String getCouponCode()
	{
		return couponCode;
	}

	public void setReferenceId(String referenceId)
	{
		this.referenceId = referenceId;
	}

	public String getReferenceId()
	{
		return referenceId;
	}

	public void setSubscriptionId(String subscriptionId)
	{
		this.subscriptionId = subscriptionId;
	}

	public String getSubscriptionId()
	{
		return subscriptionId;
	}

	@JsonIgnore
	public String getTaxId()
	{
		return taxId;
	}

	@JsonProperty
	public void setTaxId(String taxId)
	{
		this.taxId = taxId;
	}

	@JsonIgnore
	public String getTaxExemptionCode()
	{
		return taxExemptionCode;
	}

	@JsonProperty
	public void setTaxExemptionCode(String taxExemptionCode)
	{
		this.taxExemptionCode = taxExemptionCode;
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

	public void setAmount(BigDecimal amount)
	{
		this.amount = amount;
	}

	public BigDecimal getAmount()
	{
		return amount;
	}

	@JsonProperty
	public void setInitiatedAt(String initiatedAt)
	{
		this.initiatedAt = initiatedAt;
	}

	@JsonIgnore
	public String getInitiatedAt()
	{
		return initiatedAt;
	}

	@JsonProperty
	public void setTrialStartsAt(String trialStartsAt)
	{
		this.trialStartsAt = trialStartsAt;
	}

	@JsonIgnore
	public String getTrialStartsAt()
	{
		return trialStartsAt;
	}

	@JsonProperty
	public void setTrialEndsAt(String trialEndsAt)
	{
		this.trialEndsAt = trialEndsAt;
	}

	@JsonIgnore
	public String getTrialEndsAt()
	{
		return trialEndsAt;
	}

	@JsonProperty
	public void setCurrentTermStartsAt(String currentTermStartsAt)
	{
		this.currentTermStartsAt = currentTermStartsAt;
	}

	@JsonIgnore
	public String getCurrentTermStartsAt()
	{
		return currentTermStartsAt;
	}

	@JsonProperty
	public void setCurrentTermEndsAt(String currentTermEndsAt)
	{
		this.currentTermEndsAt = currentTermEndsAt;
	}

	@JsonIgnore
	public String getCurrentTermEndsAt()
	{
		return currentTermEndsAt;
	}

	@JsonProperty
	public void setNextBillingAt(String nextBillingAt)
	{
		this.nextBillingAt = nextBillingAt;
	}

	@JsonIgnore
	public String getNextBillingAt()
	{
		return nextBillingAt;
	}

	@JsonProperty
	public void setNextRetryAt(String nextRetryAt)
	{
		this.nextRetryAt = nextRetryAt;
	}

	@JsonIgnore
	public String getNextRetryAt()
	{
		return nextRetryAt;
	}

	@JsonProperty
	public void setCancelledAt(String cancelledAt)
	{
		this.cancelledAt = cancelledAt;
	}

	@JsonIgnore
	public String getCancelledAt()
	{
		return cancelledAt;
	}

	@JsonProperty
	public void setExpiresAt(String expiresAt)
	{
		this.expiresAt = expiresAt;
	}

	@JsonIgnore
	public String getExpiresAt()
	{
		return expiresAt;
	}

	@JsonProperty
	public void setInterval(Integer interval)
	{
		this.interval = interval;
	}

	@JsonIgnore
	public Integer getInterval()
	{
		return interval;
	}

	@JsonProperty
	public void setIntervalUnit(String intervalUnit)
	{
		this.intervalUnit = intervalUnit;
	}

	@JsonIgnore
	public String getIntervalUnit()
	{
		return intervalUnit;
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
	public void setNotes(List<Note> notes)
	{
		this.notes = notes;
	}

	@JsonIgnore
	public List<Note> getNotes()
	{
		return notes;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

	public String getDescription()
	{
		return description;
	}

	public List<Tax> getTaxes()
	{
		return taxes;
	}

	public void setTaxes(List<Tax> taxes)
	{
		this.taxes = taxes;
	}

	public void setRenewalAt(String renewalAt)
	{
		this.renewalAt = renewalAt;
	}

	public String getRenewalAt()
	{
		return renewalAt;
	}

	@JsonIgnore
	public String getChildInvoiceId()
	{
		return childInvoiceId;
	}

	@JsonProperty
	public void setChildInvoiceId(String childInvoiceId)
	{
		this.childInvoiceId = childInvoiceId;
	}

	@JsonIgnore
	public String getAdditionalParam()
	{
		return additionalParam;
	}

	@JsonProperty
	public void setAdditionalParam(String additionalParam)
	{
		this.additionalParam = additionalParam;
	}

	@JsonIgnore
	public String getLastBillingAt()
	{
		return lastBillingAt;
	}

	@JsonProperty
	public void setLastBillingAt(String lastBillingAt)
	{
		this.lastBillingAt = lastBillingAt;
	}

	@JsonIgnore
	public Boolean getProrate()
	{
		return prorate;
	}

	@JsonProperty
	public void setProrate(Boolean prorate)
	{
		this.prorate = prorate;
	}

	public Boolean getEndOfTerm()
	{
		return endOfTerm;
	}

	public void setEndOfTerm(Boolean endOfTerm)
	{
		this.endOfTerm = endOfTerm;
	}

	@JsonIgnore
	public String getSource()
	{
		return source;
	}

	@JsonProperty
	public void setSource(String source)
	{
		this.source = source;
	}

	public void setExchangeRate(BigDecimal exchangeRate)
	{
		this.exchangeRate = exchangeRate;
	}

	public BigDecimal getExchangeRate()
	{
		return exchangeRate;
	}

	public void setCustomerId(String customerId)
	{
		this.customerId = customerId;
	}

	public String getCustomerId()
	{
		return customerId;
	}

	public void setAutoCollect(Boolean autoCollect)
	{
		this.autoCollect = autoCollect;
	}

	public Boolean getAutoCollect()
	{
		return autoCollect;
	}

	public void setStartsAt(String startsAt)
	{
		this.startsAt = startsAt;
	}

	public String getStartsAt()
	{
		return startsAt;
	}

	@JsonProperty
	public void setActivatedAt(String activatedAt)
	{
		this.activatedAt = activatedAt;
	}

	@JsonIgnore
	public String getActivatedAt()
	{
		return activatedAt;
	}

	@JsonProperty
	public void setTrialRemainingDays(Integer trialRemainingDays)
	{
		this.trialRemainingDays = trialRemainingDays;
	}

	@JsonIgnore
	public Integer getTrialRemainingDays()
	{
		return trialRemainingDays;
	}

	@JsonProperty
	public void setCurrencyCode(String currencyCode)
	{
		this.currencyCode = currencyCode;
	}

	@JsonIgnore
	public String getCurrencyCode()
	{
		return currencyCode;
	}

	@JsonProperty
	public void setCurrencySymbol(String currencySymbol)
	{
		this.currencySymbol = currencySymbol;
	}

	@JsonIgnore
	public String getCurrencySymbol()
	{
		return currencySymbol;
	}

	@JsonProperty
	public void setProductName(String productName)
	{
		this.productName = productName;
	}

	@JsonIgnore
	public String getProductName()
	{
		return productName;
	}

	@JsonProperty
	public void setCoupon(Coupon coupon)
	{
		this.coupon = coupon;
	}

	@JsonIgnore
	public Coupon getCoupon()
	{
		return coupon;
	}

	public BigDecimal getMaxAmount()
	{
		return maxAmount;
	}

	public void setMaxAmount(BigDecimal maxAmount)
	{
		this.maxAmount = maxAmount;
	}

	public BankAccount getBankAccount()
	{
		return bankAccount;
	}

	public void setBankAccount(BankAccount bankAccount)
	{
		this.bankAccount = bankAccount;
	}

	public List<Subscription.Customfield> getCustomFields()

	{
		return customFields;
	}

	public void setCustomFields(List<Subscription.Customfield> customFields)
	{
		this.customFields = customFields;
	}

	public Integer getPaymentTerms()
	{
		return paymentTerms;
	}

	public void setPaymentTerms(Integer paymentTerms)
	{
		this.paymentTerms = paymentTerms;
	}

	public String getPaymentTermsLabel()
	{
		return paymentTermsLabel;
	}

	public void setPaymentTermsLabel(String paymentTermsLabel)
	{
		this.paymentTermsLabel = paymentTermsLabel;
	}

	public String getSalespersonName()
	{
		return salespersonName;
	}

	public void setSalespersonName(String salespersonName)
	{
		this.salespersonName = salespersonName;
	}

	@JsonIgnore
	public String getGatewayTransactionId()
	{
		return gatewayTransactionId;
	}

	@JsonProperty
	public void setGatewayTransactionId(String gatewayTransactionId)
	{
		this.gatewayTransactionId = gatewayTransactionId;
	}

	@JsonIgnore
	public String getGatewayErrorMessage()
	{
		return gatewayErrorMessage;
	}

	@JsonProperty
	public void setGatewayErrorMessage(String gatewayErrorMessage)
	{
		this.gatewayErrorMessage = gatewayErrorMessage;
	}

	@JsonIgnore
	public String getReference()
	{
		return reference;
	}

	@JsonProperty
	public void setReference(String reference)
	{
		this.reference = reference;
	}

	@JsonIgnore
	public String getIsTaxable()

	{
		return isTaxable;
	}

	@JsonProperty
	public void setIsTaxable(String isTaxable)
	{
		this.isTaxable = isTaxable;
	}

	@JsonIgnore
	public String getTaxName()
	{
		return taxName;
	}

	@JsonProperty
	public void setTaxName(String taxName)
	{
		this.taxName = taxName;
	}

	@JsonIgnore
	public BigDecimal getTaxPercentage()
	{
		return taxPercentage;
	}

	@JsonProperty
	public void setTaxPercentage(BigDecimal taxPercentage)

	{
		this.taxPercentage = taxPercentage;
	}

	@JsonIgnore
	public String getTaxAuthorityId()
	{
		return taxAuthorityId;
	}

	@JsonProperty
	public void setTaxAuthorityId(String taxAuthorityId)
	{
		this.taxAuthorityId = taxAuthorityId;
	}

	@JsonIgnore
	public String getTaxAuthorityName()
	{
		return taxAuthorityName;
	}

	@JsonProperty
	public void setTaxAuthorityName(String taxAuthorityName)
	{
		this.taxAuthorityName = taxAuthorityName;
	}

	@JsonIgnore
	public String getTaxExemptionId()
	{
		return taxExemptionId;
	}

	@JsonProperty
	public void setTaxExemptionId(String taxExemptionId)
	{
		this.taxExemptionId = taxExemptionId;
	}

	public List<PaymentGateway> getPaymentGateways()
	{
		return paymentGateways;
	}

	public void setPaymentGateways(List<PaymentGateway> paymentGateways)
	{
		this.paymentGateways = paymentGateways;
	}

	@JsonIgnoreProperties(ignoreUnknown = true)
	public static class Plan extends Resource
	{
		String planCode;

		BigDecimal price;

		Integer quantity;

		Boolean excludeSetupFee;

		Boolean excludeTrial;

		String planDescription;

		Integer trialDays;

		Integer billingCycles;

		BigDecimal setupFee;

		String taxExemptionId;

		String taxExemptionCode;

		String taxId;
		String setupFeeTaxId;

		String setupFeeTaxExemptionId;

		String setupFeeTaxExemptionCode;

		@JsonIgnore
		String isTaxable;

		@JsonIgnore
		String taxPercentage;

		@JsonIgnore
		String taxName;

		@JsonIgnore
		String taxType;

		@JsonIgnore
		String productExemptionCode;

		@JsonIgnore
		String productExemptionId;

		public void setPlanCode(String planCode)
		{
			this.planCode = planCode;
		}

		public String getPlanCode()
		{
			return planCode;
		}

		public void setPrice(BigDecimal price)
		{
			this.price = price;
		}

		public BigDecimal getPrice()
		{
			return price;
		}

		public void setQuantity(Integer quantity)
		{
			this.quantity = quantity;
		}

		public Integer getQuantity()
		{
			return quantity;
		}

		public void setExcludeSetupFee(Boolean excludeSetupFee)
		{
			this.excludeSetupFee = excludeSetupFee;
		}

		public Boolean getExcludeSetupFee()
		{
			return excludeSetupFee;
		}

		public void setExcludeTrial(Boolean excludeTrial)
		{
			this.excludeTrial = excludeTrial;
		}

		public Boolean getExcludeTrial()
		{
			return excludeTrial;
		}

		public String getPlanDescription()
		{
			return planDescription;
		}

		public void setPlanDescription(String planDescription)
		{
			this.planDescription = planDescription;
		}

		public Integer getTrialDays()
		{
			return trialDays;
		}

		public void setTrialDays(Integer trialDays)
		{
			this.trialDays = trialDays;
		}

		public Integer getBillingCycles()
		{
			return billingCycles;
		}

		public void setBillingCycles(Integer billingCycles)
		{
			this.billingCycles = billingCycles;
		}

		public BigDecimal getSetupFee()
		{
			return setupFee;
		}

		public void setSetupFee(BigDecimal setupFee)
		{
			this.setupFee = setupFee;
		}

		public void setSetupFeeTaxExemptionId(String setupFeeTaxExemptionId)
		{
			this.setupFeeTaxExemptionId = setupFeeTaxExemptionId;
		}

		public String getTaxId()
		{
			return taxId;

		}

		public void setTaxId(String taxId)
		{
			this.taxId = taxId;
		}

		public String getSetupFeeTaxId()
		{
			return setupFeeTaxId;
		}

		public void setSetupFeeTaxId(String setupFeeTaxId)
		{
			this.setupFeeTaxId = setupFeeTaxId;
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

		@JsonIgnore
		public String getTaxName()
		{
			return taxName;
		}

		@JsonProperty
		public void setTaxName(String taxName)
		{
			this.taxName = taxName;
		}

		@JsonIgnore
		public String getIsTaxable()

		{
			return isTaxable;
		}

		@JsonProperty
		public void setIsTaxable(String isTaxable)
		{
			this.isTaxable = isTaxable;
		}

		@JsonIgnore
		public String getTaxPercentage()
		{
			return taxPercentage;
		}

		@JsonProperty
		public void setTaxPercentage(String taxPercentage)
		{
			this.taxPercentage = taxPercentage;
		}

		@JsonIgnore
		public String getTaxType()

		{
			return taxType;
		}

		@JsonProperty
		public void setTaxType(String taxType)

		{
			this.taxType = taxType;
		}

		@JsonIgnore
		public String getProductExemptionCode()
		{
			return productExemptionCode;
		}

		@JsonProperty
		public void setProductExemptionCode(String productExemptionCode)
		{
			this.productExemptionCode = productExemptionCode;
		}

		@JsonIgnore
		public String getProductExemptionId()
		{
			return productExemptionId;
		}

		@JsonProperty
		public void setProductExemptionId(String productExemptionId)
		{
			this.productExemptionId = productExemptionId;
		}

		public String getSetupFeeTaxExemptionId()
		{
			return setupFeeTaxExemptionId;
		}

		public String getSetupFeeTaxExemptionCode()
		{
			return setupFeeTaxExemptionCode;
		}

		public void setSetupFeeTaxExemptionCode(String setupFeeTaxExemptionCode)
		{
			this.setupFeeTaxExemptionCode = setupFeeTaxExemptionCode;
		}
	}

	@JsonIgnoreProperties(ignoreUnknown = true)
	public static class Addon extends Resource
	{
		String addonCode;

		@JsonIgnore
		String name;

		BigDecimal price;

		Integer quantity;

		String taxId;
		String taxExemptionId;
		String taxExemptionCode;
		@JsonIgnore
		String taxType;
		@JsonIgnore
		String taxName;
		@JsonIgnore
		String taxPercentage;
		@JsonIgnore
		String isTaxable;
		@JsonIgnore
		String productExemptionCode;
		@JsonIgnore
		String productExemptionId;

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

		public void setPrice(BigDecimal price)
		{
			this.price = price;
		}

		public BigDecimal getPrice()
		{
			return price;
		}

		public void setQuantity(Integer quantity)
		{
			this.quantity = quantity;
		}

		public Integer getQuantity()
		{
			return quantity;
		}

		public String getTaxId()
		{
			return taxId;
		}

		public void setTaxId(String taxId)
		{
			this.taxId = taxId;
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

		@JsonIgnore
		public String getTaxName()
		{
			return taxName;
		}

		@JsonProperty
		public void setTaxName(String taxName)
		{
			this.taxName = taxName;
		}

		@JsonIgnore
		public String getIsTaxable()
		{
			return isTaxable;
		}

		@JsonProperty
		public void setIsTaxable(String isTaxable)
		{
			this.isTaxable = isTaxable;
		}

		@JsonIgnore
		public String getTaxType()
		{
			return taxType;
		}

		@JsonProperty
		public void setTaxType(String taxType)
		{
			this.taxType = taxType;
		}

		@JsonIgnore
		public String getTaxPercentage()
		{
			return taxPercentage;
		}

		@JsonProperty
		public void setTaxPercentage(String taxPercentage)
		{
			this.taxPercentage = taxPercentage;
		}

		@JsonIgnore
		public String getProductExemptionCode()
		{
			return productExemptionCode;
		}

		@JsonProperty
		public void setProductExemptionCode(String productExemptionCode)
		{
			this.productExemptionCode = productExemptionCode;
		}

		@JsonIgnore
		public String getProductExemptionId()
		{
			return productExemptionId;
		}

		@JsonProperty
		public void setProductExemptionId(String productExemptionId)
		{
			this.productExemptionId = productExemptionId;
		}
	}

	@JsonIgnoreProperties(ignoreUnknown = true)
	public static class Coupon extends Resource
	{
		@JsonIgnore
		String couponCode;

		@JsonIgnore
		BigDecimal discountAmount;

		@JsonProperty
		public void setCouponCode(String couponCode)
		{
			this.couponCode = couponCode;
		}

		@JsonIgnore
		public String getCouponCode()
		{
			return couponCode;
		}

		@JsonProperty
		public void setDiscountAmount(BigDecimal discountAmount)
		{
			this.discountAmount = discountAmount;
		}

		@JsonIgnore
		public BigDecimal getDiscountAmount()
		{
			return discountAmount;
		}

	}

	@JsonIgnoreProperties(ignoreUnknown = true)
	public static class Note extends Resource
	{
		String noteId;

		String description;

		String commentedBy;

		Date commentedDate;

		public void setNoteId(String noteId)
		{
			this.noteId = noteId;
		}

		public String getNoteId()
		{
			return noteId;
		}

		public void setDescription(String description)
		{
			this.description = description;
		}

		public String getDescription()
		{
			return description;
		}

		public void setCommentedBy(String commentedBy)
		{
			this.commentedBy = commentedBy;
		}

		public String getCommentedBy()
		{
			return commentedBy;
		}

		public void setCommentedDate(Date commentedDate)
		{
			this.commentedDate = commentedDate;
		}

		public Date getCommentedDate()
		{
			return commentedDate;
		}
	}

	@JsonIgnoreProperties(ignoreUnknown = true)
	public static class Customfield
	{
		String index;

		String value;
		@JsonIgnore
		String label;

		public String getIndex()
		{
			return index;
		}

		public String getValue()
		{
			return value;
		}

		@JsonIgnore
		public String getLabel()
		{
			return label;
		}

		public void setIndex(String index)
		{
			this.index = index;
		}

		public void setValue(String value)
		{
			this.value = value;
		}

		@JsonProperty
		public void setLabel(String label)
		{
			this.label = label;
		}
	}

}