package com.nopcommerce.TestCases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import nopcommerse.POM.RegistrationPage;

public class TC_003_Registration extends BaseClass {
	
	RegistrationPage rg;
	
	@Test
	public void registration() throws Exception {
		rg=new RegistrationPage(driver);
		rg.registerpage();
		//directly clicking the register button without entering any Mandatory fields
		rg.clickRegisterbutton();
		
		
	}
	@Test(dependsOnMethods="registration")
	public void errormessages() {
		String errors=driver.getPageSource();
		
		Reporter.log("Checking error message for First Name",true);
		String FirstName="First name is required";
		Assert.assertTrue(errors.contains(FirstName));
		
		Reporter.log("Checking error for Last Name",true);
		String LastName="Last name is required";
		Assert.assertTrue(errors.contains(LastName));
		
		Reporter.log("Cheking for Email",true);
		String Email="Email is required";
		Assert.assertTrue(errors.contains(Email));
		
		Reporter.log("Checking error for Password",true);
		String Password="Password is required";
		Assert.assertTrue(errors.contains(Password));
		
		Reporter.log("Checking error for Confirm Password",true);
		String Cpassword="Password is required";
		Assert.assertTrue(errors.contains(Cpassword));
		
		
		
	}

}
