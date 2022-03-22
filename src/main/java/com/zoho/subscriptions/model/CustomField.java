package com.zoho.zs.client.api.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.zoho.zs.client.api.net.Resource;


@JsonIgnoreProperties(ignoreUnknown = true)

public class CustomField extends Resource {
    String customFieldId ;

    String value;

    String label;

    String index;

    public void setIndex(String index) {
        this.index = index;
    }

    public String getIndex() {
        return index;
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

    private void setCustomfieldId(String customFieldId) {
        this.customFieldId = customFieldId;
    }

}
