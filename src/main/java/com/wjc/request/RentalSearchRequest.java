package com.wjc.request;

import java.util.List;

import com.wjc.constant.TimeUnit;
import com.wjc.constant.RentalType;

public class RentalSearchRequest {

	private String neighborhood;
	// Unix epoch timestamp in milliseconds
	private long startDateMillis;
	private int duration;
	private TimeUnit durationUnit;
	private List<RentalType> rentalTypes;
	private float minPrice;
	private float maxPrice;
	/**
	 * Start index of the results to return
	 */
	private int start;
	/**
	 * The maximum number of results to return
	 */
	private int limit;

	public RentalSearchRequest() {
	}

	public String getNeighborhood() {
		return neighborhood;
	}

	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}

	public long getStartDateMillis() {
		return startDateMillis;
	}

	public void setStartDateMillis(long startDateMillis) {
		this.startDateMillis = startDateMillis;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public TimeUnit getDurationUnit() {
		return durationUnit;
	}

	public void setDurationUnit(TimeUnit durationUnit) {
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
		private long startDateMillis;
		private int duration;
		private TimeUnit durationUnit;
		private List<RentalType> rentalTypes;
		private float minPrice;
		private float maxPrice;
		private int start;
		private int limit;

		public Builder neighborhood(String neighborhood) {
			this.neighborhood = neighborhood;
			return this;
		}

		public Builder startDateMillis(long startDateMillis) {
			this.startDateMillis = startDateMillis;
			return this;
		}

		public Builder duration(int duration) {
			this.duration = duration;
			return this;
		}

		public Builder durationUnit(TimeUnit durationUnit) {
			this.durationUnit = durationUnit;
			return this;
		}

		public Builder rentalTypes(List<RentalType> rentalTypes) {
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
		this.startDateMillis = builder.startDateMillis;
		this.duration = builder.duration;
		this.durationUnit = builder.durationUnit;
		this.rentalTypes = builder.rentalTypes;
		this.minPrice = builder.minPrice;
		this.maxPrice = builder.maxPrice;
		this.start = builder.start;
		this.limit = builder.limit;
	}
}
