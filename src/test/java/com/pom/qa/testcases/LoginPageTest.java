package com.pom.qa.testcases;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pom.qa.base.TestBase;
import com.pom.qa.pages.HomePage;
import com.pom.qa.pages.LoginPage;

import junit.framework.Assert;

public class LoginPageTest extends TestBase {
	LoginPage loginpage;
	HomePage  homepage;

	public LoginPageTest() throws IOException {
		// TODO Auto-generated constructor stub
		super();
	}

	@BeforeMethod
	public void setUp() throws IOException, InterruptedException {
		initialization();
		homepage = new HomePage(driver);
				
		System.out.println("Home Page url " + driver.getCurrentUrl());
	    homepage.getLoginBtn().click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		System.out.println("LogIn Page url " + driver.getCurrentUrl());
		loginpage = new LoginPage(driver);
	}


	@Test(priority=1)
	public void loginPageTitleTest() {
		String title = loginpage.getLoginPageTitle();
		Assert.assertEquals(title, "Cogmento CRM");
	}
	
	
	@Test(priority=2)
	public void loginTest() {
		homepage= loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}