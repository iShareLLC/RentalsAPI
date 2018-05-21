package com.wjc.response;

public class RentalSearchResponse {

	private String displayPrice;
	private String neighborhood;
	private String title;
	private String description;
	private int statusCode;
	private String message;

	public String getDisplayPrice() {
		return displayPrice;
	}

	public void setDisplayPrice(String displayPrice) {
		this.displayPrice = displayPrice;
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

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public static class Builder {
		private String displayPrice;
		private String neighborhood;
		private String title;
		private String description;
		private int statusCode;
		private String message;

		public Builder displayPrice(String displayPrice) {
			this.displayPrice = displayPrice;
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

		public Builder statusCode(int statusCode) {
			this.statusCode = statusCode;
			return this;
		}

		public Builder message(String message) {
			this.message = message;
			return this;
		}

		public RentalSearchResponse build() {
			return new RentalSearchResponse(this);
		}
	}

	private RentalSearchResponse(Builder builder) {
		this.displayPrice = builder.displayPrice;
		this.neighborhood = builder.neighborhood;
		this.title = builder.title;
		this.description = builder.description;
		this.statusCode = builder.statusCode;
		this.message = builder.message;
	}
}
