
package com.zoho.zs.client.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.zoho.zs.client.api.exception.ZSAPIException;
import com.zoho.zs.client.api.net.GenericListParams;
import com.zoho.zs.client.api.net.ListResponse;
import com.zoho.zs.client.api.net.Resource;
import com.zoho.zs.client.api.net.ResourceUtil;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Bank_Account extends Resource
{
	String gateway;

	String cardNumber;

	String cvvNumber;

	String accountNumber;

	String accountType;

	String routingNumber;

	String bankName;

	String firstName;

	String lastName;

	String acceptLicense;

	String accountId;

	String lastFourDigits;

	String subscriptionCount;

	String customerId;

	String customerName;

	String status;

	public static ListResponse<Bank_Account> retrieve(String customerId,String AccountId) throws ZSAPIException
	{
		GenericListParams params = null;
		return ResourceUtil.list(RequestMethod.GET,instancePath(Customer.class,customerId)+"/bankaccounts/"+AccountId,Bank_Account.class,params);
	}
	public static void delete(String customerId,String AccountId) throws ZSAPIException
	{
		ResourceUtil.process(RequestMethod.DELETE, instancePath(Customer.class, customerId)+"/bankaccounts/"+AccountId, Bank_Account.class);
	}


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

	public String getGateway()
	{
		return gateway;
	}

	public void setGateway(String gateway)
	{
		this.gateway = gateway;
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

	public String getAccountId()
	{
		return accountId;
	}

	public void setAccountId(String accountId)
	{
		this.accountId = accountId;
	}

	public String getLastFourDigits()
	{
		return lastFourDigits;
	}

	public void setLastFourDigits(String lastFourDigits)
	{
		this.lastFourDigits = lastFourDigits;
	}

	public String getSubscriptionCount()
	{
		return subscriptionCount;
	}

	public void setSubscriptionCount(String subscriptionCount)
	{
		this.subscriptionCount = subscriptionCount;
	}
	public void setCustomerName(String customerName)
	{
		this.customerName = customerName;
	}

	public String getCustomerName()
	{
		return customerName;
	}

	public void setCustomerId(String customerId)
	{
		this.customerId = customerId;
	}

	public String getCustomerId()
	{
		return customerId;
	}

	public String getStatus()
	{
		return status;
	}

	public void setStatus(String status)
	{
		this.status = status;
	}

}
