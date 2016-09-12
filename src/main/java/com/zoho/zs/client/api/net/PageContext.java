
package com.zoho.zs.client.api.net;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PageContext
{
	private String page;

	private String perPage;

	private String total;

	private String totalPages;

	public String getPage()
	{
		return page;
	}

	public void setPage(String page)
	{
		this.page = page;
	}

	public String getPerPage()
	{
		return perPage;
	}

	public void setPerPage(String perPage)
	{
		this.perPage = perPage;
	}

	public String getTotal()
	{
		return total;
	}

	public void setTotal(String total)
	{
		this.total = total;
	}

	public String getTotalPages()
	{
		return totalPages;
	}

	public void setTotalPages(String totalPages)
	{
		this.totalPages = totalPages;
	}

	private String hasMorePage;

	public void setHasMorePage(String hasMorePage)
	{
		this.hasMorePage = hasMorePage;
	}

	public String getHasMorePage()
	{
		return hasMorePage;
	}

	private String appliedFilter;

	public void setAppliedFilter(String appliedFilter)
	{
		this.appliedFilter = appliedFilter;
	}

	public String getAppliedFilter()
	{
		return appliedFilter;
	}

	private String sortColumn;

	public void setSortColumn(String sortColumn)
	{
		this.sortColumn = sortColumn;
	}

	public String getSortColumn()
	{
		return sortColumn;
	}

	private String sortOrder;

	public void setSortOrder(String sortOrder)
	{
		this.sortOrder = sortOrder;
	}

	public String getSortOrder()
	{
		return sortOrder;
	}

	private String reportName;

	public void setReportName(String reportName)
	{
		this.reportName = reportName;
	}

	public String getReportName()
	{
		return reportName;
	}

}
