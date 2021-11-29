package com.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;




public class Robot_Test {
	public static void  main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\god\\eclipse-workspace\\Testing\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
    	driver.get("http://www.leafground.com/");
		WebElement images = driver.findElement(By.xpath("//img[@alt='Images']"));
		Actions ac = new Actions(driver);
		ac.moveToElement(images).build().perform();
		ac.contextClick(images).build().perform();
		
		
		
		
		
		
		
		
	}

}
