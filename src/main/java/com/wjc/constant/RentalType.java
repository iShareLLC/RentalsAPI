package com.wjc.constant;

public enum RentalType {
	ENTIRE_UNIT(0),
	MASTER_ROOM(1),
	GUEST_ROOM(2),
	LIVING_ROOM(3);

	private int dbValue;

	RentalType(int dbValue) {
		this.dbValue = dbValue;
	}
	
	public int dbValue() {
		return dbValue;
	}

}
