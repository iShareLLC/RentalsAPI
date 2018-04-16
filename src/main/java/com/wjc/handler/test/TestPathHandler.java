package com.wjc.handler.test;

import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.wjc.model.test.Request;
import com.wjc.model.test.Response;
import com.amazonaws.services.lambda.runtime.Context; 

/**
 * API gateway + lambda function + POJOs demo
 * @author jiechao
 */
public class TestPathHandler implements RequestHandler<Request, Response> {
    
	@Override
    public Response handleRequest(Request request, Context context) {
        String greetingString = "Hello" + (request.getId() + request.getTime());
        return new Response(true, 2, greetingString);
    }
}
