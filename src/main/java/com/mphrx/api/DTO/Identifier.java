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

public class Identifier {
	@JsonProperty("system")
	private String system;
	@JsonProperty("use")
	private String use;
	@JsonProperty("type")
	private Type type;
	@JsonProperty("value")
	private String value;
	@JsonProperty("system")
	public String getSystem() {
	return system;
	}

	@JsonProperty("system")
	public void setSystem(String system) {
	this.system = system;
	}

	@JsonProperty("use")
	public String getUse() {
	return use;
	}

	@JsonProperty("use")
	public void setUse(String use) {
	this.use = use;
	}

	@JsonProperty("type")
	public Type getType() {
	return type;
	}

	@JsonProperty("type")
	public void setType(Type type) {
	this.type = type;
	}

	@JsonProperty("value")
	public String getValue() {
	return value;
	}

	@JsonProperty("value")
	public void setValue(String value) {
	this.value = value;
	}


}
