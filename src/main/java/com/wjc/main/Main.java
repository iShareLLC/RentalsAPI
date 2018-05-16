package com.wjc.main;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.wjc.constant.DurationUnit;
import com.wjc.constant.RentalType;
import com.wjc.model.test.Request;
import com.wjc.request.RentalSearchRequest;

public class Main {

	public static void main(String... args) {
//		System.out.println(ZonedDateTime.now(ZoneId.of("America/New_York")));
		
		List<RentalType> rentalTypes = new ArrayList<>();
		rentalTypes.add(RentalType.ENTIRE_UNIT);
		rentalTypes.add(RentalType.GUEST_ROOM);
		
		RentalSearchRequest request = new RentalSearchRequest.Builder()
				.neighborhood("金融区")
				.startDate("2018-05-02")
				.duration(3)
				.durationUnit(DurationUnit.MONTH)
				.minPrice(200f)
				.maxPrice(1000f)
				.rentalTypes(rentalTypes)
				.build();
		
		System.out.println(new Gson().toJson(request));
	}

}
