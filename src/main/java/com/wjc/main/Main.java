package com.wjc.main;
import java.time.ZoneId;
import java.time.ZonedDateTime;

import com.google.gson.Gson;
import com.wjc.model.test.Request;

public class Main {

	public static void main(String... args) {
		System.out.println(ZonedDateTime.now(ZoneId.of("America/New_York")));
	}

}
