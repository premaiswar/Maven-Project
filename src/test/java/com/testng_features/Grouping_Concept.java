package com.testng_features;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Grouping_Concept {
	
	@Test(groups = "Kits")
	public void bat() {
		
		System.out.println("Bat");	
	}
	@Test(groups = "Kits")
	public void ball() {

		System.out.println("Ball");	
	}
	@Test(groups = "Kits")
	public void stump() {
		
        System.out.println("Stump");     
	}
	@Test(groups="Fruits")
	public void grapes() {

		System.out.println("Grapes");	
	}
	@Test(groups="Fruits")
	public void orange() {

		System.out.println("Orange");
	}
	@Test(groups="Vegetables")
	public void tomato() {
		
		System.out.println("Tomato");
	}
	@Test(groups="Vegetables")
	public void potato() {

		System.out.println("Potato");
	}
	

}
