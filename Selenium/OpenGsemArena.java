package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGsemArena {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", ".\\Executable\\chromedriver.exe");
		
		WebDriver GsmAreana = new ChromeDriver();
		
		
		
		GsmAreana.get("https://www.gsmarena.com/");
		
		GsmAreana.manage().window().maximize();
		
		GsmAreana.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS );
		
		String ExpectedResult = "GSMArena.com - mobile phone reviews, news, specifications and more..";
		
		 if (ExpectedResult.equals(GsmAreana.getTitle()))
		 {
			 System.out.println("Page is valid ");
		 }else {
			 System.out.println("Page is invalid ");
		 }
		
		
	//	 .brandmenu-v2>ul>li
		
		List<WebElement> List =GsmAreana.findElements(By.cssSelector(".brandmenu-v2 ul a"));
		
		System.out.println("Print Titile :" + GsmAreana.getTitle());
		
		
		
		
		System.out.println("Pring all present element :"+ List.size());
		
		 for (int i=0;List.size()>i;i++) {
			 System.out.println(List.get(i).getText());
		 }

	}

}
