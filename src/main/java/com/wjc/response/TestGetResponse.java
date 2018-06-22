package com.wjc.response;

public class TestGetResponse {

	private String message;
	private float result;
	
	public TestGetResponse() {
	}
	
	public TestGetResponse(String message, float result) {
		this.message = message;
		this.result = result;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public float getResult() {
		return result;
	}

	public void setResult(float result) {
		this.result = result;
	}
	
}
