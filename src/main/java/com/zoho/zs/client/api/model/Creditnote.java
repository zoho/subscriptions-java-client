
package com.zoho.zs.client.api.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.zoho.zs.client.api.net.Resource;

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

	@JsonIgnore
	String status;

	@JsonIgnore
	Creditnote creditnote;

	@JsonIgnore
	Autotransaction autotransaction;

	@JsonIgnore
	String creditnoteId;

	@JsonIgnore
	String number;

	@JsonIgnore
	String transactionId;

	@JsonIgnore
	String customerCode;

	@JsonIgnore
	String customerName;

	@JsonIgnore
	String total;

	@JsonIgnore
	String balance;

	@JsonIgnore
	List<CreditnoteItem> creditnoteItems;

	@JsonIgnore
	List<Invoice> invoices;

	@JsonIgnore
	Date createdTime;

	@JsonIgnore
	String updatedTime;

	@JsonIgnore
	String creditnoteNumber;
	@JsonIgnore
	String customerId;
	@JsonIgnore
	String firstName;
	@JsonIgnore
	String lastName;
	@JsonIgnore
	String email;
	@JsonIgnore
	Long currencySymbol;
	@JsonIgnore
	String htmlString;

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

	@JsonProperty
	public void setCreditnoteId(String creditnoteId)
	{
		this.creditnoteId = creditnoteId;
	}

	@JsonIgnore
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

	@JsonProperty
	public void setTotal(String total)
	{
		this.total = total;
	}

	@JsonIgnore
	public String getTotal()
	{
		return total;
	}

	@JsonProperty
	public void setBalance(String balance)
	{
		this.balance = balance;
	}

	@JsonIgnore
	public String getBalance()
	{
		return balance;
	}

	@JsonProperty
	public void setCreditnoteItems(List<CreditnoteItem> creditnoteItems)
	{
		this.creditnoteItems = creditnoteItems;
	}

	@JsonIgnore
	public List<CreditnoteItem> getCreditnoteItems()
	{
		return creditnoteItems;
	}

	@JsonProperty
	public void setInvoices(List<Invoice> invoices)
	{
		this.invoices = invoices;
	}

	@JsonIgnore
	public List<Invoice> getInvoices()
	{
		return invoices;
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
	public void setUpdatedTime(String updatedTime)
	{
		this.updatedTime = updatedTime;
	}

	@JsonIgnore
	public String getUpdatedTime()
	{
		return updatedTime;
	}

	@JsonIgnore
	public String getCreditnoteNumber()
	{
		return creditnoteNumber;
	}

	@JsonProperty
	public void setCreditnoteNumber(String creditnoteNumber)
	{
		this.creditnoteNumber = creditnoteNumber;
	}

	@JsonIgnore
	public String getCustomerId()
	{
		return customerId;
	}

	@JsonProperty
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
	public Long getCurrencySymbol()
	{
		return currencySymbol;
	}

	@JsonProperty
	public void setCurrencySymbol(Long currencySymbol)
	{
		this.currencySymbol = currencySymbol;
	}

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

	public static class CreditnoteItem extends Resource
	{
		@JsonIgnore
		String itemId;

		@JsonIgnore
		String description;

		@JsonIgnore
		String quantity;

		@JsonIgnore
		BigDecimal price;

		@JsonIgnore
		BigDecimal itemTotal;

		@JsonProperty
		public void setItemId(String itemId)
		{
			this.itemId = itemId;
		}

		@JsonIgnore
		public String getItemId()
		{
			return itemId;
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
		public void setQuantity(String quantity)
		{
			this.quantity = quantity;
		}

		@JsonIgnore
		public String getQuantity()
		{
			return quantity;
		}

		@JsonProperty
		public void setPrice(BigDecimal price)
		{
			this.price = price;
		}

		@JsonIgnore
		public BigDecimal getPrice()
		{
			return price;
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

	public static class Invoice extends Resource
	{
		@JsonIgnore
		String invoiceId;

		@JsonIgnore
		String invoiceNumber;

		@JsonIgnore
		BigDecimal amount;

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

		@JsonProperty
		public void setInvoiceNumber(String invoiceNumber)
		{
			this.invoiceNumber = invoiceNumber;
		}

		@JsonIgnore
		public String getInvoiceNumber()
		{
			return invoiceNumber;
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

	}
}