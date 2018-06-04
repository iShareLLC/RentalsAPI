package com.wjc.request;

public class RentalSearchRequest {

	private String neighborhood;
	// Unix epoch timestamp in milliseconds
	private String startDate;
	private String duration;
	// 0 year, 1 month, 2 week, 3 day
	private int durationUnit;
	private String rentalTypes;
	private String minPrice;
	private String maxPrice;
	// Start index of the results to return
	private String start;
	// The maximum number of results to return
	private String limit;

	public RentalSearchRequest() {
	}

	public String getNeighborhood() {
		return neighborhood;
	}

	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public int getDurationUnit() {
		return durationUnit;
	}

	public void setDurationUnit(int durationUnit) {
		this.durationUnit = durationUnit;
	}

	public String getRentalTypes() {
		return rentalTypes;
	}

	public void setRentalTypes(String rentalTypes) {
		this.rentalTypes = rentalTypes;
	}

	public String getMinPrice() {
		return minPrice;
	}

	public void setMinPrice(String minPrice) {
		this.minPrice = minPrice;
	}

	public String getMaxPrice() {
		return maxPrice;
	}

	public void setMaxPrice(String maxPrice) {
		this.maxPrice = maxPrice;
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getLimit() {
		return limit;
	}

	public void setLimit(String limit) {
		this.limit = limit;
	}
}
