package com.wjc.handler;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.amazonaws.services.dynamodbv2.document.Item;
import com.amazonaws.services.dynamodbv2.document.ItemCollection;
import com.amazonaws.services.dynamodbv2.document.QueryOutcome;
import com.amazonaws.services.dynamodbv2.document.Table;
import com.amazonaws.services.dynamodbv2.document.spec.QuerySpec;
import com.amazonaws.services.dynamodbv2.document.utils.ValueMap;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.wjc.request.RentalSearchRequest;
import com.wjc.response.RentalSearchResponse;
import com.wjc.util.DynamoDBUtil;

public class PostRentalSearchHandler implements RequestHandler<RentalSearchRequest, List<RentalSearchResponse>> {

	@Override
	public List<RentalSearchResponse> handleRequest(RentalSearchRequest input, Context context) {
		List<RentalSearchResponse> responses = new ArrayList<>();
		
		Table table = DynamoDBUtil.getDynamoDBTable("NewYorkRentals");

		QuerySpec spec = new QuerySpec().withKeyConditionExpression("Neighborhood = :v_neighborhood")
				.withValueMap(new ValueMap().withString(":v_neighborhood", input.getNeighborhood()));

		ItemCollection<QueryOutcome> items = table.query(spec);
		Iterator<Item> iterator = items.iterator();
		Item item = null;
		RentalSearchResponse response = null;
		
		while (iterator.hasNext()) {
			item = iterator.next();
			String titlePostTime = item.getString("Title|PostTime");
			String title = titlePostTime.substring(0, titlePostTime.indexOf("|"));
			Object price = item.getMap("Price").get("EntireUnit");
			String displayPrice = price == null ? "" : price.toString();
			response = new RentalSearchResponse.Builder()
					.displayPrice(displayPrice)
					.neighborhood(item.getString("Neighborhood"))
					.title(title)
					.description(item.getString("Description"))
					.build();
			responses.add(response);
		}

		return responses;
	}
}
