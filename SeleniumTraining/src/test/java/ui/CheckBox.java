package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
	public static String browser = "edge";
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/samplepagetest/");
		driver.manage().window().maximize();
		WebElement radio = driver.findElement(By.xpath("(//label[@class='grunion-radio-label radio'])[3]"));
		Thread.sleep(5000);
		Actions act = new Actions(driver);
		act.moveToElement(radio).perform();
		

		driver.findElement(By.xpath("//*[@id=\"contact-form-2599\"]/form/div[5]/label[2]/input")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//*[@id=\"contact-form-2599\"]/form/div[5]/label[2]/input")).click();

		System.out.println(driver.findElements(By.xpath("//label[@class='grunion-radio-label radio']")).size());

	}

}
