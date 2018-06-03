package com.wjc.request;

public final class RentalDetailRequest {
	
	// This is the city name, not city code.
	private String city;
	private String neighborhood;
	private String title;
	// Unix epoch timestamp in milliseconds
	private String postTime;
	
	public RentalDetailRequest() {}

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
