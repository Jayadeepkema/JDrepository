package tsrtc;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TSRTC_HeaderBlockElementsTest {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver", "./SeleniumAutomation\\Library\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		String ApplicationURLAddress = "https://www.tsrtconline.in/oprs-web/";
		driver.get(ApplicationURLAddress);

		By headerBlockLocator = By.className("menu-wrap");

		WebElement headerBlock = driver.findElement(headerBlockLocator);
		
		/*
		WebElement headerBlockAttributeValue =driver.findElement(headerBlockLocator);
		String AttributeValueOf=headerBlockAttributeValue.getAttribute("href");
	*/
		
		By headerBlockLinksLocator = By.tagName("a");
		
		List<WebElement> headerBlockLinks = headerBlock.findElements(headerBlockLinksLocator);

	
		
		int headerBlockLinksCount = headerBlockLinks.size();
		System.out.println("No. Of Links in the HeaderBlock of" + "TSRTC Application Home Page are:- " + headerBlockLinksCount);
		
		for (int index = 0; index < headerBlockLinksCount; index++) 
		{
			String headerBlockLinkName = headerBlockLinks.get(index).getText();
			System.out.println(index + "  " + headerBlockLinkName);
			headerBlockLinks.get(index).click();

			String WebPageTitle = driver.getTitle();
			System.out.println(WebPageTitle);

			String WebPageURLAddress = driver.getCurrentUrl();
			System.out.println(WebPageURLAddress);
			
		
		// System.out.println(AttributeValueOf);	
		
			
			System.out.println();

			driver.navigate().back();

			headerBlock = driver.findElement(headerBlockLocator);

			headerBlockLinks = headerBlock.findElements(headerBlockLinksLocator);
			
			

		}

		driver.quit();

	}

}
