package Base;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static void chrome() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	public static void chromeOption() {
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--start-maximized");
		Map<String,Object> prefs = new HashMap<>();
		prefs.put("profile.password_manager_leak_detection",false);
		op.setExperimentalOption("prefs", prefs);
		driver = new ChromeDriver(op);
		driver.manage().window().maximize();
	}
	public static void visibilitywait(WebElement element) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	public static void elementToBeclick(WebElement element) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	public static void MultipleElementsVisibility(List<WebElement> citiesResult){
		wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfAllElements(citiesResult));
	}
	public static void url(String url) {
		driver.get(url);
	}
	public static void sendKeys(WebElement element,String name) {
		element.sendKeys(name);
	}
	public static void click(WebElement element) {
		element.click();
	}
	public static String getDomproperty(WebElement element, String name) {
		return element.getDomProperty(name);
	}
	public static String getText(WebElement element) {
		return element.getText();
	}
	public static String getCurrentURL() {
		return driver.getCurrentUrl();
	}
	public static void close() {
		if(driver!= null) {
			driver.quit();
			driver = null;
		}
	}
}