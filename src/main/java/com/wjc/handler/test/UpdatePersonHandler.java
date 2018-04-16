package com.wjc.handler.test;

import java.util.HashMap;
import java.util.Map;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.document.DynamoDB;
import com.amazonaws.services.dynamodbv2.document.Table;
import com.amazonaws.services.dynamodbv2.document.UpdateItemOutcome;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.wjc.constant.Constant;
import com.wjc.model.test.PersonResponse;
import com.wjc.model.test.UpdatePersonRequest;

/**
 * DynamoDB updateItem demo
 * 
 * @author jiechao
 */
public class UpdatePersonHandler implements RequestHandler<UpdatePersonRequest, PersonResponse> {

	@Override
	public PersonResponse handleRequest(UpdatePersonRequest input, Context context) {
		PersonResponse response = new PersonResponse();

		try {
			AmazonDynamoDB client = AmazonDynamoDBClientBuilder.standard().build();
			DynamoDB dynamoDB = new DynamoDB(client);

			Table table = dynamoDB.getTable(Constant.DYNAMODB_TABLE_NAME);

			Map<String, String> expressionAttributeNames = new HashMap<String, String>();
			expressionAttributeNames.put("#A", "middleName");
			expressionAttributeNames.put("#P", "age");
			expressionAttributeNames.put("#I", input.getRemoveAttrName());

			Map<String, Object> expressionAttributeValues = new HashMap<String, Object>();
			expressionAttributeValues.put(":val1", input.getMiddleNames());
			expressionAttributeValues.put(":val2", input.getAgeDelta());

			@SuppressWarnings("unused")
			UpdateItemOutcome outcome = table.updateItem("id", // key attribute name
					input.getId(), // key attribute value
					"add #A :val1 set #P = #P - :val2 remove #I", // UpdateExpression
					expressionAttributeNames, expressionAttributeValues);

			response.setMessage("Succeeded!");
		} catch (Exception e) {
			response.setMessage("Failed: " + e.getMessage());
		}

		return response;
	}

}
