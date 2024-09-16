package ui;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OneWayCalendar {
	private static WebDriver driver;
	private static String browser = "chrome";
	private static String baseUrl = "https://jqueryui.com/datepicker/";

	public static void main(String[] args) throws InterruptedException {
    OneWayCalendar c=new OneWayCalendar();
    c.setUp();
    c.test1();
    c.tearDown();
    
	}

	@BeforeMethod
	public void setUp() {
		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			driver.get(baseUrl);
			driver.manage().window().maximize();
		}
		if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
			driver.get(baseUrl);
		}

	}

	@Test
	public void test1() throws InterruptedException {
		String expectedDay = "9";
		String expectedMonth = "January";
		String expectedYear = "2025";
		Thread.sleep(2000);
		
		driver.switchTo().frame(0);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		while (true) {
			String month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			Thread.sleep(2000);
			String year = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			Thread.sleep(2000);
			if (month.equals(expectedMonth) && year.equals(expectedYear)) {
				List<WebElement> daylist = driver.findElements(By.xpath("//table/tbody/tr/td"));
				Thread.sleep(2000);
				for (WebElement e : daylist) {
					String day = e.getText();
					if (day.equals(expectedDay)) {
						e.click();
						break;
					}
				}
				break;
			}
			else {
				Thread.sleep(2000);
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			}
		}
	}
	@AfterMethod
	public void tearDown() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
	}
}
