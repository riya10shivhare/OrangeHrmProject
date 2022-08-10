package com.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {
	public static Properties property() {
		String path_Property="F:\\Java_Workspace\\OrangeHRM\\src\\test\\resources\\TestData\\Config.properties";
		FileInputStream	 intputStream=null;
		Properties property=new Properties();
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
			return property;
	}
}
