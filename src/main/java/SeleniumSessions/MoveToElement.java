package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElement {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("http://mrbool.com/search/?txtsearch=how-to-create-menu-with-submenu-using-css-html");

		Thread.sleep(5000);

		Actions action = new Actions(driver);

		driver.findElement(By.xpath("//a[@class='menulink']"));

		action.moveToElement(driver.findElement(By.xpath("//a[@class='menulink']"))).build().perform();

		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(text(),'Courses')]")).click();
	}

}
