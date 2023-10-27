package testNGprogrammes;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
@Test
public class BaseTest {
	WebDriver driver;
	
	String ApplicationURL="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
	public void ApplicationLaunch() 
	{
		//chrome Browser Automation
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe" );
		driver = new ChromeDriver();
		driver.get(ApplicationURL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	public void applicationclose()
	{
		driver.quit();
		
	}
	
	

}
