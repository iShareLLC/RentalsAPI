package com.wjc.request;

public class RentalListRequest {

	private String city;
	/**
	 * Start index of the results to return
	 */
	private int start;
	/**
	 * The maximum number of results to return
	 */
	private int limit;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

}
