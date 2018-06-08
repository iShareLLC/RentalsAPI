package com.wjc.model;

import java.util.List;

public class RentalListCard {

	private String id;
	// In US cents
	private int price;
	// For example, per month
	private int timeUnit;
	private String title1;
	private String title2;
	private String description;
	private List<String> imageUrls;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

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

	public String getTitle1() {
		return title1;
	}

	public void setTitle1(String title1) {
		this.title1 = title1;
	}

	public String getTitle2() {
		return title2;
	}

	public void setTitle2(String title2) {
		this.title2 = title2;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<String> getImageUrls() {
		return imageUrls;
	}

	public void setImageUrls(List<String> imageUrls) {
		this.imageUrls = imageUrls;
	}

	public static class Builder {
		private String id;
		private int price;
		private int timeUnit;
		private String title1;
		private String title2;
		private String description;
		private List<String> imageUrls;

		public Builder id(String id) {
			this.id = id;
			return this;
		}

		public Builder price(int price) {
			this.price = price;
			return this;
		}

		public Builder timeUnit(int timeUnit) {
			this.timeUnit = timeUnit;
			return this;
		}

		public Builder title1(String title1) {
			this.title1 = title1;
			return this;
		}

		public Builder title2(String title2) {
			this.title2 = title2;
			return this;
		}

		public Builder description(String description) {
			this.description = description;
			return this;
		}

		public Builder imageUrls(List<String> imageUrls) {
			this.imageUrls = imageUrls;
			return this;
		}

		public RentalListCard build() {
			return new RentalListCard(this);
		}
	}

	private RentalListCard(Builder builder) {
		this.id = builder.id;
		this.price = builder.price;
		this.timeUnit = builder.timeUnit;
		this.title1 = builder.title1;
		this.title2 = builder.title2;
		this.description = builder.description;
		this.imageUrls = builder.imageUrls;
	}
}
