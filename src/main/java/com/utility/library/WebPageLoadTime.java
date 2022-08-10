package com.utility.library;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;

public class WebPageLoadTime {
		public static Timeouts pageLoadTime(WebDriver Idriver,long time) {
			return Idriver.manage().timeouts().pageLoadTimeout(time, TimeUnit.SECONDS);
		}
}
