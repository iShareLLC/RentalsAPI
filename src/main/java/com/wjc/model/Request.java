package com.wjc.model;

public class Request {

	public int id;
	public String time;
	public boolean fromIos = true;
	
	public Request() {}
	
	public Request(int id, String time) {
		this.id = id;
		this.time = time;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public boolean isFromIos() {
		return fromIos;
	}

	public void setFromIos(boolean fromIos) {
		this.fromIos = fromIos;
	}
}
