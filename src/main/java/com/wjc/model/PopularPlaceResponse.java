package com.wjc.model;

import java.util.List;

public class PopularPlaceResponse {
	
	private String price;
	private String title1;
	private String title2;
	private String description;
	private List<String> imageUrls;
	
	public PopularPlaceResponse(String price, String title1, String title2, String description, List<String> imageUrls) {
		this.price = price;
		this.title1 = title1;
		this.title2 = title2;
		this.description = description;
		this.imageUrls = imageUrls;
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
	public List<String> getImageUrls() {
		return imageUrls;
	}
	public void setImageUrls(List<String> imageUrls) {
		this.imageUrls = imageUrls;
	}

}
