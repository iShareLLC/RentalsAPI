package com.wjc.handler;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.wjc.request.RentalNewRequest;
import com.wjc.response.RentalNewResponse;

/**
 * @author jiechao
 */
public class RentalNewHandler implements RequestHandler <RentalNewRequest, RentalNewResponse>{

	@Override
	public RentalNewResponse handleRequest(RentalNewRequest request, Context context) {
		RentalNewResponse response = new RentalNewResponse();
		response.setStatusCode(201);
		int rentalCount = request.getRentals().size();
		int rentalType = request.getRentals().get(0).getRentalType();
		int subwayTime = request.getSubwayLines().get(0).getTime();
		response.setMessage("borough is " + request.getBorough() + " rental count is " + rentalCount + " rentalType is " + rentalType
				+ " subwayTime is " + subwayTime);
		return response;
	}

}
