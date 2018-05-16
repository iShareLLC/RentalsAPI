package com.wjc.util;

import javax.annotation.Nonnull;

import com.amazonaws.regions.Regions;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.document.DynamoDB;
import com.amazonaws.services.dynamodbv2.document.Table;

public final class DynamoDBUtil {

	private DynamoDBUtil() {}
	
	public static DynamoDB getDynamoDB() {
		AmazonDynamoDB client = AmazonDynamoDBClientBuilder.standard().withRegion(Regions.US_EAST_1).build();
		return new DynamoDB(client);
	}
	
	public static Table getDynamoDBTable(@Nonnull final String tableName) {
		return getDynamoDB().getTable(tableName);
	}
}
