package com.wjc.handler;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.wjc.request.TestGetRequest;
import com.wjc.response.TestGetResponse;

/**
 * Is also used for TestPost in Tokyo region
 * @author jiechao
 */
public class TestGetHandler implements RequestHandler<TestGetRequest, TestGetResponse>{

	@Override
	public TestGetResponse handleRequest(TestGetRequest request, Context context) {
		TestGetResponse response = new TestGetResponse();
		response.setResult(88.4F);
		response.setMessage("name is " + request.getName() + " id is " + request.getId() + " correct is " + request.isCorrect());
		return response;
	}

}
