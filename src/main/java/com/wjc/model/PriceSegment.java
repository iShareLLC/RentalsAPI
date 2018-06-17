package com.wjc.model;

public class PriceSegment {

	private String currency = "USD";
	private int month = -1;
	private int week = -1;
	private int day = -1;

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getWeek() {
		return week;
	}

	public void setWeek(int week) {
		this.week = week;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public static class Builder {
		private String currency = "USD";
		private int month;
		private int week;
		private int day = -1;

		public Builder currency(String currency) {
			this.currency = currency;
			return this;
		}

		public Builder month(int month) {
			this.month = month;
			return this;
		}

		public Builder week(int week) {
			this.week = week;
			return this;
		}

		public Builder day(int day) {
			this.day = day;
			return this;
		}

		public PriceSegment build() {
			return new PriceSegment(this);
		}
	}

	private PriceSegment(Builder builder) {
		this.currency = builder.currency;
		this.month = builder.month;
		this.week = builder.week;
		this.day = builder.day;
	}
}
