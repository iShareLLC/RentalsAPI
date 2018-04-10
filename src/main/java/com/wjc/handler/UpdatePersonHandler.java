package com.wjc.handler;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.document.DynamoDB;
import com.amazonaws.services.dynamodbv2.document.Table;
import com.amazonaws.services.dynamodbv2.document.UpdateItemOutcome;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.wjc.constant.Constant;
import com.wjc.model.PersonRequest;
import com.wjc.model.PersonResponse;

/**
 * DynamoDB updateItem demo
 * @author jiechao
 */
public class UpdatePersonHandler implements RequestHandler<PersonRequest, PersonResponse> {

	@Override
	public PersonResponse handleRequest(PersonRequest input, Context context) {
		PersonResponse response = new PersonResponse();
		
		try {
		AmazonDynamoDB client = AmazonDynamoDBClientBuilder.standard().build();
		DynamoDB dynamoDB = new DynamoDB(client);

		Table table = dynamoDB.getTable(Constant.DYNAMODB_TABLE_NAME);

		Map<String, String> expressionAttributeNames = new HashMap<String, String>();
		expressionAttributeNames.put("#A", "middleName");
		expressionAttributeNames.put("#P", "age");
		expressionAttributeNames.put("#I", "ISBN");

		Map<String, Object> expressionAttributeValues = new HashMap<String, Object>();
		expressionAttributeValues.put(":val1",
		    new HashSet<String>(Arrays.asList("None", "No")));
		expressionAttributeValues.put(":val2", 1);   //Price

		@SuppressWarnings("unused")
		UpdateItemOutcome outcome =  table.updateItem(
		    "id",        // key attribute name
		    3,           // key attribute value
		    "add #A :val1 set #P = #P - :val2 remove #I", // UpdateExpression
		    expressionAttributeNames,
		    expressionAttributeValues);
		
		response.setMessage("Succeeded!");
		} catch (Exception e) {
			response.setMessage("Failed: " + e.getMessage());
		}
		
		return response;
	}

}
