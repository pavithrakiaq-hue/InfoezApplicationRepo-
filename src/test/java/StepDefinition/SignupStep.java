package StepDefinition;

import org.junit.Assert;

import Base.BaseClass;
import Pom.SignupPomClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignupStep extends BaseClass{
	String FullNameExpected;
	String EmailExpected;
	String PasswordExpected;

	SignupPomClass pm2 = new SignupPomClass(driver);
	@Given("User is on the sign up page")
	public void user_is_on_the_sign_up_page() {
		url("https://d2mojgetgp5xie.cloudfront.net/register");
	}
	@Then("Sign up page heading should be displayed")
	public void sign_up_page_heading_should_be_displayed() {
	    Assert.assertTrue(pm2.heading.isDisplayed());
	}
	@When("User enters {string}")
	public void user_enters1(String string) {
		FullNameExpected = string;
		sendKeys(pm2.FullName,string);
	}

	@Then("Full name should be entered on Full name field")
	public void full_name_should_be_entered_on_full_name_field() {
	    String FullNameActual = getAttribute(pm2.FullName,"value");
	    Assert.assertEquals(FullNameExpected, FullNameActual);
	}

	@When("User enters the {string}")
	public void user_enters2(String string) {
		EmailExpected = string;
		sendKeys(pm2.Email,string);
	}

	@Then("Email value should be entered on email field")
	public void email_value_should_be_entered_on_email_field() {
	    String EmailActual = getAttribute(pm2.Email,"value");
	    Assert.assertEquals(EmailActual, EmailExpected); 
	}
	@When("User enter the {string}")
	public void user_enters3(String string) {
		PasswordExpected = string;
		sendKeys(pm2.Password,string);
	}
	@Then("Password value should be entered on password field")
	public void password_value_should_be_entered_on_password_field() {
		String PasswordActual = getAttribute(pm2.Password,"value");
	    Assert.assertEquals(PasswordExpected,PasswordActual); 
	}
	@When("User clicks Create account button")
	public void user_clicks_create_account_button() {
	    click(pm2.createAccountButton);
	}
	@Then("The sign up validation should be {string}")
	public void the_sign_up_result_should_be(String string) {
	    if(string.contains("Success")) {
	    	visibilitywait(pm2.profilemenu);
	    	Assert.assertTrue(pm2.profilemenu.isDisplayed());
	    }
	    else if(string.contains("Toast")) {
	    	visibilitywait(pm2.InvalidMesssage);
	    	Assert.assertTrue(pm2.InvalidMesssage.isDisplayed());
	    }
	    else {
	    	String message = getDomproperty(pm2.Password, "ValidationMessage");
		    System.err.println(message);
	    }
	}
}

