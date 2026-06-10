package com.assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CaseStudy1 {
	WebDriver driver;
	String url = "https://www.login.hiox.com/register?referrer=easycalculation.com";

    @BeforeTest
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to(url);
    }

    @Test
    public void register() throws Exception{
        driver.findElement(By.id("xreg_usr")).sendKeys("Ananya");
        driver.findElement(By.id("xreg_pass")).sendKeys("Ananya@2004");
        driver.findElement(By.id("xreg_confirm")).sendKeys("Ananya@2004");
        driver.findElement(By.id("xreg_cnt")).sendKeys("India");
        driver.findElement(By.id("xreg_mob")).sendKeys("9937418829");
        Thread.sleep(6000);

       
        String title = driver.getTitle();
		String source = driver.getPageSource();
		int length = driver.getPageSource().length();
		System.out.println("url : " + url);
		System.out.println("Source :" + source);
		System.out.println("Length : " + length);
		
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}