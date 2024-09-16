package ui;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CapturingScreenshot {
	public static String browser = "chrome";
	public static WebDriver driver;

	public static void main(String[] args) throws IOException {
		Date currentDate = new Date();
		// System.out.println(currentDate);
		String currentDateFile = currentDate.toString().replace(" ", "-").replace(":", "-");
		System.out.println(currentDateFile);

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.ebay.com.au");
		driver.manage().window().maximize();
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile, new File(".//screenshot/" + currentDateFile + ".png"));

	}

}
