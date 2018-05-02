package com.wjc.handler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.wjc.request.PopularPlaceRequest;
import com.wjc.response.PopularPlaceResponse;

public class GetPopularPlacesHandler implements RequestHandler<PopularPlaceRequest, List<PopularPlaceResponse>> {

	@Override
	public List<PopularPlaceResponse> handleRequest(PopularPlaceRequest input, Context context) {
		String price = "$110/day";
		String title1 = "BROOKLYN";
		String title2 = "Best apartment in Downtown Brooklyn";
		String description = "This is a very long long long long long long long long description from user in " + input.getCity();
		List<String> imageUrls = new ArrayList<>();
		imageUrls.add("https://room-matehotels.com/images/img/general/slide_inicio/slide_01.jpg");
		imageUrls.add(
				"http://4.bp.blogspot.com/-RSAdi3NMMs8/VakWj_znRcI/AAAAAAAAAMI/lp19iktRyCw/s1600/Rent%2Broom%2Bstockholm.jpg");
		imageUrls.add("https://room-matehotels.com/images/img/general/slide_inicio/slide_01.jpg");
		imageUrls.add(
				"http://4.bp.blogspot.com/-RSAdi3NMMs8/VakWj_znRcI/AAAAAAAAAMI/lp19iktRyCw/s1600/Rent%2Broom%2Bstockholm.jpg");

		PopularPlaceResponse place1 = new PopularPlaceResponse(price, title1, title2, description, imageUrls);
		PopularPlaceResponse place2 = new PopularPlaceResponse(price, title1, title2, description, imageUrls);
		PopularPlaceResponse place3 = new PopularPlaceResponse(price, title1, title2, description, imageUrls);

		return Arrays.asList(place1, place2, place3);
	}

}
