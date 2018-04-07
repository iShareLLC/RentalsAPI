package com.wjc.api;

import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient;
import com.amazonaws.services.dynamodbv2.document.DynamoDB;
import com.amazonaws.services.dynamodbv2.document.Item;
import com.amazonaws.services.dynamodbv2.document.PutItemOutcome;
import com.amazonaws.services.dynamodbv2.document.spec.PutItemSpec;
import com.amazonaws.services.dynamodbv2.model.ConditionalCheckFailedException;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.wjc.model.PersonRequest;
import com.wjc.model.PersonResponse;

public class SavePersonHandler implements RequestHandler<PersonRequest, PersonResponse> {

	private DynamoDB dynamoDb;
	private String DYNAMODB_TABLE_NAME = "Person";
	private Regions REGION = Regions.US_EAST_1;

	public PersonResponse handleRequest(PersonRequest personRequest, Context context) {

		initDynamoDbClient();

		persistData(personRequest);

		PersonResponse personResponse = new PersonResponse();
		personResponse.message = "Saved Successfully!!!";
		return personResponse;
	}

	private PutItemOutcome persistData(PersonRequest personRequest) throws ConditionalCheckFailedException {
		Item item = new Item().withPrimaryKey("id", personRequest.id).withString("firstName", personRequest.firstName)
				.withString("lastName", personRequest.lastName).withNumber("age", personRequest.age)
				.withString("address", personRequest.address);
		return dynamoDb.getTable(DYNAMODB_TABLE_NAME).putItem(new PutItemSpec().withItem(item));
	}

	private void initDynamoDbClient() {
		AmazonDynamoDBClient client = new AmazonDynamoDBClient();
		client.setRegion(Region.getRegion(REGION));
		dynamoDb = new DynamoDB(client);
	}
}
