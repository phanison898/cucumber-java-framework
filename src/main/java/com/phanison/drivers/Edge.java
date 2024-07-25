package com.phanison.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Edge implements Driver<EdgeOptions> {

	private WebDriver driver;

	@Override
	public EdgeOptions options() {
		EdgeOptions options = new EdgeOptions();
		return options;
	}

	@Override
	public void createDriver() {
		driver = new EdgeDriver(options());
	}

	@Override
	public WebDriver getDriver() {
		return driver;
	}

}
