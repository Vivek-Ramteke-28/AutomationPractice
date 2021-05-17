package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementsConcept {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");

		// get the number of link on the page
		// get the text of each link
		// ignore the blank text

		List<WebElement> linklist = driver.findElements(By.tagName("a"));

		System.out.println("Total links ::: " + linklist.size());

		for (int i = 0; i < linklist.size(); i++) {
			String text = linklist.get(i).getText();
			if (!text.isEmpty()) {
				System.out.println(i + "-->" + text);
			}
		}
	}

}
