package com.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dynamic_Xpath {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\god\\eclipse-workspace\\Testing\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
//		Thread.sleep(5000);
//		WebElement path1 = driver.findElement(By.xpath("//h2[contains(text(),'Revamp')]//following::img[@alt='Home products']"));
//		path1.click();
		
//		Thread.sleep(3000);
//		WebElement alexa = driver.findElement(By.xpath("(//h2[contains(text(),'Revamp')]//preceding::img)[7]"));
//	    WebDriverWait wait = new WebDriverWait(driver,180);
//	    wait.until(ExpectedConditions.visibilityOf(alexa));
//	    alexa.click();
		
		Thread.sleep(8000);
		driver.findElement(By.xpath("(//div[@id='desktop-grid-5']//following-sibling::div)[7]")).click();
	    
	}

}
