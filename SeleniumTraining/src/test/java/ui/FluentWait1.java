package ui;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWait1 {
	public static String browser = "chrome";
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.ebay.com.au");
		driver.manage().window().maximize();

		WebElement element = driver.findElement(By.xpath("//*[@id='vl-flyout-nav']/ul/li[4]"));
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(10)).withMessage("RCV Academy: This is custom message")
				.ignoring(NoSuchElementException.class);

		// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//*[@id='vl-flyout-nav']/ul/li[4]/div[2]/div[1]/nav[2]/ul/li[3]/a"))).click();

	}

}
