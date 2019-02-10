package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Colour {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		String bcolor=driver.findElement(By.name("websubmit")).getCssValue("color");
		System.out.println("backgroud color is: "+ bcolor);
		
		

	}

}
