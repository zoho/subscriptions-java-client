
package com.zoho.zs.client.api.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Activity
{
	String activityId;

	String description;

	Date activityTime;

	public String getActivityId()
	{
		return activityId;
	}

	public void setActivityId(String activityId)
	{
		this.activityId = activityId;
	}

	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

	public Date getActivityTime()
	{
		return activityTime;
	}

	public void setActivityTime(Date activityTime)
	{
		this.activityTime = activityTime;
	}

}
