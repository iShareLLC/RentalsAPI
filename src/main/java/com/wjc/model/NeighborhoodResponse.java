package com.wjc.model;

import java.util.ArrayList;
import java.util.List;

public final class NeighborhoodResponse {

	private List<String> neighborhoods = new ArrayList<>();
	private boolean needUpdate;
	private ResponseError error;
	
	public NeighborhoodResponse() {
	}

	public NeighborhoodResponse(List<String> neighborhoods, boolean needUpdate, ResponseError error) {
		this.neighborhoods = neighborhoods;
		this.needUpdate = needUpdate;
		this.error = error;
	}

	public List<String> getNeighborhoods() {
		return neighborhoods;
	}

	public void setNeighborhoods(List<String> neighborhoods) {
		this.neighborhoods = neighborhoods;
	}

	public boolean isNeedUpdate() {
		return needUpdate;
	}

	public void setNeedUpdate(boolean needUpdate) {
		this.needUpdate = needUpdate;
	}

	public ResponseError getError() {
		return error;
	}

	public void setError(ResponseError error) {
		this.error = error;
	}
	
}
