package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectClassDropDown {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		driver.manage().window().maximize();

		// dropdown -- html tag is select
		// We have to use Select

//		WebElement industry_ele = driver.findElement(By.id("Form_submitForm_Industry"));
//		WebElement country_ele = driver.findElement(By.id("Form_submitForm_Country"));
//
//		Select select = new Select(industry_ele);
//		select.selectByVisibleText("Automotive");
//
//		select.selectByIndex(8);
//
//		select.selectByValue("health");
//
//		Select select1 = new Select(country_ele);
//		select1.selectByVisibleText("India");

		
		
		By industry = By.id("Form_submitForm_Industry");
		By country = By.id("Form_submitForm_Country");

		
//		doSelectDropdownByByVisibleText(industry, "Automotive");
//		doSelectDropdownByByVisibleText(industry, "Albania");
		
		
		
		doSelectDropdownByValue(industry, "media");
		doSelectDropdownByValue(country, "Brazil");
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doSelectDropdownByVisibleText(By locator, String text) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(text);
	}

	public static void doSelectDropdownByVisibleText(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}
	
	public static void doSelectDropdownByValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}
}
