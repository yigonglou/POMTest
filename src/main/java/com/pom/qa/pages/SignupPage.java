package com.pom.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pom.qa.base.TestBase;

public class SignupPage extends TestBase{
	

			@FindBy(xpath="//span[contain(text(),'Sign Up')]") 
			WebElement signupBtn;
			
			@FindBy(xpath="//a[contain(text(),'Sign Up')]") 
			WebElement signupLnk;
			
			@FindBy(xpath="//img[contains(@class,'img-responsive')]")
			WebElement crmLogo;
			
			public SignupPage(WebDriver driver) {
				  PageFactory.initElements(driver, this);
			}

			
		    public boolean validateCRMImage() {
		    	return crmLogo.isDisplayed();
		    }

		    
		    public WebElement getSignupPageBtn() {
		    	return signupBtn;   	
		    }
		    
		    
		    public WebElement getSignupPageLnk() {
		    	return signupLnk;   	
		    }
		    
		   	
		   public String validateSignupPageTitle() {
		    	return driver.getTitle();
		    }
		    
		  	   
		    public HomePage signup(String un, String pwd) {
		    	
		    	return new HomePage(driver);
		    }
		    
		    

}
