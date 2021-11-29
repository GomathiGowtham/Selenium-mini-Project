package auto.testing;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoAutomation { 
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\god\\eclipse-workspace\\Testing\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.xpath("//a[@class='login']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("selenaaarogi@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("Kiara*2selena");
		driver.findElement(By.id("SubmitLogin")).click();
		
		driver.findElement(By.xpath("(//a[text()='T-shirts'])[2]")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.manage().timeouts().implicitlyWait(90,TimeUnit.SECONDS);
		WebElement tshirt = driver.findElement(By.xpath("//img[contains(@title,'Faded ')]"));
		js.executeScript("arguments[0].scrollIntoView()", tshirt);
		
		WebElement Qview = driver.findElement(By.xpath("//span[text()='Quick view']"));
		Actions ac = new Actions(driver);
		ac.moveToElement(tshirt).build().perform();
		
		WebDriverWait wait = new WebDriverWait(driver,90);
		wait.until(ExpectedConditions.visibilityOf(Qview));
		ac.moveToElement(Qview).build().perform();
		ac.click(Qview).build().perform();
		
		Thread.sleep(5000);
		WebElement addcart = driver.findElement(By.xpath("//iframe[@vspace='0']"));
		driver.switchTo().frame(addcart);
		Thread.sleep(5000);
		WebElement cartclick = driver.findElement(By.xpath("//button[@name='Submit']"));
	    ac.moveToElement(cartclick).build().perform();
	    ac.click(cartclick).build().perform();
	    
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='layer_cart']/div/div[2]/div[4]/a/span")));
		WebElement proceedclick = driver.findElement(By.xpath("//div[@id='layer_cart']/div/div[2]/div[4]/a/span"));
        ac.moveToElement(proceedclick).build().perform();
        ac.click(proceedclick).build().perform();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@id='center_column']/p[2]/a/span")).click();
	    
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@id='center_column']/form/p/button/span")).click();
	    
        Thread.sleep(3000);
        WebElement proceedaddress = driver.findElement(By.id("cgv"));
	    proceedaddress.click();
	    
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//form[@id='form']/p/button/span")).click();
	    
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//div[@id='HOOK_PAYMENT']/div[2]/div/p/a")).click();
	
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//div[@id='center_column']/form/p/button/span")).click();
	    Thread.sleep(3000);
	    WebElement laststep = driver.findElement(By.xpath("//div[@id='center_column']/ul/li[4]/a"));
	    js.executeScript("arguments[0].scrollIntoView()", laststep);
	    
	    Thread.sleep(6000);
	    TakesScreenshot ts = (TakesScreenshot) driver;
	    File source = ts.getScreenshotAs(OutputType.FILE);
	    File destination = new File("C:\\Users\\god\\eclipse-workspace\\Testing\\screenshot\\pic2.png");
	    FileUtils.copyFile(source, destination);
	    
	}

}
