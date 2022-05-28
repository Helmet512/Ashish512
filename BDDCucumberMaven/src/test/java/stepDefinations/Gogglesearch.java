package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import cucumber.api.java.en.*;
import day24.webpages.GoogleSearchPage;
import utilities.SeleniumUtility;

public class Gogglesearch extends SeleniumUtility {

	public static WebDriver driver;
	GoogleSearchPage getGoogleSearchPage;
	@Given("^User is already on goggle search$")
	public void user_is_already_on_goggle_search() {
	    
	    driver=setUp("chrome","https://www.google.com");
	}
	@When("User type {string} on search field and enter")
	public void user_type_on_search_field_and_enter(String string) {

		driver.findElement(By.className("gLFyf gsfi")).sendKeys("Selenium 2.0",Keys.ENTER);
		getGoogleSearchPage=new GoogleSearchPage(driver);
	}
	

	@Then("User gets results with the title of {string}")
	public void user_gets_results_with_the_title_of(String title) {
	   System.out.println(driver.getTitle());
	   System.out.println("Ex:"+title);
	   Assert.assertEquals(getGoogleSearchPage.searchedResultPageTitile(), title);
	   
	}
     


	@When("^User type(.+) in search input field,click on searcg button$")
	public void user_types_tyexttobesearch_in_search_input_field() {
	   
	}

	@Then("User will reached the search result page with the title Selenium {double} - Goggle Search")
	public void user_will_reached_the_search_result_page_with_the_title_Selenium_Goggle_Search(Double double1) {
	   
	}
     
	@Then("^Close the browser$")
	public void close_the_browser() {
	
	}
     

}






