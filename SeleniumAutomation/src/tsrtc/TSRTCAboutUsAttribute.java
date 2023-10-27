package tsrtc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TSRTCAboutUsAttribute {

	public static void main(String[] args) {
		
		//System.setProperty("WebDriver.chrome.driver",
				//"C:\\Users\\jayad\\jaideepworkspace\\SeleniumAutomation\\Drivers\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.setBinary("C:\\Users\\jayad\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
		
		WebDriver driver = new ChromeDriver(options);


		String ApplicationURLAddress = "https://www.tsrtconline.in/oprs-web/";
		driver.get(ApplicationURLAddress);
       
		By aboutusElementProperty=By.linkText("Driver Info");
		WebElement aboutusElement=driver.findElement(aboutusElementProperty);
		
		String aboutusattributevalue=aboutusElement.getAttribute("href");
		System.out.println("The value of the href attribute of the webElement About Us is:-"+aboutusattributevalue);
		
	    String aboutusElementText=aboutusElement.getText();
	    System.out.println("The text of the Element About Us is:-"+aboutusElementText);
	    
	    aboutusElement.click();
	    
	    driver.quit();
		
	}

}
