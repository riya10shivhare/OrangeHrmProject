package com.Utility;

import org.openqa.selenium.WebDriver;

import com.orangehrm.login.Base;

public class WebPageVerify extends Base{
	public static String verifyUrl() {
		return	Base.driver.getCurrentUrl();
	}
}
