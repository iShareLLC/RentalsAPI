package com.wjc.handler;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.wjc.request.UserUpdatePWRequest;
import com.wjc.response.BaseResponse;

public class UserUpdatePWHandler implements RequestHandler<UserUpdatePWRequest, BaseResponse> {

	@Override
	public BaseResponse handleRequest(UserUpdatePWRequest input, Context context) {
		return new BaseResponse(200, "Succeeded");
	}
}
