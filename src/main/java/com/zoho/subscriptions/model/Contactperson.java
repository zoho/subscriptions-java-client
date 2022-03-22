
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

	String customerId;

	Date createdTime;

	Date updatedTime;

	public static Contactperson retrieve(String customerId, String contactpersonCode) throws ZSAPIException
	{
		return ResourceUtil.process(RequestMethod.GET, instancePath(Customer.class, customerId) + "/" + instancePath(Contactperson.class, contactpersonCode), Contactperson.class);
	}

	public static ListResponse<Contactperson> list(String customerId) throws ZSAPIException
	{
		return list(customerId, GenericListParams.getDefaults());
	}

	public static ListResponse<Contactperson> list(String customerId, GenericListParams params) throws ZSAPIException
	{
		return ResourceUtil.list(RequestMethod.GET, instancePath(Customer.class, customerId) + "/" + classPath(Contactperson.class), Contactperson.class, params);
	}

	public static Contactperson create(String customerId, Contactperson contactPerson) throws ZSAPIException
	{
		return ResourceUtil.process(RequestMethod.POST, instancePath(Customer.class, customerId) + "/" + classPath(Contactperson.class), Contactperson.class, contactPerson);
	}

	public static Contactperson update(Contactperson contactperson, String customerId, String contactpersonId) throws ZSAPIException
	{
		return ResourceUtil.process(RequestMethod.PUT, instancePath(Customer.class, customerId) + "/" + instancePath(Contactperson.class, contactpersonId), Contactperson.class, contactperson);
	}

	public static void delete(String customerId, String contactpersonId) throws ZSAPIException
	{
		ResourceUtil.process(RequestMethod.DELETE, instancePath(Customer.class, customerId) + "/" + instancePath(Contactperson.class, contactpersonId), Contactperson.class);
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

	public void setCustomerId(String customerId)
	{
		this.customerId = customerId;
	}

	public String getCustomerId()
	{
		return customerId;
	}

	public Date getCreatedTime()
	{
		return createdTime;
	}

	public void setCreatedTime(Date createdTime)
	{
		this.createdTime = createdTime;
	}

	public Date getUpdatedTime()
	{
		return updatedTime;
	}

	public void setUpdatedTime(Date updatedTime)
	{
		this.updatedTime = updatedTime;
	}
}