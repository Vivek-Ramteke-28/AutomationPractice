package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalImages {

	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");

//		List<WebElement> imageList = driver.findElements(By.tagName("img"));
//
//		System.out.println("Total images " + imageList.size());
//
//		for (WebElement e : imageList) {
//			String src = e.getAttribute("src");
//			System.out.println(src);}
		
		
		System.out.println("Toatl images :: " + getElementCount("img"));
		System.out.println("Toatl images :: " + getElementCount("a"));

		
		
		List<String> srcList = getAttributeList("img", "src");
		for(String s: srcList) {
		System.out.println(s);
		}
		
		System.out.println("--------------------");
		
		List<String> hrefList = getAttributeList("a", "href");
		for(String s: hrefList) {
		System.out.println(s);
		}
	}

	public static int getElementCount(String tagName) {
		return driver.findElements(By.tagName(tagName)).size();

	}

	public static List<String> getAttributeList(String tagName, String attributeName) {

		List<String> attributeList = new ArrayList<String>();

		List<WebElement> elementList = driver.findElements(By.tagName(tagName));
		for (WebElement e : elementList) {
			String text = e.getAttribute(attributeName);
			attributeList.add(text);
		}
		return attributeList;
	}

}
