package com.assignment1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CaseStudy5 {
	WebDriver driver;
	String url = "http://automationpractice.com/index.php";

	@BeforeTest
	public void setUp() {
		driver = new ChromeDriver();
		driver.navigate().to(url);
		driver.manage().window().maximize();
	}

	@Test
	public void practiceTest() throws Exception {
		String title = driver.getTitle();
		int len = title.length();
		System.out.println(title);
		System.out.println("Title length:" + len);
		
		String currentURL = driver.getCurrentUrl();
		System.out.println("Current URL: " + currentURL);
		if (currentURL.equals("http://automationpractice.com/index.php")) {
        System.out.println("User is on the correct page");
        } else {
        System.out.println("User is NOT on the correct page");
        }

		String pageSource = driver.getPageSource();
		int length = pageSource.length();
		System.out.println("Length is :" + length);
		
		List<WebElement> totalLinks = driver.findElements(By.tagName("a"));
		System.out.println("Total Links : " + totalLinks.size());
		for (var link : totalLinks)
		System.out.println(link.getText());
		Thread.sleep(2000);
	}

	@AfterTest
	public void close() {
		driver.quit();
	}

}



