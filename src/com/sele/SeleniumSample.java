package com.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumSample {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\god\\eclipse-workspace\\Testing\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
//	driver.get("https://www.facebook.com/");
//		driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div/div[2]/div/div/form/div/div/input")).sendKeys("selenaaarogi@gmail.com");
//driver.findElement(By.xpath("//div[@id='content']/div/div/div/div/div/div/form/div/div/div/input")).sendKeys("kiara*2selena");
//driver.findElement(By.xpath("((//div[@id='globalContainer']/div/div/div/div[1]/div/div)[2]/div/form/div)[2]/button")).click();
		
		//	driver.get("https://www.youtube.com/");
//	driver.manage().window().maximize();
//	String s = driver.getTitle();
//	System.out.println(s);
//	String curl = driver.getCurrentUrl();
//	
//	System.out.println(curl);
//	driver.navigate().to("https://www.youtube.com/");
//	driver.navigate().back();
//	driver.navigate().forward();
//	driver.navigate().refresh();
//	driver.close();
	driver.get("https://www.amazon.in/");
//	driver.manage().window().maximize();
//	Thread.sleep(6000);
driver.findElement(By.xpath("//div[@id='navbar']/div[5]/div[2]/div/div/a")).click();
driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div[2]/div/section/div/div/div[2]/div[2]/div/ol/li/a/img")).click();
	
		
	}

}
