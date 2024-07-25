package com.phanison.reports;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.phanison.config.Paths;

public class Screenshot {

	WebDriver driver;

	Screenshot(WebDriver driver) {
		this.driver = driver;
	}

	public String capture() {
		String relativePath = Paths.SCREENSHOTS_FOLDER_NAME + "ss_" + System.currentTimeMillis() + ".png";
		String absolutePath = Paths.REPORT_FOLDER + "/" + relativePath;

		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File dest = new File(absolutePath);

		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return relativePath;
	}

}
