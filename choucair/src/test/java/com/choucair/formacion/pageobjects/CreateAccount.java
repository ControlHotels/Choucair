package com.choucair.formacion.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {
	ClassAuto Automate = new  ClassAuto();
	private WebDriver driver;
	
	
	public void Account () throws InterruptedException
	{
		Automate.Action(Action.Click,Constants.XPATH,"//*[@id=\"id_gender2\"]");

		Automate.Action(Action.SendKeys,Constants.XPATH,"//*[@id=\"customer_firstname\"]","Vanessa");
		
		Automate.Action(Action.SendKeys,Constants.XPATH,"//*[@id=\"customer_lastname\"]","Valencia");
		
		
		Automate.Action(Action.SendKeys,Constants.XPATH,"//*[@id=\"passwd\"]","Choucair123");
		
		Automate.Action(Action.Click,Constants.XPATH,"//*[@id=\"days\"]");	
		
		Automate.Action(Action.SendKeys,Constants.XPATH,"//*[@id=\"days\"]","5");
		
	    Automate.Action(Action.Click,Constants.XPATH,"//*[@id=\"months\"]");	
		
		Automate.Action(Action.SendKeys,Constants.XPATH,"//*[@id=\"months\"]","September");
		
		
	    Automate.Action(Action.Click,Constants.XPATH,"//*[@id=\"years\"]");	
		
		Automate.Action(Action.SendKeys,Constants.XPATH,"//*[@id=\"years\"]","1995");
		
		
		Automate.Action(Action.SendKeys,Constants.XPATH,"//*[@id=\"company\"]","Choucair");
		
		Automate.Action(Action.SendKeys,Constants.XPATH,"//*[@id=\"address1\"]","address la clarita");
		
		Automate.Action(Action.SendKeys,Constants.XPATH,"//*[@id=\"address2\"]","Barrio la clarita");
		
		Automate.Action(Action.SendKeys,Constants.XPATH,"//*[@id=\"city\"]","Bogota");
		
		Automate.Action(Action.Click,Constants.XPATH,"//*[@id=\"id_state\"]/option[7]");		
		
	
		
		Automate.Action(Action.SendKeys,Constants.XPATH,"//*[@id=\"postcode\"]","11121");
		
		Automate.Action(Action.Click,Constants.XPATH,"//*[@id=\"id_country\"]/option[2]");	
		
		Automate.Action(Action.SendKeys,Constants.XPATH,"//*[@id=\"other\"]","Automatizacion Prueba Choucair");
		
		Automate.Action(Action.SendKeys,Constants.XPATH,"//*[@id=\"phone\"]","6947440");
		
		Automate.Action(Action.SendKeys,Constants.XPATH,"//*[@id=\"phone_mobile\"]","32040054158");
		
		Automate.Action(Action.SendKeys,Constants.XPATH,"//*[@id=\"alias\"]","Barrio la Clarita");
		
		Automate.Action(Action.Click,Constants.XPATH,"//*[@id=\"submitAccount\"]/span");	
	}
}