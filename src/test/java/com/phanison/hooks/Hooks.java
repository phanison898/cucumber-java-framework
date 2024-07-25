package com.phanison.hooks;

import org.openqa.selenium.WebDriver;

import com.phanison.config.Config;
import com.phanison.drivers.Driver;
import com.phanison.drivers.DriverFactory;
import com.phanison.reports.ExtentReportManager;
import com.phanison.reports.ExtentTestManager;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class Hooks {

	private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

	@BeforeAll
	public void beforeSuite() {
		ExtentReportManager.createInstance();
	}

	@Before
	public void beforeScenario(Scenario scenario) {

		Driver<?> webDriver = DriverFactory.selectDriverByBrowserName(Config.getBrowser());
		webDriver.init();
		driver.set(webDriver.getDriver());

		ExtentTestManager.createScenario(scenario.getName(), getDriver());
	}

	@BeforeStep
	public void beforeStep() {
		// TODO
	}

	@AfterStep
	public void afterStep() {
		// TODO
	}

	@After
	public void afterScenario(Scenario scenario) {
		getDriver().quit();
	}

	@AfterAll
	public void afterSuite() {
		ExtentReportManager.flush();
	}

	public static WebDriver getDriver() {
		return driver.get();
	}

}
