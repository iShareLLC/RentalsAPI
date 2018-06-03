package com.wjc.handler;

import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.amazonaws.services.dynamodbv2.document.Item;
import com.amazonaws.services.dynamodbv2.document.ItemCollection;
import com.amazonaws.services.dynamodbv2.document.QueryOutcome;
import com.amazonaws.services.dynamodbv2.document.Table;
import com.amazonaws.services.dynamodbv2.document.spec.QuerySpec;
import com.amazonaws.services.dynamodbv2.document.utils.ValueMap;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.wjc.constant.RentalType;
import com.wjc.request.RentalSearchRequest;
import com.wjc.response.RentalCard;
import com.wjc.response.RentalSearchData;
import com.wjc.response.RentalSearchResponse;
import com.wjc.util.DynamoDBUtil;

public class RentalSearchHandler implements RequestHandler<RentalSearchRequest, RentalSearchResponse> {

	@Override
	public RentalSearchResponse handleRequest(RentalSearchRequest input, Context context) {
//		RentalSearchData data = new RentalSearchData();
//		data.setTotalCount(100);
//
//		Table table = DynamoDBUtil.getDynamoDBTable("NewYorkRentals");
//
//		QuerySpec spec = new QuerySpec().withKeyConditionExpression("Neighborhood = :v_neighborhood")
//				.withValueMap(new ValueMap().withString(":v_neighborhood", input.getNeighborhood()));
//
//		ItemCollection<QueryOutcome> items = table.query(spec);
//		Iterator<Item> iterator = items.iterator();
//		Item item = null;
//		RentalCard rentalCard = null;
//
//		while (iterator.hasNext()) {
//			item = iterator.next();
//			String titlePostTime = item.getString("Title|PostTime");
//			String title = titlePostTime.substring(0, titlePostTime.indexOf("|"));
//			String displayPrice = matchPrice(item, input);
//			if (displayPrice == null || displayPrice.isEmpty()) {
//				continue;
//			}
//			rentalCard = new RentalCard.Builder().price(3100).timeUnit(1).neighborhood(item.getString("Neighborhood"))
//					.title(title).description(item.getString("Description")).build();
//			data.addRentalCard(rentalCard);
//		}
//
//		return new RentalSearchResponse(200, "", data);
		
		
		
		RentalSearchData data = new RentalSearchData();
		data.setTotalCount(100);
		for (int i = 0; i < 3; i++) {
			RentalCard rentalCard = new RentalCard.Builder().price(3100).timeUnit(1).neighborhood(input.getNeighborhood())
					.title("test title").description("minPrice is " + input.getMinPrice() + " start is " + input.getStart())
					.addImageUrl("startDate is " + input.getStartDate()).addImageUrl("url 2").postTime(1525609320).build();
			data.addRentalCard(rentalCard);
		}
		
		return new RentalSearchResponse(200, "get rental type length: " + input.getRentalTypes().split(",").length, data);
	}

	// Return display price if this satisfy price filter condition
//	private String matchPrice(Item item, RentalSearchRequest input) {
//		List<RentalType> rentalTypes = input.getRentalTypes();
//		for (RentalType rentalType : rentalTypes) {
//			Map<String, Object> priceMap = item.getMap(rentalType.dbName());
//			if (priceMap == null || priceMap.isEmpty()) {
//				continue;
//			}
//			BigDecimal monthlyPrice = (BigDecimal) priceMap.get("m");
//			if (monthlyPrice == null) {
//				continue;
//			}
//			float priceFloat = monthlyPrice.floatValue();
//			if (priceFloat >= input.getMinPrice() && priceFloat <= input.getMaxPrice()) {
//				return "$" + priceFloat + "/月";
//			}
//		}
//
//		return null;
//	}
}
