package com.wjc.response;

import java.util.List;
import java.util.Map;

public final class RentalDetailResponse {

	private List<String> imageUrls;
	private long availableStartDate;
	private long availableEndDate;
	private String neighborhood;
	private String title;
	private String description;
	private Map<String, List<Integer>> prices;
	private boolean includeInternet;
	private boolean includeElectricity;
	private boolean includeWater;
	private boolean includeGas;
	private boolean allowCat;
	private boolean allowDog;

	private boolean noSmoking;
	private boolean hasDoorman;
	private boolean hasWasher;
	private boolean hasDryer;
	private List<String> highlights;
	private int statusCode;
	private String message;
	
	// One row for subway, no matter how many lines (A/B/C/1) we have
	// One possible row for Path
	// One possible row for train
	private Map<String, String> transpotation;

	public RentalDetailResponse() {
	}

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

	public Map<String, List<Integer>> getPrices() {
		return prices;
	}

	public void setPrices(Map<String, List<Integer>> prices) {
		this.prices = prices;
	}

	public boolean isIncludeInternet() {
		return includeInternet;
	}

	public void setIncludeInternet(boolean includeInternet) {
		this.includeInternet = includeInternet;
	}

	public boolean isIncludeElectricity() {
		return includeElectricity;
	}

	public void setIncludeElectricity(boolean includeElectricity) {
		this.includeElectricity = includeElectricity;
	}

	public boolean isIncludeWater() {
		return includeWater;
	}

	public void setIncludeWater(boolean includeWater) {
		this.includeWater = includeWater;
	}

	public boolean isIncludeGas() {
		return includeGas;
	}

	public void setIncludeGas(boolean includeGas) {
		this.includeGas = includeGas;
	}

	public boolean isAllowCat() {
		return allowCat;
	}

	public void setAllowCat(boolean allowCat) {
		this.allowCat = allowCat;
	}

	public boolean isAllowDog() {
		return allowDog;
	}

	public void setAllowDog(boolean allowDog) {
		this.allowDog = allowDog;
	}

	public boolean isNoSmoking() {
		return noSmoking;
	}

	public void setNoSmoking(boolean noSmoking) {
		this.noSmoking = noSmoking;
	}

	public boolean isHasDoorman() {
		return hasDoorman;
	}

	public void setHasDoorman(boolean hasDoorman) {
		this.hasDoorman = hasDoorman;
	}

	public boolean isHasWasher() {
		return hasWasher;
	}

	public void setHasWasher(boolean hasWasher) {
		this.hasWasher = hasWasher;
	}

	public boolean isHasDryer() {
		return hasDryer;
	}

	public void setHasDryer(boolean hasDryer) {
		this.hasDryer = hasDryer;
	}

	public List<String> getHighlights() {
		return highlights;
	}

	public void setHighlights(List<String> highlights) {
		this.highlights = highlights;
	}

	public Map<String, String> getTranspotation() {
		return transpotation;
	}

	public void setTranspotation(Map<String, String> transpotation) {
		this.transpotation = transpotation;
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

	// TODO: add info for contacting host

	public static class Builder {
		private List<String> imageUrls;
		private long availableStartDate;
		private long availableEndDate;
		private String neighborhood;
		private String title;
		private String description;
		private Map<String, List<Integer>> prices;
		private boolean includeInternet;
		private boolean includeElectricity;
		private boolean includeWater;
		private boolean includeGas;
		private boolean allowCat;
		private boolean allowDog;
		private boolean noSmoking;
		private boolean hasDoorman;
		private boolean hasWasher;
		private boolean hasDryer;
		private List<String> highlights;
		private Map<String, String> transpotation;
		private int statusCode;
		private String message;

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

		public Builder prices(Map<String, List<Integer>> prices) {
			this.prices = prices;
			return this;
		}

		public Builder includeInternet(boolean includeInternet) {
			this.includeInternet = includeInternet;
			return this;
		}

		public Builder includeElectricity(boolean includeElectricity) {
			this.includeElectricity = includeElectricity;
			return this;
		}

		public Builder includeWater(boolean includeWater) {
			this.includeWater = includeWater;
			return this;
		}

		public Builder includeGas(boolean includeGas) {
			this.includeGas = includeGas;
			return this;
		}

		public Builder allowCat(boolean allowCat) {
			this.allowCat = allowCat;
			return this;
		}

		public Builder allowDog(boolean allowDog) {
			this.allowDog = allowDog;
			return this;
		}

		public Builder noSmoking(boolean noSmoking) {
			this.noSmoking = noSmoking;
			return this;
		}

		public Builder hasDoorman(boolean hasDoorman) {
			this.hasDoorman = hasDoorman;
			return this;
		}

		public Builder hasWasher(boolean hasWasher) {
			this.hasWasher = hasWasher;
			return this;
		}

		public Builder hasDryer(boolean hasDryer) {
			this.hasDryer = hasDryer;
			return this;
		}

		public Builder highlights(List<String> highlights) {
			this.highlights = highlights;
			return this;
		}

		public Builder transpotation(Map<String, String> transpotation) {
			this.transpotation = transpotation;
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
		this.includeInternet = builder.includeInternet;
		this.includeElectricity = builder.includeElectricity;
		this.includeWater = builder.includeWater;
		this.includeGas = builder.includeGas;
		this.allowCat = builder.allowCat;
		this.allowDog = builder.allowDog;
		this.noSmoking = builder.noSmoking;
		this.hasDoorman = builder.hasDoorman;
		this.hasWasher = builder.hasWasher;
		this.hasDryer = builder.hasDryer;
		this.highlights = builder.highlights;
		this.transpotation = builder.transpotation;
		this.statusCode = builder.statusCode;
		this.message = builder.message;
	}
}
