package ui;

import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableDemo {
	public static String browser = "chrome";
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.asx.com.au/markets/trade-our-cash-market/equity-market-prices");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='onetrust-accept-btn-handler']")).click();

		List<WebElement> rowElements = driver
				.findElements(By.xpath("//*[@id='home_top_twenty']/div/div[1]/div/div[1]/table/tr"));
		Thread.sleep(2000);
		System.out.println(rowElements.size());
		int rowsize = rowElements.size();
    Thread.sleep(2000);
		List<WebElement> colomnElements = driver
				.findElements(By.xpath("// *[@id='home_top_twenty']/div/div[1]/div/div[1]/table/tr[2]/td"));
		System.out.println(colomnElements.size());
		int colsize = colomnElements.size();
		for (int i = 2; i <= rowsize; i++) {
			for (int j = 1; j <= colsize; j++) {
				Thread.sleep(2000);
				System.out.println(driver.findElement(By.xpath(
						"//*[@id='home_top_twenty']/div/div[1]/div/div[1]/table/tr[" + i + "]/td[" + j + "]"))
						.getText());
				//*[@id="home_top_twenty"]/div/div[1]/div/div/table/tr[2]/td[1]
			}

		}

	}

}
