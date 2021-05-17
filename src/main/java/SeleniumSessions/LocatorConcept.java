package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorConcept {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://app.hubspot.com/login");
		Thread.sleep(7000);

		// Create WebElement and perform the action.

		// 2nd approach

		WebElement email = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement loginBtn = driver.findElement(By.id("loginBtn"));

		email.sendKeys("test@gmail.com");
		password.sendKeys("test123");
		loginBtn.click();

		// 3rd approach

		By email_ele = By.id("username");
		By password_ele = By.id("password");
		By loginBtn_ele = By.id("loginBtn");

//		WebElement e = driver.findElement(email_ele);
//		WebElement p = driver.findElement(password_ele);
//		WebElement l = driver.findElement(loginBtn_ele);
//		
//		e.sendKeys("test@gmail.com");
//		p.sendKeys("test123");
//		l.click();

		// 4th approach

		getElement(email_ele).sendKeys("test@gmail.com");
		getElement(password_ele).sendKeys("123");
		getElement(loginBtn_ele).click();

		// 5th approach

		doSendKeys(email_ele, "Test@gmail.com");
		doSendKeys(loginBtn_ele, "test123");
		doClick(loginBtn_ele);

		// 6th approach

		String email_id = "username";
		doSendKeys(getLocator(email_id), "test@gmail.com");
		
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);

	}

	public static void doSendKeys(By locator, String value) {

		getElement(locator).sendKeys(value);
	}

	public static void doClick(By locator) {

		getElement(locator).click();
	}

	public static By getLocator(String value) {
		return By.id(value);
	}

}
