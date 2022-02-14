package com.Singleton_Design_Pattern;

import org.openqa.selenium.WebDriver;

import com.pomclass.Add_Cart;
import com.pomclass.Confirm;
import com.pomclass.Dress_Cat;
import com.pomclass.Home_Page;
import com.pomclass.Login_Page;
import com.pomclass.Payment;
import com.pomclass.Proceed_A;
import com.pomclass.Proceed_B;
import com.pomclass.Proceed_C;
import com.pomclass.Proceed_D;
import com.pomclass.Terms;

public class Page_Object_Manager {
	
	//private WebElement refname;
	//private classname objname;
	
	public WebDriver driver;
	
    private Home_Page hp;
    private Login_Page lp;
    private Dress_Cat dc;
    private Add_Cart ac;
    private Proceed_A a;
    private Proceed_B b;
    private Terms tm;
    private Proceed_C c;
    private Proceed_D d;
    private Payment pm;
    private Confirm cm;
    
    public Page_Object_Manager(WebDriver driver2) {

        this.driver=driver2;
    	
    	
    }

	public Home_Page getInstanceHp() {
    	
    	if (hp==null) {
    		
    		hp = new Home_Page(driver);	
		}
    	
        return hp;
	}
	
    public Login_Page getInstanceLp() {
    	
    	if (lp==null) {
    		
    		lp = new Login_Page(driver);
			
		}
    	
    	return lp;
	}
    
    public Dress_Cat getInstanceDress() {
    	
    	if (dc==null) {
    		
    		dc= new Dress_Cat(driver);
			
		}
	
    	return dc;
	}
    
    public Add_Cart getInstanceCart() {
    	
    	if (ac==null) {
    		
    		ac= new Add_Cart(driver);
			
		}

    	return ac;
    	   	
	}
    
    public Proceed_A getInstanceProceed() {
    	
    	if (a==null) {
    		
    		a= new Proceed_A(driver);
		}
    	
    	return a;
	}
    
    public Proceed_B getInstanceProceed1() {
    	if (b==null) {
    		
    		b= new Proceed_B(driver);
			
		}
    	
    	return b;
	}
    
	public Terms getInstanceTerms() {
		
		if (tm==null) {
			
			tm = new Terms(driver);
		}
		
		return tm;
	}
	
	public Proceed_C getInstanceProceed2() {
		
		if (c==null) {
			
			c= new Proceed_C(driver);
			
		}
		
		return c;
	}
	
	public Proceed_D getInstanceProceed3() {
		
		if (d==null) {
			
			d= new Proceed_D(driver);
			
		}
		
		return d;
	}
	
	public Payment getInstancePayment() {
		
		if (pm==null) {
			
			pm= new Payment(driver);
			
		}
		
		return pm;
	}
	
	public Confirm getInstanceConfirm() {
		
		if (cm==null) {
			
			cm = new Confirm(driver);
			
		}
	
		return cm;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
