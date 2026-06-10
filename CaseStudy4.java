package com.assignment1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CaseStudy4 {
	WebDriver driver;
	String url = "https://store.webkul.com";

	@BeforeTest
	public void setUp() {
		driver = new ChromeDriver();
		driver.navigate().to(url);
		driver.manage().window().maximize();
	}

	@Test
	public void case4() throws Exception {
		List<WebElement> totalLinks = driver.findElements(By.tagName("a"));

		System.out.println("Total Links : " + totalLinks.size());

		for (var link : totalLinks)
			System.out.println(link.getText());

		String title = driver.getTitle();
		System.out.println(title);

		String pageSource = driver.getPageSource();
		int length = pageSource.length();

		System.out.println("Length is :" + length);
		Thread.sleep(2000);
	}

	@AfterTest
	public void close() {
		driver.quit();
	}

}
