package com.phanison.config;

import java.io.FileReader;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class Config {

	private static JsonObject jo;

	private static JsonObject getJO() {
		if (jo == null) {
			try (FileReader reader = new FileReader(Paths.CONFIG_FILE)) {
				jo = new Gson().fromJson(reader, JsonObject.class);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return jo;
	}

	public static long getPageLoadTime() {
		return getJO().get("time-outs").getAsJsonObject().get("page-load-wait").getAsLong();
	}

	public static long getImplicitTime() {
		return getJO().get("time-outs").getAsJsonObject().get("implicit-wait").getAsLong();
	}

	public static long getExplicitTime() {
		return getJO().get("time-outs").getAsJsonObject().get("explicit-wait").getAsLong();
	}

	public static long getScriptLoadTime() {
		return getJO().get("time-outs").getAsJsonObject().get("script-load-wait").getAsLong();
	}

}
