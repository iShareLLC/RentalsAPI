package com.wjc.handler;

import com.amazonaws.services.dynamodbv2.document.DynamoDB;
import com.amazonaws.services.dynamodbv2.document.Item;
import com.amazonaws.services.dynamodbv2.document.PutItemOutcome;
import com.amazonaws.services.dynamodbv2.document.spec.PutItemSpec;
import com.amazonaws.services.dynamodbv2.model.ConditionalCheckFailedException;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.wjc.constant.Constant;
import com.wjc.model.PersonRequest;
import com.wjc.model.PersonResponse;
import com.wjc.util.DynamoDBUtil;

/**
 * PutItem demo
 * @author jiechao
 */
public class SavePersonHandler implements RequestHandler<PersonRequest, PersonResponse> {

	private DynamoDB dynamoDB;

	public PersonResponse handleRequest(PersonRequest personRequest, Context context) {
		dynamoDB = DynamoDBUtil.getDynamoDB();
		persistData(personRequest);

		PersonResponse personResponse = new PersonResponse();
		personResponse.message = "Saved Successfully!!!";
		return personResponse;
	}

	private PutItemOutcome persistData(PersonRequest personRequest) throws ConditionalCheckFailedException {
		Item item = new Item().withPrimaryKey("id", personRequest.id).withString("firstName", personRequest.firstName)
				.withString("lastName", personRequest.lastName).withNumber("age", personRequest.age)
				.withString("country", personRequest.address.country);
		return dynamoDB.getTable(Constant.DYNAMODB_TABLE_NAME).putItem(new PutItemSpec().withItem(item));
	}
}
