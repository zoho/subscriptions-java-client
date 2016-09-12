
package com.zoho.zs.client.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.zoho.zs.client.api.net.Resource;

public class BankAccount extends Resource
{
	String paymentGateway;
	String cardNumber;
	String cvvNumber;

	String accountNumber;

	String accountType;

	String routingNumber;

	String bankName;

	String firstName;

	String lastName;

	String acceptLicense;

	@JsonIgnore
	String accountId;

	@JsonIgnore
	String lastFourDigits;

	@JsonIgnore
	String subscriptionCount;

	public String getCvvNumber()
	{
		return cvvNumber;
	}

	public void setCvvNumber(String cvvNumber)
	{
		this.cvvNumber = cvvNumber;
	}

	public String getCardNumber()
	{
		return cardNumber;
	}

	public void setCardNumber(String cardNumber)
	{
		this.cardNumber = cardNumber;
	}

	public String getPaymentGateway()
	{
		return paymentGateway;
	}

	public void setPaymentGateway(String paymentGateway)
	{
		this.paymentGateway = paymentGateway;
	}

	public String getAccountNumber()
	{
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber)
	{
		this.accountNumber = accountNumber;
	}

	public String getAccountType()
	{
		return accountType;
	}

	public void setAccountType(String accountType)
	{
		this.accountType = accountType;
	}

	public String getRoutingNumber()
	{
		return routingNumber;
	}

	public void setRoutingNumber(String routingNumber)
	{
		this.routingNumber = routingNumber;
	}

	public String getBankName()
	{
		return bankName;
	}

	public void setBankName(String bankName)
	{
		this.bankName = bankName;
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

	public String getAcceptLicense()
	{
		return acceptLicense;
	}

	public void setAcceptLicense(String acceptLicense)
	{
		this.acceptLicense = acceptLicense;
	}

	@JsonIgnore
	public String getAccountId()
	{
		return accountId;
	}

	@JsonProperty
	public void setAccountId(String accountId)
	{
		this.accountId = accountId;
	}

	@JsonIgnore
	public String getLastFourDigits()
	{
		return lastFourDigits;
	}

	@JsonProperty
	public void setLastFourDigits(String lastFourDigits)
	{
		this.lastFourDigits = lastFourDigits;
	}

	@JsonIgnore
	public String getSubscriptionCount()
	{
		return subscriptionCount;
	}

	@JsonProperty
	public void setSubscriptionCount(String subscriptionCount)
	{
		this.subscriptionCount = subscriptionCount;
	}
}
