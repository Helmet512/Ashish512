package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrm {

	public static void main(String[] args) throws InterruptedException {
		
	//	D:\Workspace\Selenium\Executable\chromedriver.exe
		
		System.setProperty("webdriver.chrome.driver", ".\\Executable\\chromedriver.exe");
		
		WebDriver OrangeHRM = new ChromeDriver();
		
		OrangeHRM.manage().window().maximize();
		
		OrangeHRM.get("https://opensource-demo.orangehrmlive.com");
		
		String A1= OrangeHRM.findElement(By.tagName("span")).getText();
		System.out.println(A1);
		
		String[] Logindetails=A1.split(" ");
		
		OrangeHRM.findElement(By.id("txtusername")).sendKeys(Logindetails[3]);
		OrangeHRM.findElement(By.id("txtpassword")).sendKeys(Logindetails[6]);

        OrangeHRM. findElement(By.id("btnLogin")).click();
//         Thread.sleep(3000);
//         OrangeHRM.navigate().back()
//         Thread.sleep(3000);
//         OrangeHRM.navigate().forward();
//         Thread.sleep(3000);
//         OrangeHRM.navigate().refresh();
//         Thread.sleep(3000);
//         OrangeHRM.close();
//		

	}

}
