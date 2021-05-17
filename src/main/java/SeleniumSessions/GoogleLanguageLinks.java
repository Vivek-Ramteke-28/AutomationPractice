package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleLanguageLinks {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");

		// get the text of each link
		// click on each link one by one
		// come back
		// and click on next link

		List<WebElement> lanList = driver.findElements(By.xpath("//div[@id='SIvCob']//a"));

		System.out.println("Total language list count ::: " + lanList.size());

		for (WebElement e : lanList) {
			String text = e.getText();
			System.out.println(text);
			
			if(text.equals("मराठी")) {
				e.click();
				break;
			}
			
		}

	}

}
