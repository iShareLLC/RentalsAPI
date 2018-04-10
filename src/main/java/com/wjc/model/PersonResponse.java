package com.wjc.model;

import javax.annotation.Nonnull;

public class PersonResponse {
	
	public String message = "";
	
	public PersonResponse() {
	}
	
	public PersonResponse(@Nonnull final String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
