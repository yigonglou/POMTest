package com.pom.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;

import com.oracle.tools.packager.Log;
import com.pom.qa.util.TestUtil;

public class TestBase{
	
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase() {
		
		try {
		prop = new Properties();
		
		FileInputStream ip = new FileInputStream(
				System.getProperty("user.dir")+ "/src/main/java/com/pom/qa/config/config.properties");
		prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

	public static void initialization() {
		String browserName = prop.getProperty("browser");

		if(browserName.equals("chrome")) {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\daniel\\eclipse-workspace\\chromedriver.exe");
	       driver = new ChromeDriver();
		}else if (browserName.equals("firefox") ){
			System.setProperty("webdriver.chromedriver", "C:\\Users\\daniel\\eclipse-workspace\\geckodriver.exe");
		       driver = new FirefoxDriver();	
		}
	
	   driver.manage().window().maximize();
	   driver.manage().deleteAllCookies();
	   driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
	   driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
	   driver.get(prop.getProperty("url"));
	   Log.info("app url is:  " + prop.getProperty("url"));
	   
	   
	
	}
	
	
	
	
	
}

