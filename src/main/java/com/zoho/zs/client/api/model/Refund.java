
package com.zoho.zs.client.api.model;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.zoho.zs.client.api.exception.ZSAPIException;
import com.zoho.zs.client.api.net.Resource;
import com.zoho.zs.client.api.net.ResourceUtil;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Refund extends Resource
{

	BigDecimal amount;

	String description;

	@JsonIgnore
	String customerId;

	@JsonIgnore
	String date;

	@JsonIgnore
	String refundMode;

	@JsonIgnore
	String referenceNumber;

	@JsonIgnore
	String status;

	@JsonIgnore
	String customerName;

	@JsonIgnore
	String email;

	@JsonIgnore
	BigDecimal exchangeRate;

	@JsonIgnore
	Integer pricePrecision;

	@JsonIgnore
	String currencyCode;

	@JsonIgnore
	String currencySymbol;

	@JsonIgnore
	Creditnote creditnote;

	@JsonIgnore
	Autotransaction autotransaction;

	@JsonIgnore
	String refundId;

	@JsonIgnore
	String creditnoteNumber;

	@JsonIgnore
	String transactionId;

	@JsonIgnore
	String firstName;

	@JsonIgnore
	String lastName;

	public static Refund retrieve(String id) throws ZSAPIException
	{
		return ResourceUtil.process(RequestMethod.GET, "creditnotes/" + instancePath(Refund.class, id), Refund.class);
	}

	@JsonProperty
	public void setCustomerId(String customerId)
	{
		this.customerId = customerId;
	}

	@JsonIgnore
	public String getCustomerId()
	{
		return customerId;
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
	public void setRefundMode(String refundMode)
	{
		this.refundMode = refundMode;
	}

	@JsonIgnore
	public String getRefundMode()
	{
		return refundMode;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

	public String getDescription()
	{
		return description;
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
	public void setEmail(String email)
	{
		this.email = email;
	}

	@JsonIgnore
	public String getEmail()
	{
		return email;
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
	public void setPricePrecision(Integer pricePrecision)
	{
		this.pricePrecision = pricePrecision;
	}

	@JsonIgnore
	public Integer getPricePrecision()
	{
		return pricePrecision;
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

	@JsonIgnore
	public String getRefundId()
	{
		return refundId;
	}

	@JsonProperty
	public void setRefundId(String refundId)
	{
		this.refundId = refundId;
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
	public String getTransactionId()
	{
		return transactionId;
	}

	@JsonProperty
	public void setTransactionId(String transactionId)
	{
		this.transactionId = transactionId;
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

	@JsonIgnoreProperties(ignoreUnknown = true)
	public static class Creditnote extends Resource
	{
		@JsonIgnore
		String creditnoteId;

		@JsonIgnore
		String creditnoteNumber;

		@JsonIgnore
		String date;

		@JsonIgnore
		BigDecimal amount;

		@JsonIgnore
		BigDecimal refundAmount;

		@JsonIgnore
		BigDecimal balanceAmount;

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
		public void setCreditnoteNumber(String creditnoteNumber)
		{
			this.creditnoteNumber = creditnoteNumber;
		}

		@JsonIgnore
		public String getCreditnoteNumber()
		{
			return creditnoteNumber;
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
		public void setRefundAmount(BigDecimal refundAmount)
		{
			this.refundAmount = refundAmount;
		}

		@JsonIgnore
		public BigDecimal getRefundAmount()
		{
			return refundAmount;
		}

		@JsonProperty
		public void setBalanceAmount(BigDecimal balanceAmount)
		{
			this.balanceAmount = balanceAmount;
		}

		@JsonIgnore
		public BigDecimal getBalanceAmount()
		{
			return balanceAmount;
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

		@JsonIgnore
		String gatewayErrorMessage;

		@JsonIgnore
		public String getPaymenGateway()
		{
			return paymenGateway;
		}

		@JsonIgnore
		public void setPaymenGateway(String paymenGateway)
		{
			this.paymenGateway = paymenGateway;
		}

		@JsonIgnore
		public String getGatewayErrorMessage()
		{
			return gatewayErrorMessage;
		}

		@JsonIgnore
		public void setGatewayErrorMessage(String gatewayErrorMessage)
		{
			this.gatewayErrorMessage = gatewayErrorMessage;
		}

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
}
