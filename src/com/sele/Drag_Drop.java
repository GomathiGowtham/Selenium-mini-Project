package com.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\god\\eclipse-workspace\\Testing\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Static.html");
	driver.manage().window().maximize();
	Actions ac = new Actions(driver);
	WebElement drag1 = driver.findElement(By.id("dragarea"));
	WebElement drop1 = driver.findElement(By.id("droparea"));
    
    ac.dragAndDrop(drag1, drop1).build().perform();
    Thread.sleep(5000);
    
    driver.get("http://www.leafground.com/pages/drop.html");
    WebElement drag2 = driver.findElement(By.id("draggable"));
	WebElement drop2 = driver.findElement(By.id("droppable"));
    ac.dragAndDrop(drag2, drop2).build().perform();
    
    
   
}
}
