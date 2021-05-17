package com.my.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonTestWithBM extends BaseTest{
	WebDriver driver;

	public static String TITLE = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";

	@Test(priority = 1)
	public void amazonTitleTest() {
		driver.get("https://www.amazon.com/");
		String title = driver.getTitle();
		System.out.println("Title is::: " + title);
		Assert.assertEquals(title, AmazonTest.TITLE);

	}

	@Test(priority = 2)
	public void amazonUrlTest() {
		driver.get("https://www.amazon.com/");
		String url = driver.getCurrentUrl();
		System.out.println("Page url is :::" + url);
		Assert.assertTrue(url.contains("amazon"));
	}

	@Test(priority = 3)
	public void mobileLinkPresentTest() {
		driver.get("https://www.amazon.com/");
		Assert.assertTrue(driver.findElement(By.linkText("Mobiles")).isDisplayed());
	}


}
