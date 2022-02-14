package com.testng_features;

import org.testng.annotations.Test;

public class Data_Provider_Concept {
	
	@Test
	public void details(String username, String password) {

		System.out.println("Username :" + username);
		
		System.out.println("Password :" + password);
		
	}
	
	

}
