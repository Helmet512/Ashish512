package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DEMOAUTOMATIONTESTING {

	public static void main(String[] args) throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver", ".\\Executable\\chromedriver.exe");
		
		WebDriver Automation = new ChromeDriver();
		
		Automation.get("http://demo.automationtesting.in/Register.html");
		
		WebElement Active= Automation.switchTo().activeElement();
		
		Automation.manage().window().maximize();
		Automation.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement FirstName= Automation.findElement(By.cssSelector("input[placeholder='First Name']"));
		
		FirstName.sendKeys("admin",Keys.chord(Keys.CONTROL ,"a"),Keys.chord(Keys.CONTROL));
		FirstName.sendKeys(Keys.CONTROL,"c");
		
		FirstName.sendKeys(Keys.TAB);
		
		Automation.switchTo().activeElement().sendKeys(Keys.chord(Keys.CONTROL,"v"),Keys.TAB);
		
		Automation.switchTo().activeElement().sendKeys("Sharyu park,nashik",Keys.TAB);
		
		Automation.switchTo().activeElement().sendKeys("ashish.chavan@viit.ac.in",Keys.TAB);
		Automation.switchTo().activeElement().sendKeys("7588912109",Keys.TAB);
		
		
		Automation.switchTo().activeElement().click();
		Automation.switchTo().activeElement().sendKeys(Keys.TAB);
		
		Automation.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN,Keys.ARROW_UP,Keys.END,Keys.HOME);
		Automation.switchTo().activeElement().sendKeys(Keys.TAB);
		Automation.switchTo().activeElement().sendKeys(Keys.TAB);
		Automation.switchTo().activeElement().click();
		
		Automation.findElement(By.cssSelector(".col-md-4 .ui-state-default")).click();
		Automation.findElement(By.cssSelector(".ui-menu>:nth-child(8)")).click();
		Automation.findElement(By.xpath("//body")).click();
		
		WebElement drop =Automation.findElement(By.id("Skills"));
		
		Select Down = new Select(drop);
		
		Down.selectByVisibleText("Android");
		Automation.switchTo().activeElement().sendKeys(Keys.TAB);
		
		WebElement Country =Automation.findElement(By.xpath("//span[@role='combobox']"));
		
		Select Downcountry =new Select(Country);
		
		List<WebElement>alloption=Downcountry.getOptions();
		for(WebElement option:alloption)
		{
			if(option.getText().equals("India"))
			{
				option.click();
			}
		}
		
		
		
		
		
		WebElement Year=Automation.findElement(By.id("yearbox"));
		Select YearDropdown=new Select(Year);
		YearDropdown.selectByIndex(10);
		Automation.switchTo().activeElement().sendKeys(Keys.TAB);
		
		WebElement Month = Automation.findElement(By.xpath("//select[@placeholder='Month']"));
		Select MonthDrop =new Select(Month);
		MonthDrop.selectByIndex(15);
		Automation.switchTo().activeElement().sendKeys(Keys.TAB);

		WebElement Days=Automation.findElement(By.id("daybox"));
		Select DayDrop =new Select(Days);
		DayDrop.selectByIndex(12);
		Automation.switchTo().activeElement().sendKeys(Keys.TAB);
		Automation.switchTo().activeElement().sendKeys("manager",Keys.TAB);
		Automation.switchTo().activeElement().sendKeys("manager",Keys.TAB);
		
		Automation.switchTo().activeElement().sendKeys(Keys.ENTER);
		


		
		
		
		
		
		
		
		
		
		
		
		
		
		
//Automation.switchTo().activeElement().sendKeys(Keys.DOWN);
//		
//        list.get(3).click();
//        Automation.switchTo().activeElement().sendKeys(Keys.TAB);
//        Automation.switchTo().activeElement().sendKeys(Keys.TAB);
//        Automation.switchTo().activeElement().sendKeys(Keys.ENTER);
//        
//        Select year = new Select((WebElement) Automation);
//        
//        List <WebElement> list2 = year.getOptions();
//        System.out.println("Get the Count:"+list2.size());
//        list.get(5).click();
//        
//        
	
		
		
		
		
    	
		
	
	
	

	}

}
