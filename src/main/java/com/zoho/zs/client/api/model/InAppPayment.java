package com.zoho.zs.client.api.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class InAppPayment
{

	String receiptJson;

	String receiptSignature;

	String paymentGateway;

	public String getPaymentGateway()
	{
		return paymentGateway;
	}

	public void setPaymentGateway(String paymentGateway)
	{
		this.paymentGateway = paymentGateway;
	}

	public String getReceiptJson()
	{
		return receiptJson;
	}

	public void setReceiptJson(String receiptJson)
	{
		this.receiptJson = receiptJson;
	}

	public String getReceiptSignature()
	{
		return receiptSignature;
	}

	public void setReceiptSignature(String receiptSignature)
	{
		this.receiptSignature = receiptSignature;
	}

}
