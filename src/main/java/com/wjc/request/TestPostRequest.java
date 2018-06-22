package com.wjc.request;

import java.util.List;

import com.wjc.model.SubwayLine;

public class TestPostRequest {

	private String borough;
	private int price;
	private boolean includeFee;
	private List<SubwayLine> subwayLines;
	
	public TestPostRequest() {
	}

	public TestPostRequest(String borough, int price, boolean includeFee, List<SubwayLine> subwayLines) {
		this.borough = borough;
		this.price = price;
		this.includeFee = includeFee;
		this.subwayLines = subwayLines;
	}

	public String getBorough() {
		return borough;
	}

	public void setBorough(String borough) {
		this.borough = borough;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public boolean isIncludeFee() {
		return includeFee;
	}

	public void setIncludeFee(boolean includeFee) {
		this.includeFee = includeFee;
	}

	public List<SubwayLine> getSubwayLines() {
		return subwayLines;
	}

	public void setSubwayLines(List<SubwayLine> subwayLines) {
		this.subwayLines = subwayLines;
	}
}
