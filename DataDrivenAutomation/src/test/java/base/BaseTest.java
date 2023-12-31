package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	FileInputStream fis1; 
	Properties pr;
	public WebDriver driver;
	
	@BeforeTest
	public void fileSetUp() throws IOException
	{
        fis1=new FileInputStream("Properties\\config.properties");
	    pr=new Properties();
		pr.load(fis1);
	}
	
	@BeforeMethod
	public void setup()
	{
       String browserName= pr.getProperty("browser");
       
       if(browserName.equalsIgnoreCase("chrome"))
       {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
       }
       else if(browserName.equalsIgnoreCase("firefox"))
       {
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
       } 
       else if(browserName.equalsIgnoreCase("edge"))
       {
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
       } 
       
       //Launch app
       
       driver.get(pr.getProperty("baseURL"));
       
       driver.manage().window().maximize();
       
      // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Long.parseLong(pr.getProperty("implictWaitTime"))));
       driver.manage().timeouts().implicitlyWait(Long.parseLong(pr.getProperty("implictWaitTime")), TimeUnit.SECONDS);
	}
	@AfterMethod
	public void teardown() throws InterruptedException
	{
		Thread.sleep(5000);
		
		driver.quit();
		
	}
}
