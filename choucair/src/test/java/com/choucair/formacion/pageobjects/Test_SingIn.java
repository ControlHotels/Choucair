package com.choucair.formacion.pageobjects;

import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.Automation.DriverConect;


public class Test_SingIn  extends DriverConect {
	private StringBuffer verificationErrors = new StringBuffer();

	//@Before: Significa que se ejecutara antes de cada m�todo.
	@Before
	public void setUp() throws Exception {
		DriverConect Conect = new DriverConect();	
		Conect.conecction();
		
	}


	//La annotation @Test es simplemente para identificar que el m�todo sera un m�todo a testear.
	@Test
	public void testEjemplo() throws Exception {

		Login login = new Login();
		login.SignIn();
		
		
	//	CreateAccount sign = new CreateAccount ();
	//	sign.Account();

		Order order = new Order();
		order.NewOrder();
		
		
	}


	//@After: Significa que se ejecutara despu�s de cada m�todo.))
	@After
	public void tearDown() throws Exception {
		Thread.sleep(5000);	
		//cv_driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}
}
