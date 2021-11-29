package com.sele;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Single_Dropdown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\god\\eclipse-workspace\\Testing\\Driver\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.facebook.com/");
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.name("firstname")).sendKeys("kiara");
		
		driver.findElement(By.name("lastname")).sendKeys("G");
		
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("abc@gmail.com");
		
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("12345");
		
		WebElement date = driver.findElement(By.id("day"));
		
		Select s1 = new Select(date);
		
		s1.selectByVisibleText("21");
		
		WebElement month = driver.findElement(By.id("month"));
		
		Select s2 = new Select(month);
		
		s2.selectByIndex(2);
		
		WebElement year = driver.findElement(By.id("year"));
		
		Select s3 = new Select(year);
		
		s3.selectByVisibleText("1994");
		
		boolean multi = s2.isMultiple();
	
	System.out.println("is multiple or not :" +multi);
	List<WebElement> opt = s2.getOptions();
	
	for (WebElement webElement : opt) {
		
		String text = webElement.getText();
		System.out.println(text);
		
	}
	
	
	}

}
