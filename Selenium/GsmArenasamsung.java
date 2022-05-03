package Selenium;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GsmArenasamsung {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", ".\\Executable\\chromedriver.exe");
		
		WebDriver GsmArena = new ChromeDriver();
		
		
		
		GsmArena.get("https://www.gsmarena.com/");
		
		GsmArena.manage().window().maximize();
		
		GsmArena.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS );
		
		String ExpectedResult = "GSMArena.com - mobile phone reviews, news, specifications and more";
		
		 if (ExpectedResult.equals(GsmArena.getTitle()))
		 {
			 System.out.println("Page is valid ");
		 }else {
			 System.out.println("Page is invalid ");
			 
			// GsmAreana.findElement(By.linkText("Samsung")).click();
			 
			 GsmArena.get("https://www.gsmarena.com/samsung-phones-9.php");
			 
			// List<WebElement>List = GsmAreana.findElements(By.className(".light ul>li"));
			
			 
			 List<WebElement> List = GsmArena.findElements(By.cssSelector(" .makers  span"));
			                                                              //.makers>ul>li>a>strong>span
			 System.out.println("Print size:"+ List.size());
			
			 for (int i=0;List.size()>i;i++) {
				 System.out.println(List.get(i).getText());
				
		 }
	}
				
	}
}
			


