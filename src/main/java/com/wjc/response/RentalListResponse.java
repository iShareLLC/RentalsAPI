package com.wjc.response;

import com.wjc.model.RentalListData;

/**
 * For popular places
 * 
 * @author jiechao
 */
public class RentalListResponse {
	
	private int statusCode;
	private String message;
	private RentalListData data;
	
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
	public RentalListData getData() {
		return data;
	}
	public void setData(RentalListData data) {
		this.data = data;
	}
}
