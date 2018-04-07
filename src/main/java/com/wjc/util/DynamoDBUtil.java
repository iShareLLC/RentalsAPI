package com.wjc.util;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.document.DynamoDB;

public final class DynamoDBUtil {

	private DynamoDBUtil() {}
	
	public static DynamoDB getDynamoDB() {
		AmazonDynamoDB client = AmazonDynamoDBClientBuilder.standard().build();
		return new DynamoDB(client);
	}
}
