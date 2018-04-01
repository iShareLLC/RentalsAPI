package com.wjc.model;

public class Response {
	
	private boolean success;
	private int id;
	private String body;
	
	public Response() {
	}
	
	public Response(boolean success, int id, String body) {
		this.success = success;
		this.id = id;
		this.body = body;
	}
	
}
