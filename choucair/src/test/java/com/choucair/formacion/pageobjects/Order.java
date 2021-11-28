package com.choucair.formacion.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Order {

	ClassAuto Automate = new  ClassAuto();
	private WebDriver driver;
	
	public void NewOrder () throws InterruptedException
	{
		
		
		Automate.Action(Action.Click,Constants.XPATH,"//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a");

		Automate.Action(Action.SendKeys,Constants.XPATH,"//*[@id=\"email\"]","Vanessa_Test@hotmail.com");
			
		Automate.Action(Action.SendKeys,Constants.XPATH,"//*[@id=\"passwd\"]","Choucair123");
		
		Automate.Action(Action.Click,Constants.XPATH,"//*[@id=\"SubmitLogin\"]/span");	
		
	    Automate.Action(Action.Click,Constants.XPATH,"//*[@id=\"search_query_top\"]");	
				
		Automate.Action(Action.SendKeys,Constants.XPATH,"//*[@id=\"search_query_top\"]","Dresses");
	    Automate.Action(Action.Click,Constants.XPATH,"//*[@id=\"searchbox\"]/button");	
		
		Automate.Action(Action.Click,Constants.XPATH,"//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img");		
		
		Automate.Action(Action.Click,Constants.XPATH,"//*[@id=\"add_to_cart\"]/button/span");		
		
		Automate.Action(Action.Click,Constants.XPATH,"//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span");
		
		Automate.Action(Action.Click,Constants.XPATH,"//*[@id=\"center_column\"]/p[2]/a[1]");	
		
		Automate.Action(Action.Click,Constants.XPATH,"//*[@id=\"center_column\"]/form/p/button/span");	
		
		Automate.Action(Action.Click,Constants.XPATH,"//*[@id=\"cgv\"]");	
		
		Automate.Action(Action.Click,Constants.XPATH,"//*[@id=\"form\"]/p/button/span");	
		
		Automate.Action(Action.Click,Constants.XPATH,"//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a");	
		
		Automate.Action(Action.Click,Constants.XPATH,"//*[@id=\"cart_navigation\"]/button/span");	
		
		
		
		
		
		
		
		
	}
}
