package com.phanison.drivers;

public class DriverFactory {

	public static Driver<?> selectDriverByBrowserName(String browser) {

		Driver<?> driver = null;

		switch (browser.toLowerCase()) {
		case "chrome":
			driver = new Chrome();
			break;
		case "edge":
			driver = new Edge();
			break;
		default:
			throw new IllegalArgumentException("Unsupported browser: " + browser);
		}

		return driver;
	}
}
