package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Dashboard1Steps {
	
	@Given("the user is on the dashboard page")
	public void the_user_is_on_the_dashboard_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Hello1");
	}

	@When("the user enters valid dusername and dpassword")
	public void the_user_enters_valid_dusername_and_dpassword() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Hello2");
	}
	

	@Then("the user should be navigated to the home\\/dashboard page")
	public void the_user_should_be_navigated_to_the_home_dashboard_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(" Hello3");
	}
	}



