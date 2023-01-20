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

public class Extension {
	@JsonProperty("valueString")
	private String valueString;
	@JsonProperty("url")
	private String url;
	
	@JsonProperty("valueString")
	public String getValueString() {
	return valueString;
	}

	@JsonProperty("valueString")
	public void setValueString(String valueString) {
	this.valueString = valueString;
	}

	@JsonProperty("url")
	public String getUrl() {
	return url;
	}

	@JsonProperty("url")
	public void setUrl(String url) {
	this.url = url;
	}

}
