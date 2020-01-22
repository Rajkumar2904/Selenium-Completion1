package org.baseclass;


import java.util.List;
import java.awt.Robot;
import java.io.File;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartExe {
    public static WebDriver driver;
   
    public static TakesScreenshot tk;
    
    public static Actions a;
    
    public static Robot r;
    
    public static String parent;  
   
    
    
    public static void launch(String a) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\Selenium Completion1\\div\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to(a);
    }
	
	public static void setWait() {
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	public static void klik(WebElement b) {
		b.click();
	}
	
	public static void input(WebElement c, String d) {
		c.sendKeys(d);
	}
	
	public static void allwindows() {
		parent=driver.getWindowHandle();
		Set<String> allwin = driver.getWindowHandles();
		for (String x : allwin) {
			if (x!=parent) {
				driver.switchTo().window(x);
			}
		}
	}
	
	public static void multiwindows(int i) {
		Set<String> allwin2 = driver.getWindowHandles();
		List<String> li=new ArrayList<String>();
		li.addAll(allwin2);
		String swit = li.get(i);
		driver.switchTo().window(swit);
		
	}
	
    public static void capture(String s) throws Exception {
    	TakesScreenshot tk=(TakesScreenshot)driver;
    	 File src1 = tk.getScreenshotAs(OutputType.FILE);
    	 File des=new File(s);
    	 FileUtils.copyFile(src1, des);
	}
	
    public static void swich(String x) {
   
		driver.switchTo().window(x);
	}
	
	public static void dblClick(WebElement h) {
		a=new Actions(driver);
		a.doubleClick(h).perform();
	}
	
	public static void keyPres(int h, int j) throws Exception {
		r=new Robot();
		for (int i = 0; i < j ; i++) {
			r.keyPress(h);
			r.keyRelease(h);
		}
	}
	
	public static void scrollDown(WebElement k) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", k);
	}
	
	public static void slep() throws Exception {
		Thread.sleep(3000);
	}
	
	public static void kill() {
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
