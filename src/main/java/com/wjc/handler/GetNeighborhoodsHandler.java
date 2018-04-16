package com.wjc.handler;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.ScanRequest;
import com.amazonaws.services.dynamodbv2.model.ScanResult;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.util.StringUtils;
import com.wjc.model.NeighborhoodRequest;
import com.wjc.model.NeighborhoodResponse;
import com.wjc.model.ResponseError;

public class GetNeighborhoodsHandler implements RequestHandler<NeighborhoodRequest, NeighborhoodResponse> {

	@Override
	public NeighborhoodResponse handleRequest(NeighborhoodRequest request, Context context) {
		List<String> neighborhoods = new ArrayList<>();
		LambdaLogger logger = context.getLogger();

		try {
			logger.log("GetNeighborhoodsHandler: received request: " + request.getCity() + request.getClient()
					+ request.getVersion());
			AmazonDynamoDB client = AmazonDynamoDBClientBuilder.standard().build();
			ScanRequest scanRequest = new ScanRequest().withTableName("Neighborhoods");

			ScanResult result = client.scan(scanRequest);
			for (Map<String, AttributeValue> item : result.getItems()) {
				String chineseName = item.get("Chinese Name").getS();
				if (!StringUtils.isNullOrEmpty(chineseName)) {
					neighborhoods.add(chineseName);
				} else {
					neighborhoods.add(item.get("Name").getS());
				}
			}

			return new NeighborhoodResponse(neighborhoods, false, null);
		} catch (Exception e) {
			logger.log(e.getMessage());
			return new NeighborhoodResponse(null, false, new ResponseError(500, e.getMessage()));
		}
	}

}
