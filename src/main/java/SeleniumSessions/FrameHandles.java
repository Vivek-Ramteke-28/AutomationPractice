package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandles {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		// frame method is oveloaded

		// driver.switchTo().frame(2); // index

		driver.switchTo().frame("main"); // NameorID

		driver.switchTo().frame(driver.findElement(By.name("main"))); // using webElement

		String header = driver.findElement(By.xpath("/html/body/h2")).getText();
		System.out.println(header);

		driver.switchTo().defaultContent(); // return to main page

		// driver.switchTo().parentFrame(); // frame Inside frame

	}
}
