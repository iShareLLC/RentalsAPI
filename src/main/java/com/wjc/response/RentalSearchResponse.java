package com.wjc.response;

import com.wjc.model.RentalSearchData;

public class RentalSearchResponse {
	
	private int statusCode;
	private String message;
	private RentalSearchData data;
	
	public RentalSearchResponse() {
	}
	
	public RentalSearchResponse(int statusCode, String message, RentalSearchData data) {
		this.statusCode = statusCode;
		this.message = message;
		this.data = data;
	}
	
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public RentalSearchData getData() {
		return data;
	}
	public void setData(RentalSearchData data) {
		this.data = data;
	}
}
