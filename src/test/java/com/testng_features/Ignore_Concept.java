package com.testng_features;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_Concept {
	
	@Test
	public void bat() {
		
		System.out.println("Bat");
		
	}
	
	@Test	
	public void ball() {

		System.out.println("Ball");
		
	}
	@Ignore
	@Test
	public void stump() {
		
        System.out.println("Stump");
        
	}
	
	@Test(enabled = false)
	public void gloves() {

		System.out.println("Gloves");
		
	}
	
	@Test
	public void helmet() {

		System.out.println("Helmet");
	}
	
	
	
	
	
	

}
