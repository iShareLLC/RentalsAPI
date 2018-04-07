package com.wjc.api;

import java.util.List;

import com.amazonaws.services.dynamodbv2.document.BatchGetItemOutcome;
import com.amazonaws.services.dynamodbv2.document.DynamoDB;
import com.amazonaws.services.dynamodbv2.document.Item;
import com.amazonaws.services.dynamodbv2.document.TableKeysAndAttributes;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.wjc.model.PersonRequest;
import com.wjc.model.PersonResponse;
import com.wjc.util.DynamoDBUtil;

/**
 * batchGetItem demo
 * 
 * @author jiechao
 */
public class GetPersonsHandler implements RequestHandler<PersonRequest, PersonResponse> {

	private DynamoDB dynamoDB;
	private String DYNAMODB_TABLE_NAME = "Person";

	public PersonResponse handleRequest(PersonRequest personRequest, Context context) {
		dynamoDB = DynamoDBUtil.getDynamoDB();

		TableKeysAndAttributes attributes = new TableKeysAndAttributes(DYNAMODB_TABLE_NAME);
		attributes.addHashOnlyPrimaryKeys("id", 1, 2);

		BatchGetItemOutcome outcome = dynamoDB.batchGetItem(attributes);

		PersonResponse response = new PersonResponse();

		for (String tableName : outcome.getTableItems().keySet()) {
			List<Item> items = outcome.getTableItems().get(tableName);
			System.out.println("Item count " + items.size());
			for (Item item : items) {
				response.message += item.getString("country");
			}
		}

		return response;
	}
}
