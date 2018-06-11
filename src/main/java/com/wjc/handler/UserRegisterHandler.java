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
import com.wjc.request.UserRegisterRequest;
import com.wjc.response.UserRegisterResponse;
import com.wjc.util.DynamoDBUtil;

public class UserRegisterHandler implements RequestHandler<UserRegisterRequest, UserRegisterResponse> {

	@Override
	public UserRegisterResponse handleRequest(UserRegisterRequest request, Context context) {
		int code = 201;
		String message = "Register succeeded";
		Table table = DynamoDBUtil.getDynamoDBTable("Users");
		
		Index index = table.getIndex("Email-index");
		QuerySpec spec = new QuerySpec()
			    .withKeyConditionExpression("Email = :v_email")
			    .withValueMap(new ValueMap()
			        .withString(":v_email", request.getEmail()));
		ItemCollection<QueryOutcome> items = index.query(spec);
		Iterator<Item> iter = items.iterator();
		if (iter.hasNext()) {
			code = 409;
			message = "Email already exists";
		}
		
		index = table.getIndex("Username-index");
		spec = new QuerySpec()
			    .withKeyConditionExpression("Username = :v_username")
			    .withValueMap(new ValueMap()
			        .withString(":v_username", request.getUsername()));
		items = index.query(spec);
		iter = items.iterator();
		if (iter.hasNext()) {
			code = 409;
			message = "Username already exists";
		}
		
		
		UserRegisterResponse response = new UserRegisterResponse();
		response.setStatusCode(code);
		response.setMessage(message);
//		response.setMessage("email is " + request.getEmail() + " wechat id is " + request.getWeChatId()
//				+ " hased pw is " + hashPassword(request.getPassword()));
		return response;
	}

	private String hashPassword(String plainTextPassword) {
		return BCrypt.hashpw(plainTextPassword, BCrypt.gensalt());
	}

}
