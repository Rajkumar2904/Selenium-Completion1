package org.winhandles;

import java.awt.event.KeyEvent;
import org.baseclass.FlipkartExe;
import org.openqa.selenium.By;

public class ExecutingFlipkart extends FlipkartExe{
public static void main(String[] args) throws Exception {
	launch("https://www.flipkart.com/");
	setWait();
	klik(driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")));
	input(driver.findElement(By.xpath("//input[@type='text']")), "iphone");
	klik(driver.findElement(By.xpath("//button[@type='submit']")));
	klik(driver.findElement(By.xpath("//a[@class='_2cLu-l']")));
	String parent = driver.getWindowHandle();
	allwindows();
	slep();
	swich(parent);
	driver.switchTo().window(parent);
	dblClick(driver.findElement(By.xpath("(//input[@type='text'])[1]")));
	keyPres(KeyEvent.VK_BACK_SPACE, 1);
	input(driver.findElement(By.xpath("(//input[@type='text'])[1]")), "oneplus");
	klik(driver.findElement(By.xpath("//button[@type='submit']")));
	klik(driver.findElement(By.xpath("(//a[@class='_2cLu-l'])[1]")));
	multiwindows(2);
	dblClick(driver.findElement(By.className("_3X4tVa")));
	keyPres(KeyEvent.VK_BACK_SPACE, 1);
	input(driver.findElement(By.className("_3X4tVa")), "638011");
	klik(driver.findElement(By.xpath("//span[text()='Check']")));
	scrollDown(driver.findElement(By.xpath("//div[text()='Delivery']")));
	slep();
	//capture("D:\\Screenshots\\oneplus.png");
	multiwindows(1);
	dblClick(driver.findElement(By.className("_3X4tVa")));
	keyPres(KeyEvent.VK_BACK_SPACE, 1);
	input(driver.findElement(By.className("_3X4tVa")), "638011");
	klik(driver.findElement(By.xpath("//span[text()='Check']")));
	scrollDown(driver.findElement(By.xpath("//div[text()='Highlights']")));
	slep();
	//capture("D:\\Screenshots\\iphone.png");
	kill();
	
	
	
}
}
