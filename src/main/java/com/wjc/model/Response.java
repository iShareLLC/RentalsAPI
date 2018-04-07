package com.wjc.model;

public class Response {
	
	private boolean success;
	private int id;
	private String body;
	
	public Response() {}
	
	public Response(boolean success, int id, String body) {
		this.success = success;
		this.id = id;
		this.body = body;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}
	
}
