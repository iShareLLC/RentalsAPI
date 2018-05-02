package com.wjc.request;

import java.util.List;

import com.wjc.constant.DurationUnit;
import com.wjc.constant.RentalType;

public class RentalSearchRequest {
	
	private String neighborhood;
	// ISO 8601: YYYY-MM-DD
	private String startDate;
	private int duration;
	private DurationUnit durationUnit; 
	private List<RentalType> rentalTypes;
	private float minPrice;
	private float maxPrice;
	
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
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public DurationUnit getDurationUnit() {
		return durationUnit;
	}
	public void setDurationUnit(DurationUnit durationUnit) {
		this.durationUnit = durationUnit;
	}
	public List<RentalType> getRentalTypes() {
		return rentalTypes;
	}
	public void setRentalTypes(List<RentalType> rentalTypes) {
		this.rentalTypes = rentalTypes;
	}
	public float getMinPrice() {
		return minPrice;
	}
	public void setMinPrice(float minPrice) {
		this.minPrice = minPrice;
	}
	public float getMaxPrice() {
		return maxPrice;
	}
	public void setMaxPrice(float maxPrice) {
		this.maxPrice = maxPrice;
	}
}
