package com.mphrx.api.DTO;

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

public class Name {

	@JsonProperty("given")
	private List<String> given = null;
	@JsonProperty("use")
	private String use;
	@JsonProperty("text")
	private String text;
	@JsonProperty("family")
	private String family;

	@JsonProperty("given")
	public List<String> getGiven() {
		return given;
	}

	@JsonProperty("given")
	public void setGiven(List<String> given) {
		this.given = given;
	}

	@JsonProperty("use")
	public String getUse() {
		return use;
	}

	@JsonProperty("use")
	public void setUse(String use) {
		this.use = use;
	}

	@JsonProperty("text")
	public String getText() {
		return text;
	}

	@JsonProperty("text")
	public void setText(String text) {
		this.text = text;
	}

	@JsonProperty("family")
	public String getFamily() {
		return family;
	}

	@JsonProperty("family")
	public void setFamily(String family) {
		this.family = family;
	}

}
