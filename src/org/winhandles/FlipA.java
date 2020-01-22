package org.winhandles;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipA {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\Selenium Completion1\\div\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	

	driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
	
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone");
	
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	driver.findElement(By.xpath("//a[@class='_2cLu-l']")).click();
	
	String parent = driver.getWindowHandle();
	
	Set<String> Child = driver.getWindowHandles();
	
	for (String x : Child) {
		if (x!=parent) {
			driver.switchTo().window(x);
		}
	}
	
	driver.findElement(By.xpath("//button[@type='button']")).click();
	
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("9788289903");
	
	driver.findElement(By.xpath("//span[text()='CONTINUE']")).click();
	
	Thread.sleep(3000);
	
	driver.quit();
	
}
}
