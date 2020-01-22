package org.baseclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class B1 {
	static WebDriver driver;
public static void set() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\Selenium Completion1\\div\\chromedriver.exe");
	
}
public static void drive() {
	driver=new ChromeDriver();
}
public static void url(String r) {
	driver.get(r);
}
public static void input(String a, String b) {
	driver.findElement(By.id(a)).sendKeys(b);
}
public static void clik(String c) {
	driver.findElement(By.id(c)).click();
}
public static void quit() {
	driver.quit();
}
}
