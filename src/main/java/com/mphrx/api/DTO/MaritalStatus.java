package com.mphrx.api.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MaritalStatus 
{
	@JsonProperty("text")
	private String text;

	@JsonProperty("text")
	public String getText() {
		return text;
	}

	@JsonProperty("text")
	public void setText(String text) {
		this.text = text;
	}
	
	
	
}
