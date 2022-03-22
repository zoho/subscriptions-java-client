
package com.zoho.zs.client.api.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.zoho.zs.client.api.exception.ZSAPIException;
import com.zoho.zs.client.api.net.Resource;
import com.zoho.zs.client.api.net.ResourceUtil;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Creditnote extends Resource
{
	@JsonIgnore
	BigDecimal amount;

	@JsonIgnore
	String description;

	@JsonIgnore
	String refundId;

	@JsonIgnore
	String date;

	@JsonIgnore
	String currencyCode;

	@JsonIgnore
	String referenceNumber;

	@JsonIgnore
	String refundMode;

	String status;

	@JsonIgnore
	Creditnote creditnote;

	@JsonIgnore
	Autotransaction autotransaction;

	String creditnoteId;

	@JsonIgnore
	String number;

	@JsonIgnore
	String transactionId;

	@JsonIgnore
	String customerCode;

	String customerName;

	String total;

	String balance;

	List<CreditnoteItem> creditnoteItems;

	List<Invoice> invoices;

	Date createdTime;

	String updatedTime;

	String creditnoteNumber;

	String customerId;
	@JsonIgnore
	String firstName;
	@JsonIgnore
	String lastName;
	@JsonIgnore
	String email;
	@JsonIgnore
	String currencySymbol;
	@JsonIgnore
	String htmlString;

	String message;

	List<Tax> taxes;

	public static Creditnote create(Creditnote creditnote) throws ZSAPIException
	{
		return ResourceUtil.process(RequestMethod.POST, classPath(Creditnote.class), Creditnote.class, creditnote);
	}

	public static Creditnote retrieve(String creditnoteId) throws ZSAPIException
	{
		return ResourceUtil.process(RequestMethod.GET, instancePath(Creditnote.class, creditnoteId), Creditnote.class);
	}
	public static void delete(String creditnoteId) throws ZSAPIException
	{
		ResourceUtil.process(RequestMethod.DELETE, instancePath(Creditnote.class, creditnoteId), Creditnote.class);
	}

	public static Creditnote emailAnCreditnote(Mail mail, String id) throws ZSAPIException
	{
		return ResourceUtil.process(RequestMethod.POST, instancePath(Creditnote.class,id) + "/email", Creditnote.class, mail);
	}

	public static Creditnote convertToVoid(String id) throws ZSAPIException
	{
		return ResourceUtil.process(RequestMethod.POST, instancePath(Creditnote.class,id) + "/void",Creditnote.class);
	}

	public static Creditnote applyToInvoice(Creditnote creditnote,String id) throws ZSAPIException
	{
		return ResourceUtil.process(RequestMethod.POST, instancePath(Creditnote.class,id) + "/invoices", Creditnote.class, creditnote);
	}
	public static Creditnote convertToOpen(String id) throws ZSAPIException
	{
		return ResourceUtil.process(RequestMethod.POST, instancePath(Creditnote.class,id) + "/converttoopen",Creditnote.class);
	}

	public String getMessage()
	{
		return message;
	}

	public void setMessage(String message)
	{
		this.message = message;
	}

	public List<Tax> getTaxes()
	{
		return taxes;
	}

	public void setTaxes(List<Tax> taxes)
	{
		this.taxes = taxes;
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
	public void setRefundId(String refundId)
	{
		this.refundId = refundId;
	}

	@JsonIgnore
	public String getRefundId()
	{
		return refundId;
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
	public void setRefundMode(String refundMode)
	{
		this.refundMode = refundMode;
	}

	@JsonIgnore
	public String getRefundMode()
	{
		return refundMode;
	}

	public void setStatus(String status)
	{
		this.status = status;
	}

	public String getStatus()
	{
		return status;
	}

	@JsonProperty
	public void setCreditnote(Creditnote creditnote)
	{
		this.creditnote = creditnote;
	}

	@JsonIgnore
	public Creditnote getCreditnote()
	{
		return creditnote;
	}

	@JsonProperty
	public void setAutotransaction(Autotransaction autotransaction)
	{
		this.autotransaction = autotransaction;
	}

	@JsonIgnore
	public Autotransaction getAutotransaction()
	{
		return autotransaction;
	}

	public void setCreditnoteId(String creditnoteId)
	{
		this.creditnoteId = creditnoteId;
	}

	public String getCreditnoteId()
	{
		return creditnoteId;
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
	public void setTransactionId(String transactionId)
	{
		this.transactionId = transactionId;
	}

	@JsonIgnore
	public String getTransactionId()
	{
		return transactionId;
	}

	@JsonProperty
	public void setCustomerCode(String customerCode)
	{
		this.customerCode = customerCode;
	}

	@JsonIgnore
	public String getCustomerCode()
	{
		return customerCode;
	}

	public void setCustomerName(String customerName)
	{
		this.customerName = customerName;
	}

	public String getCustomerName()
	{
		return customerName;
	}

	public void setTotal(String total)
	{
		this.total = total;
	}

	public String getTotal()
	{
		return total;
	}

	public void setBalance(String balance)
	{
		this.balance = balance;
	}

	public String getBalance()
	{
		return balance;
	}

	public void setCreditnoteItems(List<CreditnoteItem> creditnoteItems)
	{
		this.creditnoteItems = creditnoteItems;
	}

	public List<CreditnoteItem> getCreditnoteItems()
	{
		return creditnoteItems;
	}

	public void setInvoices(List<Invoice> invoices)
	{
		this.invoices = invoices;
	}

	public List<Invoice> getInvoices()
	{
		return invoices;
	}

	public void setCreatedTime(Date createdTime)
	{
		this.createdTime = createdTime;
	}

	public Date getCreatedTime()
	{
		return createdTime;
	}

	public void setUpdatedTime(String updatedTime)
	{
		this.updatedTime = updatedTime;
	}

	public String getUpdatedTime()
	{
		return updatedTime;
	}

	public String getCreditnoteNumber()
	{
		return creditnoteNumber;
	}

	public void setCreditnoteNumber(String creditnoteNumber)
	{
		this.creditnoteNumber = creditnoteNumber;
	}

	public String getCustomerId()
	{
		return customerId;
	}

	public void setCustomerId(String customerId)
	{
		this.customerId = customerId;
	}

	@JsonIgnore
	public String getFirstName()
	{
		return firstName;
	}

	@JsonProperty
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	@JsonIgnore
	public String getLastName()
	{
		return lastName;
	}

	@JsonProperty
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	@JsonIgnore
	public String getEmail()
	{
		return email;
	}

	@JsonProperty
	public void setEmail(String email)
	{
		this.email = email;
	}

	@JsonIgnore
	public String getCurrencySymbol()
	{
		return currencySymbol;
	}

	@JsonProperty
	public void setCurrencySymbol(String currencySymbol)
	{
		this.currencySymbol = currencySymbol;
	}

	@JsonIgnoreProperties(ignoreUnknown = true)
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
	public static class Autotransaction extends Resource
	{
		@JsonIgnore
		String autotransactionId;

		@JsonIgnore
		String paymenGateway;

		@JsonIgnore
		String gatewayTransactionId;

		@JsonIgnore
		String cardId;

		@JsonIgnore
		String lastFourDigits;

		@JsonIgnore
		String expiryMonth;

		@JsonIgnore
		String expiryYear;

		@JsonProperty
		public void setAutotransactionId(String autotransactionId)
		{
			this.autotransactionId = autotransactionId;
		}

		@JsonIgnore
		public String getAutotransactionId()
		{
			return autotransactionId;
		}

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
		public void setGatewayTransactionId(String gatewayTransactionId)
		{
			this.gatewayTransactionId = gatewayTransactionId;
		}

		@JsonIgnore
		public String getGatewayTransactionId()
		{
			return gatewayTransactionId;
		}

		@JsonProperty
		public void setCardId(String cardId)
		{
			this.cardId = cardId;
		}

		@JsonIgnore
		public String getCardId()
		{
			return cardId;
		}

		@JsonProperty
		public void setLastFourDigits(String lastFourDigits)
		{
			this.lastFourDigits = lastFourDigits;
		}

		@JsonIgnore
		public String getLastFourDigits()
		{
			return lastFourDigits;
		}

		@JsonProperty
		public void setExpiryMonth(String expiryMonth)
		{
			this.expiryMonth = expiryMonth;
		}

		@JsonIgnore
		public String getExpiryMonth()
		{
			return expiryMonth;
		}

		@JsonProperty
		public void setExpiryYear(String expiryYear)
		{
			this.expiryYear = expiryYear;
		}

		@JsonIgnore
		public String getExpiryYear()
		{
			return expiryYear;
		}

	}

	@JsonIgnoreProperties(ignoreUnknown = true)
	public static class CreditnoteItem extends Resource
	{
		String itemId;

		String code;

		String description;

		String quantity;

		BigDecimal price;

		BigDecimal itemTotal;

		List<Tag>tags;

		List<CustomField> itemCustomFields;

		String name;

		Integer type;

		String accountId;

		String accountName;

		String taxId;

		public String getTaxId()
		{
			return taxId;
		}

		public void setTaxId(String taxId)
		{
			this.taxId = taxId;
		}

		public String getAccountName()
		{
			return accountName;
		}

		public void setAccountName(String accountName)
		{
			this.accountName = accountName;
		}

		public String getAccountId()
		{
			return accountId;
		}

		public void setAccountId(String accountId)
		{
			this.accountId = accountId;
		}

		public Integer getType()
		{
			return type;
		}

		public void setType(Integer type)
		{
			this.type = type;
		}

		public void setName(String name)
		{
			this.name = name;
		}

		public String getName()
		{
			return name;
		}

		public List<CustomField> getItemCustomFields()
		{
			return itemCustomFields;
		}

		public void setItemCustomFields(List<CustomField> itemCustomFields)
		{
			this.itemCustomFields = itemCustomFields;
		}

		public void setTags(List<Tag> tags)
		{
			this.tags = tags;
		}

		public List<Tag> getTags()
		{
			return tags;
		}

		public String getCode()
		{
			return code;
		}

		public void setCode(String code)
		{
			this.code = code;
		}

		public void setItemId(String itemId)
		{
			this.itemId = itemId;
		}

		public String getItemId()
		{
			return itemId;
		}

		public void setDescription(String description)
		{
			this.description = description;
		}

		public String getDescription()
		{
			return description;
		}

		public void setQuantity(String quantity)
		{
			this.quantity = quantity;
		}

		public String getQuantity()
		{
			return quantity;
		}

		public void setPrice(BigDecimal price)
		{
			this.price = price;
		}

		public BigDecimal getPrice()
		{
			return price;
		}

		public void setItemTotal(BigDecimal itemTotal)
		{
			this.itemTotal = itemTotal;
		}

		public BigDecimal getItemTotal()
		{
			return itemTotal;
		}

	}

	@JsonIgnoreProperties(ignoreUnknown = true)
	public static class Invoice extends Resource
	{
		String invoiceId;

		String invoiceNumber;

		BigDecimal amount;

		BigDecimal amountApplied;

		public void setAmountApplied(BigDecimal amountApplied)
		{
			this.amountApplied = amountApplied;
		}

		public BigDecimal getAmountApplied()
		{
			return amountApplied;
		}

		public void setInvoiceId(String invoiceId)
		{
			this.invoiceId = invoiceId;
		}

		public String getInvoiceId()
		{
			return invoiceId;
		}

		public void setInvoiceNumber(String invoiceNumber)
		{
			this.invoiceNumber = invoiceNumber;
		}

		public String getInvoiceNumber()
		{
			return invoiceNumber;
		}

		public void setAmount(BigDecimal amount)
		{
			this.amount = amount;
		}

		public BigDecimal getAmount()
		{
			return amount;
		}

	}
}