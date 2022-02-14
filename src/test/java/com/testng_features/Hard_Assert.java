package com.testng_features;

import org.testng.Assert;

public class Hard_Assert {
	
	public void details() {

		String exp = "iswar";
		
		String act = "qwerty";
		
		Assert.assertNotEquals(exp, act);
		
		
	}
	
	

}
