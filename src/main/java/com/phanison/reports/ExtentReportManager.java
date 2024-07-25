package com.phanison.reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.phanison.config.Paths;

public class ExtentReportManager {

	public static ExtentReports extent;

	private ExtentReportManager() {

	}

	public static ExtentReports createInstance() {
		if (extent == null) {
			extent = new ExtentReports();
			ExtentSparkReporter spark = new ExtentSparkReporter(Paths.REPORT_FILE);
			spark.config().setTheme(Theme.DARK);
			extent.attachReporter(spark);
		}
		return extent;
	}

	public static void flush() {
		extent.flush();
	}

}
