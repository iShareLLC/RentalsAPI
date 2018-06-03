package com.wjc.handler;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.wjc.request.UserRegisterRequest;
import com.wjc.response.UserRegisterResponse;

public class UserRegisterHandler implements RequestHandler<UserRegisterRequest, UserRegisterResponse> {

	@Override
	public UserRegisterResponse handleRequest(UserRegisterRequest request, Context context) {
		UserRegisterResponse response = new UserRegisterResponse();
		response.setStatusCode(200);
		response.setMessage("email is " + request.getEmail());
		return response;
	}

}
