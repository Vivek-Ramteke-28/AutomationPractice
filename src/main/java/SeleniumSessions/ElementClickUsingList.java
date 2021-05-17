package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementClickUsingList {

	static WebDriver driver;
	public static void main(String[] args) {
	
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.freshworks.com/");
		
		By footerLinks = By.xpath("//ul[@class='footer-nav']//li//a");
		
//		List<WebElement> list = driver.findElements(By.xpath("//ul[@class='footer-nav']//li//a"));
//		
//		for(int i = 0; i<list.size(); i++)
//		{
//			String text = list.get(i).getText();
//			if(text.equals("GDPR"))
//			{
//				list.get(i).click();
//				break;
//			}
//			
//		}
		
		doClickFromList(footerLinks, "GDPR");
		
		

	}

	
	
	
	public static void doClickFromList(By locator, String linkText) {
		List<WebElement> list = getElements(locator);

		for (int i = 0; i < list.size(); i++) {
			String text = list.get(i).getText();
			if (text.equals(linkText)) {
				list.get(i).click();
				break;
			}

		}
	}




	private static List<WebElement> getElements(By locator) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
	
	public static void doActionSendKeys(By locator, String value)
	{
		Actions action  = new Actions(driver);
		action.sendKeys(getElement(locator), value).perform();
	}
	
	
	public static void doActionClick(By locator)
	{
		Actions action  = new Actions(driver);
		action.click(getElement(locator)).perform();
	}
	
	
}
