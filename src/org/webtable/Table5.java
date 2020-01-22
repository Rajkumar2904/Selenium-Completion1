package org.webtable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table5 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Selenium Completion1\\div\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://www.toolsqa.com/automation-practice-table/");
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().deleteAllCookies();
	
	List<WebElement> allrow = driver.findElements(By.tagName("tr"));
	for (int i = allrow.size()-1; i < allrow.size(); i++) {
		WebElement eachrow = allrow.get(i);
		List<WebElement> alldata = eachrow.findElements(By.tagName("td"));
		for (int j = 0; j < alldata.size(); j++) {
			WebElement eachdata = alldata.get(j);
			System.out.println(eachdata.getText());
		}
		
	driver.quit();		
		
	}
}
}
