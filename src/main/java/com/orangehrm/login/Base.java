package com.orangehrm.login;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;

import com.utility.library.WebImplicityWait;
import com.utility.library.WebPageLoadTime;

public class Base {
	String path_Property="F:\\Java_Workspace\\OrangeHRM\\src\\main\\resources\\Config\\Config.properties";
	String firefox_Profile="AutomationProfile";
	FileInputStream intputStream;
	static Properties property;
	public static WebDriver driver;
	
	public Base() {
		 property=new Properties();
		try {
			 intputStream=new FileInputStream(path_Property);
		} catch (FileNotFoundException e) {
			System.out.println("Property file is not found:\n "+e.getMessage());
		}
		try {
			property.load(intputStream);
		} catch (IOException e) {
			System.out.println("Config file is loaded:\n "+e.getMessage());
		}
	}
	
	public  void initialisation() {
		
			System.setProperty("webdriver.chrome.driver","F:\\Java_Workspace\\OrangeHRM\\src\\main\\resources\\Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			WebPageLoadTime.pageLoadTime(driver, 30);
			driver.get(property.getProperty("URL"));
			//WebImplicityWait.webImplicitlyWait(driver, 30);	
			System.out.println("URL has sucessful lunch");
	}
	
	public static void closeBrowser() {
		driver.quit();

	}

}
