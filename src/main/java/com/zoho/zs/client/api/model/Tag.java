package com.zoho.zs.client.api.model;

import com.zoho.zs.client.api.net.Resource;

public class Tag extends Resource {
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
