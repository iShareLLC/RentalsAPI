package com.wjc.model;

/**
 * Represents an object for subway/path/ferry
 * @author jiechao
 */
public class Transportation {
	
	// https://www.w3schools.com/tags/ref_language_codes.asp
	private TransportationSegment zhHans;
	private TransportationSegment en;
	
	public TransportationSegment getZhHans() {
		return zhHans;
	}
	public void setZhHans(TransportationSegment zhHans) {
		this.zhHans = zhHans;
	}
	public TransportationSegment getEn() {
		return en;
	}
	public void setEn(TransportationSegment en) {
		this.en = en;
	}

}
