package com.wjc.model;

import java.util.HashSet;

public class UpdatePersonRequest {

	private int id;
	private int ageDelta;
	private HashSet<String> middleNames;
	private String removeAttrName;
	
	public UpdatePersonRequest() {
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAgeDelta() {
		return ageDelta;
	}

	public void setAgeDelta(int ageDelta) {
		this.ageDelta = ageDelta;
	}

	public HashSet<String> getMiddleNames() {
		return middleNames;
	}

	public void setMiddleNames(HashSet<String> middleNames) {
		this.middleNames = middleNames;
	}

	public String getRemoveAttrName() {
		return removeAttrName;
	}

	public void setRemoveAttrName(String removeAttrName) {
		this.removeAttrName = removeAttrName;
	}

}
