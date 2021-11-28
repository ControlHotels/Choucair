package com.choucair.formacion.pageobjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Automation.DriverConect;






public class ClassAuto  extends com.Automation.DriverConect{
	
	
	@SuppressWarnings("incomplete-switch")
	public void Action(Enum<?> action, String Value)
	{
		switch ((Action)Enum.valueOf(Action.class, action.name())) {


		case Navigate: 
			cv_driver.manage().window().maximize(); 
			cv_driver.navigate().to(Value);
			break;
		}
	}
	
	public void Action(Enum<?> action, String Type,String Seek, String Send )
	{
		switch ((Action)Enum.valueOf(Action.class, action.name())) {


		case SendKeys: 

			WebElement envio = cv_driver.findElement(By.xpath(Seek));
			envio.sendKeys(Send);

			break;
		}
	}
	
	

	public void Action(Enum<?> action, String value, String seek) throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement envio;
		Object prueba ;
		switch ((Action)Enum.valueOf(Action.class, action.name())) {


		case Click: 
			switch (value){

			case "xpath":	
				envio = cv_driver.findElement(By.xpath(seek));
				envio.click();
				break;

			case "linkText":	
				System.out.println("entro linktext");
				envio = cv_driver.findElement(By.linkText("Integrated Operations (New) >> Acquisition >> Subscribe to Offering"));
				envio.click();
				break;				
				
			case "id":	
				envio = cv_driver.findElement(By.id(seek));
				envio.click();
				break;
			}

		}
		Thread.sleep(1000);

	}



}
