package com.wjc.api.archive;

import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.wjc.model.Request;
import com.wjc.model.Response;
import com.amazonaws.services.lambda.runtime.Context; 

public class TestPath implements RequestHandler<Request, Response> {
    
	// TODO: Need to figure out if we can use handleRequest with API gateway
	@Override
    public Response handleRequest(Request request, Context context) {
        String greetingString = "Hello" + (request.id + request.time);
        return new Response(true, 2, greetingString);
    }
}
