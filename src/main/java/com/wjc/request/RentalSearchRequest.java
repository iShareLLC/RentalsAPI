package com.wjc.request;

import java.util.ArrayList;
import java.util.List;

public class RentalSearchRequest {

	private String neighborhood;
	// Unix epoch timestamp in milliseconds
	private long startDate;
	private int duration;
	// 0 year, 1 month, 2 week, 3 day
	private int durationUnit;
	private List<Integer> rentalTypes = new ArrayList<>();
	private float minPrice;
	private float maxPrice;
	// Start index of the results to return
	private int start;
	// The maximum number of results to return
	private int limit;

	public RentalSearchRequest() {
	}

	public String getNeighborhood() {
		return neighborhood;
	}

	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}

	public long getStartDate() {
		return startDate;
	}

	public void setStartDate(long startDateMillis) {
		this.startDate = startDateMillis;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getDurationUnit() {
		return durationUnit;
	}

	public void setDurationUnit(int durationUnit) {
		this.durationUnit = durationUnit;
	}

	public List<Integer> getRentalTypes() {
		return rentalTypes;
	}

	public void setRentalTypes(List<Integer> rentalTypes) {
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

	public static class Builder {
		private String neighborhood;
		private long startDate;
		private int duration;
		private int durationUnit;
		private List<Integer> rentalTypes;
		private float minPrice;
		private float maxPrice;
		private int start;
		private int limit;

		public Builder neighborhood(String neighborhood) {
			this.neighborhood = neighborhood;
			return this;
		}

		public Builder startDate(long startDate) {
			this.startDate = startDate;
			return this;
		}

		public Builder duration(int duration) {
			this.duration = duration;
			return this;
		}

		public Builder durationUnit(int durationUnit) {
			this.durationUnit = durationUnit;
			return this;
		}

		public Builder rentalTypes(List<Integer> rentalTypes) {
			this.rentalTypes = rentalTypes;
			return this;
		}

		public Builder minPrice(float minPrice) {
			this.minPrice = minPrice;
			return this;
		}

		public Builder maxPrice(float maxPrice) {
			this.maxPrice = maxPrice;
			return this;
		}

		public Builder start(int start) {
			this.start = start;
			return this;
		}

		public Builder limit(int limit) {
			this.limit = limit;
			return this;
		}

		public RentalSearchRequest build() {
			return new RentalSearchRequest(this);
		}
	}

	private RentalSearchRequest(Builder builder) {
		this.neighborhood = builder.neighborhood;
		this.startDate = builder.startDate;
		this.duration = builder.duration;
		this.durationUnit = builder.durationUnit;
		this.rentalTypes = builder.rentalTypes;
		this.minPrice = builder.minPrice;
		this.maxPrice = builder.maxPrice;
		this.start = builder.start;
		this.limit = builder.limit;
	}
}
