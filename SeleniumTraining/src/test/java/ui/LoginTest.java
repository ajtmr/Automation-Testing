package ui;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LoginTest {
	public static String browser = "edge";
	public static WebDriver driver;

	public static void main(String[] args) {
		if (browser.equals("Firefox")) {
			driver = new FirefoxDriver();
		} else if (browser.equals("chrome"))

		{
			driver = new ChromeDriver();
		} else if (browser.equals("edge")) {
			driver = new EdgeDriver();
		}

		driver.get("http://www.saucedemo.com");
		driver.manage().window().maximize();
		String getUrl = driver.getCurrentUrl();
		System.out.println(getUrl);
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		String title = driver.getTitle();
		System.out.println(title);

		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();

		List<WebElement> list = driver.findElements(By.xpath("//div[@class='inventory_list']/div"));
		System.out.println(list);

		driver.navigate().to("https://www.sugarcrm.com/au/request-demo/");
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
		driver.findElement(By.xpath("//*[@id=\"CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"menu-item-22135\"]/a/span[1]")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);

		driver.quit();

//		driver.findElement(By.id("password")).sendKeys("secret_sauce");
//		driver.findElement(By.id("login-button")).click();
//		driver.close();

	}

}
