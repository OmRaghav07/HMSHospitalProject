package com.tests;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.pages.BaseClass;
import com.pages.DashboardPage;
import com.pages.LoginPage;

public class dashboardPageTest extends BaseClass{
	
	LoginPage obj;
	DashboardPage obj1;
	
	@Test(priority = 0)
	public void loginApp(){
		obj = new LoginPage(driver);
		obj1 = new DashboardPage(driver);
		obj.login("admin@mail.com", "Password@123");
		obj.logo();

	}
	
	@Test(priority = 1)
	public void dashboardvereify() {
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		obj1.verifyHospitalManagementSys();
		
	}
	
	@Test(priority = 3)
	public void dashboardPhar() {
		obj1.verifyPharma();
	}
	
	@Test(priority = 4)
	public void PatienttabVerify() {
//		obj1.verifyPatientTab();
	}
	

}
