package automationBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomatingBrowsers {

	public static void main(String[] args) {
		
	    WebDriverManager.chromedriver().setup();
	    
	  WebDriver driver= new ChromeDriver();
	  
	  driver.get("https://www.facebook.com/");

	

	WebDriver driver1=new EdgeDriver();
	driver1.get("https://www.facebook.com/");

}
}