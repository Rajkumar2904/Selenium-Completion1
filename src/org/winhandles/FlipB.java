package org.winhandles;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipB {
public static void main(String[] args) throws Exception {
	//Launching:
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\Selenium Completion1\\div\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://www.flipkart.com/");
	
	//Setting page and locator Waiting:
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	//Performing Search:
	driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	//Getting Windowhandle:
	String parent = driver.getWindowHandle();
	
	//Clicking Iphone:
	driver.findElement(By.xpath("//a[@class='_2cLu-l']")).click();
	
	//Getting Windowhandles:
	Set<String> allwid = driver.getWindowHandles();
    
    //Iterating WindowHandles:
	for (String x : allwid) {
		if (x!=parent) {
			driver.switchTo().window(x);
		}
	}
    
	//TakeScreenShot
    TakesScreenshot tk=(TakesScreenshot)driver;
   
    Thread.sleep(3000);
    
    //Switching To Parent:
    driver.switchTo().window(parent);
    
    //Refreshing:
    driver.navigate().refresh();
    
    //Action Class
    Actions a=new Actions(driver);
    //DoubleClicking:
    a.doubleClick(driver.findElement(By.xpath("(//input[@type='text'])[1]"))).perform();
    
    //Robot class:
    Robot r=new Robot();
    //Keypress and Release:
    r.keyPress(KeyEvent.VK_BACK_SPACE);
    r.keyRelease(KeyEvent.VK_BACK_SPACE);
    
    //Searching OnePlus in Parent window:
    driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("oneplus");
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    driver.findElement(By.xpath("//a[text()='OnePlus 7 (Mirror Grey, 256 GB)']")).click();
    //driver.findElement(By.xpath("(//a[@class='_2cLu-l'])[1]")).click();
    
    //Iterating To Child Window:
    Set<String> allwid2 = driver.getWindowHandles();
    for (String x2 : allwid2) {
		if (x2!=parent) {
			driver.switchTo().window(x2);
		}
	}

    //Javascript Executor Creation:
    JavascriptExecutor js=(JavascriptExecutor)driver;
    
    //ScrollDownOperation:
    js.executeScript("arguments[0].scrollIntoView(true)", driver.findElement(By.xpath("//div[text()='Enter pincode for exact delivery dates/charges']")));
   
    //Finding Webelements for Address Checkbox:
    driver.findElement(By.className("_3X4tVa")).sendKeys("638011");
    driver.findElement(By.xpath("//span[text()='Check']")).click();
    
    Thread.sleep(3000);
    
    //Getting schreenshot Oneplus availablity:
    File src1 = tk.getScreenshotAs(OutputType.FILE);
    File des=new File("D:\\Screenshots\\Oneplus.png");
    FileUtils.copyFile(src1, des);
    
    //Set to List Conversion:
    Set<String> allwid3 = driver.getWindowHandles();
    List<String> li = new ArrayList<String>();
    li.addAll(allwid3);
    
    //Switching to Child Page1:
    driver.switchTo().window(li.get(1));
    
    //Finding Webelements for Address Checkbox:
    //Inorder to avoid Stale Element Exception for reusing webelements:
    WebElement pinbox = driver.findElement(By.className("_3X4tVa"));
    pinbox.sendKeys("638011");
    WebElement check = driver.findElement(By.xpath("//span[text()='Check']"));
    check.click();
    
   	Thread.sleep(2500);
    
   	//Getting Screenshot for iphone availablity:
   	File source= tk.getScreenshotAs(OutputType.FILE);
	File destination=new File("D:\\Screenshots\\iphone.png");
	FileUtils.copyFile(source, destination);
	
	driver.quit();
}
    
	
}

