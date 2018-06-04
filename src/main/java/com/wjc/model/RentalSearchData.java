package com.wjc.model;

import java.util.ArrayList;
import java.util.List;

public class RentalSearchData {

	private List<RentalCard> results = new ArrayList<>();
	private int totalCount;
	
	public RentalSearchData() {
	}
	
	public RentalSearchData(List<RentalCard> results, int totalCount) {
		this.results.addAll(results);
		this.totalCount = totalCount;
	}

	public List<RentalCard> getResults() {
		return results;
	}

	public void setResults(List<RentalCard> results) {
		this.results = results;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	
	public void addRentalCard(RentalCard card) {
		results.add(card);
	}
}
