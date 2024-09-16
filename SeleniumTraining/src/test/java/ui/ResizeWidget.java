package ui;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class ResizeWidget {
public static String browser="chrome";
public static WebDriver driver;

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		  driver.get("https://jqueryui.com/resizable/");
		  driver.manage().window().maximize(); WebElement frame =
		  driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		  driver.switchTo().frame(frame); WebElement element =
		  driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]")); Actions
		  action=new Actions(driver); action.dragAndDropBy(element, 300,
		  100).perform();
		 
		

	}

	

}
