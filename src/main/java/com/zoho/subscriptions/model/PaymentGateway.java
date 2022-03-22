package com.zoho.zs.client.api.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by aravinth-3063 on 14/06/16.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PaymentGateway
{
	String gatewayName;

	public String getGatewayName()
	{
		return gatewayName;
	}

	public void setGatewayName(String gatewayName)
	{
		this.gatewayName = gatewayName;
	}
}
