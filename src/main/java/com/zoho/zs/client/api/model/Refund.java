
package com.zoho.zs.client.api.model;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.zoho.zs.client.api.exception.ZSAPIException;
import com.zoho.zs.client.api.net.Resource;
import com.zoho.zs.client.api.net.ResourceUtil;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Refund extends Resource
{

	BigDecimal amount;

	String description;


	String customerId;


	String date;


	String refundMode;


	String referenceNumber;


	String status;


	String customerName;


	String email;


	BigDecimal exchangeRate;


	Integer pricePrecision;


	String currencyCode;


	String currencySymbol;


	CreditNote creditnote;


	AutoTransaction autotransaction;


	String refundId;


	String creditnoteNumber;


	String transactionId;


	String firstName;


	String lastName;

	public static Refund retrieve(String id) throws ZSAPIException
	{
		return ResourceUtil.process(RequestMethod.GET, "creditnotes/" + instancePath(Refund.class, id), Refund.class);
	}


	public void setCustomerId(String customerId)
	{
		this.customerId = customerId;
	}


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


	public void setDate(String date)
	{
		this.date = date;
	}


	public String getDate()
	{
		return date;
	}


	public void setRefundMode(String refundMode)
	{
		this.refundMode = refundMode;
	}


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


	public void setReferenceNumber(String referenceNumber)
	{
		this.referenceNumber = referenceNumber;
	}


	public String getReferenceNumber()
	{
		return referenceNumber;
	}


	public void setStatus(String status)
	{
		this.status = status;
	}


	public String getStatus()
	{
		return status;
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


	public void setExchangeRate(BigDecimal exchangeRate)
	{
		this.exchangeRate = exchangeRate;
	}


	public BigDecimal getExchangeRate()
	{
		return exchangeRate;
	}


	public void setPricePrecision(Integer pricePrecision)
	{
		this.pricePrecision = pricePrecision;
	}


	public Integer getPricePrecision()
	{
		return pricePrecision;
	}


	public void setCurrencyCode(String currencyCode)
	{
		this.currencyCode = currencyCode;
	}


	public String getCurrencyCode()
	{
		return currencyCode;
	}


	public void setCurrencySymbol(String currencySymbol)
	{
		this.currencySymbol = currencySymbol;
	}


	public String getCurrencySymbol()
	{
		return currencySymbol;
	}


	public void setCreditNote(CreditNote creditnote)
	{
		this.creditnote = creditnote;
	}


	public CreditNote getCreditNote()
	{
		return creditnote;
	}


	public void setAutoTransaction(AutoTransaction autotransaction)
	{
		this.autotransaction = autotransaction;
	}


	public AutoTransaction getAutoTransaction()
	{
		return autotransaction;
	}


	public String getRefundId()
	{
		return refundId;
	}


	public void setRefundId(String refundId)
	{
		this.refundId = refundId;
	}


	public String getCreditNoteNumber()
	{
		return creditnoteNumber;
	}


	public void setCreditNoteNumber(String creditnoteNumber)
	{
		this.creditnoteNumber = creditnoteNumber;
	}


	public String getTransactionId()
	{
		return transactionId;
	}


	public void setTransactionId(String transactionId)
	{
		this.transactionId = transactionId;
	}


	public String getFirstName()
	{
		return firstName;
	}


	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}


	public String getLastName()
	{
		return lastName;
	}


	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	@JsonIgnoreProperties(ignoreUnknown = true)
	public static class CreditNote extends Resource
	{

		String creditNoteId;


		String creditNoteNumber;


		String date;


		BigDecimal amount;


		BigDecimal refundAmount;


		BigDecimal balanceAmount;


		public void setCreditNoteId(String creditNoteId)
		{
			this.creditNoteId = creditNoteId;
		}


		public String getCreditNoteId()
		{
			return creditNoteId;
		}


		public void setCreditNoteNumber(String creditNoteNumber)
		{
			this.creditNoteNumber = creditNoteNumber;
		}


		public String getCreditNoteNumber()
		{
			return creditNoteNumber;
		}


		public void setDate(String date)
		{
			this.date = date;
		}


		public String getDate()
		{
			return date;
		}


		public void setAmount(BigDecimal amount)
		{
			this.amount = amount;
		}


		public BigDecimal getAmount()
		{
			return amount;
		}


		public void setRefundAmount(BigDecimal refundAmount)
		{
			this.refundAmount = refundAmount;
		}


		public BigDecimal getRefundAmount()
		{
			return refundAmount;
		}


		public void setBalanceAmount(BigDecimal balanceAmount)
		{
			this.balanceAmount = balanceAmount;
		}


		public BigDecimal getBalanceAmount()
		{
			return balanceAmount;
		}

	}

	@JsonIgnoreProperties(ignoreUnknown = true)
	public static class AutoTransaction extends Resource
	{

		String autoTransactionId;


		String paymentGateway;


		String gatewayTransactionId;


		String cardId;


		String lastFourDigits;


		String expiryMonth;


		String expiryYear;


		String gatewayErrorMessage;


		public String getPaymentGateway()
		{
			return paymentGateway;
		}


		public void setPaymentGateway(String paymentGateway)
		{
			this.paymentGateway = paymentGateway;
		}


		public String getGatewayErrorMessage()
		{
			return gatewayErrorMessage;
		}


		public void setGatewayErrorMessage(String gatewayErrorMessage)
		{
			this.gatewayErrorMessage = gatewayErrorMessage;
		}


		public void setAutoTransactionId(String autoTransactionId)
		{
			this.autoTransactionId = autoTransactionId;
		}


		public String getAutoTransactionId()
		{
			return autoTransactionId;
		}


		public void setGatewayName(String paymentGateway)
		{
			this.paymentGateway = paymentGateway;
		}


		public String getGatewayName()
		{
			return paymentGateway;
		}


		public void setGatewayTransactionId(String gatewayTransactionId)
		{
			this.gatewayTransactionId = gatewayTransactionId;
		}


		public String getGatewayTransactionId()
		{
			return gatewayTransactionId;
		}

		public void setCardId(String cardId)
		{
			this.cardId = cardId;
		}


		public String getCardId()
		{
			return cardId;
		}


		public void setLastFourDigits(String lastFourDigits)
		{
			this.lastFourDigits = lastFourDigits;
		}


		public String getLastFourDigits()
		{
			return lastFourDigits;
		}


		public void setExpiryMonth(String expiryMonth)
		{
			this.expiryMonth = expiryMonth;
		}


		public String getExpiryMonth()
		{
			return expiryMonth;
		}


		public void setExpiryYear(String expiryYear)
		{
			this.expiryYear = expiryYear;
		}


		public String getExpiryYear()
		{
			return expiryYear;
		}
	}
}
