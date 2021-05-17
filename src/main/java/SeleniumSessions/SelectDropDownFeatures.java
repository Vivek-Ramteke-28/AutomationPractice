package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDownFeatures {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");

		By industry = By.id("Form_submitForm_Industry");
		By country = By.id("Form_submitForm_Country");
		
		
		List<String> industryList = doGetDropDownOption(industry);
		
		
		
		System.out.println("Total number of industry:: " + industryList.size());
		
		System.out.println(industryList);
		
		
		
//		Select select_industry = new Select(driver.findElement(industry));
//		List<WebElement> industryOptionList = select_industry.getOptions();
//
//		System.out.println(industryOptionList.size());
//
////		for(int i = 0; i<industryOptionList.size();i++)
////		{
////			String text  = industryOptionList.get(i).getText();
////			System.out.println(text);
////		}
//
//		for (WebElement e : industryOptionList) {
//			System.out.println(e.getText());
//		}

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static List<String> doGetDropDownOption(By locator) {

		List<String> optionValueList = new ArrayList<String>();
		Select select = new Select(getElement(locator));
		List<WebElement> optionList = select.getOptions();

		for (WebElement e : optionList) {
			optionValueList.add(e.getText());
		}
		return optionValueList;
	}

}
