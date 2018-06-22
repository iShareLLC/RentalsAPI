package com.wjc.handler;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.wjc.request.TestPostRequest;
import com.wjc.response.RentalNewResponse;

/**
 * Is also used for TestPost in Tokyo region
 * @author jiechao
 */
public class TestPostHandler implements RequestHandler<TestPostRequest, RentalNewResponse>{

	@Override
	public RentalNewResponse handleRequest(TestPostRequest request, Context context) {
		RentalNewResponse response = new RentalNewResponse();
		response.setStatusCode(201);
		int subwayTime = request.getSubwayLines().get(0).getTime();
		response.setMessage("borough is " + request.getBorough() + " price is " + request.getPrice()
		+ " includeFee is " + request.isIncludeFee() + " subwayTime is " + subwayTime);
		return response;
	}

}
