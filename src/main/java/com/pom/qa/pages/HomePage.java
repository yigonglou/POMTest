package com.pom.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pom.qa.base.TestBase;

public class HomePage extends TestBase {


	@FindBy(xpath="//span[contains(text(), 'Log In')]")  WebElement loginBtn;

	@FindBy(xpath="//a[contains(text(), 'Sign Up')]")  WebElement signupBtn;

	//	@FindBy(xpath="//input[@type='submit'") 
	//	WebElement loginBtn;
	@FindBy(xpath="//button[contain(text(),'Sign Up')]") 
	WebElement signBtn;
	//@FindBy(xpath="//img[contains(@class,'img-responsive')]") 
	
	@FindBy(xpath="//img[contains(@class,'img-responsive')]")
	WebElement crmLogo;

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	
	public String getHomePageTitle() {
		return driver.getTitle();
	}
	
	public boolean validateCrmLogoExist () {
		return crmLogo.isDisplayed();
	}

	public String getLoginBtnText () {
		System.out.println(loginBtn.getText());
		return loginBtn.getText();
		
	}
	
	public WebElement getLoginBtn () {
		return loginBtn;	
	}

	public String getSignupBtnText () {
		System.out.println(signupBtn.getText());
		return signupBtn.getText();
		}
	
	
}

