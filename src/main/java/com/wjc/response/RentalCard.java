package com.wjc.response;

public class RentalCard {

	// In US cents
	private int price;
	// 0: year, 1: month, 2: week, 3: day
	private int timeUnit;
	private String neighborhood;
	private String title;
	private String description;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getTimeUnit() {
		return timeUnit;
	}

	public void setTimeUnit(int timeUnit) {
		this.timeUnit = timeUnit;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public static class Builder {
		private int price;
		private int timeUnit;
		private String neighborhood;
		private String title;
		private String description;

		public Builder price(int price) {
			this.price = price;
			return this;
		}

		public Builder timeUnit(int timeUnit) {
			this.timeUnit = timeUnit;
			return this;
		}

		public Builder neighborhood(String neighborhood) {
			this.neighborhood = neighborhood;
			return this;
		}

		public Builder title(String title) {
			this.title = title;
			return this;
		}

		public Builder description(String description) {
			this.description = description;
			return this;
		}

		public RentalCard build() {
			return new RentalCard(this);
		}
	}

	private RentalCard(Builder builder) {
		this.price = builder.price;
		this.timeUnit = builder.timeUnit;
		this.neighborhood = builder.neighborhood;
		this.title = builder.title;
		this.description = builder.description;
	}
}
