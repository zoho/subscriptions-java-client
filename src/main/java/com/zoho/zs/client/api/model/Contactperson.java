
package com.zoho.zs.client.api.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.zoho.zs.client.api.exception.ZSAPIException;
import com.zoho.zs.client.api.net.GenericListParams;
import com.zoho.zs.client.api.net.ListResponse;
import com.zoho.zs.client.api.net.Resource;
import com.zoho.zs.client.api.net.ResourceUtil;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Contactperson extends Resource
{
	String firstName;

	String lastName;

	String email;

	String phone;

	String mobile;
	@JsonIgnore
	String zcrmContactId;

	String contactpersonId;

	@JsonIgnore
	String customerCode;

	@JsonIgnore
	Date createdTime;

	@JsonIgnore
	Date updatedTime;

	public static Contactperson retrieve(String customerCode, String contactpersonCode) throws ZSAPIException
	{
		return ResourceUtil.process(RequestMethod.GET, instancePath(Customer.class, customerCode) + "/" + instancePath(Contactperson.class, contactpersonCode), Contactperson.class);
	}

	public static ListResponse<Contactperson> list(String customerCode) throws ZSAPIException
	{
		return list(customerCode, GenericListParams.getDefaults());
	}

	public static ListResponse<Contactperson> list(String customerCode, GenericListParams params) throws ZSAPIException
	{
		return ResourceUtil.list(RequestMethod.GET, instancePath(Customer.class, customerCode) + "/" + classPath(Contactperson.class), Contactperson.class, params);
	}

	public static Contactperson create(String customerCode, Contactperson contactPerson) throws ZSAPIException
	{
		return ResourceUtil.process(RequestMethod.POST, instancePath(Customer.class, customerCode) + "/" + classPath(Contactperson.class), Contactperson.class, contactPerson);
	}

	public static Contactperson update(Contactperson contactperson, String customerCode, String contactpersonCode) throws ZSAPIException
	{
		return ResourceUtil.process(RequestMethod.PUT, instancePath(Customer.class, customerCode) + "/" + instancePath(Contactperson.class, contactpersonCode), Contactperson.class, contactperson);
	}

	public static void delete(String customerCode, String contactpersonCode) throws ZSAPIException
	{
		ResourceUtil.process(RequestMethod.DELETE, instancePath(Customer.class, customerCode) + "/" + instancePath(Contactperson.class, contactpersonCode), Contactperson.class);
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public String getFirstName()
	{
		return firstName;
	}

	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public String getEmail()
	{
		return email;
	}

	public void setPhone(String phone)
	{
		this.phone = phone;
	}

	public String getPhone()
	{
		return phone;
	}

	public void setMobile(String mobile)
	{
		this.mobile = mobile;
	}

	public String getMobile()
	{
		return mobile;
	}

	public void setContactpersonId(String contactpersonId)
	{
		this.contactpersonId = contactpersonId;
	}

	public String getContactpersonId()
	{
		return contactpersonId;
	}

	@JsonIgnore
	public String getZcrmContactId()
	{
		return zcrmContactId;
	}

	@JsonProperty
	public void setZcrmContactId(String zcrmContactId)
	{
		this.zcrmContactId = zcrmContactId;
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

	@JsonIgnore
	public Date getCreatedTime()
	{
		return createdTime;
	}

	@JsonProperty
	public void setCreatedTime(Date createdTime)
	{
		this.createdTime = createdTime;
	}

	@JsonIgnore
	public Date getUpdatedTime()
	{
		return updatedTime;
	}

	@JsonProperty
	public void setUpdatedTime(Date updatedTime)
	{
		this.updatedTime = updatedTime;
	}
}