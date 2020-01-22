package org.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class A {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\HP\\eclipse-workspace\\Selenium Completion1\\div\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("http://www.greenstechnologys.com/index.html");
		driver.findElement(By.cssSelector(".dropdown > li:nth-child(5) > a:nth-child(1)")).click();
		WebElement move1 = driver.findElement(By.cssSelector(".activeLink"));
		Actions a=new Actions(driver);
		a.moveToElement(move1).perform();
		Thread.sleep(2500);
		WebElement move2 = driver.findElement(By.cssSelector(".dropdown > li:nth-child(3) > ul:nth-child(2) > li:nth-child(3) > a:nth-child(1) > span:nth-child(1)"));
		a.moveToElement(move2).perform();
		String text = move2.getText();
		System.out.println(text);
		boolean endsWith = text.endsWith("i");
		if (endsWith) {
			System.out.println("Element name is displayed");
		}
		else {
		System.out.println("Element not ends with G");	
		}

	}

}
