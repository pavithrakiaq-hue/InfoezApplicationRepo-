package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupPomClass {
	WebDriver driver;
	public SignupPomClass(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//h1[text()='Create your account']")
	public WebElement heading;
	@FindBy(xpath="//input[@data-testid='register-name']")
	public WebElement FullName;
	@FindBy(xpath="//input[@data-testid='register-email']")
	public WebElement Email;
	@FindBy(xpath="//input[@data-testid='register-password']")
	public WebElement Password;
	@FindBy(xpath="//button[text()='Create account']")
	public WebElement createAccountButton;
	@FindBy(xpath = "//button[@data-testid='user-menu-btn']")
	public WebElement profilemenu;
	@FindBy(xpath = "(//section[@aria-label='Notifications alt+T']//li//div)[3]")
	public WebElement InvalidMesssage;
}
