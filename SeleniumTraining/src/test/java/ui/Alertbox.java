package ui;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertbox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		  driver.get(
		  "https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		  
		  driver.manage().window().maximize(); WebElement frame1 =
		  driver.findElement(By.id("iframeResult")); driver.switchTo().frame(frame1);
		  driver.findElement(By.xpath("/html/body/button")).click();
		  
		  String alerttext = driver.switchTo().alert().getText();
		  System.out.println(alerttext); driver.switchTo().alert().accept();
		 		
		
		//driver.switchTo().parentFrame();
		//System.out.println(driver.getTitle());
		
		
		
		
		//for sendkeys methode in alert
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		driver.manage().window().maximize();
		
		
		/*
		 * WebElement frame1 = driver.findElement(By.id("iframeResult"));
		 * driver.switchTo().frame(frame1);
		 * driver.findElement(By.xpath("/html/body/button")).click();
		 * Thread.sleep(2000); Alert alertonpage=driver.switchTo().alert();
		 * alertonpage.sendKeys("RCV Academy"); alertonpage.accept();
		 * driver.switchTo().parentFrame(); System.out.println(driver.getTitle());
		 */

	}

}
