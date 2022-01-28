package com.nopcommerce.TestCases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.nopcommerce.Utilities.RandomEmail;

import nopcommerse.POM.RegistrationPage;

public class TC_001_Registration extends BaseClass {
	RegistrationPage rg;
	RandomEmail em;
	
	@Test
	public void registration() throws Exception {
		rg=new RegistrationPage(driver);
		rg.registerpage();
		em=new RandomEmail();
		
		
		
		Reporter.log("entered first name",true);
		rg.setFirstname(prop.getProperty("FirstName"));
		
		Reporter.log("entered last name",true);
		rg.setLastname(prop.getProperty("LastName"));
		
		
		Reporter.log("entered email",true);
		rg.registerEmail(em.newemail1());
		
		Reporter.log("entered password",true);
		rg.setPassword(prop.getProperty("Password"));
		
		Reporter.log("Confirm Password");
		rg.confirmPassword(prop.getProperty("Password"), prop.getProperty("Cpassword"));
		
		Reporter.log("Click register button");
		rg.clickRegisterbutton();
		

	}
	@Test(dependsOnMethods="registration")
	public void successpage() {
		String reg=driver.getPageSource();
		Assert.assertTrue(reg.contains("Your registration completed"));
	}

}
