package com.wjc.constant;

/*
 * Unit of time or duration
 */
public enum TimeUnit {
	YEAR(0), MONTH(1), WEEK(2), DAY(3);
	
	private int value;
	
	TimeUnit(int value) {
		this.value = value;
	}
	
	public int value() {
		return value;
	}
}
