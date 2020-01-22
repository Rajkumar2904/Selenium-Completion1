package org.locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class B {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\HP\\eclipse-workspace\\Selenium Completion1\\div\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.navigate().to("http://seleniumpractise.blogspot.com/");
		
		//This wont work after the page is completely loaded
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		//This wont work after the cursor has been found
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.cssSelector("#post-body-9011060868494634961 > button:nth-child(2)")).click();
		
		//This command is used in order to wait until the web element shows
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.alertIsPresent());
		
		driver.switchTo().alert().accept();

	}

}
