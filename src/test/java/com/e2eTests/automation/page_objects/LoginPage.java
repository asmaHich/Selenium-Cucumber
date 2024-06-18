package com.e2eTests.automation.page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTests.automation.utils.BasePage;
import com.e2eTests.automation.utils.Setup;


public class LoginPage extends BasePage {

	/* Retrieve web element */
	@FindBy(how = How.ID, using = "Email")
	private static WebElement email;

	@FindBy(how = How.ID, using = "Password")
	private static WebElement password;

	@FindBy(how = How.XPATH, using = "//button[@type='submit']")
	private static WebElement btnLogin;
	
	@FindBy(how = How.TAG_NAME, using = "h1")
	private static WebElement text;
	
	public LoginPage() {
		super(Setup.getDriver());
	}

	/* Create method getter */
	public static WebElement getEmail() {
		return email;
	}

	public static WebElement getPassword() {
		return password;
	}

	public static WebElement getBtnlogin() {
		return btnLogin;
	}
	
	public static WebElement getTitlePage() {
		return text;
	}
}
