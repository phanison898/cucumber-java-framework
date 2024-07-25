package com.phanison.reports;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

public class ExtentTestManager {

	private static Map<Integer, ExtentTest> scenarioMap = new HashMap<Integer, ExtentTest>();

	private static ExtentTest test;

	private static WebDriver driver;

	public synchronized static void createScenario(String scenarioName, WebDriver driver) {
		test = ExtentReportManager.extent.createTest(scenarioName);
		scenarioMap.put(currentThreadID(), test);
		ExtentTestManager.driver = driver;
	}

	private synchronized static ExtentTest getScenario() {
		return scenarioMap.get(currentThreadID());
	}

	public static void createStep(String stepName) {
		test = getScenario().createNode(stepName);
	}

	public static ExtentTest getTest() {
		return test;
	}

	public static WebDriver getDriver() {
		return driver;
	}

	private static int currentThreadID() {
		return ((int) ((long) Thread.currentThread().getId()));
	}

}
