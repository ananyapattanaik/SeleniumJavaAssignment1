package com.assignment1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CaseStudy3 {
	int linkCount;
	List<WebElement> list;
	
	WebDriver driver;
	String url = "https://www.easycalculation.com/index.php";

	@BeforeTest
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(url);
	}

	@Test
	public void countAndPrintLink() throws Exception {
		driver.findElement(By.xpath("//a[normalize-space()='Calculators']")).click();
		
		list = driver.findElements(By.tagName("a"));
		System.out.println("Number of links:" + list.size());

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getText());
		}
		Thread.sleep(3000);
		
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
