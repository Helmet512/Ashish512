package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenCart {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",".\\\\Executable\\\\chromedriver.exe");
		
		WebDriver OpenCart=new ChromeDriver();
		
		OpenCart.get("https://www.opencart.com/index.php?route=account/register");
		
		OpenCart.switchTo().activeElement().sendKeys(Keys.chord(Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB));
		OpenCart.switchTo().activeElement().sendKeys("Ashish512",Keys.TAB);
		OpenCart.switchTo().activeElement().sendKeys("Ashish",Keys.TAB);
		OpenCart.switchTo().activeElement().sendKeys("Chavan",Keys.TAB);
		OpenCart.switchTo().activeElement().sendKeys("ashish.chavan@viit.ac.in",Keys.TAB,Keys.ENTER);
		OpenCart.switchTo().activeElement().sendKeys(Keys.DOWN,Keys.DOWN,Keys.ENTER,Keys.TAB);
		OpenCart.switchTo().activeElement().sendKeys("Helmet",Keys.TAB);
		OpenCart.switchTo().activeElement().sendKeys(Keys.ARROW_RIGHT,Keys.ARROW_RIGHT,Keys.ARROW_RIGHT,Keys.ARROW_RIGHT,Keys.ARROW_RIGHT);
		OpenCart.findElement(By.cssSelector("#button-register>:nth-child(1)")).click();
		
		
	}

}
