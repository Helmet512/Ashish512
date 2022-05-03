package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment2selenium {

	public static void main(String[] args) {


		// String path1 = "D:\Workspace\Selenium\Executable\geckodriver.exe"
		
		System.setProperty("webdriver.gecko.driver", ".\\Executable\\geckodriver.exe");
		
		WebDriver demo = new FirefoxDriver();
		
		demo.get("https://demosite.executeautomation.com/Login.html");
//		
//		WebElement Demo1 = demo.findElement(By.name("username"));
//		Demo1.sendKeys("execution");
//		
//		WebElement Demo2 = demo.findElement(By.name("password"));
//		Demo2.sendKeys("admin");
//		
//		WebElement Demo3 = demo.findElement(By.name("Login"));
//		Demo3.click();
//		
		
		
		
	    demo.findElement(By.name("UserName")).sendKeys("execution");
		
		demo.findElement(By.name("Password")).sendKeys("admin");
		demo.findElement(By.name("Login")).click();
	
		
	}

}
