package com.wjc.model;

public class Response {
	
	@SuppressWarnings("unused")
	private boolean success;
	
	@SuppressWarnings("unused")
	private int id;
	
	@SuppressWarnings("unused")
	private String body;
	
	public Response() {}
	
	public Response(boolean success, int id, String body) {
		this.success = success;
		this.id = id;
		this.body = body;
	}
	
}
