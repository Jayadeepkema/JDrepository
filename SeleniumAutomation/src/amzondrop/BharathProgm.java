package amzondrop;

//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BharathProgm {
	public static void main(String[] args) throws InterruptedException  {
	    
	WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		//driver.quit();
	

		//driver = new ChromeDriver();
		driver.get("http://youtube.com");
		driver.manage().window().maximize();
		
	          Thread.sleep(3000);
	          
		driver.get("http://seleniumbymahesh.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		       
		driver.get("http://yahoo.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.get("http://naukri.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.get("http://gmail.com");
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
	driver.quit();
	
	
		
	}

}