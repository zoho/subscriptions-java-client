

package com.zoho.zs.client.api.model;

import java.math.BigDecimal;
import java.util.Date;
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
public class Plan extends Resource {
	String planCode;

	String name;

	String productId;

	String productType;

	String accountId;

	Integer trialPeriod;

	BigDecimal setupFee;

	BigDecimal recurringPrice;

	Integer interval;

	String intervalUnit;

	Integer billingCycles;

	String taxId;

	Boolean isTaxable;

	String taxExemptionId;

	String taxExemptionCode;

	Boolean showInWidget;

	Boolean showInPortal;

	String Description;

	@JsonIgnore
	String taxName;

	@JsonIgnore
	String taxPercentage;

	@JsonIgnore
	String taxType;

	@JsonIgnore
	String planId;

	@JsonIgnore
	String status;

	@JsonIgnore
	Date createdTime;

	@JsonIgnore
	Date updatedTime;

	@JsonIgnore
	List<Addon> addons;

	List<Plan.CustomField> customFields;

	List<Plan.Tag> tags;

	public static Plan retrieve(String planCode) throws ZSAPIException {
		return ResourceUtil.process(RequestMethod.GET, instancePath(Plan.class, planCode), Plan.class);
	}

	public static ListResponse<Plan> list() throws ZSAPIException {
		return list(GenericListParams.getDefaults());
	}

	public static ListResponse<Plan> list(GenericListParams params) throws ZSAPIException {
		return ResourceUtil.list(RequestMethod.GET, classPath(Plan.class), Plan.class, params);
	}

	public static Plan create(Plan plan) throws ZSAPIException {
		return ResourceUtil.process(RequestMethod.POST, classPath(Plan.class), Plan.class, plan);
	}

	public static void markAsActive(String planCode) throws ZSAPIException {
		ResourceUtil.process(RequestMethod.POST, instancePath(Plan.class, planCode) + "/markasactive", Plan.class);
	}

	public static void markAsInactive(String planCode) throws ZSAPIException {
		ResourceUtil.process(RequestMethod.POST, instancePath(Plan.class, planCode) + "/markasinactive", Plan.class);
	}

	public static Plan update(Plan plan, String planCode) throws ZSAPIException {
		return ResourceUtil.process(RequestMethod.PUT, instancePath(Plan.class, planCode), Plan.class, plan);
	}

	public static void delete(String planCode) throws ZSAPIException {
		ResourceUtil.process(RequestMethod.DELETE, instancePath(Plan.class, planCode), Plan.class);
	}

	public void setPlanCode(String planCode) {
		this.planCode = planCode;
	}

	public String getPlanCode() {
		return planCode;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getProductType() {
		return productType;
	}

	public void setTaxId(String taxId) {
		this.taxId = taxId;
	}

	public String getTaxId() {
		return taxId;
	}

	@JsonProperty
	public void setTaxName(String taxName) {
		this.taxName = taxName;
	}

	@JsonIgnore
	public String getTaxName() {
		return taxName;
	}

	@JsonProperty
	public void setTaxType(String taxType) {
		this.taxType = taxType;
	}

	@JsonIgnore
	public String getTaxType() {
		return taxType;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setTrialPeriod(Integer trialPeriod) {
		this.trialPeriod = trialPeriod;
	}

	public Integer getTrialPeriod() {
		return trialPeriod;
	}

	public void setSetupFee(BigDecimal setupFee) {
		this.setupFee = setupFee;
	}

	public BigDecimal getSetupFee() {
		return setupFee;
	}

	public void setRecurringPrice(BigDecimal recurringPrice) {
		this.recurringPrice = recurringPrice;
	}

	public BigDecimal getRecurringPrice() {
		return recurringPrice;
	}

	public void setInterval(Integer interval) {
		this.interval = interval;
	}

	public Integer getInterval() {
		return interval;
	}

	public void setIntervalUnit(String intervalUnit) {
		this.intervalUnit = intervalUnit;
	}

	public String getIntervalUnit() {
		return intervalUnit;
	}

	public void setBillingCycles(Integer billingCycles) {
		this.billingCycles = billingCycles;
	}

	public Integer getBillingCycles() {
		return billingCycles;
	}

	@JsonProperty
	public void setPlanId(String planId) {
		this.planId = planId;
	}

	@JsonIgnore
	public String getPlanId() {
		return planId;
	}

	@JsonProperty
	public void setStatus(String status) {
		this.status = status;
	}

	@JsonIgnore
	public String getStatus() {
		return status;
	}

	@JsonProperty
	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	@JsonIgnore
	public Date getCreatedTime() {
		return createdTime;
	}

	@JsonProperty
	public void setUpdatedTime(Date updatedTime) {
		this.updatedTime = updatedTime;
	}

	@JsonIgnore
	public Date getUpdatedTime() {
		return updatedTime;
	}

	public void setIsTaxable(Boolean isTaxable) {
		this.isTaxable = isTaxable;
	}

	public Boolean getIsTaxable() {
		return isTaxable;
	}

	public void setTaxExemptionCode(String taxExemptionCode) {
		this.taxExemptionCode = taxExemptionCode;
	}

	public String getTaxExemptionId() {
		return taxExemptionId;
	}

	public void setTaxExemptionId(String taxExemptionId) {
		this.taxExemptionId = taxExemptionId;
	}

	public String getTaxPercentage() {
		return taxPercentage;
	}

	public void setTaxPercentage(String taxPercentage) {
		this.taxPercentage = taxPercentage;
	}

	public String getTaxExemptionCode() {
		return taxExemptionCode;
	}

	public void setShowInWidget(Boolean showInWidget) {
		this.showInWidget = showInWidget;
	}

	public Boolean getShowInWidget() {
		return this.showInWidget;
	}

	public void setShowInPortal(Boolean showInPortal) {
		this.showInPortal = showInPortal;
	}

	public Boolean getShowInPortal() {
		return this.showInPortal;
	}

	public void setDescription(String Description) {
		this.Description = Description;
	}

	public String getDescription() {
		return this.Description;
	}

	@JsonProperty
	public void setAddons(List<Addon> addons) {
		this.addons = addons;
	}

	@JsonIgnore
	public List<Addon> getAddons() {
		return addons;
	}

	public void setCustomFields(List<Plan.CustomField> customFields) {
		this.customFields = customFields;
	}

	public List<Plan.CustomField> getCustomFields() {
		return customFields;
	}

	public void setTags(List<Plan.Tag> tags){this.tags=tags;}

	public List<Plan.Tag> getTags(){return tags;}

	public static class CustomField extends Resource {
		String customFieldId;

		String value;

		String label;

		String showInStore;

		String showInPortal;

		String placeholder;

		String isActive;

		String index;

		Boolean showOnPdf;

		Boolean editOnPortal;

		Boolean editOnStore;

		Boolean showInAllPdf;

		String valueFormatted;

		String searchEntity;

		String dataType;

		Boolean isDependentField;

		public void setValueFormatted(String valueFormatted) {
			this.valueFormatted = valueFormatted;
		}

		public String getValueFormatted() {
			return valueFormatted;
		}

		public void setSearchEntity(String searchEntity) {
			this.searchEntity = searchEntity;
		}

		public String getSearchEntity() {
			return searchEntity;
		}

		public void setDataType(String dataType) {
			this.dataType = dataType;
		}

		public String getDataType() {
			return dataType;
		}

		public void setShowOnPdf(Boolean showOnPdf) {
			this.showOnPdf = showOnPdf;
		}

		public Boolean getShowOnPdf() {
			return showOnPdf;
		}

		public void setEditOnPortal(Boolean editOnPortal) {
			this.editOnPortal = editOnPortal;
		}

		public Boolean getEditOnPortal() {
			return editOnPortal;
		}

		public void setEditOnStore(Boolean editOnStore) {
			this.editOnStore = editOnStore;
		}

		public Boolean getEditOnStore() {
			return editOnStore;
		}

		public void setShowInAllPdf(Boolean showInAllPdf) {
			this.showInAllPdf = showInAllPdf;
		}

		public Boolean getShowInAllPdf() {
			return showInAllPdf;
		}

		public void setIsDependentField(Boolean isDependentField) {
			this.isDependentField = isDependentField;
		}

		public Boolean getIsDependentField() {
			return isDependentField;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}

		public void setLabel(String label) {
			this.label = label;
		}

		public String getLabel() {
			return label;
		}

		public String getCustomfieldId() {
			return customFieldId;
		}

		public void setCustomfieldId(String customFieldId) {
			this.customFieldId = customFieldId;
		}

		public void setShowInStore(String showInStore) {
			this.showInStore = showInStore;
		}

		public String getShowInStore() {
			return showInStore;
		}

		public void setShowInPortal(String showInPortal) {
			this.showInPortal = showInPortal;
		}

		public String getShowInPortal() {
			return showInPortal;
		}

		public void setPlaceholder(String placeholder) {
			this.placeholder = placeholder;
		}

		public String getPlaceholder() {
			return placeholder;
		}

		public void setIsActive(String isActive) {
			this.isActive = isActive;
		}

		public String getIsActive() {
			return isActive;
		}

		public void setIndex(String index) {
			this.index = index;
		}

		public String getIndex() {
			return index;
		}

	}

	public static class Tag {
		String tagOptionId;

		Boolean isTagMandatory;

		String tagName;

		String tagId;

		String tagOptionName;

		public void setTagOptionId(String tagOptionId) {this.tagOptionId = tagOptionId;}
		public String getTagOptionId() {return tagOptionId;}

		public void setTagName(String tagName) {this.tagName = tagName;}
		public String getTagName() {return tagName;}

		public void setTagId(String tagId) {this.tagId = tagId;}
		public String getTagId() {return tagId;}

		public void setTagOptionName(String tagOptionName) {this.tagOptionName= tagOptionName;}
		public String getTagOptionName() {return tagOptionName;}

		public void setIsTagMandatory(Boolean isTagMandatory){this.isTagMandatory = isTagMandatory;}
		public Boolean getIsTagMandatory(){return isTagMandatory;}
	}
}