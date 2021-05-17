package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleAlertPopUp {

	public static void main(String[] args) throws InterruptedException {
	
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver  = new ChromeDriver();
		
		// JS alerts --- alerts
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		
		driver.findElement(By.name("proceed")).click();
		
		Thread.sleep(4000);
		
		
		Alert alert = driver.switchTo().alert();
		
		String text = alert.getText();
		System.out.println(text);
		
		if(text.equals("Please enter a valid user name"))
		{
			System.out.println("Correct text");
		}
		alert.accept(); // click on OK
		//alert.dismiss(); // cancel the alert-- ESC button from keyboard
		

		driver.switchTo().defaultContent();
	}

}
