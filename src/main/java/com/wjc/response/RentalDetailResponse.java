package com.wjc.response;

import java.util.List;

import com.wjc.model.RentalDetailPrice;
import com.wjc.model.RentalDetailTransportation;

public final class RentalDetailResponse {

	private List<String> imageUrls;
	private long availableStartDate;
	private long availableEndDate;
	private String neighborhood;
	private String title;
	private String description;
	private RentalDetailPrice prices;
	private List<String> basicFeatures;
	private List<String> highlights;
	private List<String> moreHighlights;
	private int statusCode;
	private String message;

	// One row for subway, no matter how many lines (A/B/C/1) we have
	// One possible row for Path
	// One possible row for train
	private RentalDetailTransportation transportations;

	public List<String> getImageUrls() {
		return imageUrls;
	}

	public void setImageUrls(List<String> imageUrls) {
		this.imageUrls = imageUrls;
	}

	public long getAvailableStartDate() {
		return availableStartDate;
	}

	public void setAvailableStartDate(long availableStartDate) {
		this.availableStartDate = availableStartDate;
	}

	public long getAvailableEndDate() {
		return availableEndDate;
	}

	public void setAvailableEndDate(long availableEndDate) {
		this.availableEndDate = availableEndDate;
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

	public RentalDetailPrice getPrices() {
		return prices;
	}

	public void setPrices(RentalDetailPrice prices) {
		this.prices = prices;
	}

	public List<String> getBasicFeatures() {
		return basicFeatures;
	}

	public void setBasicFeatures(List<String> basicFeatures) {
		this.basicFeatures = basicFeatures;
	}

	public List<String> getHighlights() {
		return highlights;
	}

	public void setHighlights(List<String> highlights) {
		this.highlights = highlights;
	}

	public List<String> getMoreHighlights() {
		return moreHighlights;
	}

	public void setMoreHighlights(List<String> moreHighlights) {
		this.moreHighlights = moreHighlights;
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

	public RentalDetailTransportation getTransportations() {
		return transportations;
	}

	public void setTransportations(RentalDetailTransportation transportations) {
		this.transportations = transportations;
	}

	public static class Builder {
		private List<String> imageUrls;
		private long availableStartDate;
		private long availableEndDate;
		private String neighborhood;
		private String title;
		private String description;
		private RentalDetailPrice prices;
		private List<String> basicFeatures;
		private List<String> highlights;
		private List<String> moreHighlights;
		private int statusCode;
		private String message;
		private RentalDetailTransportation transportations;

		public Builder imageUrls(List<String> imageUrls) {
			this.imageUrls = imageUrls;
			return this;
		}

		public Builder availableStartDate(long availableStartDate) {
			this.availableStartDate = availableStartDate;
			return this;
		}

		public Builder availableEndDate(long availableEndDate) {
			this.availableEndDate = availableEndDate;
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

		public Builder prices(RentalDetailPrice prices) {
			this.prices = prices;
			return this;
		}

		public Builder basicFeatures(List<String> basicFeatures) {
			this.basicFeatures = basicFeatures;
			return this;
		}

		public Builder highlights(List<String> highlights) {
			this.highlights = highlights;
			return this;
		}

		public Builder moreHighlights(List<String> moreHighlights) {
			this.moreHighlights = moreHighlights;
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

		public Builder transportations(RentalDetailTransportation transportations) {
			this.transportations = transportations;
			return this;
		}

		public RentalDetailResponse build() {
			return new RentalDetailResponse(this);
		}
	}

	private RentalDetailResponse(Builder builder) {
		this.imageUrls = builder.imageUrls;
		this.availableStartDate = builder.availableStartDate;
		this.availableEndDate = builder.availableEndDate;
		this.neighborhood = builder.neighborhood;
		this.title = builder.title;
		this.description = builder.description;
		this.prices = builder.prices;
		this.basicFeatures = builder.basicFeatures;
		this.highlights = builder.highlights;
		this.moreHighlights = builder.moreHighlights;
		this.statusCode = builder.statusCode;
		this.message = builder.message;
		this.transportations = builder.transportations;
	}
}