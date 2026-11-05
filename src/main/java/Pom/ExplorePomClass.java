package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExplorePomClass {
	public WebDriver driver;
	public ExplorePomClass(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//button[@data-testid='filter-category']")
	public WebElement CategoryDropdown;
	@FindBy(xpath="//*[text()='Education']")
	public WebElement CategoryOption;
	@FindBy(xpath="//button[@data-testid='filter-sort']")
	public WebElement SortBydropdown;
	@FindBy(xpath="//*[text()='Top rated']")
	public WebElement sortByDropdownOption;
	@FindBy(xpath="//button[@data-testid='filter-min-rating']")
	public WebElement MinRatingDropdown;
	@FindBy(xpath="//*[text()='4.0+']")
	public WebElement MinRatingDropdownOption;
	@FindBy(xpath="//input[@data-testid='filter-verified']")
	public WebElement VerifyCheckBox;
	@FindBy(xpath="(//button[@aria-label='Toggle favorite']/parent::div/parent::a)[1]")
	public WebElement resultImage;
	@FindBy(xpath="(//div[@class='flex items-center gap-2 text-xs']/div)[2]")
	public WebElement verified;
	@FindBy(xpath="(//div[@class='flex items-center gap-2 text-xs']/div)[1]")
	public WebElement categoryNameVerify;
	@FindBy(xpath="//span[@class='font-mono font-semibold text-base']")
	public WebElement RatingVerify;
	@FindBy(xpath="//button[@data-testid='open-enquiry-btn']")
	public WebElement sendEnquiryButton;
	@FindBy(xpath="//input[@data-testid='enquiry-name']")
	public WebElement enquiryName;
	@FindBy(xpath="//input[@data-testid='enquiry-email']")
	public WebElement enquiryEmail;
	@FindBy(xpath="//input[@data-testid='enquiry-phone']")
	public WebElement enquiryPhone;
	@FindBy(xpath="//textarea[@data-testid='enquiry-message']")
	public WebElement enquiryMessage;
	@FindBy(xpath="//button[@data-testid='enquiry-submit-btn']")
	public WebElement enquirySubmitButton;
	@FindBy(xpath="//button[text()='Save']")
	public WebElement saveButton;
	@FindBy(xpath="//button[@data-testid='claim-business-btn']")
	public WebElement ClaimButton;
	@FindBy(xpath="//button[@data-testid='write-review-btn']")
	public WebElement ReviewButton;
	@FindBy(xpath="//*[contains(text(),'Enquiry sent')]")
	public WebElement EnquirySubmittedMessage;
	@FindBy(xpath="//*[text()='Sign in to save favorites']")
	public WebElement saveErrorMessage;
	@FindBy(xpath="//textarea[@data-testid='claim-reason']")
	public WebElement claimReasonField;
	@FindBy(xpath="//button[@data-testid='claim-submit-btn']")
	public WebElement claimSubmitButton;
	@FindBy(xpath="//*[text()='Please sign in first']")
	public WebElement claimErrorMessage;
	
}