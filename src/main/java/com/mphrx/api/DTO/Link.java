package com.mphrx.api.DTO;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

public class Link {

	@JsonProperty("url")
	private String url;
	@JsonProperty("relation")
	private String relation;
	
	@JsonProperty("url")
	public String getUrl() {
	return url;
	}

	@JsonProperty("url")
	public void setUrl(String url) {
	this.url = url;
	}

	@JsonProperty("relation")
	public String getRelation() {
	return relation;
	}

	@JsonProperty("relation")
	public void setRelation(String relation) {
	this.relation = relation;
	}

}
