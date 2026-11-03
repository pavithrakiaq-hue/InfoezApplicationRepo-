package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPomClass {
	WebDriver driver;
	public LoginPomClass(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "//h1[text()='Sign in to Infoez']")
	public WebElement loginHeading;
	@FindBy(xpath = "//input[@type=\"email\"]")
	public WebElement email;
	@FindBy(xpath = "//input[@type=\"password\"]")
	public WebElement password;
	@FindBy(xpath = "(//button[text()='Sign in'])[2]")
	public WebElement signinClick;
	@FindBy(xpath = "//button[@data-testid='user-menu-btn']")
	public WebElement profilemenu;
	@FindBy(xpath="//div[text()='Invalid credentials']")
	public WebElement InvalidMessage;
}
