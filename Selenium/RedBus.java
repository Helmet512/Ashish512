package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBus {

	public static void main(String[] args) throws InterruptedException {
	
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver RedBus =new ChromeDriver();
		
		 RedBus.get("https://www.redbus.com");
		
		RedBus.manage().window().maximize();
		
	    RedBus.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
	    
	    RedBus.findElement(By.className("bfMZDh")).click();
	    RedBus.findElement(By.id("src")).sendKeys("pune");
	   
	   RedBus.findElement(By.id("dest")).sendKeys("Goa");
	  
	   
	  RedBus.findElement(By.cssSelector(".date-box .text-trans-uc")).click();
	
	  
	  RedBus.findElement(By.cssSelector("#rb-calendar_onward_cal .next")).click();
	 
	  
	  RedBus.findElement(By.cssSelector("#rb-calendar_onward_cal tbody>:nth-child(5)>:nth-child(2)")).click();
	  
	  RedBus.findElement(By.cssSelector(".gtm-returnCalendar .tal")).click();
	  
	  RedBus.findElement(By.cssSelector("#rb-calendar_return_cal tbody .next")).click();
	  
	  RedBus.findElement(By.cssSelector("#rb-calendar_return_cal tbody>:nth-child(4)>:nth-child(3)")).click();
	  
	  RedBus.findElement(By.cssSelector(".autoFill>:nth-child(1)")).click();
	  
	  
	  RedBus.findElement(By.cssSelector(".homeSearch>:nth-child(1)")).click();
	
	  RedBus.findElement(By.id("search_btn")).click();

	  RedBus.findElement(By.cssSelector(".tripleFive-block .icon-close")).click();
	  
	  RedBus.findElement(By.cssSelector("body")).sendKeys(Keys.ARROW_DOWN);
	  
	  RedBus.findElement(By.cssSelector(".dt-time-filter>:nth-child(4)>:nth-child(2)")).click();
	  
	  RedBus.findElement(By.cssSelector("body")).sendKeys(Keys.ARROW_DOWN);
	  
	 // WebDriver wait=new WebDriver(RedBus,20);
	  
	  RedBus.findElement(By.cssSelector(".list-chkbox>:nth-child(3)>:nth-child(2)")).click();
	  
	//  RedBus.findElement(By.cssSelector("body")).sendKeys(Keys.ARROW_DOWN);
	  RedBus.findElement(By.cssSelector("#result-section .bus-items .row-sec"));
	  
	 List<WebElement> Buslist =RedBus.findElements(By.cssSelector("#result-section .bus-items .row-sec .travels"));
	 List<WebElement> Busprice =RedBus.findElements(By.cssSelector(".seat-fare .fare span"));
 	 System.out.println("Print list count of buses from pune to goa After 6pm:"+Buslist.size());
	 
	  
	 for (int i=0;Buslist.size()>1;i++) {
		 System.out.println("Punt to Goa:"+Buslist.get(i).getText()+"===>"+Busprice.get(i).getText());
	 }
	  
	 
	  
	  
	  
	  
	  
	  

	  
	  
	  
	  
	  
		
	  
	  
	  
	}

}
