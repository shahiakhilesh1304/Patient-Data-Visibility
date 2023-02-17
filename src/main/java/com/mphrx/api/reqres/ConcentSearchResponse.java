package com.mphrx.api.reqres;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mphrx.api.DTO.Patient;

public class ConcentSearchResponse 
{
	@JsonProperty("patient")
	private Patient patient;
	@JsonProperty("id")
	private String id;
	@JsonProperty("resourceType")
	private String resourceType;
	@JsonProperty("status")
	private String status;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("patient")
	public Patient getPatient() {
	return patient;
	}

	@JsonProperty("patient")
	public void setPatient(Patient patient) {
	this.patient = patient;
	}

	@JsonProperty("id")
	public String getId() {
	return id;
	}

	@JsonProperty("id")
	public void setId(String id) {
	this.id = id;
	}

	@JsonProperty("resourceType")
	public String getResourceType() {
	return resourceType;
	}

	@JsonProperty("resourceType")
	public void setResourceType(String resourceType) {
	this.resourceType = resourceType;
	}

	@JsonProperty("status")
	public String getStatus() {
	return status;
	}

	@JsonProperty("status")
	public void setStatus(String status) {
	this.status = status;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
	return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
	this.additionalProperties.put(name, value);
	}
}
