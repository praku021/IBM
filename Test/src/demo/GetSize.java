package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSize {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://twitter.com/login?lang=en");
		WebElement wb=driver.findElement(By.name("session[username_or_email]"));
		int widthbutton=wb.getSize().getWidth();
		System.out.println("Width is" +widthbutton);
		
		int heighthbutton=wb.getSize().getHeight();
		System.out.println("Width is" +heighthbutton);

	}

}
