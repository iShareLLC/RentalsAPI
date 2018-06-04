package com.wjc.handler;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.wjc.model.RentalCard;
import com.wjc.model.RentalSearchData;
import com.wjc.request.RentalSearchRequest;
import com.wjc.response.RentalSearchResponse;

public class RentalSearchHandler implements RequestHandler<RentalSearchRequest, RentalSearchResponse> {

	@Override
	public RentalSearchResponse handleRequest(RentalSearchRequest request, Context context) {
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
			RentalCard rentalCard = new RentalCard.Builder().price(3100).timeUnit(1).neighborhood(request.getNeighborhood())
					.title("test title").description("minPrice is " + request.getMinPrice() + " start is " + request.getStart())
					.addImageUrl("startDate is " + request.getStartDate()).addImageUrl("url 2").postTime(1525609320).build();
			data.addRentalCard(rentalCard);
		}
		
		return new RentalSearchResponse(200, "get rental type length: " + request.getRentalTypes().split(",").length, data);
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
