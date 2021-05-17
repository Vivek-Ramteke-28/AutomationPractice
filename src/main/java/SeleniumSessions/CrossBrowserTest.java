package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserTest {
	static WebDriver driver;

	public static void main(String[] args) {

		String browser = "ie";

		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}

		else if (browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browser.equals("opera")) {
			WebDriverManager.operadriver().setup();
			driver = new OperaDriver();
		} else {
			System.out.println("Please pass the correct browser....");
		}

		try {
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
		if (driver.getCurrentUrl().contains("Google")) {
			System.out.println("Correct URL");
		} else {
			System.out.println("Incorrect URL");
		}

		driver.quit();
		}
		catch (NullPointerException e) {
			e.printStackTrace();
		}
	}

}
