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

public class Resource {
	@JsonProperty("identifier")
	private List<Identifier> identifier = null;
	@JsonProperty("deceasedBoolean")
	private Boolean deceasedBoolean;
	@JsonProperty("address")
	private List<Address> address = null;
	@JsonProperty("gender")
	private String gender;
	@JsonProperty("meta")
	private Meta meta;
	@JsonProperty("name")
	private List<Name> name = null;
	@JsonProperty("active")
	private Boolean active;
	@JsonProperty("telecom")
	private List<Telecom> telecom = null;
	@JsonProperty("id")
	private String id;
	@JsonProperty("birthDate")
	private String birthDate;
	@JsonProperty("resourceType")
	private String resourceType;
	@JsonProperty("maritalStatus")
	private MaritalStatus maritalStatus;

	
	@JsonProperty("maritalStatus")
	public MaritalStatus getMaritalStatus() {
		return maritalStatus;
	}

	@JsonProperty("maritalStatus")
	public void setMaritalStatus(MaritalStatus maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	
	@JsonProperty("identifier")
	public List<Identifier> getIdentifier() {
	return identifier;
	}

	@JsonProperty("identifier")
	public void setIdentifier(List<Identifier> identifier) {
	this.identifier = identifier;
	}

	@JsonProperty("deceasedBoolean")
	public Boolean getDeceasedBoolean() {
	return deceasedBoolean;
	}

	@JsonProperty("deceasedBoolean")
	public void setDeceasedBoolean(Boolean deceasedBoolean) {
	this.deceasedBoolean = deceasedBoolean;
	}

	@JsonProperty("address")
	public List<Address> getAddress() {
	return address;
	}

	@JsonProperty("address")
	public void setAddress(List<Address> address) {
	this.address = address;
	}

	@JsonProperty("gender")
	public String getGender() {
	return gender;
	}

	@JsonProperty("gender")
	public void setGender(String gender) {
	this.gender = gender;
	}

	@JsonProperty("meta")
	public Meta getMeta() {
	return meta;
	}

	@JsonProperty("meta")
	public void setMeta(Meta meta) {
	this.meta = meta;
	}

	@JsonProperty("name")
	public List<Name> getName() {
	return name;
	}

	@JsonProperty("name")
	public void setName(List<Name> name) {
	this.name = name;
	}

	@JsonProperty("active")
	public Boolean getActive() {
	return active;
	}

	@JsonProperty("active")
	public void setActive(Boolean active) {
	this.active = active;
	}

	@JsonProperty("telecom")
	public List<Telecom> getTelecom() {
	return telecom;
	}

	@JsonProperty("telecom")
	public void setTelecom(List<Telecom> telecom) {
	this.telecom = telecom;
	}

	@JsonProperty("id")
	public String getId() {
	return id;
	}

	@JsonProperty("id")
	public void setId(String id) {
	this.id = id;
	}

	@JsonProperty("birthDate")
	public String getBirthDate() {
	return birthDate;
	}

	@JsonProperty("birthDate")
	public void setBirthDate(String birthDate) {
	this.birthDate = birthDate;
	}

	@JsonProperty("resourceType")
	public String getResourceType() {
	return resourceType;
	}

	@JsonProperty("resourceType")
	public void setResourceType(String resourceType) {
	this.resourceType = resourceType;
	}
}
