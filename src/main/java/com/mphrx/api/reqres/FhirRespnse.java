package com.mphrx.api.reqres;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.mphrx.api.DTO.Entry;
import com.mphrx.api.DTO.Link;

public class FhirRespnse {
	@JsonProperty("entry")
	private List<Entry> entry;
	@JsonProperty("total")
	private Integer total;
	@JsonProperty("link")
	private List<Link> link;
	@JsonProperty("type")
	private String type;
	@JsonProperty("resourceType")
	private String resourceType;


	@JsonProperty("entry")
	public List<Entry> getEntry() {
		return entry;
	}

	@JsonProperty("entry")
	public void setEntry(List<Entry> entry) {
		this.entry = entry;
	}

	@JsonProperty("total")
	public Integer getTotal() {
		return total;
	}

	@JsonProperty("total")
	public void setTotal(Integer total) {
		this.total = total;
	}

	@JsonProperty("link")
	public List<Link> getLink() {
		return link;
	}

	@JsonProperty("link")
	public void setLink(List<Link> link) {
		this.link = link;
	}

	@JsonProperty("type")
	public String getType() {
		return type;
	}

	@JsonProperty("type")
	public void setType(String type) {
		this.type = type;
	}

	@JsonProperty("resourceType")
	public String getResourceType() {
		return resourceType;
	}

	@JsonProperty("resourceType")
	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
	}

	@Override
	public String toString() {
		return "FhirRespnse [total=" + total + ", type=" + type + ", resourceType=" + resourceType + "]";
	}

	/**
	 * @param entry
	 * @param total
	 * @param link
	 * @param type
	 * @param resourceType
	 */
	public FhirRespnse(List<Entry> entry, Integer total, List<Link> link, String type, String resourceType) {
		this.entry = entry;
		this.total = total;
		this.link = link;
		this.type = type;
		this.resourceType = resourceType;
	}

	/**
	 * 
	 */
	public FhirRespnse() {
		// TODO Auto-generated constructor stub
	}

	

}