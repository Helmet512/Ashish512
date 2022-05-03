package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenFlipkart {

	public static void main(String[] args) {
		
	//	D:\Workspace\Selenium\Executable\chromedriver.exe
		
		//String A2 =".\\Excecutable\\\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", ".\\Executable\\chromedriver.exe");
		
		WebDriver Flipkart = new ChromeDriver();
		
		Flipkart.get("https://www.flipkart.com");
		
		Flipkart.manage().window().maximize();
		
		System.out.println("Validate Home Page :"+ Flipkart.getTitle());
	  
		 String ExpectedResult = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		  
		 if (ExpectedResult.equals(Flipkart.getTitle())) {
			 System.out.println("page valid");
		 }else {
			 System.out.println("page invalid");
		 }
			 
		 List<WebElement> List = Flipkart.findElements(By.cssSelector("div[class='xtXmba']"));
		 
		 System.out.println("Print Count: "+ List.size());
		 
		 for (int i=0;List.size()>i;i++) {
			 System.out.println(List.get(i).getText());
			 
		 
		 
		 
  
		 }
	
		
		
		

	}

}
