package com.mphrx.api.DTO;


import com.fasterxml.jackson.annotation.JsonProperty;


public class Coding {

@JsonProperty("code")
private String code;

@JsonProperty("code")
public String getCode() {
return code;
}
@JsonProperty("code")
public void setCode(String code) {
this.code = code;
}

}