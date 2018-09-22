package com.billing.qa.testCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.billing.qa.Base.TestBase;
import com.billing.qa.Pages.HomePage;
import com.billing.qa.Pages.LoginPage;

public class HomePageTest extends TestBase {
	LoginPage loginPage;
	HomePage homepage;

	public HomePageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
	}

	@AfterMethod
	public void shutDown() {
		driver.quit();
	}

	@Test(priority = 1)
	public void validateHomeTitle() {
		homepage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		String d = homepage.checkHomePAgeTitle();
		Assert.assertEquals(d, "Main Menu");
	}

}
