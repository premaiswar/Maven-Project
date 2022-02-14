package com.testng_features;

import org.testng.annotations.Test;

public class Exceptions_Concept {
	

	@Test(expectedExceptions = ArithmeticException.class)
	public void demo() {

		int a = 77;
		
		System.out.println(a/0);
	}

}
