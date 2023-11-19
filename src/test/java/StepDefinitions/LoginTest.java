package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPage;

public class LoginTest {
	
	WebDriver driver;
	LoginPage login;
	
	@Given("the user1 is on the login page")
	public void the_user1_is_on_the_login_page() {
		//WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		login = new LoginPage(driver);
		
	    }

	@When("the user1 enters valid username and password")
	public void the_user1_enters_valid_username_and_password() {
		login.enterUsername("standard_user");
		login.enterPassword("secret_sauce");
	    
	}

	@When("the clicks on the {string} button")
	public void the_clicks_on_the_button(String string) {
		login.clickLoginButton();
	    
	}

	@Then("the user1 should be redirected to the home\\/dashboard page")
	public void the_user1_should_be_redirected_to_the_home_dashboard_page() {
		System.out.println("Dashboard page");
		driver.quit();
	    
	}

}
