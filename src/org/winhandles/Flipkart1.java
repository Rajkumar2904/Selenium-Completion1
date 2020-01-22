package org.winhandles;

import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.baseclass.FlipkartExe;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart1 extends FlipkartExe {
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
	
	
	String pwin = driver.getWindowHandle();
	
	Set<String> allwin = driver.getWindowHandles();
	
	for (String x : allwin) {
		driver.switchTo().window(x);
	}
	
	driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("638011");
	

}
}
