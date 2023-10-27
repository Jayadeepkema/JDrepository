package testNGprogrammes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//import ch.qos.logback.core.joran.action.Action;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup() 
	{
		WebDriverManager.edgedriver().setup();
		
		driver = new EdgeDriver();
		
		driver.get("https://www.tesla.com/");
		
		driver.manage().window().maximize();
	}
	
   @Test
   public void mousehoverTest() throws InterruptedException 
   {
	   driver.findElement(By.xpath("//a[@title='Shop']")).click();
	   
	   WebElement charging=driver.findElement(By.xpath("//a[text()='Charging']"));
	   
	  Actions action=new Actions(driver);
	  
	 // WebElement shop = null;
	action.moveToElement(charging)
	  .pause(8000)
	  .moveToElement(driver.findElement(By.xpath("//a[text()='Vehicle Accessories']")))
	  .pause(8000)
	  .moveToElement(driver.findElement(By.xpath("//a[text()='Apparel']")))
	  .pause(8000)
	  .moveToElement(driver.findElement(By.xpath("//a[text()='Lifestyle']")))
	  .build()
	  .perform();
	
	Thread.sleep(4000);
   }
@AfterMethod
public void teardown() {
	
	driver.quit();
}
}
