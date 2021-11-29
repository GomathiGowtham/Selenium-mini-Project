package com.sele;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Table {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\god\\eclipse-workspace\\Testing\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		driver.manage().window().maximize();
		
		System.out.println("-----------Header Data--------");
		List<WebElement> header_data = driver.findElements(By.xpath("//table/thead"));
		for (WebElement header : header_data) {
			String text = header.getText();
			System.out.println(text);
			
		}
		
		System.out.println("-----------All Data--------");
		List<WebElement> all_data = driver.findElements(By.xpath("//table/tbody/tr/td"));
		
		for (WebElement webElement : all_data) {
			String text = webElement.getText();
			System.out.println(text);
		}
		System.out.println("----------Row Data----------------");
		List<WebElement> row_data = driver.findElements(By.xpath("//table/tbody//tr[3]/td"));
		for (WebElement row : row_data) {
			System.out.println(row.getText());
		}
		System.out.println("----------Coloumn Data-------------");
		List<WebElement> coloumn_data = driver.findElements(By.xpath("//table/tbody/tr/td[3]"));
		for (WebElement coloumn : coloumn_data) {
			System.out.println(coloumn.getText());
		}
		System.out.println("-------------Particular Data------------");
	    WebElement particular_data = driver.findElement(By.xpath("//table/tbody/tr[4]/td[2]"));	
	    System.out.println(particular_data.getText());
	}

}
