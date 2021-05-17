package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DiffferentLocators {
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://classic.crmpro.com/");

		// 1. id ==== unique element
		// 2. name:

		driver.findElement(By.name("username")).sendKeys("testvivvek");

		// 3. className: not unique
		// 4. Xpath
		// 5. Css selector
		driver.findElement(By.cssSelector("#loginForm > div > input:nth-child(1)"));

		// 6. linkText
		// 7. partialLinkText
		// tagName
		driver.findElement(By.tagName("a"));
		driver.findElement(By.tagName("input"));
		String h2 = driver.findElement(By.tagName("h2")).getText();
		System.out.println(h2);
		
		
		boolean b = driver.findElement(By.id("username")).isDisplayed();
		if(b)
		{
			System.out.println("username is present");
		}
		else
		{
			System.out.println("usename is not present ");
		}
		
		
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);

	}

	public static String doGetText(By locator) {
		return getElement(locator).getText();
	}

	
	public static boolean doIsDisplayed(By locator)
	{
		return getElement(locator).isDisplayed();
	}
	
	
}
