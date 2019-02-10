package demo;

import java.io.File;

import org.apache.commons.compress.compressors.FileNameUtil;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {
	
	static WebDriver driver;

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

	}
	
	public static void takeScreenshot(String fileName)
	{
		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
	}

}
