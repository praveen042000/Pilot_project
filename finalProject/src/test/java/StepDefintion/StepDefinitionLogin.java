package StepDefintion;

import Actions.LoginActions;
import Utility.HelperClass;
import Utility.dataProperties;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionLogin {
	LoginActions logac = new LoginActions() ;
	dataProperties data =new dataProperties();
	
	@Given("User is on the orangehrm.com homepage")
	public void user_is_on_the_orangehrm_com_homepage() {
		 HelperClass.openPage(data.url);
	}

	@When("User enters the valid username and password")
	public void user_enters_the_valid_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User clicks the login button")
	public void user_clicks_the_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User sees the login successful message")
	public void user_sees_the_login_successful_message() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User enters the invalid username {string}")
	public void user_enters_the_invalid_username(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User enters the invalid password {string}")
	public void user_enters_the_invalid_password(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Login is unsuccessful with error messages")
	public void login_is_unsuccessful_with_error_messages() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}




}
