package tsrtc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TSRTC01 {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\jayad\\jaideepworkspace\\SeleniumAutomation\\Library\\chromedriver.exe");
//WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		String ApplicationURLAddress = "https://www.tsrtconline.in/oprs-web/";
		driver.get(ApplicationURLAddress);
		
		By MenuAttribute=By.className("menu");
		WebElement MenuAttributeValue=driver.findElement(MenuAttribute);
		
		
		
	  Object tsrtcA[]= new Object[8];
	  tsrtcA[0] ="Home";
	  tsrtcA[1] ="Bus on Contract";
	  tsrtcA[2] ="Enquiry";
	  tsrtcA[3] ="Cancel Tickets";
	  tsrtcA[4] ="Cancelled Services";
	  tsrtcA[5] ="About Us";
	  tsrtcA[6] ="Tourism";
	  tsrtcA[7] ="Driver Info";
	  
	  
	  
	  
	  for(int index=0; index<=7; index++)
	  {
		  
		  System.out.println(MenuAttributeValue.getAttribute("href"));
	  }

	}

}
