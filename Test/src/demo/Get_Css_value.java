package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Css_value {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement wb=driver.findElement(By.name("websubmit"));
		int bw=wb.getSize().getWidth();
		System.out.println(wb);
		int bh=wb.getSize().getHeight();
		System.out.println(bh);
		
		
		
		
		
	}

}
