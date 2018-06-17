package com.wjc.model;

/**
 * Transportation in a specific language
 * @author jiechao
 */
public class TransportationSegment {

	private String startText;
	private String endText;
	
	public TransportationSegment() {
	}
	
	public TransportationSegment(String startText, String endText) {
		this.startText = startText;
		this.endText = endText;
	}
	
	public String getStartText() {
		return startText;
	}
	public void setStartText(String startText) {
		this.startText = startText;
	}
	public String getEndText() {
		return endText;
	}
	public void setEndText(String endText) {
		this.endText = endText;
	}
	
}
