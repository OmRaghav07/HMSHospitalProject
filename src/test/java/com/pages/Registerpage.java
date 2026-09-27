package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Registerpage extends BaseClass{
	

	@FindBy(id = "inputEmail4") private WebElement inputEmail;
	@FindBy(id = "inputPassword4") private WebElement lastName;
	@FindBy(id = "inputEmail4") private WebElement dateTime;
	
	@FindBy(xpath ="//input[@placeholder='Patient`s Age']") private WebElement age;
	
	@FindBy(id ="inputAddress") private WebElement patientAddress;
	
	@FindBy(xpath ="//input[@name='pat_phone']") private WebElement phoneNumber;
	@FindBy(xpath ="//input[@name='pat_ailment']") private WebElement patientAlignment;
	@FindBy(xpath ="//select[@name='pat_type']") private WebElement patientTypeDropdown;
	@FindBy(xpath = "//span[contains(text(), 'Patients')]") private WebElement patientTab;
	@FindBy(xpath = "//a[text()='Register Patient']") private WebElement registerPatient;
	
	
	
	public Registerpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	
	public void clickonPatientTab() {
		patientTab.click();
		registerPatient.click();
	}
	
	public void fillFormData() {
		inputEmail.sendKeys("Umesh");
		lastName.sendKeys("raghav");
		dateTime.sendKeys("25/09/2026");
		age.sendKeys("24");
		patientAddress.sendKeys("Mathura uttar pradesh");
		phoneNumber.sendKeys("7078273495");
		patientAlignment.sendKeys("Hello world how are you?");
		Select dropdown = new Select(patientTypeDropdown);
		dropdown.selectByIndex(1);
		
	}
	
	
	

}
