package com.testng_features;

import org.testng.annotations.Test;

public class Timeout_Concept {
	
	@Test(timeOut = 8000)
	public void procedure() throws InterruptedException {

		System.out.println("Browser Launch");
		Thread.sleep(2000);
		
		System.out.println("Url Launch");
		Thread.sleep(2500);
		
		System.out.println("Click Login");
		Thread.sleep(3000);
		
	}

}
