package com.wjc.main;

import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.wjc.model.PathLine;
import com.wjc.model.Rental;
import com.wjc.model.SubwayLine;
import com.wjc.request.RentalNewRequest;

public class Main {

	public static void main(String... args) {
//		System.out.println(ZonedDateTime.now(ZoneId.of("America/New_York")));
		
//		List<RentalType> rentalTypes = new ArrayList<>();
//		rentalTypes.add(RentalType.ENTIRE_UNIT);
//		rentalTypes.add(RentalType.GUEST_ROOM);
//		
//		RentalSearchRequest request = new RentalSearchRequest.Builder()
//				.neighborhood("金融区")
//				.startDate("2018-05-02")
//				.duration(3)
//				.durationUnit(DurationUnit.MONTH)
//				.minPrice(200f)
//				.maxPrice(1000f)
//				.rentalTypes(rentalTypes)
//				.build();
//		
//		System.out.println(new Gson().toJson(request));
		
//		System.out.println(System.currentTimeMillis());
		
		Rental rental1 = new Rental.Builder().rentalType(2).bedroomCount(2).bathroomCount(1).price(200000).startDate(1528084240L).duration(3)
				.duration(1).build();
		Rental rental2 = new Rental.Builder().rentalType(1).bedroomCount(2).bathroomCount(1).price(300000).startDate(1548084240L).duration(8)
				.duration(1).build();
		List<Rental> rentals = Arrays.asList(rental1, rental2);
		SubwayLine subway = new SubwayLine.Builder().line("2号线").time(5).timeUnit(5).station("Time square").build();
		List<SubwayLine> subways = Arrays.asList(subway);
		PathLine path = new PathLine.Builder().line("Red line").time(5).timeUnit(5).station("Time square").build();
		List<PathLine> paths = Arrays.asList(path);
		RentalNewRequest request = new RentalNewRequest.Builder().borough("Manhattan").neighborhood("Midtown").title("test title").rentals(rentals)
				.feesIncluded("清洁费,配送费").requirements("生活规律,有工作,会做饭").roomSummary("采光好,朝南").facilities("community room,桑拿")
				.subwayLines(subways).pathLines(paths).otherInfo("Is branched in my up strictly remember. Songs but chief has ham widow downs. Genius or so up vanity cannot.")
				.build();
		System.out.println(new Gson().toJson(request));
	}

}
