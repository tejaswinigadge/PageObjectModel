package com.billing.qa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.billing.qa.Base.TestBase;

public class LoginPage extends TestBase {

	// page factory
	@FindBy(xpath = "//input[@name='UserNameEntryField']")
	WebElement username;

	@FindBy(xpath = "//input[@name='Password']")
	WebElement password;

	@FindBy(xpath = "//input[@name='SubmitUser']")
	WebElement btnlogin;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	// Action

	public String validateTitle() {
		return driver.getTitle();
	}

	public HomePage login(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		btnlogin.submit();
		return new HomePage();
	}
}
