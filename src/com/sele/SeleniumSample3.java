package com.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumSample3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\god\\eclipse-workspace\\Testing\\Driver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.instagram.com/");
	    driver.manage().window().maximize();
	    Thread.sleep(3000);
	    WebElement user = driver.findElement(By.name("username"));
	    user.sendKeys("selenaaarogi@gmail.com");
	    WebElement pass = driver.findElement(By.xpath("(//input[@autocorrect='off'])[2]"));
	    pass.sendKeys("kiara*2selena");
	    driver.findElement(By.xpath("//div[text()='Log In']")).click();
	    
}

}
