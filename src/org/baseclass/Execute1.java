package org.baseclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Execute1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", );
	WebDriver driver=new ChromeDriver();
	driver.get();
	//System.out.println(driver.getCurrentUrl());
	driver.findElement(By.id("email")).sendKeys("Rajkumar15112");
	driver.findElement(By.id("pass")).sendKeys("123455");
	driver.findElement(By.id("loginbutton")).click();
	//System.out.println(driver.getTitle());
	driver.quit();
	
	
	
}
}
