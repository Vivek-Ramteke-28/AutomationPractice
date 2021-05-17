package SeleniumSessions;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomWait {
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");

		By emailId = By.name("username");
		retryingElement(emailId).sendKeys("test@gmailcom");
	}

	public static WebElement retryingElement(By locator) {
		WebElement element = null;
		int attempts = 0;

		while (attempts < 30) {
			try {
				element = driver.findElement(locator);
				break;
			} catch (StaleElementReferenceException e) {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e1) {

				}
			} catch (NoSuchElementException e) {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e1) {
				}
				System.out.println("Element is not found in attempts: " + (attempts+1));
			}
			attempts++;
		}

		return element;

	}
	
	public static List<WebElement> waitForElementWithFluentWait(By locator, int timeOut, int pollingTime)
	{
		Wait<WebDriver> wait =  new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(timeOut))
				.pollingEvery(Duration.ofSeconds(pollingTime))
				.ignoring(NoSuchElementException.class)
				.ignoring(StaleElementReferenceException.class);
		
				return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
	}
	
	

}
