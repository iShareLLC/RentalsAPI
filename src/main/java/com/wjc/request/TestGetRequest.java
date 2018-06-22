package com.wjc.request;

public class TestGetRequest {
	
	private String name;
	private int id;
	private boolean correct;
	
	public TestGetRequest() {
	}

	public TestGetRequest(String name, int id, boolean correct) {
		this.name = name;
		this.id = id;
		this.correct = correct;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isCorrect() {
		return correct;
	}

	public void setCorrect(boolean correct) {
		this.correct = correct;
	}
}
