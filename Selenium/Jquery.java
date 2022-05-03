package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.interactions.Actions;

public class Jquery {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", ".\\Executable\\geckodriver.exe");
		
		WebDriver Jquery =new FirefoxDriver();
		
		Jquery.manage().window().maximize();
		
		Jquery.get("https://jqueryui.com/droppable/");
		Jquery.findElement(By.linkText("Sortable")).click();
		Jquery.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		
		Jquery.switchTo().frame(0);
		Actions Jquery1 =new Actions(Jquery);
		
		List<WebElement> source=Jquery.findElements(By.cssSelector(".ui-sortable>li"));
		
		List<WebElement> target=Jquery.findElements(By.cssSelector(".ui-sortable>li"));
	
		
	  Jquery1.dragAndDrop(source.get(6), target.get(0)).build().perform();
	  Jquery1.dragAndDrop(source.get(5), target.get(0)).build().perform();
	  Jquery1.dragAndDrop(source.get(4), target.get(0)).build().perform();
	  Jquery1.dragAndDrop(source.get(3), target.get(0)).build().perform();
	  Jquery1.dragAndDrop(source.get(2), target.get(0)).build().perform();
	  Jquery1.dragAndDrop(source.get(1), target.get(0)).build().perform();
	  Jquery1.dragAndDrop(source.get(0), target.get(0)).build().perform();
	  
	    		 
		
		


	}

}
