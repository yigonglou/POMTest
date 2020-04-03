package com.pom.qa.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pom.qa.base.TestBase;
import com.pom.qa.pages.HomePage;
import com.pom.qa.pages.LoginPage;

import junit.framework.Assert;



public class SignupPageTest {
	
	LoginPage signuppage;
	HomePage  homepage;

	public SignupPageTest() {
		// TODO Auto-generated constructor stub	
		super();
	}
	
	@BeforeMethod
	public void setUp() throws IOException {
		initialization();
		signupage = new SignupPage();
	}


	@Test(priority=1)
	public void loginPageTitleTest() {
		String title = signupapge.getSignupPageTitle();
		Assert.assertEquals(title, "Free CRM #1 cloud software for any business large or small");
	}
	
	@Test (priority=2)
	public void crmLogoTest() {
		boolean flag = loginpage.validateCRMImage();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=3)
	public void loginTest() {
		homepage= loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}