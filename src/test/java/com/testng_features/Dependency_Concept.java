package com.testng_features;

import org.testng.annotations.Test;

public class Dependency_Concept {
	
	@Test
	public void prelims() {
		
		System.out.println("Preliminary Exam");

	}
	@Test(dependsOnMethods = "prelims")
	public void mains() {
		
		System.out.println("Mains Exam");

	}
	@Test(dependsOnMethods = "mains")
	public void interview() {

		System.out.println("Interview");
	}

}
