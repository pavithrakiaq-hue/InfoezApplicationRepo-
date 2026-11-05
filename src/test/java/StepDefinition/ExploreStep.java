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

	
	@When("User clicks Save button")
	public void user_clicks_save_button() {
		elementToBeclick(ep.resultImage);
	    click(ep.resultImage);
	    elementToBeclick(ep.saveButton);
	    click(ep.saveButton);
	}

	@Then("Error message should be displayed")
	public void error_message_should_be_displayed() {
	    visibilitywait(ep.saveErrorMessage);
	    Assert.assertTrue(ep.saveErrorMessage.isDisplayed());
	}
	@When("User clicks Claim button and fills the required details")
	public void user_clicks_claim_button_and_fills_the_required_details() {
		elementToBeclick(ep.ClaimButton);
	    click(ep.ClaimButton);
	    sendKeys(ep.claimReasonField,"Owner");
	}

	@And("Clicks the submit claim button")
	public void clicks_the_submit_claim_button() {
		click(ep.claimSubmitButton);
	}

	@Then("The error message should be displayed")
	public void the_error_message_should_be_displayed() {
	    visibilitywait(ep.claimErrorMessage);
	    Assert.assertTrue(ep.claimErrorMessage.isDisplayed());
	    navigateBack();
	}
	@When("User click send enquiry button")
	public void user_click_send_enquiry_button() {
	    elementToBeclick(ep.sendEnquiryButton);
	    click(ep.sendEnquiryButton);
	}
	@And("User fills the required details and Clicks the send enquiry button")
	public void user_fills_the_required_details_and_clicks_the_send_enquiry_button() {
	    sendKeys(ep.enquiryName,"Pavi");
	    click(ep.enquirySubmitButton);
	}
	@Then("Validation message should be displayed")
	public void validation_message_should_be_displayed() {
	    visibilitywait(ep.EnquirySubmittedMessage);
	    Assert.assertFalse(ep.EnquirySubmittedMessage.isDisplayed());
	}
}

