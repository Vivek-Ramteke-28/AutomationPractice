package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CustomeXpath_1 {

	static WebDriver driver;
	public static void main(String[] args) {

	
		
	}

	
	public static void selectContact(String name)
	{
		String checkbox_xpath = "//span[text()='"+name+"']"
				+ "//ancestor::td//preceding-sibling::td//input[@type='checkbox']//parent::span";
		
		driver.findElement(By.xpath(checkbox_xpath)).click();
	}
	
	
	
}
