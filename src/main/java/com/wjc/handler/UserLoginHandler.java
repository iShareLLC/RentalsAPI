package com.wjc.handler;

import java.util.Iterator;

import org.mindrot.jbcrypt.BCrypt;

import com.amazonaws.services.dynamodbv2.document.Index;
import com.amazonaws.services.dynamodbv2.document.Item;
import com.amazonaws.services.dynamodbv2.document.ItemCollection;
import com.amazonaws.services.dynamodbv2.document.QueryOutcome;
import com.amazonaws.services.dynamodbv2.document.Table;
import com.amazonaws.services.dynamodbv2.document.spec.QuerySpec;
import com.amazonaws.services.dynamodbv2.document.utils.ValueMap;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.wjc.constant.Constant;
import com.wjc.request.UserLoginRequest;
import com.wjc.response.UserLoginResponse;
import com.wjc.util.DynamoDBUtil;
import com.wjc.util.StringUtil;

public class UserLoginHandler implements RequestHandler<UserLoginRequest, UserLoginResponse> {

	private int statusCode;
	private String message;
	private String userId;
	private Index index;

	@Override
	public UserLoginResponse handleRequest(UserLoginRequest request, Context context) {

		Table table = DynamoDBUtil.getDynamoDBTable(Constant.USER_TABLE);
		String password = request.getPassword();

		if (!StringUtil.isNullOrEmpty(request.getUsername())) {
			index = table.getIndex(Constant.USERNAME_INDEX);
			checkCredential(password, "Username", request.getUsername());
		} else {
			index = table.getIndex(Constant.EMAIL_INDEX);
			checkCredential(password, "Email", request.getEmail());
		}

		UserLoginResponse response = new UserLoginResponse();
		response.setStatusCode(statusCode);
		response.setMessage(message);
		response.setUserId(userId);
		return response;
	}

	private void checkCredential(String password, String attrName, String attrValue) {
		QuerySpec spec = new QuerySpec().withKeyConditionExpression(attrName + " = :v_attr")
				.withValueMap(new ValueMap().withString(":v_attr", attrValue));
		ItemCollection<QueryOutcome> items = index.query(spec);
		Iterator<Item> iter = items.iterator();
		if (iter.hasNext()) {
			Item item = iter.next();
			String passwordDb = item.getString("Password");
			if (BCrypt.checkpw(password, passwordDb)) {
				statusCode = 200;
				message = "Login succeeded";
				userId = item.getString("CreateTime|Random");
			} else {
				statusCode = 401;
				message = "Login failed";
			}
		} else {
			statusCode = 401;
			message = "Login failed";
		}
	}

}
