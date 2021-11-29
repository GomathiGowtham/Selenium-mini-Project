package com.sele;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table2 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\god\\eclipse-workspace\\Testing\\Driver\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://letcode.in/table");
    driver.manage().window().maximize();
    
    List<WebElement> click = driver.findElements(By.xpath("//table[@id='simpletable']"));
    
    List<WebElement> allname = driver.findElements(By.xpath("(//table)[2]/tbody/tr/td[2]"));
    
    int size = allname.size();
    System.out.println("name coloum value:"+size);
    
    for (int i = 0; i <size; i++) {
    	List<WebElement> allrows = allname.get(i).findElements(By.tagName("td"));
    	
    	String text = ((WebElement) allname).getText();
    	if(text.equals("Raj")) {
    		WebElement input = allrows.get(3).findElement(By.tagName("input"));
    		input.click();
    	}
    	
		
	}
    
}
}
