package Selenium;

//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefox {

	public static void main(String[] args) {
		
	
		//String A1 = "D:\\Workspace\\Selenium\\Executable\\geckodriver.exe";
		
	    System.setProperty("webdriver.gecko"
	    		+ ".driver", ".\\Executable\\geckodriver.exe");
	    
	    FirefoxDriver Ashish = new FirefoxDriver();
	    
	}

}
