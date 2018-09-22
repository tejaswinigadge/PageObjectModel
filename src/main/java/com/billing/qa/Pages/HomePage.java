package com.billing.qa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.billing.qa.Base.TestBase;

public class HomePage extends TestBase {
	@FindBy(xpath = "//div[@id='AppInfoModuleDiv']")
	WebElement menu;

	@FindBy(xpath = ".//*[@id='TransactionsDiv']/ul/li[1]/b")
	WebElement customer;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public String checkHomePAgeTitle() {
		return driver.getTitle();
	}

	public Customer clickOnCustomer() {
		customer.click();
		return new Customer();
	}
}
