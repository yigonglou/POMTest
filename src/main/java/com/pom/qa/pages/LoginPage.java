package com.pom.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.oracle.tools.packager.Log;
import com.pom.qa.base.TestBase;
import com.pom.qa.util.TestUtil;

public class LoginPage extends TestBase {
	
	//*[@id="ui"]/div/div/form/div/div[1]/div/input
	
	@FindBy(name="email") 
	WebElement username;
	@FindBy(name="password") 
	WebElement password;
	@FindBy(xpath="//div[contain(text(),'Login')]") 
	WebElement loginSubBtn;
	//@FindBy(xpath="//input[@type='submit'") 
	@FindBy(xpath="//Sapn[contain(text(),'Log In')])")
	WebElement loginBtn;
	@FindBy(xpath="//button[contain(text(),'Sign Up')]") 
	WebElement signBtn;
	@FindBy(xpath="//img[contains(@class,'img-responsive')]")
	WebElement crmLogo;
	
	public LoginPage(WebDriver driver) {	
		PageFactory.initElements(driver, this);
	}

	
    public String getLoginPageTitle() {
    	return driver.getTitle();
    }
    
    public boolean validateCRMImage() {
    	return crmLogo.isDisplayed();
    }
    
   
    public WebElement getLoginBtn() {
    	return loginBtn;
    }
    
    public HomePage login(String un, String pwd) {
    	
    	username.sendKeys(un);
    	password.sendKeys(pwd);
    	loginSubBtn.click();
    	return new HomePage(driver);
    }
    
    public HomePage signup(String un, String pwd) {
    	username.sendKeys(un);
    	password.sendKeys(pwd);
    	return new HomePage(driver);
    }
    
    
}

	
	


