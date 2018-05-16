package com.wjc.constant;

public enum RentalType {
	ENTIRE_UNIT("整套", "EntireUnit"),
	MASTER_ROOM("主卧", "MasterRoom"),
	GUEST_ROOM("客卧", "GuestRoom"),
	LIVING_ROOM("客厅", "LivingRoom");

	private String displayName;
	private String dbName;

	RentalType(String displayName, String dbName) {
		this.displayName = displayName;
		this.dbName = dbName;
	}

	public String displayName() {
		return displayName;
	}
	
	public String dbName() {
		return dbName;
	}

}
