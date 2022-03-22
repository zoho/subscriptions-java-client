
package com.zoho.zs.client.api.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.zoho.zs.client.api.exception.ZSAPIException;
import com.zoho.zs.client.api.net.GenericListParams;
import com.zoho.zs.client.api.net.ListResponse;
import com.zoho.zs.client.api.net.Resource;
import com.zoho.zs.client.api.net.ResourceUtil;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Organization extends Resource
{
	String name;

	String fiscalYearStartMonth;

	String currencyCode;

	String timeZone;

	String portalName;

	Address address;

	String dateFormat;

	String industryType;

	String industrySize;

	String orgAddress;

	String remitToAddress;

	String version;

	Boolean isRegisteredForTax;
	@JsonIgnore
	String taxBasis;
	@JsonIgnore
	String portalUrl;
	@JsonIgnore
	Boolean isDefaultOrg;
	@JsonIgnore
	String languageCode;
	@JsonIgnore
	String accountCreatedDateFormatted;
	@JsonIgnore
	Boolean isOrgActive;
	@JsonIgnore
	String userStatus;
	@JsonIgnore
	String userStatusFormatted;
	@JsonIgnore
	String userRole;
	@JsonIgnore
	String currencyId;
	@JsonIgnore
	String currencySymbol;
	@JsonIgnore
	String currencyFormat;
	@JsonIgnore
	Integer pricePrecision;
	@JsonIgnore
	String businessType;
	@JsonIgnore
	Boolean taxGroupEnabled;
	@JsonIgnore
	Integer status;
	@JsonIgnore
	Boolean isTransactionAvailable;
	@JsonIgnore
	String paymentsUrl;
	@JsonIgnore
	List<CustomField> customFields;
	@JsonIgnore
	String isLogoUploaded;
	@JsonIgnore
	String mode;
	@JsonIgnore
	String taxPaymentPeriod;
	@JsonIgnore
	String taxStructure;
	@JsonIgnore
	String organizationId;
	@JsonIgnore
	String contactName;
	@JsonIgnore
	String phone;
	@JsonIgnore
	String fax;
	@JsonIgnore
	String email;
	@JsonIgnore
	String unverifiedEmail;
	@JsonIgnore
	String website;
	@JsonIgnore
	String fieldSeparator;
	@JsonIgnore
	String companyidLabel;
	@JsonIgnore
	String companyidValue;
	@JsonIgnore
	String accountCreatedDate;
	@JsonIgnore
	String taxidLabel;
	@JsonIgnore
	String taxidValue;

	public static Organization retrieve(String id) throws ZSAPIException
	{
		return ResourceUtil.process(RequestMethod.GET, instancePath(Organization.class, id), Organization.class);
	}

	public static Organization update(Organization organization, String id) throws ZSAPIException
	{
		organization.setPortalName(null);
		return ResourceUtil.process(RequestMethod.PUT, instancePath(Organization.class, id), Organization.class, organization);
	}

	public static ListResponse<Organization> list() throws ZSAPIException
	{
		return list(GenericListParams.getDefaults());
	}

	public static ListResponse<Organization> list(GenericListParams params) throws ZSAPIException
	{
		return ResourceUtil.list(RequestMethod.GET, classPath(Organization.class), Organization.class, params);
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return name;
	}

	public void setFiscalYearStartMonth(String fiscalYearStartMonth)
	{
		this.fiscalYearStartMonth = fiscalYearStartMonth;
	}

	public String getFiscalYearStartMonth()
	{
		return fiscalYearStartMonth;
	}

	public void setCurrencyCode(String currencyCode)
	{
		this.currencyCode = currencyCode;
	}

	public String getCurrencyCode()
	{
		return currencyCode;
	}

	public void setTimeZone(String timeZone)
	{
		this.timeZone = timeZone;
	}

	public String getTimeZone()
	{
		return timeZone;
	}

	public void setPortalName(String portalName)
	{
		this.portalName = portalName;
	}

	public String getPortalName()
	{
		return portalName;
	}

	public void setAddress(Address address)
	{
		this.address = address;
	}

	public Address getAddress()
	{
		return address;
	}

	@JsonProperty
	public void setOrganizationId(String organizationId)
	{
		this.organizationId = organizationId;
	}

	@JsonIgnore
	public String getOrganizationId()
	{
		return organizationId;
	}

	@JsonProperty
	public void setContactName(String contactName)
	{
		this.contactName = contactName;
	}

	@JsonIgnore
	public String getContactName()
	{
		return contactName;
	}

	@JsonProperty
	public void setPhone(String phone)
	{
		this.phone = phone;
	}

	@JsonIgnore
	public String getPhone()
	{
		return phone;
	}

	@JsonProperty
	public void setFax(String fax)
	{
		this.fax = fax;
	}

	@JsonIgnore
	public String getFax()
	{
		return fax;
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
	public void setUnverifiedEmail(String unverifiedEmail)
	{
		this.unverifiedEmail = unverifiedEmail;
	}

	@JsonIgnore
	public String getUnverifiedEmail()
	{
		return unverifiedEmail;
	}

	@JsonProperty
	public void setWebsite(String website)
	{
		this.website = website;
	}

	@JsonIgnore
	public String getWebsite()
	{
		return website;
	}

	@JsonProperty
	public void setAccountCreatedDate(String accountCreatedDate)
	{
		this.accountCreatedDate = accountCreatedDate;
	}

	@JsonIgnore
	public String getAccountCreatedDate()
	{
		return accountCreatedDate;
	}

	public void setDateFormat(String dateFormat)
	{
		this.dateFormat = dateFormat;
	}

	public String getDateFormat()
	{
		return dateFormat;
	}

	@JsonProperty
	public void setFieldSeparator(String fieldSeparator)
	{
		this.fieldSeparator = fieldSeparator;
	}

	@JsonIgnore
	public String getFieldSeparator()
	{
		return fieldSeparator;
	}

	@JsonProperty
	public void setCompanyidLabel(String companyidLabel)
	{
		this.companyidLabel = companyidLabel;
	}

	@JsonIgnore
	public String getCompanyidLabel()
	{
		return companyidLabel;
	}

	@JsonProperty
	public void setCompanyidValue(String companyidValue)
	{
		this.companyidValue = companyidValue;
	}

	@JsonIgnore
	public String getCompanyidValue()
	{
		return companyidValue;
	}

	@JsonProperty
	public void setTaxidLabel(String taxidLabel)
	{
		this.taxidLabel = taxidLabel;
	}

	@JsonIgnore
	public String getTaxidLabel()
	{
		return taxidLabel;
	}

	@JsonProperty
	public void setTaxidValue(String taxidValue)
	{
		this.taxidValue = taxidValue;
	}

	@JsonIgnore
	public String getTaxidValue()
	{
		return taxidValue;
	}

	@JsonProperty
	public void setPortalUrl(String portalUrl)
	{
		this.portalUrl = portalUrl;
	}

	@JsonIgnore
	public String getPortalUrl()
	{
		return portalUrl;
	}

	@JsonIgnore
	public Boolean getIsDefaultOrg()
	{
		return isDefaultOrg;
	}

	@JsonProperty
	public void setIsDefaultOrg(Boolean isDefaultOrg)
	{
		this.isDefaultOrg = isDefaultOrg;
	}

	@JsonIgnore
	public String getLanguageCode()
	{
		return languageCode;
	}

	@JsonProperty
	public void setLanguageCode(String languageCode)
	{
		this.languageCode = languageCode;
	}

	@JsonIgnore
	public String getAccountCreatedDateFormatted()
	{
		return accountCreatedDateFormatted;
	}

	@JsonProperty
	public void setAccountCreatedDateFormatted(String accountCreatedDateFormatted)
	{
		this.accountCreatedDateFormatted = accountCreatedDateFormatted;
	}

	@JsonIgnore
	public Boolean getIsOrgActive()
	{
		return isOrgActive;
	}

	@JsonProperty
	public void setIsOrgActive(Boolean isOrgActive)
	{
		this.isOrgActive = isOrgActive;
	}

	@JsonIgnore
	public String getUserStatus()
	{
		return userStatus;
	}

	@JsonProperty
	public void setUserStatus(String userStatus)
	{
		this.userStatus = userStatus;
	}

	@JsonIgnore
	public String getUserStatusFormatted()
	{
		return userStatusFormatted;
	}

	@JsonProperty
	public void setUserStatusFormatted(String userStatusFormatted)
	{
		this.userStatusFormatted = userStatusFormatted;
	}

	@JsonIgnore
	public String getUserRole()
	{
		return userRole;
	}

	@JsonProperty
	public void setUserRole(String userRole)
	{
		this.userRole = userRole;
	}

	@JsonIgnore
	public String getCurrencyId()
	{
		return currencyId;
	}

	@JsonProperty
	public void setCurrencyId(String currencyId)
	{
		this.currencyId = currencyId;
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

	@JsonIgnore
	public String getCurrencyFormat()
	{
		return currencyFormat;
	}

	@JsonProperty
	public void setCurrencyFormat(String currencyFormat)
	{
		this.currencyFormat = currencyFormat;
	}

	@JsonIgnore
	public Integer getPricePrecision()
	{
		return pricePrecision;
	}

	@JsonProperty
	public void setPricePrecision(Integer pricePrecision)
	{
		this.pricePrecision = pricePrecision;
	}

	public String getIndustryType()
	{
		return industryType;
	}

	public void setIndustryType(String industryType)
	{
		this.industryType = industryType;
	}

	public String getIndustrySize()
	{
		return industrySize;
	}

	public void setIndustrySize(String industrySize)
	{
		this.industrySize = industrySize;
	}

	public String getOrgAddress()
	{
		return orgAddress;
	}

	public void setOrgAddress(String orgAddress)
	{
		this.orgAddress = orgAddress;
	}

	public String getRemitToAddress()
	{
		return remitToAddress;
	}

	public void setRemitToAddress(String remitToAddress)
	{
		this.remitToAddress = remitToAddress;
	}

	public String getVersion()
	{
		return version;
	}

	public void setVersion(String version)
	{
		this.version = version;
	}

	public Boolean getIsRegisteredForTax()
	{
		return isRegisteredForTax;
	}

	public void setIsRegisteredForTax(Boolean isRegisteredForTax)
	{
		this.isRegisteredForTax = isRegisteredForTax;
	}

	@JsonIgnore
	public String getTaxBasis()
	{
		return taxBasis;
	}

	@JsonProperty
	public void setTaxBasis(String taxBasis)
	{
		this.taxBasis = taxBasis;
	}

	@JsonIgnore
	public String getBusinessType()
	{
		return businessType;
	}

	@JsonProperty
	public void setBusinessType(String businessType)
	{
		this.businessType = businessType;
	}

	@JsonIgnore
	public Boolean getTaxGroupEnabled()
	{
		return taxGroupEnabled;
	}

	@JsonProperty
	public void setTaxGroupEnabled(Boolean taxGroupEnabled)
	{
		this.taxGroupEnabled = taxGroupEnabled;
	}

	@JsonIgnore
	public Integer getStatus()
	{
		return status;
	}

	@JsonProperty
	public void setStatus(Integer status)
	{
		this.status = status;
	}

	@JsonIgnore
	public Boolean getIsTransactionAvailable()
	{
		return isTransactionAvailable;
	}

	@JsonProperty
	public void setIsTransactionAvailable(Boolean isTransactionAvailable)
	{
		this.isTransactionAvailable = isTransactionAvailable;
	}

	@JsonIgnore
	public String getPaymentsUrl()
	{
		return paymentsUrl;
	}

	@JsonProperty
	public void setPaymentsUrl(String paymentsUrl)
	{
		this.paymentsUrl = paymentsUrl;
	}

	@JsonIgnore
	public List<CustomField> getCustomFields()
	{
		return customFields;
	}

	@JsonProperty
	public void setCustomFields(List<CustomField> customFields)
	{
		this.customFields = customFields;
	}

	@JsonIgnore
	public String getIsLogoUploaded()
	{
		return isLogoUploaded;
	}

	@JsonProperty
	public void setIsLogoUploaded(String isLogoUploaded)
	{
		this.isLogoUploaded = isLogoUploaded;
	}

	@JsonIgnore
	public String getMode()
	{
		return mode;
	}

	@JsonProperty
	public void setMode(String mode)
	{
		this.mode = mode;
	}

	@JsonIgnore
	public String getTaxPaymentPeriod()
	{
		return taxPaymentPeriod;
	}

	@JsonProperty
	public void setTaxPaymentPeriod(String taxPaymentPeriod)
	{
		this.taxPaymentPeriod = taxPaymentPeriod;
	}

	@JsonIgnore
	public String getTaxStructure()
	{
		return taxStructure;
	}

	@JsonProperty
	public void setTaxStructure(String taxStructure)
	{
		this.taxStructure = taxStructure;
	}

	@JsonIgnoreProperties(ignoreUnknown = true)
	public static class Address extends Resource
	{
		String streetAddress1;

		String streetAddress2;

		String city;

		String state;

		String country;

		String zip;

		public void setStreetAddress1(String streetAddress1)
		{
			this.streetAddress1 = streetAddress1;
		}

		public String getStreetAddress1()
		{
			return streetAddress1;
		}

		public void setStreetAddress2(String streetAddress2)
		{
			this.streetAddress2 = streetAddress2;
		}

		public String getStreetAddress2()
		{
			return streetAddress2;
		}

		public void setCity(String city)
		{
			this.city = city;
		}

		public String getCity()
		{
			return city;
		}

		public void setState(String state)
		{
			this.state = state;
		}

		public String getState()
		{
			return state;
		}

		public void setCountry(String country)
		{
			this.country = country;
		}

		public String getCountry()
		{
			return country;
		}

		public void setZip(String zip)
		{
			this.zip = zip;
		}

		public String getZip()
		{
			return zip;
		}
	}

}