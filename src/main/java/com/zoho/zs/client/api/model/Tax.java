package com.zoho.zs.client.api.model;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Tax {
	String taxId;
	String taxName;
	BigDecimal taxAmount;

	String taxExemptionId;
	String taxExemptionCode;
	String taxPercentage;
	Integer taxType;
	String taxAuthorityId;
	String taxAuthorityName;
	String country;
	Boolean isDefaultTax;
	Boolean isEditable;
	
	public String getTaxId() {
		return taxId;
	}
	public void setTaxId(String taxId) {
		this.taxId = taxId;
	}
	public String getTaxName() {
		return taxName;
	}
	public void setTaxName(String taxName) {
		this.taxName = taxName;
	}
	public BigDecimal getTaxAmount() {
		return taxAmount;
	}
	public void setTaxAmount(BigDecimal taxAmount) {
		this.taxAmount = taxAmount;
	}
	public String getTaxExemptionId() {
		return taxExemptionId;
	}
	public void setTaxExemptionId(String taxExemptionId) {
		this.taxExemptionId = taxExemptionId;
	}
	public String getTaxExemptionCode() {
		return taxExemptionCode;
	}
	public void setTaxExemptionCode(String taxExemptionCode) {
		this.taxExemptionCode = taxExemptionCode;
	}
	public String getTaxPercentage() {
		return taxPercentage;
	}
	public void setTaxPercentage(String taxPercentage) {
		this.taxPercentage = taxPercentage;
	}
	public Integer getTaxType() {
		return taxType;
	}
	public void setTaxType(Integer taxType) {
		this.taxType = taxType;
	}
	public String getTaxAuthorityId() {
		return taxAuthorityId;
	}
	public void setTaxAuthorityId(String taxAuthorityId) {
		this.taxAuthorityId = taxAuthorityId;
	}
	public String getTaxAuthorityName() {
		return taxAuthorityName;
	}
	public void setTaxAuthorityName(String taxAuthorityName) {
		this.taxAuthorityName = taxAuthorityName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Boolean getIsDefaultTax() {
		return isDefaultTax;
	}
	public void setIsDefaultTax(Boolean isDefaultTax) {
		this.isDefaultTax = isDefaultTax;
	}
	public Boolean getIsEditable() {
		return isEditable;
	}
	public void setIsEditable(Boolean isEditable) {
		this.isEditable = isEditable;
	}
}
