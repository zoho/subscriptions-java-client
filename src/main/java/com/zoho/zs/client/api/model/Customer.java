
package com.zoho.zs.client.api.model;

import java.lang.String;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.zoho.zs.client.api.exception.ZSAPIException;
import com.zoho.zs.client.api.net.GenericListParams;
import com.zoho.zs.client.api.net.ListResponse;
import com.zoho.zs.client.api.net.QueryParams;
import com.zoho.zs.client.api.net.Resource;
import com.zoho.zs.client.api.net.ResourceUtil;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Customer extends Resource
{

	String companyName;

	String displayName;

	String firstName;

	String lastName;

	String currencyCode;

	String email;

	String phone;

	String mobile;

	BillingAddress billingAddress;

	ShippingAddress shippingAddress;

	List<Customer.Customfield> customFields;

	String notes;

	BigDecimal amount;
	String taxAuthority;

	String description;

	String isTaxable;

	String taxId;

	String taxExemptionCode;

	String countryCode;

	String vatRegNo;

	String vatTreatment;

	String taxAuthorityId;

	String taxAuthorityName;

	String taxExemptionId;

	Integer paymentTerms;

	String paymentTermsLabel;

	@JsonIgnore
	String taxName;
	@JsonIgnore
	BigDecimal taxPercentage;
	@JsonIgnore
	String zcrmAccountId;
	@JsonIgnore
	String zcrmContactId;
	@JsonIgnore
	List<Contactperson> contactpersons;
	@JsonIgnore
	List<Card> cards;
	@JsonIgnore
	List<BankAccount> bankAccounts;
	@JsonIgnore
	List<Subscription> subscriptions;

	@JsonIgnore
	String customerId;

	@JsonIgnore
	String currencySymbol;

	@JsonIgnore
	String status;

	@JsonIgnore
	BigDecimal unusedCredits;

	@JsonIgnore
	BigDecimal outstandingReceivableAmount;

	@JsonIgnore
	BigDecimal outstanding;

	@JsonIgnore
	Date createdTime;

	@JsonIgnore
	Date updatedTime;

	@JsonIgnore
	String currencyId;

	@JsonIgnore
	Integer pricePrecision;

	String pricebookId;

	Card card;

	BankAccount bankAccount;

	String website;

	@JsonIgnore
	String primaryContactpersonId;

	public static Customer retrieve(String customerCode) throws ZSAPIException
	{
		return ResourceUtil.process(RequestMethod.GET, instancePath(Customer.class, customerCode), Customer.class);
	}

	public static Customer retrieve(String customerCode, QueryParams params) throws ZSAPIException
	{
		return ResourceUtil.process(RequestMethod.GET, instancePath(Customer.class, customerCode), Customer.class, params);
	}

	public static ListResponse<Customer> list() throws ZSAPIException
	{
		return list(GenericListParams.getDefaults());
	}

	public static ListResponse<Customer> list(GenericListParams params) throws ZSAPIException
	{
		return ResourceUtil.list(RequestMethod.GET, classPath(Customer.class), Customer.class, params);
	}

	public static Customer create(Customer customer) throws ZSAPIException
	{
		return ResourceUtil.process(RequestMethod.POST, classPath(Customer.class), Customer.class, customer);
	}

	public static Customer update(Customer customer, String customerCode) throws ZSAPIException
	{
		return ResourceUtil.process(RequestMethod.PUT, instancePath(Customer.class, customerCode), Customer.class, customer);
	}

	public static void delete(String customerCode) throws ZSAPIException
	{
		ResourceUtil.process(RequestMethod.DELETE, instancePath(Customer.class, customerCode), Customer.class);
	}

	public void setCompanyName(String companyName)
	{
		this.companyName = companyName;
	}

	public String getCompanyName()
	{
		return companyName;
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

	public void setBillingAddress(BillingAddress billingAddress)
	{
		this.billingAddress = billingAddress;
	}

	public BillingAddress getBillingAddress()
	{
		return billingAddress;
	}

	public void setShippingAddress(ShippingAddress shippingAddress)
	{
		this.shippingAddress = shippingAddress;
	}

	public ShippingAddress getShippingAddress()
	{
		return shippingAddress;
	}

	public void setNotes(String notes)
	{
		this.notes = notes;
	}

	public String getNotes()
	{
		return notes;
	}

	public String getIsTaxable()

	{
		return isTaxable;
	}

	public String getTaxAuthority()
	{
		return taxAuthority;
	}

	public void setTaxAuthority(String taxAuthority)
	{
		this.taxAuthority = taxAuthority;
	}

	public void setPaymentTerms(Integer paymentTerms)
	{
		this.paymentTerms = paymentTerms;
	}

	public String getTaxId()
	{
		return taxId;
	}

	public void setTaxId(String taxId)
	{
		this.taxId = taxId;
	}

	public String getTaxExemptionCode()
	{
		return taxExemptionCode;
	}

	public void setTaxExemptionCode(String taxExemptionCode)
	{
		this.taxExemptionCode = taxExemptionCode;
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

	@JsonProperty
	public void setUnusedCredits(BigDecimal unusedCredits)
	{
		this.unusedCredits = unusedCredits;
	}

	@JsonIgnore
	public BigDecimal getUnusedCredits()
	{
		return unusedCredits;
	}

	@JsonIgnore
	public BigDecimal getOutstandingReceivableAmount()
	{
		return outstandingReceivableAmount;
	}

	@JsonProperty
	public void setOutstandingReceivableAmount(BigDecimal outstandingReceivableAmount)
	{
		this.outstandingReceivableAmount = outstandingReceivableAmount;
	}

	@JsonProperty
	public void setOutstanding(BigDecimal outstanding)
	{
		this.outstanding = outstanding;
	}

	@JsonIgnore
	public BigDecimal getOutstanding()
	{
		return outstanding;
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
	public void setUpdatedTime(Date updatedTime)
	{
		this.updatedTime = updatedTime;
	}

	@JsonIgnore
	public Date getUpdatedTime()
	{
		return updatedTime;
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

	public void setDisplayName(String displayName)
	{
		this.displayName = displayName;
	}

	public String getDisplayName()
	{
		return displayName;
	}

	public void setCurrencyCode(String currencyCode)
	{
		this.currencyCode = currencyCode;
	}

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
	public void setCurrencyId(String currencyId)
	{
		this.currencyId = currencyId;
	}

	@JsonIgnore
	public String getCurrencyId()
	{
		return currencyId;
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

	public String getPricebookId()
	{
		return pricebookId;
	}

	public void setPricebookId(String pricebookId)
	{
		this.pricebookId = pricebookId;
	}

	public List<Customer.Customfield> getCustomFields()
	{
		return customFields;
	}

	public void setCustomFields(List<Customer.Customfield> customFields)
	{
		this.customFields = customFields;
	}

	public String getCountryCode()
	{
		return countryCode;
	}

	public void setCountryCode(String countryCode)
	{
		this.countryCode = countryCode;
	}

	public String getVatRegNo()
	{
		return vatRegNo;
	}

	public void setVatRegNo(String vatRegNo)
	{
		this.vatRegNo = vatRegNo;
	}

	public String getVatTreatment()
	{
		return vatTreatment;
	}

	public void setVatTreatment(String vatTreatment)
	{
		this.vatTreatment = vatTreatment;
	}

	public String getTaxAuthorityId()
	{
		return taxAuthorityId;
	}

	public void setTaxAuthorityId(String taxAuthorityId)
	{
		this.taxAuthorityId = taxAuthorityId;
	}

	public String getTaxAuthorityName()
	{
		return taxAuthorityName;
	}

	public void setTaxAuthorityName(String taxAuthorityName)
	{
		this.taxAuthorityName = taxAuthorityName;
	}

	public String getTaxExemptionId()
	{
		return taxExemptionId;
	}

	public void setTaxExemptionId(String taxExemptionId)
	{
		this.taxExemptionId = taxExemptionId;
	}

	public Integer getPaymentTerms()
	{
		return paymentTerms;
	}

	public String getPaymentTermsLabel()
	{
		return paymentTermsLabel;
	}

	public void setPaymentTermsLabel(String paymentTermsLabel)
	{
		this.paymentTermsLabel = paymentTermsLabel;
	}

	@JsonIgnore
	public String getTaxName()
	{
		return taxName;
	}

	@JsonProperty
	public void setTaxName(String taxName)
	{
		this.taxName = taxName;
	}

	@JsonIgnore
	public BigDecimal getTaxPercentage()
	{
		return taxPercentage;
	}

	@JsonProperty
	public void setTaxPercentage(BigDecimal taxPercentage)
	{
		this.taxPercentage = taxPercentage;
	}

	@JsonIgnore
	public String getZcrmAccountId()
	{
		return zcrmAccountId;
	}

	@JsonProperty
	public void setZcrmAccountId(String zcrmAccountId)
	{
		this.zcrmAccountId = zcrmAccountId;
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

	@JsonIgnore
	public List<Contactperson> getContactpersons()
	{
		return contactpersons;
	}

	@JsonProperty
	public void setContactpersons(List<Contactperson> contactpersons)
	{
		this.contactpersons = contactpersons;
	}

	@JsonIgnore
	public List<Card> getCards()
	{
		return cards;
	}

	@JsonProperty
	public void setCards(List<Card> cards)
	{
		this.cards = cards;
	}

	@JsonIgnore
	public List<BankAccount> getBankAccounts()
	{
		return bankAccounts;
	}

	@JsonProperty
	public void setBankAccounts(List<BankAccount> bankAccounts)
	{
		this.bankAccounts = bankAccounts;
	}

	@JsonIgnore
	public List<Subscription> getSubscriptions()
	{
		return subscriptions;
	}

	@JsonProperty
	public void setSubscriptions(List<Subscription> subscriptions)
	{
		this.subscriptions = subscriptions;
	}

	public Card getCard()
	{
		return card;
	}

	public void setCard(Card card)
	{
		this.card = card;
	}

	public BankAccount getBankAccount()
	{
		return bankAccount;
	}

	public void setBankAccount(BankAccount bankAccount)
	{
		this.bankAccount = bankAccount;
	}

	public String getWebsite()
	{
		return website;
	}

	public void setWebsite(String website)
	{
		this.website = website;
	}

	public void setIsTaxable(String isTaxable)
	{
		this.isTaxable = isTaxable;
	}

	@JsonProperty
	public void setPrimaryContactpersonId(String primaryContactpersonId)
	{
		this.primaryContactpersonId = primaryContactpersonId;
	}

	@JsonIgnore
	public String getPrimaryContactpersonId()
	{
		return primaryContactpersonId;
	}

	@JsonIgnoreProperties(ignoreUnknown = true)
	public static class BillingAddress extends Resource
	{
		String street;

		String city;

		String state;

		String zip;

		String country;

		String fax;

		public void setStreet(String street)
		{
			this.street = street;
		}

		public String getStreet()
		{
			return street;
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

		public void setZip(String zip)
		{
			this.zip = zip;
		}

		public String getZip()
		{
			return zip;
		}

		public void setCountry(String country)
		{
			this.country = country;
		}

		public String getCountry()
		{
			return country;
		}

		public void setFax(String fax)
		{
			this.fax = fax;
		}

		public String getFax()
		{
			return fax;
		}
	}

	@JsonIgnoreProperties(ignoreUnknown = true)
	public static class ShippingAddress
	{
		String street;

		String city;

		String state;

		String zip;

		String country;

		String fax;

		public void setStreet(String street)
		{
			this.street = street;
		}

		public String getStreet()
		{
			return street;
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

		public void setZip(String zip)
		{
			this.zip = zip;
		}

		public String getZip()
		{
			return zip;
		}

		public void setFax(String fax)
		{
			this.fax = fax;
		}

		public String getFax()
		{
			return fax;
		}

		public void setCountry(String country)
		{
			this.country = country;
		}

		public String getCountry()
		{
			return country;
		}
	}

	@JsonIgnoreProperties(ignoreUnknown = true)
	public static class Customfield
	{
		String index;

		String value;

		String label;

		public String getIndex()
		{
			return index;
		}

		public String getValue()
		{
			return value;
		}

		public String getLabel()
		{
			return label;
		}

		public void setIndex(String index)
		{
			this.index = index;
		}

		public void setValue(String value)
		{
			this.value = value;
		}

		public void setLabel(String label)
		{
			this.label = label;
		}
	}
}