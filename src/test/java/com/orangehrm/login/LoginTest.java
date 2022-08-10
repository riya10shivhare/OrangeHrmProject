package com.orangehrm.login;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Utility.PropertyReader;
import com.Utility.WebPageVerify;

public class LoginTest {
	
	Base base;
	@BeforeMethod
	public void setup() {
		base=new Base();
		base.initialisation();
	}
	
	@Test
	public void verifyUrl() {
		String expected=PropertyReader.property().getProperty("Expected_URL");
		String actual=WebPageVerify.verifyUrl();
		System.out.println(actual);
		Assert.assertEquals(actual, expected,"Url has not matched");
	}
	
	@AfterMethod
	public void tearDown() {
		base.closeBrowser();
	}
}
