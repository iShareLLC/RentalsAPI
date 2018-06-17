package com.wjc.request;

public class UserUpdatePWRequest {
	
	private String userId;
	private String currentPW;
	private String newPW;
	
	public UserUpdatePWRequest() {
	}
	
	public UserUpdatePWRequest(String userId, String currentPW, String newPW) {
		this.userId = userId;
		this.currentPW = currentPW;
		this.newPW = newPW;
	}

	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getCurrentPW() {
		return currentPW;
	}
	public void setCurrentPW(String currentPW) {
		this.currentPW = currentPW;
	}
	public String getNewPW() {
		return newPW;
	}
	public void setNewPW(String newPW) {
		this.newPW = newPW;
	}

}
