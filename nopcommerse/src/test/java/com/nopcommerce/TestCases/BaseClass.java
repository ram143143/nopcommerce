package com.nopcommerce.TestCases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
WebDriver driver;
Properties prop;
@BeforeClass
public void browsersetup() throws IOException {
	prop=new Properties();
	FileInputStream fis=new FileInputStream("./Config/config.properties");
	prop.load(fis);
	if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	}
	if(prop.getProperty("browser").equalsIgnoreCase("firefox")) {
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		}
	
	driver.get(prop.getProperty("baseURL"));
}

@AfterClass
public void teardown() {
	driver.close();
}


}

