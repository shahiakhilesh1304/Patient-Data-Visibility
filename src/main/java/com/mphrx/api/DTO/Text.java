package com.mphrx.api.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Text {
	@JsonProperty("value")
	private String value;

	@JsonProperty("value")
	public String getValue() {
		return value;
	}

	@JsonProperty("value")
	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Text [value=" + value + "]";
	}

	/**
	 * @param value
	 */
	public Text(String value) {
		this.value = value;
	}
	
	
}
