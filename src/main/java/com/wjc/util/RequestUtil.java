package com.wjc.util;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.json.simple.JSONObject;

public final class RequestUtil {

	private RequestUtil() {
	}

	@Nullable
	public static String getQueryParam(@Nonnull JSONObject jsonObject, @Nonnull String paramName) {
		JSONObject qps = (JSONObject) jsonObject.get("queryStringParameters");
		return qps == null ? null : (String) qps.get(paramName);
	}

	@Nullable
	public static String getPathParam(@Nonnull JSONObject jsonObject, @Nonnull String paramName) {
		JSONObject qps = (JSONObject) jsonObject.get("pathParameters");
		return qps == null ? null : (String) qps.get(paramName);
	}

	@Nullable
	public static String getHeader(@Nonnull JSONObject jsonObject, @Nonnull String headerName) {
		JSONObject qps = (JSONObject) jsonObject.get("headers");
		return qps == null ? null : (String) qps.get(headerName);
	}

	@Nullable
	public static String getBody(@Nonnull JSONObject jsonObject, @Nonnull String bodyName) {
		JSONObject qps = (JSONObject) jsonObject.get("body");
		return qps == null ? null : (String) qps.get(bodyName);
	}
}
