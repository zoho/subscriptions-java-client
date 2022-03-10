package com.zoho.zs.client.api.model;

import com.zoho.zs.client.api.net.Resource;

public class CustomField extends Resource {
    String customFieldId ;

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

    public  String getSearchEntity() {
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
