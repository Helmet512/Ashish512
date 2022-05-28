package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.SeleniumUtility;

public class ActiTimeRunner extends SeleniumUtility {
	
	WebDriver driver;
	@Given("User is already in actitime log in page")
	public void user_is_already_in_actitime_log_in_page() {
	    // Write code here that turns the phrase above into concrete actions
	    driver=setUp("chrome","https://demo.actitime.com/login.do");
	}

	@When("User Enter username")
	public void user_Enter_username() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("username")).sendKeys("admin");
	}

	@When("Enter password")
	public void enter_password() {
	    // Write code here that turns the phrase above into concrete actions
		 driver.findElement(By.name("pwd")).sendKeys("manager");
	}

	@When("click on login button")
	public void click_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		 driver.findElement(By.id("loginButton")).click();
	}

	@Then("Verify Actitime Homepage Opened or Not")
	public void verify_Actitime_Homepage_Opened_or_Not() {
	    // Write code here that turns the phrase above into concrete actions
		 Assert.assertEquals(driver.getTitle(), "actiTIME - Enter Time-Track", "Either login is not successful or page not loaded");
			
	}

	@Given("User is Already have valid URL for Actitime Login page {string}")
	public void user_is_Already_have_valid_URL_for_Actitime_Login_page(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("User Enters Username As {string}")
	public void user_Enters_Username_As(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("Enter password as {string}")
	public void enter_password_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("click on Login button")
	public void click_on_Login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("Verify Actitime page As {string}")
	public void verify_Actitime_page_As(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Given("User is Already have valid URL for Actitime Login page https:\\/\\/demo.actitime.com\\/login.do")
	public void user_is_Already_have_valid_URL_for_Actitime_Login_page_https_demo_actitime_com_login_do() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("User Enters Username As admin")
	public void user_Enters_Username_As_admin() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("Enter password as manager")
	public void enter_password_as_manager() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("Verify Actitime page As < page Title>")
	public void verify_Actitime_page_As_page_Title() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("Enter password as manager{int}")
	public void enter_password_as_manager(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
}
