package com.pom.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pom.qa.base.TestBase;

public class SignupPage extends TestBase{
	

			@FindBy(xpath="//button[contain(text(),'Sign Up')]") 
			WebElement signBtn;
			@FindBy(xpath="//img[contains(@class,'img-responsive')]")
			WebElement crmLogo;
			
			
		    public boolean validateCRMImage() {
		    	return crmLogo.isDisplayed();
		    }

		    public HomePage signup(String un, String pwd) {
		    	username.sendKeys(un);
		    	password.sendKeys(pwd);
		    	return new HomePage();
		    }
		    
		    
			
			
			@FindBy(find_element_by_link_text("Enterprise")) WebElement signBtn;
			
			public void LoginPage(WebDriver driver) {
			  PageFactory.initElements(driver, this);
			}

		    public String validateLogoinpageTitle() {
		    	return driver.getTitle();
		    }
		    
		    public boolean validateCRMImage() {
		    	return crmLogo.isDisplayed();
		    }
		    
		   	    
		    public void signup(String un, String pwd) {
		    	
		    }
		    
		    

}
