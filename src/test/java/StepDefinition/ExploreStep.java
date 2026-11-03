package StepDefinition;

import org.junit.Assert;

import Base.BaseClass;
import Pom.ExplorePomClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ExploreStep extends BaseClass{
	ExplorePomClass ep = new ExplorePomClass(driver);
	@Given("User is on the explore businesses page")
	public void user_is_on_the_explore_businesses_page() {
	    url("https://d2mojgetgp5xie.cloudfront.net/search");
	}

	@When("User select option from Category dropdown")
	public void user_select_option_from_category_dropdown() {
	    click(ep.CategoryDropdown);
	    visibilitywait(ep.CategoryOption);
	    click(ep.CategoryOption);
	}
	@And("User select option from Sort by dropdown")
	public void user_select_option_from_sort_by_dropdown() {
	    click(ep.SortBydropdown);
	    visibilitywait(ep.sortByDropdownOption);
	    click(ep.sortByDropdownOption);
	    
	}
	@And("User select option from Min rating dropdown")
	public void user_select_option_from_min_rating_dropdown() {
	    click(ep.MinRatingDropdown);
	    visibilitywait(ep.MinRatingDropdownOption);
	    click(ep.MinRatingDropdownOption);
	}
	@And("User select Verified only checkbox and clicks the result image")
	public void user_select_verified_only_checkbox() {
		visibilitywait(ep.VerifyCheckBox);
	    click(ep.VerifyCheckBox);
	    elementToBeclick(ep.resultImage);
	    click(ep.resultImage);
	}
	@Then("The matching result should be displayed on the explore page")
	public void the_matching_result_should_be_displayed_on_the_explore_page() {
		visibilitywait(ep.verified);
		Assert.assertTrue(getText(ep.verified).contains("Verified"));
		Assert.assertTrue(getText(ep.categoryNameVerify).contains("Education"));
		double rating = Double.parseDouble(getText(ep.RatingVerify));
		Assert.assertTrue(rating>=4.0);
	}
}
