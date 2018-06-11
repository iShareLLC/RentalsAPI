package com.wjc.request;

public final class RentalDetailRequest {
	
	// This is the city name, not city code.
	private String city;
	private String id;
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

}
