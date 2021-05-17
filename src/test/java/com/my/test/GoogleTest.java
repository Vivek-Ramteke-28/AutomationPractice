package com.my.test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest{
	WebDriver driver;

	public static String TITLE = "Google";


	@Test(priority = 1)
	public void googleTitleTest() {
		driver.get("https://www.google.com/");
		String title = driver.getTitle();
		System.out.println("Title is::: " + title);
		Assert.assertEquals(title, GoogleTest.TITLE);

	}

	@Test(priority = 2)
	public void googleUrlTest() {
		driver.get("https://www.google.com/");
		String url = driver.getCurrentUrl();
		System.out.println("Page url is :::" + url);
		Assert.assertTrue(url.contains("google"));
	}


}
