package com.sele;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Sample {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\god\\eclipse-workspace\\Testing\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.leafground.com/pages/Alert.html");
	
    driver.findElement(By.xpath("//button[@onclick='normalAlert()']")).click();	
	Alert simplealert = driver.switchTo().alert();
	Thread.sleep(3000);
	simplealert.accept();
	
	driver.findElement(By.xpath("//button[@onclick='confirmAlert()']")).click();
	Alert confirmalert = driver.switchTo().alert();
	Thread.sleep(3000);
	confirmalert.dismiss();
	
	driver.findElement(By.xpath("//button[@onclick='confirmPrompt()']")).click();
	Alert promptalert = driver.switchTo().alert();
	Thread.sleep(3000);
	promptalert.sendKeys("hi");
	promptalert.accept();
			
	
	
}
}