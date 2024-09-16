package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SelectDropdown {
	public static String browser = "chrome";
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		if (browser.equals("Firefox")) {
			driver = new FirefoxDriver();
		} 
		else if (browser.equals("chrome"))

		{
			driver = new ChromeDriver();
		}
		else if (browser.equals("edge")) {
			driver = new EdgeDriver();
		}

		/*
		 * driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		 * driver.manage().window().maximize(); webelement ddown =
		 * driver.findelement(by.tagname("select"));
		 * 
		 * select select=new select(ddown); select.selectbyvalue("alb");
		 * thread.sleep(5000);
		 * 
		 * select.selectbyindex(5); thread.sleep(5000);
		 * 
		 * select.selectbyvisibletext("afghanistan");
		 */

		/*
		 * driver.get("https://demoqa.com/select-menu");
		 * driver.manage().window().maximize(); WebElement ddown =
		 * driver.findElement(By.id("cars")); Select select = new Select(ddown);
		 * select.selectByValue("volvo"); Thread.sleep(3000); select.selectByIndex(1);
		 * Thread.sleep(3000); select.selectByVisibleText("Opel"); Thread.sleep(3000);
		 * List<WebElement> alloptions = select.getAllSelectedOptions();
		 * System.out.println(alloptions.size()); Thread.sleep(3000);
		 * select.deselectAll(); Thread.sleep(3000); select.selectByValue("volvo");
		 * Thread.sleep(3000); select.selectByIndex(2); Thread.sleep(3000);
		 * List<WebElement> alloptions1 = select.getAllSelectedOptions();
		 * System.out.println(alloptions1.size());
		 */

		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		WebElement ddown = driver.findElement(By.id("oldSelectMenu"));
		
		Select select = new Select(ddown);
		
		 WebElement firstoption = select.getFirstSelectedOption();
		
		 System.out.println(firstoption.getText()); 

	}	

}
