package com.wjc.model;

import java.util.ArrayList;
import java.util.List;

public class RentalListData {
	
	private List<RentalListCard> results = new ArrayList<>();
	private int totalCount;
	
	public List<RentalListCard> getResults() {
		return results;
	}
	public void setResults(List<RentalListCard> results) {
		this.results = results;
	}
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

}
