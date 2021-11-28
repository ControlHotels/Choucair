package com.Automation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;


public class DriverConect {
	//protected static WebDriver driver = new ChromeDriver();
	public static RemoteWebDriver cv_driver;
	public void conecction (){

		cv_driver = new ChromeDriver();

	}

}



