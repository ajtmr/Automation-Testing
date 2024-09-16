package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardEvent {
	public static String browser = "chrome";
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://extendsclass.com/text-compare.html");
		driver.manage().window().maximize();
		WebElement sourcetextarea = driver.findElement(By.xpath("//*[@id=\"dropZone\"]//div[5]/pre/span"));
		Actions action = new Actions(driver);
		Thread.sleep(2000);
		action.keyDown(sourcetextarea, Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
		WebElement designation = driver.findElement(By.xpath("//*[@id=\"dropZone2\"]//div[5]/div[4]/pre/span"));
		Thread.sleep(2000);
		action.keyDown(designation, Keys.CONTROL).sendKeys("a").sendKeys("v").build().perform();
	}

}
