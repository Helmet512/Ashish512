package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenAmazon {

	public static void main(String[] args) {
		//String s = "D:\\Workspace\\Selenium\\Executable\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", ".\\Executable\\chromedriver.exe");
		
	     WebDriver A3 = new ChromeDriver();
	     
	     A3.get("https://www.amazon.com");
	     
	     System.out.println("Print current page URl:"+ A3.getCurrentUrl());
	     
	     System.out.println("Print Title page :"+ A3.getTitle());
	     System.out.println("Print Length of the page "+ A3.getTitle().length());
	     
	     if (A3.getTitle().equals("amazon")){
	  
	    	 System.out.println("Print the amazon succesfully ");
	   	 
	     }
	     else{
	    	 System.out.println("Print either its not printing or not same ");
	     }
	     
	     
	    

	}

}
