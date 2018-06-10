package com.wjc.constant;

public enum RentalType {
	ENTIRE_UNIT("entireUnit"),
	MASTER_ROOM("masterRoom"),
	GUEST_ROOM("guestRoom"),
	LIVING_ROOM("livingRoom");

	private String name;

	RentalType(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

}
