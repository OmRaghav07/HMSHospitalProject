package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {
	WebDriver driver;
	
	@FindBy(id="emailaddress") private WebElement username;
	@FindBy(id="password") private WebElement password;
	@FindBy(xpath = "//button[@name='admin_login']") private WebElement loginBtn;
	@FindBy(xpath="//img[@height=\"24\"]")private WebElement logo;
	
	
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	


	public void login(String usernameApp, String passwordApp) {
		username.sendKeys(usernameApp);
		password.sendKeys(passwordApp);
		loginBtn.click();
	}
	
	public void logo()
	{
		logo.isDisplayed();
	}
}
