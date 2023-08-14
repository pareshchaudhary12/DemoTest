package com.projectname.qa.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.projectname.qa.Base.TestBase;
import com.projectname.qa.Pages.RegistrationPage;


public class RegistrationTest extends TestBase {
	
	
	@BeforeClass
	public void setup() {
		TestBase.intializeBrowser("chrome");
	}
	
	@Test
	public void FacebookRegistrationPageTest() {
		
		RegistrationPage rgpage = new RegistrationPage(driver);
		rgpage.ClickFacebookSignupLink();
		rgpage.VerifyFacebookRegistrationPageFblogo();
		rgpage.VerifyFacebookRegistrationPageAllreadyAccount();
		rgpage.SetFacebookRegistrationPageFirstname();
		rgpage.SetFacebookRegistrationPageLastname();
		rgpage.SetFacebookRegistrationPageMobileEmail();
		rgpage.SetFacebookRegistrationPagePassword();
		rgpage.SetFacebookRegistrationPageBirthDate();
		rgpage.SetFacebookRegistrationPageBirthMonth();
		rgpage.SetFacebookRegistrationPageBirthYear();
		rgpage.SetFacebookRegistrationPageGender("MALE");
		rgpage.ClickFacebookRegistrationPageSubmitBtn();
	}
	
	@AfterClass
	public void teardown() {
		driver.close();
	}

}
