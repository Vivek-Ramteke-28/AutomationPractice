package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtil {

	WebDriver driver;

	/**
	 * 
	 * @param browserName
	 * @return this return driver
	 */
	public WebDriver init_driver(String browserName) {

		if (browserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserName.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else {
			System.out.println("Please pass correct browser :: " + browserName);
		}
		return driver;
	}

	/**
	 * This is used to launch the url
	 * 
	 * @param url
	 */
	public void launchUrl(String url) {
		System.out.println("URL = " + url);
		driver.get(url);
	}

	public void navigateToUrl(String url) {
		System.out.println("URL  =" + url);
		driver.navigate().to(url);
	}

	/**
	 * 
	 * @return page title
	 */
	public String getPageTitle() {
		return driver.getTitle();
	}

	public void quitBrowser() {
		driver.quit();
	}

	public void closeBrowser() {
		driver.close();
	}

}
