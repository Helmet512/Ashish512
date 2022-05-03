package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenZomato {

	public static void main(String[] args) {
		
		//D:\Workspace\Selenium\Executable\chromedriver.exe
		
		System.setProperty("webdriver.chrome.driver",".\\Executable\\chromedriver.exe");
		
		WebDriver obj = new ChromeDriver();
	
		obj.get("https://www.zomato.com");
		
		System.out.println("Print title for zomato:"+ obj.getTitle());
		System.out.println("Print length for zomato page :"+ obj.getTitle().length());
		
		System.out.println("Print Source Page For Zomato :"+ obj.getPageSource());
		
		System.out.println("Print Current URL:"+ obj.getCurrentUrl());
		
		String Expected  = "Zomato";
		String Actual  = obj.getTitle();
		if (Actual.equals(Expected)) {
			System.out.println("Run Succesfully ");
		}else {
			System.out.println("Not Run succesfully ");
			
			
		}
		
		System.out.println("*********Program End***************");
		
		
		obj.close();
	}

}
