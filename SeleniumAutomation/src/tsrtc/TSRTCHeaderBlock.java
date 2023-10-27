package tsrtc;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TSRTCHeaderBlock {

	public static void main(String[] args) {

		//System.setProperty("WebDriver. chrome. driver",
				//"C:\\Users\\jayad\\jaideepworkspace\\SeleniumAutomation\\Library\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		String ApplicationURLAddress = "https://www.tsrtconline.in/oprs-web/";

		driver.get(ApplicationURLAddress);

		By headerblocklocator = By.className("menu-wrap");
		WebElement headerBlock = driver.findElement(headerblocklocator);
		By headerBlockLinksLocator = By.tagName("a");
		
		
		List<WebElement> headerBlockLinks = headerBlock.findElements(headerBlockLinksLocator);

		int headerBlockLinksCount = headerBlockLinks.size();
		System.out.println("No. of Links in the HeaderBlock Of " + "TSRTC Application Home Page are:-" + headerBlockLinksCount);

		for (int index = 0; index < headerBlockLinksCount; index++) 
		{
			String headerBlockLinkName = headerBlockLinks.get(index).getText();
			System.out.println(index + "  " + headerBlockLinkName);
		}
		driver.quit();

	}

}
