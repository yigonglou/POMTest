package com.pom.qa.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pom.qa.base.TestBase;
import com.pom.qa.pages.HomePage;

import junit.framework.Assert;

public class HomePageTest extends TestBase {

//	LoginPage loginpage;
	HomePage  homepage;

	public HomePageTest() throws IOException {
		// TODO Auto-generated constructor stub
		super();
	}

	@BeforeMethod
	public void setUp() throws IOException {
		initialization();
		homepage = new HomePage(driver);
	}


	@Test(priority=1)
	public void HomePageTitleTest() {
		String title = homepage.getHomePageTitle();
		Assert.assertEquals(title, "Free CRM #1 cloud software for any business large or small");
	}
	
	@Test (priority=2)
	public void signupBtnExistTest() {
		Assert.assertEquals(homepage.getSignupBtnText(),"SIGN UP" );
	}

	@Test(priority=3)
	public void loginBntExistTest() {
		//homepage= loginpage.login(prop.getProperty("username"),prop.getProperty("password"));	
		
		Assert.assertEquals(homepage.getLoginBtnText(),"LOG IN");
	}
  
	
	@Test (priority=4)
	public void crmLogoExistTest() {
		boolean flag = homepage.validateCrmLogoExist();
		Assert.assertTrue(flag);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}