package com.mphrx.api.DTO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Address {

	@JsonProperty("country")
	private String country;
	@JsonProperty("city")
	private String city;
	@JsonProperty("use")
	private String use;
	@JsonProperty("line")
	private List<String> line = null;
	@JsonProperty("text")
	private String text;
	@JsonProperty("state")
	private String state;

	@JsonProperty("country")
	public String getCountry() {
	return country;
	}

	@JsonProperty("country")
	public void setCountry(String country) {
	this.country = country;
	}

	@JsonProperty("city")
	public String getCity() {
	return city;
	}

	@JsonProperty("city")
	public void setCity(String city) {
	this.city = city;
	}

	@JsonProperty("use")
	public String getUse() {
	return use;
	}

	@JsonProperty("use")
	public void setUse(String use) {
	this.use = use;
	}

	@JsonProperty("line")
	public List<String> getLine() {
	return line;
	}

	@JsonProperty("line")
	public void setLine(List<String> line) {
	this.line = line;
	}

	@JsonProperty("text")
	public String getText() {
	return text;
	}

	@JsonProperty("text")
	public void setText(String text) {
	this.text = text;
	}

	@JsonProperty("state")
	public String getState() {
	return state;
	}

	@JsonProperty("state")
	public void setState(String state) {
	this.state = state;
	}

}
