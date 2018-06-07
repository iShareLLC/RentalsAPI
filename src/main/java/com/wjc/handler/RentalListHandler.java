package com.wjc.handler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.wjc.model.RentalListCard;
import com.wjc.model.RentalListData;
import com.wjc.request.RentalListRequest;
import com.wjc.response.RentalListResponse;

/**
 * Previously popular places handler
 * 
 * @author jiechao
 */
public class RentalListHandler implements RequestHandler<RentalListRequest, RentalListResponse> {

	@Override
	public RentalListResponse handleRequest(RentalListRequest request, Context context) {
		String description = "This is a very long long long long long long long long description from user in " + request.getCity();
		List<String> imageUrls = new ArrayList<>();
		imageUrls.add("https://room-matehotels.com/images/img/general/slide_inicio/slide_01.jpg");
		imageUrls.add(
				"http://4.bp.blogspot.com/-RSAdi3NMMs8/VakWj_znRcI/AAAAAAAAAMI/lp19iktRyCw/s1600/Rent%2Broom%2Bstockholm.jpg");
		imageUrls.add("https://room-matehotels.com/images/img/general/slide_inicio/slide_01.jpg");
		imageUrls.add(
				"http://4.bp.blogspot.com/-RSAdi3NMMs8/VakWj_znRcI/AAAAAAAAAMI/lp19iktRyCw/s1600/Rent%2Broom%2Bstockholm.jpg");

		RentalListCard card1 = new RentalListCard("$110/日", "布鲁克林下城", "Best apartment in Downtown Brooklyn", description + " and lets make it even longer longer longer", imageUrls);
		RentalListCard card2 = new RentalListCard("$3110/月", "中城西", "Best apartment in Downtown Brooklyn", description, imageUrls);
		RentalListCard card3 = new RentalListCard("$11022/年", "地狱厨房/克林顿区", "LIVE HERE!", description, imageUrls);
		
		RentalListData data = new RentalListData();
		data.setTotalCount(100);
		data.setResults(Arrays.asList(card1, card2, card3));
		RentalListResponse response = new RentalListResponse();
		response.setStatusCode(200);
		response.setData(data);
		return response;
	}

}
