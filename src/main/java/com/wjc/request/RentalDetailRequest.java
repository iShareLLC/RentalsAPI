package com.wjc.request;

public final class RentalDetailRequest {
	
	// This is the city name, not city code.
	private String city;
	private String neighborhood;
	private String title;
	// ISO 8601: 2018-04-19T01:55:03.952-04:00
	private String postTime;
	
	public RentalDetailRequest() {}
	
	public RentalDetailRequest(String city, String neighborhood, String title, String postTime) {
		this.city = city;
		this.neighborhood = neighborhood;
		this.title = title;
		this.postTime = postTime;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getNeighborhood() {
		return neighborhood;
	}
	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPostTime() {
		return postTime;
	}
	public void setPostTime(String postTime) {
		this.postTime = postTime;
	}
	
}
