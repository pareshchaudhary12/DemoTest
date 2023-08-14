package com.projectname.qa.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.projectname.qa.Base.TestBase;
import com.projectname.qa.Pages.LoginPage;


public class LoginTest extends TestBase {
	
	@BeforeClass
	public void setup() {
		TestBase.intializeBrowser("chrome");
	}
	
	@Test
	public void FacebookLoginPageTest_positive() {
		LoginPage Lp = new LoginPage(driver);
		Lp.VerifyFacebookLoginPageFblogo();
		Lp.VerifyFacebookLoginPageTagline();
		Lp.VerifyFacebookLoginPageCreateNewAccount();
		Lp.VerifyFacebookLoginPageForgotPasswordLink();
		Lp.VerifyFacebookLoginPageFooterlinks();
		Lp.SetFacebookLoginPageUsername("test");
		Lp.SetFacebookLoginPagePassword("test@123");
		Lp.ClickFacebookLoginPageLoginBtn();
		
	}
	
	
	@AfterClass
	public void teardown() {
		driver.close();
	}
	

}
