
package com.zoho.zs.client.api.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.zoho.zs.client.api.exception.ZSAPIException;
import com.zoho.zs.client.api.net.QueryParams;
import com.zoho.zs.client.api.net.Resource;
import com.zoho.zs.client.api.net.ResourceUtil;
import com.zoho.zs.client.api.net.Response;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Invoice extends Resource
{
	@JsonIgnore
	String invoiceId;
	@JsonIgnore
	String invoiceAmount;
	@JsonIgnore
	String balanceAmount;
	@JsonIgnore
	String invoicePaymentId;
	@JsonIgnore
	String number;
	@JsonIgnore
	String amountApplied;

	@JsonIgnore
	BigDecimal writeOffAmount;

	@JsonIgnore
	BigDecimal dueAmount;

	String customerId;

	@JsonIgnore
	String customerName;
	@JsonIgnore
	String salesPersonId;

	String salesPersonName;
	String invoiceDate;

	@JsonIgnore
	String transactionType;

	@JsonIgnore
	String dueDate;

	@JsonIgnore
	String currencyCode;

	@JsonIgnore
	String currencySymbol;

	@JsonIgnore
	BigDecimal total;

	@JsonIgnore
	BigDecimal balance;

	@JsonIgnore
	String status;

	@JsonIgnore
	Date createdTime;

	@JsonIgnore
	Date updatedTime;

	@JsonIgnore
	String email;

	List<InvoiceItem> invoiceItems;

	@JsonIgnore
	BigDecimal paymentMade;

	@JsonIgnore
	List<Coupon> coupons;

	@JsonIgnore
	BigDecimal creditsApplied;

	@JsonIgnore
	List<Payment> payments;

	@JsonIgnore
	String htmlString;

	@JsonIgnore
	String activityId;

	@JsonIgnore
	String description;
	@JsonIgnore
	String invoiceUrl;
	@JsonIgnore
	Date activityTime;

	@JsonIgnore
	int autoBillStatus;
	List<Invoice.Customfield> customFields;
	@JsonIgnore
	String taxID;
	@JsonIgnore
	String taxExemptionID;
	@JsonIgnore
	String taxExemptionCode;

	String subscriptionId;

	List<Contactperson> contactpersons;

	String couponCode;

	List<PaymentGateway> paymentGateways;

	public static Invoice retrieve(String id) throws ZSAPIException
	{
		return ResourceUtil.process(RequestMethod.GET, instancePath(Invoice.class, id), Invoice.class);
	}

	public static Invoice create(Invoice invoice) throws ZSAPIException
	{
		return ResourceUtil.process(RequestMethod.POST, classPath(Invoice.class), Invoice.class, invoice);
	}

	public static void markAsSent(String invoiceId) throws ZSAPIException
	{
		ResourceUtil.process(RequestMethod.POST, instancePath(Invoice.class, invoiceId) + "/sent", Invoice.class);
	}

	public static Response getPDF(String id) throws ZSAPIException
	{
		QueryParams params = new QueryParams();
		params.add("accept", "pdf");
		return ResourceUtil.process(RequestMethod.GET, instancePath(Invoice.class, id), Response.class, params);
	}

	@JsonIgnore
	public String getInvoicePaymentId()
	{
		return invoicePaymentId;
	}

	@JsonProperty
	public void setInvoicePaymentId(String invoicePaymentId)
	{
		this.invoicePaymentId = invoicePaymentId;
	}

	@JsonIgnore
	public String getAmountApplied()
	{
		return amountApplied;
	}

	@JsonProperty
	public void setAmountApplied(String amountApplied)
	{
		this.amountApplied = amountApplied;
	}

	@JsonProperty
	public void setInvoiceId(String invoiceId)
	{
		this.invoiceId = invoiceId;
	}

	@JsonIgnore
	public String getInvoiceId()
	{
		return invoiceId;
	}

	@JsonIgnore
	public String getInvoiceAmount()
	{
		return invoiceAmount;
	}

	@JsonProperty
	public void setInvoiceAmount(String invoiceAmount)
	{
		this.invoiceAmount = invoiceAmount;
	}

	@JsonIgnore
	public String getBalanceAmount()
	{
		return balanceAmount;
	}

	@JsonProperty
	public void setBalanceAmount(String balanceAmount)
	{
		this.balanceAmount = balanceAmount;
	}

	@JsonProperty
	public void setInvoiceUrl(String invoiceUrl)
	{
		this.invoiceUrl = invoiceUrl;
	}

	@JsonIgnore
	public String getInvoiceUrl()
	{
		return invoiceUrl;
	}

	@JsonProperty
	public void setAutoBillStatus(int autoBillStatus)
	{
		this.autoBillStatus = autoBillStatus;
	}

	@JsonIgnore
	public int getAutoBillStatus()
	{
		return autoBillStatus;
	}

	@JsonProperty
	public void setNumber(String number)
	{
		this.number = number;
	}

	@JsonIgnore
	public String getNumber()
	{
		return number;
	}

	@JsonProperty
	public void setWriteOffAmount(BigDecimal writeOffAmount)
	{
		this.writeOffAmount = writeOffAmount;
	}

	@JsonIgnore
	public BigDecimal getWriteOffAmount()
	{
		return writeOffAmount;
	}

	@JsonProperty
	public void setDueAmount(BigDecimal dueAmount)
	{
		this.dueAmount = dueAmount;
	}

	@JsonIgnore
	public BigDecimal getDueAmount()
	{
		return dueAmount;
	}

	public void setCustomerId(String customerId)
	{
		this.customerId = customerId;
	}

	public String getCustomerId()
	{
		return customerId;
	}

	@JsonProperty
	public void setCustomerName(String customerName)
	{
		this.customerName = customerName;
	}

	@JsonIgnore
	public String getCustomerName()
	{
		return customerName;
	}

	@JsonIgnore
	public String getSalesPersonId()
	{
		return salesPersonId;
	}

	@JsonProperty
	public void setSalesPersonId(String salesPersonId)
	{
		this.salesPersonId = salesPersonId;
	}

	public void setSalesPersonName(String salesPersonName)
	{
		this.salesPersonName = salesPersonName;
	}

	public String getSalesPersonName()
	{
		return salesPersonName;
	}

	public void setInvoiceDate(String invoiceDate)
	{
		this.invoiceDate = invoiceDate;
	}

	public String getInvoiceDate()
	{
		return invoiceDate;
	}

	@JsonProperty
	public void setDueDate(String dueDate)
	{
		this.dueDate = dueDate;
	}

	@JsonIgnore
	public String getDueDate()
	{
		return dueDate;
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
	public void setTotal(BigDecimal total)
	{
		this.total = total;
	}

	@JsonIgnore
	public BigDecimal getTotal()
	{
		return total;
	}

	@JsonProperty
	public void setBalance(BigDecimal balance)
	{
		this.balance = balance;
	}

	@JsonIgnore
	public BigDecimal getBalance()
	{
		return balance;
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
	public void setEmail(String email)
	{
		this.email = email;
	}

	@JsonIgnore
	public String getEmail()
	{
		return email;
	}

	public void setInvoiceItems(List<InvoiceItem> invoiceItems)
	{
		this.invoiceItems = invoiceItems;
	}

	public List<InvoiceItem> getInvoiceItems()
	{
		return invoiceItems;
	}

	@JsonProperty
	public void setPaymentMade(BigDecimal paymentMade)
	{
		this.paymentMade = paymentMade;
	}

	@JsonIgnore
	public BigDecimal getPaymentMade()
	{
		return paymentMade;
	}

	@JsonProperty
	public void setCoupons(List<Coupon> coupons)
	{
		this.coupons = coupons;
	}

	@JsonIgnore
	public List<Coupon> getCoupons()
	{
		return coupons;
	}

	public List<Invoice.Customfield> getCustomFields()
	{
		return customFields;
	}

	public void setCustomFields(List<Invoice.Customfield> customFields)
	{
		this.customFields = customFields;
	}

	@JsonProperty
	public void setCreditsApplied(BigDecimal creditsApplied)
	{
		this.creditsApplied = creditsApplied;
	}

	@JsonIgnore
	public BigDecimal getCreditsApplied()
	{
		return creditsApplied;
	}

	@JsonProperty
	public void setPayments(List<Payment> payments)
	{
		this.payments = payments;
	}

	@JsonIgnore
	public List<Payment> getPayments()
	{
		return payments;
	}

	@JsonProperty
	public void setActivityId(String activityId)
	{
		this.activityId = activityId;
	}

	@JsonIgnore
	public String getActivityId()
	{
		return activityId;
	}

	@JsonProperty
	public void setDescription(String description)
	{
		this.description = description;
	}

	@JsonIgnore
	public String getDescription()
	{
		return description;
	}

	@JsonProperty
	public void setActivityTime(Date activityTime)
	{
		this.activityTime = activityTime;
	}

	@JsonIgnore
	public Date getActivityTime()
	{
		return activityTime;
	}

	@JsonProperty
	public void setHtmlString(String htmlString)
	{
		this.htmlString = htmlString;
	}

	@JsonIgnore
	public String getHtmlString()
	{
		return htmlString;
	}

	@JsonIgnore
	public String getTransactionType()
	{
		return transactionType;
	}

	@JsonProperty
	public void setTransactionType(String transactionType)
	{
		this.transactionType = transactionType;
	}

	@JsonProperty
	public void setTaxID(String taxID)
	{
		this.taxID = taxID;
	}

	@JsonIgnore
	public String getTaxID()
	{
		return taxID;
	}

	@JsonProperty
	public void setTaxExemptionID(String taxExemptionID)
	{
		this.taxExemptionID = taxExemptionID;
	}

	@JsonIgnore
	public String getTaxExemptionID()
	{
		return taxExemptionID;
	}

	@JsonProperty
	public void setTaxExemptionCode(String taxExemptionCode)
	{
		this.taxExemptionCode = taxExemptionCode;
	}

	@JsonIgnore
	public String getTaxExemptionCode()
	{
		return taxExemptionCode;
	}

	public void setSubscriptionId(String subscriptionId)
	{
		this.subscriptionId = subscriptionId;
	}

	public String getSubscriptionId()
	{
		return subscriptionId;
	}

	public void setContactpersons(List<Contactperson> contactpersons)
	{
		this.contactpersons = contactpersons;
	}

	public List<Contactperson> getContactpersons()
	{
		return contactpersons;
	}

	public void setCouponCode(String couponCode)
	{
		this.couponCode = couponCode;
	}

	public String getCouponCode()
	{
		return couponCode;
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
	public static class InvoiceItem extends Resource
	{
		String itemId;
		String description;
		String name;

		String code;

		BigDecimal price;

		Integer quantity;
		@JsonIgnore
		String discountAmount;
		@JsonIgnore
		BigDecimal itemTotal;
		String taxId;
		String taxExemptionId;
		String taxExemptionCode;

		public String getDescription()
		{
			return description;
		}

		public void setDescription(String description)
		{
			this.description = description;
		}

		@JsonIgnore
		public String getDiscountAmount()
		{
			return discountAmount;
		}

		@JsonProperty
		public void setDiscountAmount(String discountAmount)
		{
			this.discountAmount = discountAmount;
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

		public void setItemId(String itemId)
		{
			this.itemId = itemId;
		}

		public String getItemId()
		{
			return itemId;
		}

		public void setName(String name)
		{
			this.name = name;
		}

		public String getName()
		{
			return name;
		}

		public void setCode(String code)
		{
			this.code = code;
		}

		public String getCode()
		{
			return code;
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

		@JsonProperty
		public void setItemTotal(BigDecimal itemTotal)
		{
			this.itemTotal = itemTotal;
		}

		@JsonIgnore
		public BigDecimal getItemTotal()
		{
			return itemTotal;
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
	public static class Payment extends Resource
	{
		@JsonIgnore
		String paymentId;

		@JsonIgnore
		String paymentMode;

		@JsonIgnore
		String invoicePaymentId;

		@JsonIgnore
		String description;

		@JsonIgnore
		String date;

		@JsonIgnore
		String referenceNumber;

		@JsonIgnore
		BigDecimal amount;

		@JsonIgnore
		BigDecimal exchangeRate;

		@JsonIgnore
		String gatewayTransactionId;

		@JsonProperty
		public void setPaymentId(String paymentId)
		{
			this.paymentId = paymentId;
		}

		@JsonIgnore
		public String getPaymentId()
		{
			return paymentId;
		}

		@JsonProperty
		public void setPaymentMode(String paymentMode)
		{
			this.paymentMode = paymentMode;
		}

		@JsonIgnore
		public String getPaymentMode()
		{
			return paymentMode;
		}

		@JsonProperty
		public void setInvoicePaymentId(String invoicePaymentId)
		{
			this.invoicePaymentId = invoicePaymentId;
		}

		@JsonIgnore
		public String getInvoicePaymentId()
		{
			return invoicePaymentId;
		}

		@JsonProperty
		public void setDescription(String description)
		{
			this.description = description;
		}

		@JsonIgnore
		public String getDescription()
		{
			return description;
		}

		@JsonProperty
		public void setDate(String date)
		{
			this.date = date;
		}

		@JsonIgnore
		public String getDate()
		{
			return date;
		}

		@JsonProperty
		public void setReferenceNumber(String referenceNumber)
		{
			this.referenceNumber = referenceNumber;
		}

		@JsonIgnore
		public String getReferenceNumber()
		{
			return referenceNumber;
		}

		@JsonProperty
		public void setAmount(BigDecimal amount)
		{
			this.amount = amount;
		}

		@JsonIgnore
		public BigDecimal getAmount()
		{
			return amount;
		}

		@JsonProperty
		public void setExchangeRate(BigDecimal exchangeRate)
		{
			this.exchangeRate = exchangeRate;
		}

		@JsonIgnore
		public BigDecimal getExchangeRate()
		{
			return exchangeRate;
		}

		@JsonProperty
		public void setGatewayTransactionId(String gatewayTransactionId)
		{
			this.gatewayTransactionId = gatewayTransactionId;
		}

		@JsonIgnore
		public String getGatewayTransactionId()
		{
			return gatewayTransactionId;
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
