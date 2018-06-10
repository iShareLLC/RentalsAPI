package com.wjc.response;

import java.util.ArrayList;
import java.util.List;

import com.wjc.model.RentalCard;

/**
 * For popular places
 * 
 * @author jiechao
 */
public class RentalListResponse {
	
	private int statusCode;
	private String message;
	private List<RentalCard> results = new ArrayList<>();
	private int totalCount;
	
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
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
}
