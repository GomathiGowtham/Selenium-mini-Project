package com.sele;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.input.Tailer;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumSample2 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\god\\eclipse-workspace\\Testing\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("1234567");
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("gomathi@");
		boolean dis = email.isDisplayed();
		System.out.println("email is displayed or not: "  +dis);
		boolean en = pass.isEnabled();
		System.out.println("password is enabled or not: " +en);
		boolean sel = email.isSelected();
		System.out.println("email is selected or not: "+sel);
		driver.findElement(By.name("login")).click();
		
		Thread.sleep(8000);
		
		TakesScreenshot ts = (TakesScreenshot) driver; //Narrowing Type casting
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		
	    File destination = new File("C:\\Users\\god\\eclipse-workspace\\Testing\\screenshot\\pic1.png");
	    
	    FileUtils.copyFile(source, destination);
		
	}

}
