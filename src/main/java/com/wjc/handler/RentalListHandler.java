package com.wjc.handler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.wjc.request.RentalListRequest;
import com.wjc.response.RentalListResponse;

/**
 * Previously popular places handler
 * 
 * @author jiechao
 */
public class RentalListHandler implements RequestHandler<RentalListRequest, List<RentalListResponse>> {

	@Override
	public List<RentalListResponse> handleRequest(RentalListRequest input, Context context) {
		String description = "This is a very long long long long long long long long description from user in " + input.getCity();
		List<String> imageUrls = new ArrayList<>();
		imageUrls.add("https://room-matehotels.com/images/img/general/slide_inicio/slide_01.jpg");
		imageUrls.add(
				"http://4.bp.blogspot.com/-RSAdi3NMMs8/VakWj_znRcI/AAAAAAAAAMI/lp19iktRyCw/s1600/Rent%2Broom%2Bstockholm.jpg");
		imageUrls.add("https://room-matehotels.com/images/img/general/slide_inicio/slide_01.jpg");
		imageUrls.add(
				"http://4.bp.blogspot.com/-RSAdi3NMMs8/VakWj_znRcI/AAAAAAAAAMI/lp19iktRyCw/s1600/Rent%2Broom%2Bstockholm.jpg");

		RentalListResponse place1 = new RentalListResponse("$110/日", "布鲁克林下城", "Best apartment in Downtown Brooklyn", description + " and lets make it even longer longer longer", imageUrls);
		RentalListResponse place2 = new RentalListResponse("$3110/月", "中城西", "Best apartment in Downtown Brooklyn", description, imageUrls);
		RentalListResponse place3 = new RentalListResponse("$11022/年", "地狱厨房/克林顿区", "LIVE HERE!", description, imageUrls);

		return Arrays.asList(place1, place2, place3);
	}

}
