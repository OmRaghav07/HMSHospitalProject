package com.tests;

import org.testng.annotations.Test;

import com.pages.BaseClass;
import com.pages.LoginPage;
import com.pages.Registerpage;

public class RegisterPageTest extends BaseClass{
	
	LoginPage obj1;
	Registerpage obj2;
	
	@Test(priority = 0)
	public void loginPage() {
		obj1 = new LoginPage(driver);
		obj2 = new Registerpage(driver);
		obj1.login("admin@mail.com", "Password@123");
	}
	
	@Test(priority = 1)
	public void PatienttabVerify() {
		obj2.clickonPatientTab();
	}
	
	
	@Test(priority = 2)
	public void enterRegistervalue() {
		obj2.fillFormData();
	}
	
	
}
