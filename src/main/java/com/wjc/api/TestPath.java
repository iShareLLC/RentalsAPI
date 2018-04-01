package com.wjc.api;

import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.wjc.model.Request;
import com.wjc.model.Response;
import com.amazonaws.services.lambda.runtime.Context; 

public class TestPath implements RequestHandler<Request, Response> {
    
	// TODO: Need to figure out if we can use handleRequest with API gateway
    public Response handleRequest(Request request, Context context) {
        String greetingString = String.format("Hello %s %s.", request.id, request.time);
        return new Response(true, 2, greetingString);
    }
}
