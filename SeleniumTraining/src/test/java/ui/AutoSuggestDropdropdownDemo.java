package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestDropdropdownDemo {
	public static String browser = "edge";
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com");
		driver.manage().window().maximize();

		driver.findElement(By.className("commonModal__close")).click();

		driver.findElement(By.xpath("//span[text()='From']")).click();
		//driver.findElement(By.xpath("//span[text()='From']")).click();
		Thread.sleep(2000);
		WebElement from1 = driver.findElement(By.xpath("//input[@placeholder='From']"));

		Thread.sleep(2000);
		from1.sendKeys("Sydney");
		Thread.sleep(2000);
		from1.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		from1.sendKeys(Keys.ENTER);
		Thread.sleep(2000);

	}

}
