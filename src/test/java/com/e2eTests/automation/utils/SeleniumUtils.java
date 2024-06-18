package com.e2eTests.automation.utils;

import org.openqa.selenium.WebDriver;

/**
 * This class contains all the methods requireed by selenium to perform actions
 * on web element. It is a repository so that same code need to be written again
 */
public class SeleniumUtils extends BasePage {

	/* driver. */
 private static WebDriver driver;

	public SeleniumUtils() {
		super(driver);
		SeleniumUtils.driver = Setup.getDriver();
	}
	
	
	public void get(String url) {
		driver.get(url);
	}

}