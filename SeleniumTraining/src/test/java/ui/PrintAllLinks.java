package ui;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class PrintAllLinks {
public static String browser="edge";
public static WebDriver driver;

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.sugarcrm.com/au/request-demo/");
	driver.manage().window().maximize();
	List<WebElement> allLinks = driver.findElements(By.tagName("a"));
	System.out.println("Number of links on page are:");
	System.out.println(allLinks.size());
	System.out.println("Links on page are:");
	for (int i = 0; i < allLinks.size(); i++) {
		
		System.out.println(allLinks.get(i).getAttribute("href"));
		System.out.println(allLinks.get(i).getText());
		
	}
		
		
		
		
		
		
		

	}

	

}
