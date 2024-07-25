package com.phanison.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chrome implements Driver<ChromeOptions> {

	private WebDriver driver;

	@Override
	public ChromeOptions options() {
		ChromeOptions options = new ChromeOptions();
		return options;
	}

	@Override
	public void createDriver() {
		driver = new ChromeDriver(options());
	}

	@Override
	public WebDriver getDriver() {
		return driver;
	}

}
