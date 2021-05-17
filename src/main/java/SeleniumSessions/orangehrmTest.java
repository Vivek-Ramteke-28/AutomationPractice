package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class orangehrmTest {

	public static void main(String[] args) {
		
		BrowserUtil br = new BrowserUtil();
		WebDriver driver = br.init_driver("chrome");
		br.launchUrl("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		By firstName = By.id("Form_submitForm_FirstName");
		By lastName = By.id("Form_submitForm_LastName");
		By email = By.id("Form_submitForm_Email");
		
	
		ElementUtil eleUtil  =new ElementUtil(driver);

		eleUtil.doSendKeys(firstName, "Vivek");
		eleUtil.doSendKeys(lastName, "Ramteke");
		eleUtil.doSendKeys(email, "viv@gmail.com");
		
		
		br.closeBrowser();
	}

}
