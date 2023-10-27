package amzondrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amzonio {

	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("WebDriver.chrome.driver", "./SeleniumAutomation\\Library\\chromedriver.exe");
         WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		String ApplicationURLAddress = "https://www.ajio.com/";
		driver.get(ApplicationURLAddress);
		
		driver.manage().window().maximize();
		
		By menLocator=By.linkText("MEN");
		WebElement menn=driver.findElement(menLocator);
		
		Actions action=new Actions(driver);
		action.moveToElement(menn).build().perform();
		
		//<a href="/" data-test="navigation-list">BRANDS</a>
		By brands=By.partialLinkText("BRANDS");
		WebElement brandEle=driver.findElement(brands);
		
		Actions action1=new Actions(driver);
		action1.moveToElement(brandEle).build().perform();
		
		Thread.sleep(3000);
		
		driver.quit();

		
		

	
	


	}

}
