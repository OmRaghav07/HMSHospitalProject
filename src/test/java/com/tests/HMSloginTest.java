package com.tests;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.pages.BaseClass;
import com.pages.LoginPage;

public class HMSloginTest extends BaseClass {
//	WebDriver driver;  --> driver is coming from baseclass
	LoginPage obj;
	
	
	
	@Test
	public void loginApp(){
		obj = new LoginPage(driver);
		obj.login("admin@mail.com", "Password@123");
		obj.logo();

	}
	
	

}
