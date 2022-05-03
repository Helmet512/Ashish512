package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assignment1vtiger {

	public static void main(String[] args) throws InterruptedException {
	
	//String A1 = "D:\\Workspace\\Selenium\\Executable\\chromedriver.exe";
	
	System.setProperty("webdriver.chrome.driver", ".\\Executable\\chromedriver.exe");
	
	WebDriver Vtiger = new ChromeDriver();
	
	Vtiger.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	Vtiger.get("https://demo.vtiger.com/vtigercrm/index.php");
	Vtiger.manage().window().maximize();
	Vtiger.findElement(By.id("username")).clear();
	Vtiger.findElement(By.id("password")).clear();
	
	Vtiger.findElement(By.id("username")).sendKeys("admin");
	Vtiger.findElement(By.id("password")).sendKeys("Test@123");
	Vtiger.findElement(By.className("button")).click();
	
//	Vtiger.findElement(By.xpath("//div[@id='appnavigator']//span[@class='app-icon fa fa-bars']")).click();
	                    //  xpath("//div[@id='appnavigator']//span[@class='app-icon fa fa-bars']")
	
	Vtiger.findElement(By.className("app-icon")).click();
	Vtiger.findElement(By.className("app-menu-items-wrapper")).click();
	Vtiger.findElement(By.xpath("//a[@title='Contacts']//span//i")).click();
	//a[@href='index.php?module=Contacts&view=List&app=MARKETING']//span[@class='module-icon']//i[@title='Contacts']
	
	Vtiger.findElement(By.cssSelector(".overflow-y div>a")).click();
	Vtiger.findElement(By.id("select2-chosen-2")).click();
	
	Vtiger.switchTo().activeElement().sendKeys(Keys.chord(Keys.DOWN,Keys.ENTER,Keys.TAB));
	Vtiger.switchTo().activeElement().sendKeys("Ashish",Keys.TAB);
	Vtiger.switchTo().activeElement().sendKeys("Chavan",Keys.TAB);
	Vtiger.switchTo().activeElement().sendKeys("78929211812",Keys.ENTER);
	
	Vtiger.findElement(By.id("Contacts_editView_fieldName_account_id_create")).click();
	Vtiger.findElement(By.id("Accounts_editView_fieldName_accountname")).sendKeys("Monu");
	Vtiger.findElement(By.xpath("//button[@type='submit']//strong")).click();
	Vtiger.findElement(By.xpath("/html/body/div[10]/div[2]/div/div[2]/button[2]")).click();
	//Vtiger.findElement(By.className("btn-default")).click();
	
//	Vtiger.switchTo().activeElement().sendKeys(Keys.ESCAPE);
	Vtiger.findElement(By.xpath("//input[@name='title']"));
	Vtiger.switchTo().activeElement().sendKeys("HP",Keys.ENTER);
	Vtiger.findElement(By.className("saveButton")).click();
	
	Assert.assertEquals(Vtiger.getTitle(), "Contacts");
	Vtiger.findElement(By.xpath("//*[@id=\"page\"]/nav/div[2]/div/div[3]/div/div[1]/p[1]/a")).click();
	Thread.sleep(2000);
	Vtiger.findElement(By.cssSelector(".listViewContentHeader span>input")).click();
	Thread.sleep(2000);
	Vtiger.findElement(By.cssSelector(".btn-group>:nth-child(2)>:first-child")).click();
	Thread.sleep(2000);
	Vtiger.findElement(By.xpath("//button[@data-bb-handler='confirm']")).click();
	
	Vtiger.close();

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	Vtiger.findElement(By.className("userName")).click();
//
//	Vtiger.findElement(By.id("menubar_item_right_LBL_SIGN_OUT")).click();
	
	}

}
