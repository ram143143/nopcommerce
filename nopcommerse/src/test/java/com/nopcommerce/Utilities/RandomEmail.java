package com.nopcommerce.Utilities;

import org.apache.commons.lang.RandomStringUtils;

public class RandomEmail {
	
	public  String newemail1() {
		String email1=RandomStringUtils.randomAlphabetic(5).concat("@gmail.com");
		
		return email1;
	}
	public  String newemail2() {
		String email2=RandomStringUtils.randomAlphabetic(5).concat("@gmail.com");
		
		return email2;
	}

}
