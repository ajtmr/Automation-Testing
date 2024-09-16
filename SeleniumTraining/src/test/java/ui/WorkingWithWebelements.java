package ui;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class WorkingWithWebelements {
public static String browser="edge";
public static WebDriver driver;

	public static void main(String[] args) {
		if (browser.equals("Firefox")) {
			 driver=new FirefoxDriver();
		}
		else if (browser.equals("chrome")) 
			
		{
			 driver=new ChromeDriver();
		}
		else if (browser.equals("edge")) {
			driver = new EdgeDriver();
		}
		
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		driver.manage().window().maximize();
		driver.findElement(By.name("firstname")).sendKeys("Testing");
		driver.findElement(By.name("firstname")).clear();
		System.out.println(driver.findElement(By.name("firstname")).getAttribute("class"));
		System.out.println(driver.findElement(By.xpath("//*[@id='field1']/div/input")).getCssValue("text-transform"));
		System.out.println(driver.findElement(By.xpath("//*[@id='field1']/div/input")).getSize());
		System.out.println(driver.findElement(By.xpath("//*[@id='field1']/div/input")).getLocation());
		System.out.println(driver.findElement(By.xpath("//*[@id='field1']/div/input")).getText());
		System.out.println(driver.findElement(By.xpath("//*[@id='field1']/div/input")).getTagName());
		System.out.println(driver.findElement(By.xpath("//*[@id='field1']/div/input")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//*[@id='field1']/div/input")).isEnabled());
		System.out.println(driver.findElement(By.xpath("//*[@id='field1']/div/input")).isSelected());
		
		
		
		
		

	}

	

}
