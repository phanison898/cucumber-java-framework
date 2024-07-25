package com.phanison.drivers;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import com.phanison.config.Config;

public interface Driver<T> {

	T options();

	void createDriver();

	WebDriver getDriver();

	default void init() {
		getDriver().manage().window().maximize();
		getDriver().manage().deleteAllCookies();
		getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Config.getPageLoadTime()));
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(Config.getImplicitTime()));
		getDriver().manage().timeouts().scriptTimeout(Duration.ofSeconds(Config.getScriptLoadTime()));
	}

}
