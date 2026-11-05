package StepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import Base.BaseClass;
import Pom.HomePomClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeStep extends BaseClass {
	String homeUrl;
	String SearchInput;
	String CityInput;
	HomePomClass hp = new HomePomClass(driver);

	@Given("User is on the home page")
	public void user_is_on_the_home_page() {
		url("https://d2mojgetgp5xie.cloudfront.net");
	}

	@When("User search valid {string} on the search field")
	public void user_search_valid_on_the_search_field(String string) {
	   homeUrl = getCurrentURL();
	   sendKeys(hp.searchField, string);
	   SearchInput = string;
	}
	@Then("The name should be entered on the search field")
	public void the_name_should_be_entered_on_the_search_field() {
	    Assert.assertTrue(isEnabled(hp.searchField));
	}
	@When("User click search button")
	public void user_click_search_button() {
		click(hp.searchButton);
	}
	@Then("{string} result should be displayed")
	public void result_should_be_displayed(String string) {
	    if(string.contains("Matching")) {
	    	visibilitywait(hp.Descriptionn);
	    	Assert.assertTrue(getText(hp.Descriptionn).contains(SearchInput.toLowerCase()));
	    }
	    else if(string.contains("No business found")){
	    	visibilitywait(hp.NoBusinessFoundMessage);
	    	Assert.assertTrue(hp.NoBusinessFoundMessage.isDisplayed());
	    }
	    else {
	    	Assert.assertEquals(homeUrl,getCurrentURL());
	    }
	}
	@When("User search with valid {string} name")
	public void user_search_with_valid_city_name(String string) {
		homeUrl = getCurrentURL();
	    sendKeys(hp.searchCityField,string);
	    CityInput = string;
	}
	@Then("The city name should be entered on the search field")
	public void the_city_name_should_be_entered_on_the_search_field() {
		Assert.assertTrue(isEnabled(hp.searchCityField));
	}
	@When("User clicks the search button")
	public void user_clicks_the_search_button() {
	    click(hp.searchButton);
	}
	@Then("The {string} result should be displayed")
	public void the_result_should_be_displayed(String string) {
		if(string.contains("Matching")) {
			MultipleElementsVisibility(hp.citiesResult);
			for(WebElement i : hp.citiesResult) {
				String city = getText(i).toLowerCase();
				Assert.assertTrue(city.contains(CityInput.toLowerCase()));
			}
		}
		else if(string.contains("No business found")){
			visibilitywait(hp.NoBusinessFoundMessage);
	    	Assert.assertTrue(hp.NoBusinessFoundMessage.isDisplayed());
		}
		else {
			Assert.assertEquals(homeUrl,getCurrentURL());
		}
	}
	@When("User navigated from home page to explore page")
	public void user_navigated_from_home_page_to_explore_page() {
		click(hp.exploreNavigation);
	}
	@Then("The user should be redirected to the explore page")
	public void the_user_should_be_redirected_to_the_explore_page() {
	    String url = getCurrentURL();
	    Assert.assertTrue(url.contains("search"));
	}
}

