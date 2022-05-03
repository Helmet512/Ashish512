package Selenium;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		
		// Get Requried browser Executed path 
		 
	//	String A1= "D:\\Workspace\\Selenium\\Excecute\\chromedriver.exe";
	//	String A2 =".\\Excecutable\\\\chromedriver.exe";
	//	String A3 = System.getProperty("user.dir")+"\\Excecutable\\chromedriver.exe";
		
		//Set required browser execute path using set.property(String key , String value);
		
		System.setProperty("webdriver.chrome.driver", ".\\Executable\\chromedriver.exe");
		 
	    // new ChromeDriver();
		
		//ChromeDriver A4= new ChromeDriver();
		//generic 
		WebDriver A4 = new ChromeDriver();
		 A4.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		
	     A4.get("https://demo.actitime.com/");
	     
//	     System.out.println("Print title name and length: "+ A4.getTitle());
//	     System.out.println("Print Length :"+ A4.getTitle().length());
//	     
//	     System.out.println("print URL of the page :" + A4.getCurrentUrl());
//	     
//	     System.out.println("Print Source of the page :"+ A4.getPageSource());
//	     System.out.println("Print length of source page:"+ A4.getPageSource());
//	      int ps = A4.getPageSource().length();
//	      System.out.println("print length of source page :"+ ps);
	      
	      //A4.close();
	      
	    WebElement Findtheusername =  A4.findElement(By.id("username"));
	    
	    System.out.println("Check the Display method :"+Findtheusername.isDisplayed());
	    System.out.println("Check the enabled method :"+Findtheusername.isEnabled());
	    System.out.println("Check Select method :"+ Findtheusername.isSelected());
	    System.out.println("Check get text:"+ Findtheusername.getText());
	    
	    Findtheusername.sendKeys("admin");
	    
	    
	    
	    //Anotherwaytofindelemnt
	   // A4.findElement(By.id("username")).sendKeys("admin");
	    
	 

	    WebElement Findthepassword = A4.findElement(By.name("pwd"));
	    
	    //System.out.println("Get text method:"+ Findtheusername.getText());
	    System.out.println("Find the atrributes:"+Findthepassword.getAttribute("name"));
	    System.out.println("Find tagname for element:"+ Findthepassword.getTagName());
	    Findthepassword.sendKeys("manager");
	   // A4.findElement(By.id("pwd")).sendKeys("manager");
	    

	    A4.navigate().to("https://www.amazon.in");
	    A4.navigate().back();
	    
	    A4.findElement(By.id("username")).sendKeys("admin");
	    A4.findElement(By.name("pwd")).sendKeys("manager");
	       
	    A4.findElement(By.id("loginButton")).click();
	    
	   Thread.sleep(50000);
	    
	    A4.close();
	   
	      
//	    WebElement Clickonlogout = A4.findElement(By.id("logoutLink"));
//	    Clickonlogout.click();
	    
	   // A4.findElement(By.id("loginButton")).click();
	    
		
	}
}