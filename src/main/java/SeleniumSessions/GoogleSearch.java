package SeleniumSessions;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		
		driver.get("http://www.google.com");
		
		driver.findElement(By.name("q")).sendKeys("naveen automation lab");
		Thread.sleep(5000);
		
		List<WebElement> optionList = driver.findElements(By.xpath("//ul[@class='erkvQe']//li//div[@class='sbl1']//span"));
		

		System.out.println(optionList.size());
		
		
		for(WebElement e : optionList)

	{
			
		String text = e.getText();
		System.out.println(text);
		
		if(text.contains("linkedin"))
		{
			e.click();
			break;
		}
	}
		}

}
