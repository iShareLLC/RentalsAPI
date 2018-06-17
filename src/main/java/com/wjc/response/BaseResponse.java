package com.wjc.response;

public class BaseResponse {
	
	protected int statusCode;
	protected String message;
	
	public BaseResponse() {
	}
	
	public BaseResponse(int statusCode, String message) {
		this.statusCode = statusCode;
		this.message = message;
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

}
