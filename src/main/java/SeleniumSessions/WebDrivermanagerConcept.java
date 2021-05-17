package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDrivermanagerConcept {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
//		WebDriverManager.firefoxdriver().setup();
//		FirefoxDriver driver = new FirefoxDriver();

		driver.get("http://www.google.com"); // launch url

		String title = driver.getTitle(); // get the page title
		System.out.println("Title of page : " + title);

		// Verification point
		if (title.equals("Google")) {
			System.out.println("Title is correct");
		} else {
			System.out.println("Title is incorrect");
		}

		System.out.println(driver.getCurrentUrl());
		if (driver.getCurrentUrl().contains("google")) {
			System.out.println("Correct URL");
		} else {
			System.out.println("Incorrect URL");
		}
		driver.quit();
	}
}