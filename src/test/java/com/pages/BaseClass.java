package com.pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import com.utility.BrowserFactory;

public class BaseClass {

	public WebDriver driver;
	
	@BeforeClass
	public void setup() {
		driver = BrowserFactory.startApplication(driver, "Chrome", "https://project1.qualibytes.com/backend/admin/");
		System.out.println(driver.getTitle());
	
	}
	
	
	@AfterClass
	public void tearDown() {

		BrowserFactory.quiteApplication(driver);
	}
}
