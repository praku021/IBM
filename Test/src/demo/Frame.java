package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		System.out.println(driver.findElement(By.tagName("iframe")).getSize());
		
		driver.switchTo().frame("iframe1");
		
		driver.findElement(By.id("continents")).click();
	}

}
