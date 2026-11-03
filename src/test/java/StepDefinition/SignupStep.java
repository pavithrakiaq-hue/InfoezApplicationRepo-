package StepDefinition;

import org.junit.Assert;

import Base.BaseClass;
import Pom.SignupPomClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignupStep extends BaseClass{
	SignupPomClass pm2 = new SignupPomClass(driver);
	@Given("User is on the sign up page")
	public void user_is_on_the_sign_up_page() {
		url("https://d2mojgetgp5xie.cloudfront.net/register");
	}
	@Then("Sign up page heading should be displayed")
	public void sign_up_page_heading_should_be_displayed() {
	    Assert.assertTrue(pm2.heading.isDisplayed());
	}
	@When("User Enters {string},{string} and {string}")
	public void user_enters_and(String string, String string2, String string3) {
	    sendKeys(pm2.FullName,string);
	    sendKeys(pm2.Email,string2);
	    sendKeys(pm2.Password,string3);
	}
	@And("User clicks Create account button")
	public void user_clicks_create_account_button() {
	    click(pm2.createAccountButton);
	}

	@Then("The sign up result should be {string}")
	public void the_sign_up_result_should_be(String string) {
	    if(string.contains("Success")) {
	    	visibilitywait(pm2.profilemenu);
	    	Assert.assertTrue(pm2.profilemenu.isDisplayed());
	    }
	    else{
	    	visibilitywait(pm2.InvalidMesssage);
	    	Assert.assertTrue(pm2.InvalidMesssage.isDisplayed());
	    }
	}
	@When("User enter password with less than six char")
	public void user_enter_password_with_less_than_char() {
	    sendKeys(pm2.Password,"pav");
	}

	@And("User enters other fields such as Full Name,Email")
	public void user_enters_other_fields_such_as_full_name_email() {
		sendKeys(pm2.FullName,"pavithra");
	    sendKeys(pm2.Email,"xtsydg@gmail.com");
	}

	@And("User click Create account button")
	public void user_click_create_account_button() {
		click(pm2.createAccountButton);
	}

	@Then("The system should prevent user to sign up with password less than six char")
	public void the_system_should_prevent_user_to_sign_up_with_password_less_than_char() {
	    String message = getDomproperty(pm2.Password, "ValidationMessage");
	    System.err.println(message);
	}
}

