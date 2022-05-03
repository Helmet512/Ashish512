package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assighment3 {

	public static void main(String[] args) throws InterruptedException {
		// String path1 = "D:\Workspace\Selenium\Executable\geckodriver.exe"

		System.setProperty("webdriver.chrome.driver", ".\\Executable\\chromedriver.exe");
		WebDriver techlist = new ChromeDriver();
		
		techlist.get("https://www.techlistic.com");
		
		techlist.manage().window().maximize();
		
		techlist.findElement(By.linkText("Java")).click();
		
		techlist.navigate().back();
		
		techlist.findElement(By.linkText("Selenium")).click();
		
		techlist.navigate().back();
		
		//WebElement Techlistic= techlist.findElement(By.linkText("https://www.techlistic.com/p/java.html");
	//	WebElement Techlistic = techlist.findElement(By.xpath("(//a[text()='Java'])[3]"));
//		Thread.sleep(3000);
//		
//		Techlistic.click();
//		
		
	}

}
