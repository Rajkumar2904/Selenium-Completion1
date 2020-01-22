package org.webtable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table4 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Selenium Completion1\\div\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://www.toolsqa.com/automation-practice-table/");
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().deleteAllCookies();
	
	List<WebElement> allrow = driver.findElements(By.tagName("tr"));
	System.out.println("Size of the Rows:"+allrow.size());
	for (int r = 0; r < allrow.size(); r++) {
		if (r%2!=0) {
		WebElement eachrow = allrow.get(r);
		//System.out.println(eachrow.getText());
		List<WebElement> alldata = eachrow.findElements(By.tagName("td"));
		for (int i = 0; i < alldata.size(); i++) {
			WebElement eachdata = alldata.get(i);
			System.out.println(eachdata.getText());
		}
		}
	}
	driver.quit();
}
}
