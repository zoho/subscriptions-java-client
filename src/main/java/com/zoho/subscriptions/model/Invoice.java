
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

	List<CustomField> customFields;

	@JsonIgnore
	String taxID;
	@JsonIgnore
	String taxExemptionID;
	@JsonIgnore
	String taxExemptionCode;

	String subscriptionId;

	List<Contactperson> contactPersons;

	String couponCode;

	List<PaymentGateway> paymentGateways;

	String message;

	String accountId;

	String cardId;

	Mail mail;

	static List<ApplyCreditnotes> applyCreditnotes;

	InvoiceAddress invoiceAddress;

	 Customer.BillingAddress billingAddress;

	 Customer.ShippingAddress shippingAddress;

	List<CustomField> data;

	UseCredits useCredits;

	String paymentExpectedDate;

	Boolean achPaymentInitiated;

	List<Tag> tags;

	List<Credit> credits;



	public static Invoice retrieve(String id) throws ZSAPIException
	{
		return ResourceUtil.process(RequestMethod.GET, instancePath(Invoice.class, id), Invoice.class);
	}

	public static Invoice writeOff(String id) throws ZSAPIException
	{
		return ResourceUtil.process(RequestMethod.POST, instancePath(Invoice.class,id) + "/writeoff", Invoice.class);
	}
	public static Invoice cancelWriteOff(String id) throws ZSAPIException
	{
		return ResourceUtil.process(RequestMethod.POST, instancePath(Invoice.class,id) + "/cancelwriteoff", Invoice.class);
	}
	public static Invoice convertToVoid(String id) throws ZSAPIException
	{
		return ResourceUtil.process(RequestMethod.POST, instancePath(Invoice.class,id) + "/void", Invoice.class);
	}
	public static Invoice convertToOpen(String id) throws ZSAPIException
	{
		return ResourceUtil.process(RequestMethod.POST, instancePath(Invoice.class,id) + "/converttoopen", Invoice.class);
	}
	public static Invoice collectViaBank(Invoice invoice, String id) throws ZSAPIException
	{
		return ResourceUtil.process(RequestMethod.POST, instancePath(Invoice.class,id) + "/collect", Invoice.class, invoice);
	}
	public static Invoice emailAnInvoice(Mail mail, String id) throws ZSAPIException
	{
		return ResourceUtil.process(RequestMethod.POST, instancePath(Invoice.class,id) + "/email", Invoice.class, mail);
	}
	public static Invoice updateCustomFields( Invoice invoice, String id) throws ZSAPIException
	{
		return ResourceUtil.process(RequestMethod.POST, instancePath(Invoice.class,id) + "/customfields", Invoice.class, invoice);
	}
	public static Invoice updateAddress(InvoiceAddress invoiceAddress, String id) throws ZSAPIException
	{
		return ResourceUtil.process(RequestMethod.PUT, instancePath(Invoice.class,id) + "/address", Invoice.class, invoiceAddress);
	}
	public static Invoice applyCredits(Invoice invoice, String id) throws ZSAPIException
	{
		return ResourceUtil.process(RequestMethod.POST, instancePath(Invoice.class,id) + "/credits", Invoice.class, invoice);
	}
	public static Invoice addItemsToPendingInvoice(Invoice invoice, String id) throws ZSAPIException
	{
		return ResourceUtil.process(RequestMethod.POST, instancePath(Invoice.class,id) + "/lineitems", Invoice.class, invoice);
	}
	public static Invoice deleteItemsFromAPendingInvoice(String invoiceId, String itemId) throws ZSAPIException
	{
		return ResourceUtil.process(RequestMethod.DELETE, instancePath(Invoice.class,invoiceId) + "/lineitems/"+itemId, Invoice.class);
	}

	public static ListResponse<Invoice> list() throws ZSAPIException
	{
		return list(GenericListParams.getDefaults());
	}
	public static ListResponse<Invoice> list(GenericListParams params) throws ZSAPIException
	{
		return ResourceUtil.list(RequestMethod.GET, classPath(Invoice.class), Invoice.class, params);
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

	public List<CustomField> getCustomFields()
	{
		return customFields;
	}

	public void setCustomFields(List<CustomField> customFields)
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

	public void setContactPersons(List<Contactperson> contactPersons)
	{
		this.contactPersons = contactPersons;
	}

	public List<Contactperson> getContactPersons()
	{
		return contactPersons;
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

	public List<Credit> getCredits()
	{
		return credits;
	}

	public void setCredits(List<Credit> credits)
	{
		this.credits = credits;
	}

	public List<Tag> getTags()
	{
		return tags;
	}

	public void setTags(List<Tag> tags)
	{
		this.tags = tags;
	}

	public Boolean getAchPaymentInitiated()
	{
		return achPaymentInitiated;
	}

	public void setAchPaymentInitiated(Boolean achPaymentInitiated)
	{
		this.achPaymentInitiated = achPaymentInitiated;
	}

	public String getPaymentExpectedDate()
	{
		return paymentExpectedDate;
	}

	public void setPaymentExpectedDate(String paymentExpectedDate)
	{
		this.paymentExpectedDate = paymentExpectedDate;
	}

	public void setUseCredits(UseCredits useCredits)
	{
		this.useCredits = useCredits;
	}

	public UseCredits getUseCredits()
	{
		return useCredits;
	}

	public List<CustomField> getData()
	{
		return data;
	}

	public void setData(List<CustomField> data)
	{
		this.data = data;
	}

	public Customer.BillingAddress getBillingAddress()
	{
		return billingAddress;
	}

	public void setBillingAddress(Customer.BillingAddress billingAddress)
	{
		this.billingAddress = billingAddress;
	}

	public void setShippingAddress(Customer.ShippingAddress shippingAddress)
	{
		this.shippingAddress = shippingAddress;
	}

	public Customer.ShippingAddress getShippingAddress()
	{
		return shippingAddress;
	}

	public InvoiceAddress getInvoiceAddress()
	{
		return invoiceAddress;
	}

	public void setInvoiceAddress(InvoiceAddress invoiceAddress)
	{
		this.invoiceAddress = invoiceAddress;
	}

	public void setApplyCreditnotes(List<ApplyCreditnotes> applyCreditnotes)
	{
		this.applyCreditnotes = applyCreditnotes;
	}

	public List<ApplyCreditnotes> getApplyCreditnotes()
	{
		return applyCreditnotes;
	}

	public void setMessage(String message)
	{
		this.message = message;
	}

	public String getMessage()
	{
		return message;
	}

	public void setAccountId(String accountId)
	{
		this.accountId = accountId;
	}

	public String getAccountId()
	{
		return accountId;
	}

	public void setCardId(String cardId)
	{
		this.cardId = cardId;
	}

	public String getCardId()
	{
		return cardId;
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

		BigDecimal amountRefunded;

		BigDecimal bankCharges;

		public BigDecimal getBankCharges()
		{
			return bankCharges;
		}

		public void setBankCharges(BigDecimal bankCharges)
		{
			this.bankCharges = bankCharges;
		}

		public BigDecimal getAmountRefunded()
		{
			return amountRefunded;
		}

		public void setAmountRefunded(BigDecimal amountRefunded)
		{
			this.amountRefunded = amountRefunded;
		}

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
	public static class InvoiceAddress extends Resource
	{
		Customer.ShippingAddress shippingAddress;

		Customer.BillingAddress billingAddress;

		public void setShippingAddress(Customer.ShippingAddress shippingAddress)
		{
			this.shippingAddress = shippingAddress;
		}

		public Customer.ShippingAddress getShippingAddress()
		{
			return shippingAddress;
		}

		public Customer.BillingAddress getBillingAddress()
		{
			return billingAddress;
		}

		public void setBillingAddress(Customer.BillingAddress billingAddress)
		{
			this.billingAddress = billingAddress;
		}
	}
	public static class Mail extends Resource
	{
		List<String> toMailIds;

		List<String> ccMailIds;

		String subject;

		String body;

		public void setToMailIds(List<String> toMailIds)
		{
			this.toMailIds = toMailIds;
		}

		public List<String> getToMailIds()
		{
			return toMailIds;
		}

		public void setCcMailIds(List<String> ccMailIds)
		{
			this.ccMailIds = ccMailIds;
		}

		public List<String> getCcMailIds()
		{
			return ccMailIds;
		}

		public void setSubject(String subject)
		{
			this.subject = subject;
		}

		public String getSubject()
		{
			return subject;
		}

		public String getBody()
		{
			return body;
		}

		public void setBody(String body)
		{
			this.body = body;
		}
	}
	@JsonIgnoreProperties(ignoreUnknown = true)
	public static class UseCredits extends Resource
	{
		public List<ApplyCreditnotes> getApplyCreditnotes()
		{
			return applyCreditnotes;
		}
	}
	@JsonIgnoreProperties(ignoreUnknown = true)
	public static class ApplyCreditnotes extends Resource
	{
		String creditNoteId;

		String creditNotesInvoiceId;

		String invoiceId;

		BigDecimal amountApplied;

		public void setInvoiceId(String invoiceId)
		{
			this.invoiceId = invoiceId;
		}

		public String getInvoiceId()
		{
			return invoiceId;
		}

		public void setCreditnotesInvoiceId(String creditNotesInvoiceId)
		{
			this.creditNotesInvoiceId = creditNotesInvoiceId;
		}

		public String getCreditnotesInvoiceId()
		{
			return creditNotesInvoiceId;
		}

		public void setAmountApplied(BigDecimal amountApplied)
		{
			this.amountApplied = amountApplied;
		}

		public BigDecimal getAmountApplied()
		{
			return amountApplied;
		}

		public void setCreditnoteId(String creditNoteId)
		{
			this.creditNoteId = creditNoteId;
		}

		public String getCreditnoteId()
		{
			return creditNoteId;
		}
	}

	public static class Credit extends Resource
	{
		String creditnoteId;

		String creditnotesNumber;

		String creditedDate;

		BigDecimal creditedAmount;

		public BigDecimal getCreditedAmount()
		{
			return creditedAmount;
		}

		public void setCreditedAmount(BigDecimal creditedAmount)
		{
			this.creditedAmount = creditedAmount;
		}

		public String getCreditedDate()
		{
			return creditedDate;
		}

		public void setCreditedDate(String creditedDate)
		{
			this.creditedDate = creditedDate;
		}

		public String getCreditnoteId()
		{
			return creditnoteId;
		}

		public void setCreditnoteId(String creditnoteId)
		{
			this.creditnoteId = creditnoteId;
		}

		public String getCreditnotesNumber()
		{
			return creditnotesNumber;
		}

		public void setCreditnotesNumber(String creditnotesNumber)
		{
			this.creditnotesNumber = creditnotesNumber;
		}
	}


}
