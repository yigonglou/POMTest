package com.pom.qa.base;

import java.util.Properties;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase() throws IOException{
		prop = new Properties;
		
		FileInputStream ip = new FileInputStream();
		prop.load(ip);
	}

	public staticss void initialize() {
		String browerName = property("browser");
		if(browserNameequas("chrom")) {
	}
	}
}
