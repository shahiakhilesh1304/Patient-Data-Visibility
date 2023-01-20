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

public class Telecom {

	@JsonProperty("system")
	private String system;
	@JsonProperty("use")
	private String use;
	@JsonProperty("value")
	private String value;
	@JsonProperty("extension")
	private List<Extension> extension = null;

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

	@JsonProperty("value")
	public String getValue() {
		return value;
	}

	@JsonProperty("value")
	public void setValue(String value) {
		this.value = value;
	}

	@JsonProperty("extension")
	public List<Extension> getExtension() {
		return extension;
	}

	@JsonProperty("extension")
	public void setExtension(List<Extension> extension) {
		this.extension = extension;
	}
}
