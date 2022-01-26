package com.nopcommerce.Utilities;

import org.apache.commons.lang.RandomStringUtils;

public class RandomEmail {
	
	public  String newemail1() {
		String a=RandomStringUtils.randomAlphabetic(5);
		String email1=a.concat("@gmail.com");
		return email1;
	}
	public  String newemail2() {
		String a=RandomStringUtils.randomAlphabetic(5);
		String email2=a.concat("@gmail.com");
		return email2;
	}

}
