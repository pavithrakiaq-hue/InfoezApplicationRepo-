package Pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePomClass {
	public WebDriver driver;
	public HomePomClass(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//input[@data-testid='hero-search-query']")
	public WebElement searchField;
	@FindBy(xpath="//button[@data-testid='hero-search-submit']")
	public WebElement searchButton;
	@FindBy(xpath="//div[@class='p-5 flex-1 flex flex-col']/p")
	public WebElement Descriptionn;
	@FindBy(xpath ="//h3[@class='mt-6 font-display font-semibold text-xl']")
	public WebElement NoBusinessFoundMessage;
	@FindBy(xpath="//input[@data-testid='hero-search-location']")
	public WebElement searchCityField;
	@FindBy(xpath="//span[@class='flex items-center gap-1']")
	public List<WebElement> citiesResult;
	@FindBy(xpath="//a[@data-testid='nav-explore']")
	public WebElement exploreNavigation;
}
