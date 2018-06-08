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
		List<String> imageUrls = new ArrayList<>();
		imageUrls.add("https://room-matehotels.com/images/img/general/slide_inicio/slide_01.jpg");
		imageUrls.add(
				"http://4.bp.blogspot.com/-RSAdi3NMMs8/VakWj_znRcI/AAAAAAAAAMI/lp19iktRyCw/s1600/Rent%2Broom%2Bstockholm.jpg");
		imageUrls.add("https://room-matehotels.com/images/img/general/slide_inicio/slide_01.jpg");
		imageUrls.add(
				"http://4.bp.blogspot.com/-RSAdi3NMMs8/VakWj_znRcI/AAAAAAAAAMI/lp19iktRyCw/s1600/Rent%2Broom%2Bstockholm.jpg");
		
		RentalListCard card1 = new RentalListCard.Builder()
				.id("1527978347|999")
				.price(300000)
				.timeUnit(1)
				.title1("布鲁克林")
				.title2("Best 公寓 in town")
				.description("精装修，带家具，独立厨卫，包水电暖网络；交通方便，生活便利，房子干净整洁。")
				.imageUrls(imageUrls)
				.build();
		
		RentalListCard card2 = new RentalListCard.Builder()
				.id("1517978300|12")
				.price(450000)
				.timeUnit(1)
				.title1("Midtown")
				.title2("位于皇冠高度区的精装公寓")
				.description("精装修，带家具，独立厨卫，包水电暖网络；交通方便，生活便利，房子干净整洁。longer longer")
				.imageUrls(imageUrls)
				.build();
		
		RentalListData data = new RentalListData();
		data.setTotalCount(100);
		data.setResults(Arrays.asList(card1, card2));
		RentalListResponse response = new RentalListResponse();
		response.setStatusCode(200);
		response.setData(data);
		response.setMessage("a message");
		return response;
	}

}
