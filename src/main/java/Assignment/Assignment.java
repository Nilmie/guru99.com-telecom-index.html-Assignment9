package Assignment;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.Select;

public class Assignment 
{

	@Test
	
	public void testSearch()
	{
		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/index.html");
		
		driver.findElement(By.linkText("Add Tariff Plan to Customer")).click();

		
		driver.findElement(By.id("customer_id")).sendKeys("566235");
		driver.findElement(By.name("submit")).click();
		
		driver.findElement(By.name("submit")).click();
		//driver.findElement(By.linkText("Add Tariff Plan to Customer")).click();
		
		
		

		
		
		//driver.close();
		//driver.quit();
	}
}
