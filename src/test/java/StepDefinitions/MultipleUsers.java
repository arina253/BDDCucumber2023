package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.assertEquals;


public class MultipleUsers {
	
	
	WebDriver driver;
	@Given("the user is on the Saucedemo login page")
	public void the_user_is_on_the_saucedemo_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver","C:\\Users\\joshi\\OneDrive\\Desktop\\chromedriver\\chromedriver\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
	}

	@When("the user enters username {string} and password {string}")
    public void enterUsernameAndPassword(String username, String password) {
        WebElement usernameField = driver.findElement(By.id("user-name"));
        WebElement passwordField = driver.findElement(By.id("password"));
        
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
    }

    @When("clicks the login button")
    public void clickLoginButton() {
        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();
    }

    @Then("the user login status should be {string}")
    public void verifyLoginStatus(String loginStatus) {
    	
//   if (expectedLoginStatus.equals("successful")) {
//    Assuming a successful login results in navigating to the inventory page
//            
//    	WebElement inventoryTitle = driver.findElement(By.className("title"));
//WebElement Title = driver.findElement(By.cssSelector("#header_container > div.primary_header > div.header_label > div"));
//assertEquals("Swag Labs", Title.getText());
//        	
        	if (driver.getCurrentUrl().contains ("inventory")){
        		System.out.println("Successful");
   }
//        		
//        	
         else {
//            // Assuming an unsuccessful login results in an error message
//           WebElement errorMessage = driver.findElement(By.cssSelector("#login_button_container > div > form > div.error-message-container.error > h3"));
//            assertEquals("Epic sadface: Username and password do not match any user in this service", errorMessage.getText());
//               
        	 System.out.println("Unsuccessful");
        	 
        	}
       driver.quit();
    	
    	
    		   
	}
}

