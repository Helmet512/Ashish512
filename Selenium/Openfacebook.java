package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 
import org.openqa.selenium.support.ui.Select;

public class Openfacebook {

	//private static WebElement months;

	public static void main(String[] args) {
		
		//String a = "D:\\Workspace\\Selenium\\Executable\\geckodriver.exe"
	
		System.setProperty("webdriver.chrome.driver", ".\\Executable\\chromedriver.exe");
		
		WebDriver Facebook = new ChromeDriver();
		
		Facebook.get("https://www.facebook.com");
		
		Facebook.manage().window().maximize();
		Facebook.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		
		System.out.println("Print title of the page :"+ Facebook.getTitle());
	
		String ExpectedResult = "Facebook – log in or sign up";
        if (ExpectedResult.equals(Facebook.getTitle())) {
        	System.out.println("Page valid");
        }else {
        	System.out.println("Page Invalid");
        	
        }
        Facebook.findElement(By.cssSelector("._6ltg>a")).click();
        
        WebElement day = Facebook.findElement(By.className("_9407"));
        
        Select DAY = new Select(day);
        
        System.out.println("Print the Dropdown is multiple or not :"+ DAY.isMultiple());
        
        System.out.println("Show The page is enabled or not :"+ day.isEnabled());
        
        System.out.println("Show default value showing on dropdown:"+ DAY.getFirstSelectedOption().getText());
        
        Facebook.findElement(By.className("_9407")).click();
      
        List<WebElement> Size = DAY.getOptions();
        System.out.println("Print count of the values present in day :"+ Size.size());
        
        for (int i=0; Size.size()>i;i++) {
        	System.out.println(Size.get(i).getText());
        }	 
        	System.out.println("******Visibletext*********");
        	
        	DAY.selectByIndex(5);
        	DAY.selectByVisibleText("24");
//		
        	
        	System.out.println("*******For Month***********");
        	
        	WebElement monthfield= Facebook.findElement(By.id("month"));
        	monthfield.click();
        	
        	 Select Month = new Select(monthfield);
             
             System.out.println("Print the Dropdown is multiple or not :"+ Month.isMultiple());
             
             System.out.println("Show The page is enabled or not :"+ monthfield.isEnabled());
             
             System.out.println("Show default value showing on dropdown:"+ Month.getFirstSelectedOption().getText());
             
             List<WebElement> Sizecount = Month.getOptions();
             System.out.println("show size :"+ Sizecount.size());
             
             for (int i=0; Sizecount.size()>i;i++) {
             	System.out.println(Sizecount.get(i).getText());
             	
             }
             
             System.out.println("*************For Year *************");
             
             WebElement Year = Facebook.findElement(By.id("year"));
             Year.click();
             
             Select Yearfield = new Select(Year);
             
             System.out.println("check For multiple Dropdown:"+ Yearfield.isMultiple());
             
             System.out.println("Show Is enabled or not :"+ Year.isEnabled());
             System.out.println("Show The display :"+ Year.isDisplayed());
             
             
             List<WebElement> Sizecount2 = Yearfield.getOptions();
             
         
           System.out.println("show size :"+ Sizecount2.size());
             
             for (int i=0; Sizecount2.size()>i;i++) {
             	System.out.println(Sizecount2.get(i).getText());
             	
             
             	
             	
             
             
             
        }
        
	     

		}
		
				
		
		
		
		
		
		
		//A1.close();
		

	}


