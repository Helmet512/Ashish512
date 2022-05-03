package Selenium;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Crickinfo {

	public static void main(String[] args) {
		
		
		//D:\Workspace\Selenium\Executable\chromedriver.exe
		
		System.setProperty("webdriver.chrome.driver", ".\\Executable\\chromedriver.exe");
		
		WebDriver Crickinfo = new ChromeDriver();
		
		Crickinfo.manage().window().maximize();
		
		Crickinfo.get("https://www.espncricinfo.com/");
		
		//System.out.println("Print home page:" + Crickinfo.getTitle());
		
		String ExpectedTitle ="Live cricket scores, match schedules, latest cricket news, cricket videos";
		
		if (ExpectedTitle.equals(Crickinfo.getTitle())) {
			System.out.println("Page Titile is Valid ");
		}else {
			System.out.println("Print Title is not valid ");
			
		}
				
				
		
		
		List<WebElement> List =Crickinfo.findElements(By.cssSelector(".ds-flex .ds-flex-1 .ds-popper-wrapper>a"));
		
		System.out.println("Count of the list:"+ List.size());
		
	//	List <WebElement> List =  Crickinfo.findElement(By.cssSelector(".ds-flex .ds-flex-1 .ds-popper-wrapper>a"));
		
		for (int i=0; List.size()>i; i++) {
			System.out.println(List.get(i).getText());
			
			
		}

	}

}
