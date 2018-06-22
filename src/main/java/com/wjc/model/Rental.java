package com.wjc.model;

// Refer to https://app.zeplin.io/project/5ad0c5bd88a9e70728177abd/screen/5b083942eba862456b2c2ac5
public class Rental {

	private int rentalType;
	private int bedroomCount;
	private int bathroomCount;
	// In US cents
	private int price;
	private long startDate;
	private int duration;
	private int durationUnit;
	
	public Rental() {
	}

	public int getRentalType() {
		return rentalType;
	}

	public void setRentalType(int rentalType) {
		this.rentalType = rentalType;
	}

	public int getBedroomCount() {
		return bedroomCount;
	}

	public void setBedroomCount(int bedroomCount) {
		this.bedroomCount = bedroomCount;
	}

	public int getBathroomCount() {
		return bathroomCount;
	}

	public void setBathroomCount(int bathroomCount) {
		this.bathroomCount = bathroomCount;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public long getStartDate() {
		return startDate;
	}

	public void setStartDate(long startDate) {
		this.startDate = startDate;
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

	public static class Builder {
		private int rentalType;
		private int bedroomCount;
		private int bathroomCount;
		private int price;
		private long startDate;
		private int duration;
		private int durationUnit;

		public Builder rentalType(int rentalType) {
			this.rentalType = rentalType;
			return this;
		}

		public Builder bedroomCount(int bedroomCount) {
			this.bedroomCount = bedroomCount;
			return this;
		}

		public Builder bathroomCount(int bathroomCount) {
			this.bathroomCount = bathroomCount;
			return this;
		}

		public Builder price(int price) {
			this.price = price;
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

		public Rental build() {
			return new Rental(this);
		}
	}

	private Rental(Builder builder) {
		this.rentalType = builder.rentalType;
		this.bedroomCount = builder.bedroomCount;
		this.bathroomCount = builder.bathroomCount;
		this.price = builder.price;
		this.startDate = builder.startDate;
		this.duration = builder.duration;
		this.durationUnit = builder.durationUnit;
	}
}
