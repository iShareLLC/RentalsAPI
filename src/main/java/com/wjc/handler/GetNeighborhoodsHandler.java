package com.wjc.handler;

import java.util.ArrayList;
import java.util.List;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.wjc.model.GetNeighborhoodRequest;

public class GetNeighborhoodsHandler implements RequestHandler<GetNeighborhoodRequest, List<String>> {

	@Override
	public List<String> handleRequest(GetNeighborhoodRequest request, Context context) {
		List<String> response = new ArrayList<>();
		LambdaLogger logger = context.getLogger();

		try {
			logger.log("GetNeighborhoodHandler: received request: " + request.getCity());
			response.add(request.getCity());
		} catch (Exception e) {
			logger.log(e.getMessage());
			response.add(e.getMessage());
		}
		return response;
	}

}
