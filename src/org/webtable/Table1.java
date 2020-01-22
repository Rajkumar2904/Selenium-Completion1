package org.webtable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Table1 {
	public static void main(String[] args) {
		//Static function 
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\HP\\eclipse-workspace\\Selenium Completion1\\div\\geckodriver.exe");
		//Setting up of driver interface
		WebDriver driver=new FirefoxDriver();
		//Calling the Url
		driver.navigate().to("https://www.toolsqa.com/automation-practice-table/");
		
		//Waiting until the page is fully loaded
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//Deleting the Cookies
		driver.manage().deleteAllCookies();
		
		List<WebElement> allrow = driver.findElements(By.tagName("tr"));
		for (int i = 0; i < allrow.size(); i++) {
			WebElement eachrow = allrow.get(i);
			List<WebElement> alldata = driver.findElements(By.tagName("td"));
			for (int j = 0; j < alldata.size(); j++) {
				WebElement eachdata = alldata.get(j);
				String text = eachdata.getText();
				if (text.contains("Taiwan")) {
					String text2 = eachrow.getText();
					System.out.println(text2);
		
				}
			}
			
		}
	}
}
