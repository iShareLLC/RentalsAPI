package com.wjc.model;

public class RentalDetailPrice {

	private PriceSegment entireUnit;
	private PriceSegment masterRoom;
	private PriceSegment guestRoom;
	private PriceSegment livingRoom;

	public PriceSegment getEntireUnit() {
		return entireUnit;
	}

	public void setEntireUnit(PriceSegment entireUnit) {
		this.entireUnit = entireUnit;
	}

	public PriceSegment getMasterRoom() {
		return masterRoom;
	}

	public void setMasterRoom(PriceSegment masterRoom) {
		this.masterRoom = masterRoom;
	}

	public PriceSegment getGuestRoom() {
		return guestRoom;
	}

	public void setGuestRoom(PriceSegment guestRoom) {
		this.guestRoom = guestRoom;
	}

	public PriceSegment getLivingRoom() {
		return livingRoom;
	}

	public void setLivingRoom(PriceSegment livingRoom) {
		this.livingRoom = livingRoom;
	}

	public static class Builder {
		private PriceSegment entireUnit;
		private PriceSegment masterRoom;
		private PriceSegment guestRoom;
		private PriceSegment livingRoom;

		public Builder entireUnit(PriceSegment entireUnit) {
			this.entireUnit = entireUnit;
			return this;
		}

		public Builder masterRoom(PriceSegment masterRoom) {
			this.masterRoom = masterRoom;
			return this;
		}

		public Builder guestRoom(PriceSegment guestRoom) {
			this.guestRoom = guestRoom;
			return this;
		}

		public Builder livingRoom(PriceSegment livingRoom) {
			this.livingRoom = livingRoom;
			return this;
		}

		public RentalDetailPrice build() {
			return new RentalDetailPrice(this);
		}
	}

	private RentalDetailPrice(Builder builder) {
		this.entireUnit = builder.entireUnit;
		this.masterRoom = builder.masterRoom;
		this.guestRoom = builder.guestRoom;
		this.livingRoom = builder.livingRoom;
	}
}
