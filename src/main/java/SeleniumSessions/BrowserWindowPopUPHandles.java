package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowPopUPHandles {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.google.com");

		Set<String> handles = driver.getWindowHandles();

		Iterator<String> it = handles.iterator();

		String parentID = it.next();
		String childID = it.next();

		driver.switchTo().window(childID);
		driver.close();
		driver.switchTo().window(parentID);

	}

}
