package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
	public static String browser = "chrome";
	public static WebDriver driver;

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://jqueryui.com/draggable/");
		driver.manage().window().maximize();
		WebElement frame = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		driver.switchTo().frame(frame);
		WebElement rightClick = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		Actions action = new Actions(driver);
		action.contextClick(rightClick).perform();

	}

}
