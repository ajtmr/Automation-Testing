package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Radiobutton {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.singaporeair.com/");
		driver.manage().window().maximize();
		WebElement radio2 = driver.findElement(By.id("redeemFlights"));
	 WebElement radio1 = driver.findElement(By.id("bookFlights"));
	 Actions act = new Actions(driver);
	 act.moveToElement(radio1);
	 	 radio2.click();
	 System.out.println(radio2.isSelected());
		System.out.println(radio1.isSelected());
		

	}

}
