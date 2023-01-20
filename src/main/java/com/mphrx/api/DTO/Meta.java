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

public class Meta {
	@JsonProperty("lastUpdated")
	private String lastUpdated;
	@JsonProperty("versionId")
	private String versionId;
	@JsonProperty("lastUpdated")
	public String getLastUpdated() {
	return lastUpdated;
	}

	@JsonProperty("lastUpdated")
	public void setLastUpdated(String lastUpdated) {
	this.lastUpdated = lastUpdated;
	}

	@JsonProperty("versionId")
	public String getVersionId() {
	return versionId;
	}

	@JsonProperty("versionId")
	public void setVersionId(String versionId) {
	this.versionId = versionId;
	}

}
