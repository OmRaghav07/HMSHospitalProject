package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;

public class DashboardPage extends BaseClass{

//		WebDriver driver;
		

		@FindBy(xpath = "//span[text()='206']") private WebElement outPatient;
		@FindBy(xpath = "//span[text()='446']") private WebElement inPatient;
		@FindBy(xpath = "//span[text()='321']") private WebElement hospitalEmp;
		@FindBy(xpath = "//span[text()='12']") private WebElement vendors;
		@FindBy(xpath = "//span[text()='29']") private WebElement corporationAss;
		@FindBy(xpath = "//span[text()='68']") private WebElement pharmaceuticals;
		@FindBy(xpath = "//span[contains(text(), 'Patients')]") private WebElement patientTab;
		@FindBy(xpath = "//a[text()='Register Patient']") private WebElement registerPatient;
		
		
		
		public DashboardPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
			this.driver = driver;
		}
		
		
		public void verifyHospitalManagementSys() {
			Assert.assertEquals(outPatient.getText(), "206");
			Assert.assertEquals(inPatient.getText(), "446");
			Assert.assertEquals(hospitalEmp.getText(), "321");
			Assert.assertEquals(vendors.getText(), "12");
			Assert.assertEquals(corporationAss.getText(), "29");
			
		}
		
		public void verifyPharma() {
			Assert.assertEquals(pharmaceuticals.getText(), "68");
		}
		
//		public void verifyPatientTab() {
//			patientTab.click();
//			registerPatient.click();
//		}


		
}
