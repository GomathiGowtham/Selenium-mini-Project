package com.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frame_Test {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\god\\eclipse-workspace\\Testing\\Driver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("http://demo.automationtesting.in/Frames.html");
	    driver.manage().window().maximize();
	    
	    driver.switchTo().frame("singleframe");
	    driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Single Frame");
	    driver.switchTo().defaultContent();
	    
	   	driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
	   	WebElement outerframe = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
	   	driver.switchTo().frame(outerframe);
	   	WebElement innerframe = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html'][1]"));
	   	driver.switchTo().frame(innerframe);
	   	driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("MultiFrame");
	   	driver.switchTo().defaultContent();
	   	
	   	WebElement video = driver.findElement(By.xpath("//a[text()='Video']"));
        Actions ac = new Actions(driver);
        ac.moveToElement(video).build().perform();
        WebElement youtube = driver.findElement(By.xpath("//a[text()='Youtube']"));
        ac.click(youtube).build().perform();
	   	
	   	
	   	
	}

}
