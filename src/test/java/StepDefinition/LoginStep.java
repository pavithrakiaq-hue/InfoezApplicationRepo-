package StepDefinition;

import org.junit.Assert;

import Base.BaseClass;
import Pom.LoginPomClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep extends BaseClass{
	LoginPomClass pm = new LoginPomClass(driver);
	@Given("User is on the login page")
	public void user_is_on_the_login_page() {
	   url("https://d2mojgetgp5xie.cloudfront.net/login");
	}
	@Then("the login heading should be displayed")
	public void appropriate_login_heading_should_be_displayed() {
	    Assert.assertTrue(pm.loginHeading.isDisplayed());
	}
	@When("User enters valid {string} and {string}")
	public void user_enters_and1(String string, String string2) {
		sendKeys(pm.email, string);
		sendKeys(pm.password, string2);
	}
	@And("User clicks sign in button")
	public void user_clicks_sign_in_button() {
	    click(pm.signinClick);
	}
	@Then("The login should be {string}")
	public void the_login_should_be(String string) {
	    if(string.contains("Success")) {
	    	visibilitywait(pm.profilemenu);
	    	Assert.assertTrue(pm.profilemenu.isDisplayed());
	    }
	    else {
	    	visibilitywait(pm.InvalidMessage);
	    	Assert.assertTrue(pm.InvalidMessage.isDisplayed());
	    }
	}
}
