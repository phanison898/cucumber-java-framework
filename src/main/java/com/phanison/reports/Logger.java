package com.phanison.reports;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.model.Media;

public class Logger {

	public static void info(String log) {
		ExtentTestManager.getTest().info(log);
	}

	public static void info(String log, boolean needScreenshot) {
		if (needScreenshot) {
			info(log);
		} else {
			ExtentTestManager.getTest().info(log, attachScreenshot());
		}
	}

	public static void pass(String log) {
		ExtentTestManager.getTest().pass(log);
	}

	public static void pass(String log, boolean needScreenshot) {
		if (needScreenshot) {
			pass(log);
		} else {
			ExtentTestManager.getTest().pass(log, attachScreenshot());
		}
	}

	public static void fail(String log) {
		ExtentTestManager.getTest().fail(log);
	}

	public static void fail(String log, boolean needScreenshot) {
		if (needScreenshot) {
			fail(log);
		} else {
			ExtentTestManager.getTest().fail(log, attachScreenshot());
		}
	}

	public static void warning(String log) {
		ExtentTestManager.getTest().warning(log);
	}

	public static void warning(String log, boolean needScreenshot) {
		if (needScreenshot) {
			warning(log);
		} else {
			ExtentTestManager.getTest().warning(log, attachScreenshot());
		}
	}

	private static Media attachScreenshot() {
		String path = new Screenshot(ExtentTestManager.getDriver()).capture();
		return MediaEntityBuilder.createScreenCaptureFromPath(path).build();
	}

}
