package com.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.io.File;

public class Configartion {
	
	
	public static String Config(String key) throws IOException {
		Properties prop = new Properties(); 

		FileInputStream file = new FileInputStream(new File("config.proerties"));
		prop.load(file);
		return prop.get(key).toString();	
		
	}

	public static void main(String[] args) throws IOException {
		String url = Config("Url");
		System.out.println(url);
		
		System.out.println(Config("UserName"));
		System.out.println(Config("UserEmail"));
		System.out.println(Config("UserPassword"));
		
		
	}
}
