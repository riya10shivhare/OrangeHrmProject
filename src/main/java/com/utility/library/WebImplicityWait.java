package com.utility.library;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;

public class WebImplicityWait {
	public static Timeouts webImplicitlyWait(WebDriver Idriver, long time) {
		return Idriver.manage().timeouts().implicitlyWait(time,TimeUnit.SECONDS );
	}
}
