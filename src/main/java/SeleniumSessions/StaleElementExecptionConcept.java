package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaleElementExecptionConcept {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");

		// Previous elemeent i.e. V1
		WebElement url_ele = driver.findElement(By.id("Form_submitForm_subdomain")); // V1

		url_ele.sendKeys("VivekAutomationTesting.com");

		driver.navigate().refresh();
		// New elemeent i.e. V2
		url_ele = driver.findElement(By.id("Form_submitForm_subdomain")); // V2
		url_ele.sendKeys("VivekAutomationTesting.com");
	}

}
