package org.webtable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table2 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Selenium Completion1\\div\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://www.toolsqa.com/automation-practice-table/");
	
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().deleteAllCookies();
	
	List<WebElement> allrows = driver.findElements(By.tagName("tr"));
	for (WebElement w : allrows) {
		List<WebElement> alldata = w.findElements(By.tagName("td"));
		for (WebElement we : alldata) {
			System.out.println(we.getText());
		}
		
	}
}
}
