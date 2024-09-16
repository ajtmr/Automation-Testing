package ui;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class MouseHover {
public static String browser="chrome";
public static WebDriver driver;

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.ebay.com.au");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[2]/a"));
		
		Actions action=new Actions(driver);
		action.moveToElement(element).perform();
		
		

	}

	

}
