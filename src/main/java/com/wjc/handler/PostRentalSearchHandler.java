package com.wjc.handler;

import java.util.ArrayList;
import java.util.List;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.wjc.request.RentalSearchRequest;
import com.wjc.response.RentalSearchResponse;

public class PostRentalSearchHandler implements RequestHandler<RentalSearchRequest, List<RentalSearchResponse>>{

	@Override
	public List<RentalSearchResponse> handleRequest(RentalSearchRequest input, Context context) {
		List<RentalSearchResponse> responses = new ArrayList<>();
		RentalSearchResponse response1 = new RentalSearchResponse.Builder()
				.displayPrice(String.valueOf(input.getMaxPrice()))
				.neighborhood(input.getNeighborhood())
				.title(input.getStartDate() + "best house in the world")
				.description(String.valueOf(input.getDuration()) + " this is a very very very very very very very very very very very long description yes")
				.build();
		
		RentalSearchResponse response2 = new RentalSearchResponse.Builder()
				.displayPrice("$1100/月")
				.neighborhood("哈林区")
				.title("位于哈林区的精装公寓")
				.description(String.valueOf(input.getDuration()) + " this is a very very very very very very very very very very very long description yes")
				.build();
		
		responses.add(response1);
		responses.add(response2);
		
		return responses;
	}
}
