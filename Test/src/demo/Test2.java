package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		
		driver.findElement(By.xpath("//*[@id='js-switch__option']/div[2]/label")).click();
		driver.findElement(By.id("hp-widget__sfrom")).click();
		driver.findElement(By.id("hp-widget__sfrom")).sendKeys("Bangalore");
		driver.findElement(By.id("hp-widget__sTo")).sendKeys("Delhi");
		driver.findElement(By.id("hp-widget__depart")).click();
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
