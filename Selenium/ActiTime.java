package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ActiTime {

	public static void main(String[] args) {
	
		
		System.setProperty("webdriver.chrome.driver", ".\\Executable\\chromedriver.exe");
		 
		WebDriver ActiTime = new ChromeDriver ();
		ActiTime.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		
		ActiTime.get("https://demo.actitime.com/login.do");
		
		ActiTime.manage().window().maximize();
		
		ActiTime.findElement(By.id("username")).sendKeys("admin");
		ActiTime.findElement(By.name("pwd")).sendKeys("manager");
		
		ActiTime.findElement(By.id("loginButton")).click();
		
		ActiTime.findElement(By.cssSelector(".navItem .tasks .label ")).click();
		
		ActiTime.findElement(By.cssSelector(".addNewButton .plusIcon")).click();
		
		ActiTime.findElement(By.cssSelector(".dropdownContainer .createNewTasks")).click();
		
		ActiTime.findElement(By.cssSelector(".selectCustomerRow .selectedItem")).click();
		ActiTime.findElement(By.cssSelector(".cpItemRow")).click();
		ActiTime.findElement(By.cssSelector(".emptySelection")).click();
		ActiTime.findElement(By.xpath("searchInputPlaceholder")).click();
	
		ActiTime.findElement(By.xpath("//*[@id=\"createTasksPopup_content\"]/div[1]/div[1]/div/div[1]/div/table/tbody/tr[3]/td[1]/div/div/div[2]/div/div[1]/div/div[1]")).click();
		ActiTime.findElement(By.xpath("//td[input[@placeholder='Enter Project Name']]")).sendKeys("Ashish");
		ActiTime.switchTo().activeElement().sendKeys(Keys.TAB,Keys.TAB);
		ActiTime.switchTo().activeElement().sendKeys("Vicky",Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER);
		
		
		//.sendKeys("Ashish");
		
		
		
		
		
		
		
		
		
		
	
	
		
		
	}

}
