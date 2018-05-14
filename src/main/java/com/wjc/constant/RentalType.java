package com.wjc.constant;

public enum RentalType {
	ENTIRE_UNIT("整套"),
	MASTER_ROOM("主卧"),
	GUEST_ROOM("客卧"),
	LIVING_ROOM("客厅");

	private String displayName;

	RentalType(String displayName) {
		this.displayName = displayName;
	}

	public String displayName() {
		return displayName;
	}

}
