package com.wjc.handler;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import com.amazonaws.services.lambda.runtime.RequestStreamHandler;
import com.wjc.util.RequestUtil;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class FunctionWithAPIGatewayJava implements RequestStreamHandler {
	JSONParser parser = new JSONParser();

	@SuppressWarnings("unchecked")
	public void handleRequest(InputStream inputStream, OutputStream outputStream, Context context) throws IOException {

		LambdaLogger logger = context.getLogger();
		logger.log("Loading Java Lambda handler of FunctionWithAPIGatewayJava");

		BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
		JSONObject responseJson = new JSONObject();
		String name = "you";
		String city = "World";
		String time = "day";
		String day = null;
		String responseCode = "200";

		try {
			String temp;
			JSONObject jsonObject = (JSONObject) parser.parse(reader);
			logger.log("Input is " + jsonObject.toJSONString());

			temp = RequestUtil.getQueryParam(jsonObject, "name");
			if (temp != null) {
				name = temp;
			}

			temp = RequestUtil.getPathParam(jsonObject, "proxy");
			if (temp != null) {
				city = temp;
			}

			temp = RequestUtil.getHeader(jsonObject, "day");
			if (temp != null) {
				day = temp;
			}

			if (jsonObject.get("body") != null) {
				JSONObject body = (JSONObject) parser.parse((String) jsonObject.get("body"));
				if (body.get("time") != null) {
					time = (String) body.get("time");
				}
			}

			String greeting = "Good " + time + ", " + name + " of " + city + ". ";
			if (day != null && day != "")
				greeting += "Happy " + day + "!";

			JSONObject responseBody = new JSONObject();
			responseBody.put("message", greeting);

			JSONObject headerJson = new JSONObject();
			headerJson.put("x-custom-header", "my custom header value");

			responseJson.put("isBase64Encoded", false);
			responseJson.put("statusCode", responseCode);
			responseJson.put("headers", headerJson);
			responseJson.put("body", responseBody.toString());

		} catch (Exception e) {
			responseJson.put("statusCode", "400");
			responseJson.put("exception", e);
			logger.log("Exception: " + e.getMessage());
		}

		logger.log(responseJson.toJSONString());
		OutputStreamWriter writer = new OutputStreamWriter(outputStream, "UTF-8");
		writer.write(responseJson.toJSONString());
		writer.close();
	}
}
