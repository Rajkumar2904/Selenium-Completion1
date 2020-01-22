package org.winhandles;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\Selenium Completion1\\div\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
	
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone");
	
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	driver.findElement(By.xpath("//a[@class='_2cLu-l']")).click();
	
	//To get parent Window ID
	String parentwin = driver.getWindowHandle();
	System.out.println(parentwin);
	
	//To get All windows ID
	Set<String> allwindows = driver.getWindowHandles();
	System.out.println(allwindows);
	

	for (String x : allwindows) {
		if (parentwin.equals(x)) {
			System.out.println("ChildWindow:"+x);
			driver.switchTo().window(x);
		}
		
	}
	
	//driver.switchTo().window(parentwin);
	//driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("638011");

}
 	
}
