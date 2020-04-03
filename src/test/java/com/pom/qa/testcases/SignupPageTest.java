package com.pom.qa.testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pom.qa.base.TestBase;
import com.pom.qa.pages.HomePage;
import com.pom.qa.pages.SignupPage;

import junit.framework.Assert;



public class SignupPageTest extends TestBase {
	
	SignupPage signuppage;
	HomePage  homepage;

	public SignupPageTest() {
		// TODO Auto-generated constructor stub	
		super();
	}
	
	@BeforeMethod
	public void setUp() throws IOException {
		initialization();
		homepage = new HomePage(driver);
		homepage.getSignupPageBtn().click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		System.out.println("LogIn Page url " + driver.getCurrentUrl());
		signuppage = new SignupPage();
	}


	@Test(priority=1)
	public void SignupPageTitleTest() {
		String title = signuppage.validateSignupPageTitle();
		Assert.assertEquals(title, "Free CRM #1 cloud software for any business large or small");
	}
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}