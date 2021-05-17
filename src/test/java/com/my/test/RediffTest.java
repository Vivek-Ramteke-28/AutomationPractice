package com.my.test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RediffTest extends BaseTest {
	WebDriver driver;

	public static String TITLE = "Rediff.com: News | Rediffmail | Stock Quotes | Shopping";



	@Test(priority = 1)
	public void rediffTitleTest() {
		driver.get("https://www.rediff.com/");
		String title = driver.getTitle();
		System.out.println("Title is::: " + title);
		Assert.assertEquals(title, RediffTest.TITLE);

	}

	@Test(priority = 2)
	public void rediffUrlTest() {
		driver.get("https://www.rediff.com/");
		String url = driver.getCurrentUrl();
		System.out.println("Page url is :::" + url);
		Assert.assertTrue(url.contains("rediff"));
	}



}

