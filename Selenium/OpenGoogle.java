package Selenium;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import java.sql.Driver;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogle {

	public static void main(String[] args) {
		
	//	String A2 = ".\\Executable\\chromedriver.exe";

    //  System.setProperty("webdriver.chrome.driver", ".\\Executable\\chromedriver.exe" );
		System.setProperty("webdriver.chrome.driver", ".\\Executable\\chromedriver.exe");
      
      WebDriver A4 = new ChromeDriver();
      
     A4.get("https://www.google.com/");
      
     System.out.println("print current page url: "+ A4.getCurrentUrl());
     System.out.println("print current page url: "+ A4.getTitle());
     
     System.out.println("Print Source :"+ A4.getPageSource());
     
     
      
      
      
      
      

	}

}
