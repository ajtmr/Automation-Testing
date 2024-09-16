package ui;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
	public static String browser = "chrome";
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.ebay.com.au");
		driver.manage().window().maximize();

		WebElement element = driver.findElement(By.xpath("//*[@id='vl-flyout-nav']/ul/li[4]"));
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//*[@id='vl-flyout-nav']/ul/li[4]/div[2]/div[1]/nav[2]/ul/li[3]/a"))).click();
		
		
		
		
		

				
	}

}
