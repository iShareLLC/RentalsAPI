package com.wjc.model;

import java.util.ArrayList;
import java.util.List;

public class RentalSearchData {

	private List<RentalSearchCard> results = new ArrayList<>();
	private int totalCount;
	
	public RentalSearchData() {
	}
	
	public RentalSearchData(List<RentalSearchCard> results, int totalCount) {
		this.results.addAll(results);
		this.totalCount = totalCount;
	}

	public List<RentalSearchCard> getResults() {
		return results;
	}

	public void setResults(List<RentalSearchCard> results) {
		this.results = results;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	
	public void addRentalCard(RentalSearchCard card) {
		results.add(card);
	}
}
