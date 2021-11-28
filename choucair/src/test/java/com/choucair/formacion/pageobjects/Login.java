package com.choucair.formacion.pageobjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Login {
	ClassAuto Automate = new  ClassAuto();
//	private WebDriver driver;

  
	
	//Method SignIn
	@SuppressWarnings("deprecation")
	public void SignIn () throws InterruptedException
	{
		
		Automate.Action(Action.Navigate,"http://automationpractice.com/index.php");
		Automate.Action(Action.Click,Constants.XPATH,"/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a");
		Automate.Action(Action.Click,Constants.XPATH,"//*[@id=\"email_create\"]");
		Automate.Action(Action.SendKeys,Constants.XPATH,"//*[@id=\"email_create\"]","Vanessa_Test@hotmail.com");
		Automate.Action(Action.Click,Constants.XPATH,"//*[@id=\"SubmitCreate\"]/span");
		
		
		
		
		
		
		
	}
	

}
