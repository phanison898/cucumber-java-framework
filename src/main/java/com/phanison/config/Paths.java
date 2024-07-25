package com.phanison.config;

public class Paths {

	public static String HOME_PATH = System.getProperty("user.dir");

	public static String CONFIG_FILE = HOME_PATH + "/src/main/resources/framework-config.json";

	public static String REPORT_FOLDER = HOME_PATH + "/z-report";

	public static String REPORT_FILE = REPORT_FOLDER + "/index.html";

	public static String SCREENSHOTS_FOLDER_NAME = "screenshots";

	public static String SCREENSHOTS_FOLDER = REPORT_FOLDER + "/" + SCREENSHOTS_FOLDER_NAME;

}
