package com.phanison.drivers;

import org.openqa.selenium.WebDriver;

public class DriverFactory {

	public WebDriver selectDriver(String browser) {

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

		return driver.getDriver();
	}
}
