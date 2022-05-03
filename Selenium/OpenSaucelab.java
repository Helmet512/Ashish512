package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenSaucelab {

	public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", ".\\Executable\\chromedriver.exe");
		
		WebDriver obj = new ChromeDriver();
		
		obj.get("https://www.saucedemo.com");
		
		
		WebElement A1 =obj.findElement(By.id("user-name"));	
		A1.sendKeys("standard_user");
		
		
		obj.findElement(By.id("user-name")).sendKeys("standard_user");
		
		obj.findElement(By.id("password")).sendKeys("secret_sauce");
		
		obj.findElement(By.id("login-button")).click();
		
		
	
		
         
	}

}
