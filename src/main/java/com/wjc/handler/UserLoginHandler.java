package com.wjc.handler;

import org.mindrot.jbcrypt.BCrypt;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.wjc.request.UserLoginRequest;
import com.wjc.response.UserLoginResponse;

public class UserLoginHandler implements RequestHandler<UserLoginRequest, UserLoginResponse> {

	@Override
	public UserLoginResponse handleRequest(UserLoginRequest request, Context context) {
		int statusCode;
		String message;
		if (BCrypt.checkpw(request.getPassword(), "$2a$10$pVjDq8o742Z9wUSZjCIDNuTuoSNCoJe3m5XyOQLIjugWVu7ecgpZW")) {
			statusCode = 200;
			message = "Login succeeded";
		} else {
			statusCode = 401;
			message = "Login failed";
		}
		UserLoginResponse response = new UserLoginResponse();
		response.setStatusCode(statusCode);
		response.setMessage(message);
		return response;
	}

}
