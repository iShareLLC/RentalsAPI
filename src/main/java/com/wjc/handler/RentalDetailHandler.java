package com.wjc.handler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.wjc.constant.RentalType;
import com.wjc.request.RentalDetailRequest;
import com.wjc.response.RentalDetailResponse;

/**
 * Returns rental details when a rental on search results is clicked
 * 
 * @author jiechao
 */
public class RentalDetailHandler implements RequestHandler<RentalDetailRequest, RentalDetailResponse> {

	@Override
	public RentalDetailResponse handleRequest(RentalDetailRequest request, Context context) {
		List<String> imageUrls = new ArrayList<>();
		imageUrls.add("https://media.tmz.com/2018/03/28/0328-jennifer-lopez-alex-rodriguez-new-york-apartment-photos-launch-3.jpg");
		imageUrls.add("http://4.bp.blogspot.com/-RSAdi3NMMs8/VakWj_znRcI/AAAAAAAAAMI/lp19iktRyCw/s1600/Rent%2Broom%2Bstockholm.jpg");
		imageUrls.add("https://room-matehotels.com/images/img/general/slide_inicio/slide_01.jpg");
		imageUrls.add("http://4.bp.blogspot.com/-RSAdi3NMMs8/VakWj_znRcI/AAAAAAAAAMI/lp19iktRyCw/s1600/Rent%2Broom%2Bstockholm.jpg");

		Map<String, List<Integer>> prices = new HashMap<>();
		prices.put(RentalType.ENTIRE_UNIT.getName(), Arrays.asList(100000, 30000, 6000));
		prices.put(RentalType.GUEST_ROOM.getName(), Arrays.asList(85000, 25000, -1));
		prices.put(RentalType.LIVING_ROOM.getName(), Arrays.asList(-1, -1, 4500));

		List<String> highlights = Arrays.asList("空调", "游泳池", "健身房", "热水", "工作台");

		Map<String, String> transpotation = new HashMap<>();
		transpotation.put("地铁线路D", "13分钟步行距离至 Brighton Beach");
		transpotation.put("Path", "5分钟步行距离至 Chinatown");
		
		String description = "精装修，带家具，独立厨卫，包水电暖网络；交通方便，生活便利，房子干净整洁。"
				+ "city: " + request.getCity() + " id: " + request.getId();

		return new RentalDetailResponse.Builder().imageUrls(imageUrls).availableStartDate(1550188800)
				.availableEndDate(1561161600).title("位于皇后高地区的精装公寓")
				.description(description).prices(prices).includeInternet(true)
				.includeElectricity(true).includeWater(false).includeGas(false).allowCat(true).allowDog(false)
				.noSmoking(true).hasDoorman(true).hasWasher(false).hasDryer(false).highlights(highlights)
				.transpotation(transpotation).statusCode(200).message("no exception").build();
	}

}
