package com.dra3.testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.dra3.base.TestBase;
import com.dra3.pages.LoginPage;
import com.dra3.pages.TeacherHomePage;

public class LoginPageTest extends TestBase {

	LoginPage loginPage;
	TeacherHomePage teacherhomepage;

	@BeforeMethod
	public void setUp() throws Throwable {
		initialisation();
	}

	/*
	 * @Test public void LoginTest() { teacherhomepage =
	 * loginPage.LoginIn(prop.getProperty("username"),
	 * prop.getProperty("password"));
	 * 
	 * }
	 */

	@Test
	public void PageTitleTest() throws Throwable {
		loginPage = new LoginPage(driver);
		Assert.assertEquals(loginPage.validatePageTitle(), "Dra3");
	}

	 @Test
	public void dra3logoTest() {
		boolean flag = loginPage.validatedra3logo();
		Assert.assertTrue(flag);
	}

	@AfterMethod
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}
