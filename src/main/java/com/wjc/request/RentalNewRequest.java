package com.wjc.request;

import java.util.List;

import com.wjc.model.PathLine;
import com.wjc.model.Rental;
import com.wjc.model.SubwayLine;

public class RentalNewRequest {

	private String borough;
	private String neighborhood;
	private String title;
	private List<Rental> rentals;
	private String feesIncluded;
	private String requirements;
	// todo: may need to rename
	private String roomSummary;
	// originally called "公寓楼概括"
	private String facilities;
	private List<SubwayLine> subwayLines;
	private List<PathLine> pathLines;
	// todo: need to figure out this. Possible upload image in binary form
//	private List<String> images;
	private String otherInfo;

	public String getBorough() {
		return borough;
	}

	public void setBorough(String borough) {
		this.borough = borough;
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

	public List<Rental> getRentals() {
		return rentals;
	}

	public void setRentals(List<Rental> rentals) {
		this.rentals = rentals;
	}

	public String getFeesIncluded() {
		return feesIncluded;
	}

	public void setFeesIncluded(String feesIncluded) {
		this.feesIncluded = feesIncluded;
	}

	public String getRequirements() {
		return requirements;
	}

	public void setRequirements(String requirements) {
		this.requirements = requirements;
	}

	public String getRoomSummary() {
		return roomSummary;
	}

	public void setRoomSummary(String roomSummary) {
		this.roomSummary = roomSummary;
	}

	public String getFacilities() {
		return facilities;
	}

	public void setFacilities(String facilities) {
		this.facilities = facilities;
	}

	public List<SubwayLine> getSubwayLines() {
		return subwayLines;
	}

	public void setSubwayLines(List<SubwayLine> subwayLines) {
		this.subwayLines = subwayLines;
	}

	public List<PathLine> getPathLines() {
		return pathLines;
	}

	public void setPathLines(List<PathLine> pathLines) {
		this.pathLines = pathLines;
	}

	public String getOtherInfo() {
		return otherInfo;
	}

	public void setOtherInfo(String otherInfo) {
		this.otherInfo = otherInfo;
	}

	public static class Builder {
		private String borough;
		private String neighborhood;
		private String title;
		private List<Rental> rentals;
		private String feesIncluded;
		private String requirements;
		private String roomSummary;
		private String facilities;
		private List<SubwayLine> subwayLines;
		private List<PathLine> pathLines;
		private String otherInfo;

		public Builder borough(String borough) {
			this.borough = borough;
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

		public Builder rentals(List<Rental> rentals) {
			this.rentals = rentals;
			return this;
		}

		public Builder feesIncluded(String feesIncluded) {
			this.feesIncluded = feesIncluded;
			return this;
		}

		public Builder requirements(String requirements) {
			this.requirements = requirements;
			return this;
		}

		public Builder roomSummary(String roomSummary) {
			this.roomSummary = roomSummary;
			return this;
		}

		public Builder facilities(String facilities) {
			this.facilities = facilities;
			return this;
		}

		public Builder subwayLines(List<SubwayLine> subwayLines) {
			this.subwayLines = subwayLines;
			return this;
		}

		public Builder pathLines(List<PathLine> pathLines) {
			this.pathLines = pathLines;
			return this;
		}

		public Builder otherInfo(String otherInfo) {
			this.otherInfo = otherInfo;
			return this;
		}

		public RentalNewRequest build() {
			return new RentalNewRequest(this);
		}
	}

	private RentalNewRequest(Builder builder) {
		this.borough = builder.borough;
		this.neighborhood = builder.neighborhood;
		this.title = builder.title;
		this.rentals = builder.rentals;
		this.feesIncluded = builder.feesIncluded;
		this.requirements = builder.requirements;
		this.roomSummary = builder.roomSummary;
		this.facilities = builder.facilities;
		this.subwayLines = builder.subwayLines;
		this.pathLines = builder.pathLines;
		this.otherInfo = builder.otherInfo;
	}
}
