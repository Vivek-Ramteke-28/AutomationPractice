package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\VivekRamteke\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

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

}
