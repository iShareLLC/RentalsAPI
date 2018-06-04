package com.wjc.model;

public class PathLine {

	private String line;
	private int time;
	private int timeUnit;
	private String station;

	public String getLine() {
		return line;
	}

	public void setLine(String line) {
		this.line = line;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public int getTimeUnit() {
		return timeUnit;
	}

	public void setTimeUnit(int timeUnit) {
		this.timeUnit = timeUnit;
	}

	public String getStation() {
		return station;
	}

	public void setStation(String station) {
		this.station = station;
	}

	public static class Builder {
		private String line;
		private int time;
		private int timeUnit;
		private String station;

		public Builder line(String line) {
			this.line = line;
			return this;
		}

		public Builder time(int time) {
			this.time = time;
			return this;
		}

		public Builder timeUnit(int timeUnit) {
			this.timeUnit = timeUnit;
			return this;
		}

		public Builder station(String station) {
			this.station = station;
			return this;
		}

		public PathLine build() {
			return new PathLine(this);
		}
	}

	private PathLine(Builder builder) {
		this.line = builder.line;
		this.time = builder.time;
		this.timeUnit = builder.timeUnit;
		this.station = builder.station;
	}
}
