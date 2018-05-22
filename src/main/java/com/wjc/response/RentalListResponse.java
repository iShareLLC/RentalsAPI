package com.wjc.response;

import java.util.List;

/**
 * For popular places
 * 
 * @author jiechao
 */
public class RentalListResponse {
	
	private int statusCode;
	private String price;
	private String title1;
	private String title2;
	private String description;
	private String message;
	private List<String> imageUrls;
	
	public RentalListResponse(String price, String title1, String title2, String description, List<String> imageUrls) {
		this.price = price;
		this.title1 = title1;
		this.title2 = title2;
		this.description = description;
		this.imageUrls = imageUrls;
	}

	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getTitle1() {
		return title1;
	}
	public void setTitle1(String title1) {
		this.title1 = title1;
	}
	public String getTitle2() {
		return title2;
	}
	public void setTitle2(String title2) {
		this.title2 = title2;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public List<String> getImageUrls() {
		return imageUrls;
	}
	public void setImageUrls(List<String> imageUrls) {
		this.imageUrls = imageUrls;
	}

}
