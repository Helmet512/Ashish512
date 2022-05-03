package Selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Automateamazon {

	public static void main(String[] args) throws InterruptedException {
	
		//String A1 ="D:\\Workspace\\Selenium\\Executable\\chromedriver.exe";
		
		System.setProperty("webdriver.gecko.driver", ".\\Executable\\geckodriver.exe");
		
		WebDriver Amazon = new FirefoxDriver();
		
	//	Amazon.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		
		Amazon.get("https://www.amazon.in");
		
		Amazon.manage().window().maximize();
		Thread.sleep(3000);
		
		System.out.println("Print title page:"+ Amazon.getTitle());
		
		Amazon.findElement(By.linkText("Amazon Pay")).click();
		
	    Thread.sleep(3000);
		Amazon.navigate().back();
		
		Amazon.findElement(By.linkText("Mobiles")).click();
		Thread.sleep(3000);
		
		Amazon.navigate().back();
		
		Amazon.close();
		
		
//		System.setProperty("webdriver.geckodriver.driver", ".\\Executable\\geckodriver.exe");
//		
//		WebDriver A4 = new FirefoxDriver();
		

	
	
		
		
		
		
		

				
	}

}
