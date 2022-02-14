package com.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader {
	
	public static Properties p;
	
	public Configuration_Reader() throws Throwable {

        File f = new File("C:\\Users\\sivam\\eclipse-workspace\\Maven_Project\\src\\main\\java\\com\\properties\\Configuration.properties");
		
		FileInputStream fis = new FileInputStream(f);
		
	    p = new Properties();
		
		p.load(fis);
	
	}
	
	public String getUrl() {
		
		String url = p.getProperty("url");
		
		return url;
		
	}
	
	public String getEmail()  {
		
		String mail = p.getProperty("mail");
		
		return mail;
		
	}
	
	public String getPassword() {
				
		String password = p.getProperty("password");
		
		return password;

	}
	
	
	
	
	
	

}
