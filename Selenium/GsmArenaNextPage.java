package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class GsmArenaNextPage {

	public static void main(String[] args) {
		
		//String A2 =".\\Excecutable\\\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", ".\\Executable\\chromedriver.exe");
		
		WebDriver GsmNext = new ChromeDriver();
		
		GsmNext.manage().window().maximize();
		GsmNext.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		
		GsmNext.get("https://www.gsmarena.com/");
		
		GsmNext.get("https://www.gsmarena.com/samsung-phones-9.php");
		
		GsmNext.findElement(By.className("pages-next")).click();
		
		System.out.println("Get Current Page URL:"+GsmNext.getCurrentUrl());
		
        GsmNext.findElement(By.className("pages-next")).click();
		
		System.out.println("Get Current Page URL:"+GsmNext.getCurrentUrl());
		
        GsmNext.findElement(By.className("pages-next")).click();
		
		System.out.println("Get Current Page URL:"+GsmNext.getCurrentUrl());
		
        GsmNext.findElement(By.className("pages-next")).click();
		
		System.out.println("Get Current Page URL:"+GsmNext.getCurrentUrl());
		
        GsmNext.findElement(By.className("pages-next")).click();
		
		System.out.println("Get Current Page URL:"+GsmNext.getCurrentUrl());
		
GsmNext.findElement(By.className("pages-next")).click();
		
		System.out.println("Get Current Page URL:"+GsmNext.getCurrentUrl());
		
GsmNext.findElement(By.className("pages-next")).click();
		
		System.out.println("Get Current Page URL:"+GsmNext.getCurrentUrl());
		
GsmNext.findElement(By.className("pages-next")).click();
		
		System.out.println("Get Current Page URL:"+GsmNext.getCurrentUrl());
		
GsmNext.findElement(By.className("pages-next")).click();
		
		System.out.println("Get Current Page URL:"+GsmNext.getCurrentUrl());
		
GsmNext.findElement(By.className("pages-next")).click();
		
		System.out.println("Get Current Page URL:"+GsmNext.getCurrentUrl());
		
GsmNext.findElement(By.className("pages-next")).click();
		
		System.out.println("Get Current Page URL:"+GsmNext.getCurrentUrl());
		
GsmNext.findElement(By.className("pages-next")).click();
		
		System.out.println("Get Current Page URL:"+GsmNext.getCurrentUrl());
		
		
		
	}

}
