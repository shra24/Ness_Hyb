package com.dra3.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dra3.base.TestBase;

public class LoginPage {

	WebDriver driver;

	// defining Page factory

	@FindBy(id = "mat-input-0")
	private WebElement username;

	@FindBy(xpath = "//input [@id = 'mat-input-1']")
	private WebElement password;

	@FindBy(xpath = "//button [@class= 'login-form-item login-btn mat-raised-button btn-primary']/div[2]")
	private WebElement loginbtn;

	@FindBy(xpath = "//a[contains(text(),'Forgot username/password?')]")
	private WebElement forgotpwd;

	@FindBy(xpath = "//div [@class = 'app-header-left']/span [@class = 'app-header-title']")
	private WebElement dra3logo;

	// define pagefactory -

	public LoginPage(WebDriver driver) throws Throwable {
		// super(driver);
		this.driver = driver;
		// This initElements method will create all WebElements
		PageFactory.initElements(driver, this);
	}

	// Methods

	public TeacherHomePage LoginIn(String usrn, String pwdn) {
		username.clear();
		username.sendKeys(usrn);

		password.clear();
		password.sendKeys(pwdn);

		loginbtn.click();
		return new TeacherHomePage();
	}

	public String validatePageTitle() {
		return driver.getTitle();
	}

	public boolean validatedra3logo() {
		return dra3logo.isDisplayed();

	}

}
