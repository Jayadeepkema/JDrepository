package tsrtc;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TSRTCHeaderBlockAttributeValues {

	public void AttributevaluesofTSRTC() {
		System.setProperty("WebDriver.chrome.driver", "./SeleniumAutomation\\Library\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		String ApplicationURLAddress = "https://www.tsrtconline.in/oprs-web/";
		driver.get(ApplicationURLAddress);

          By Ele = By.linkText("Home");
         WebElement Avenger =driver.findElement(Ele);
		String ValueOfAttribute=Avenger.getAttribute("href");
		System.out.println("The attribute value of Home is:-" +ValueOfAttribute);

	}

	public static void main(String[] args) {

		TSRTCHeaderBlockAttributeValues THBAV = new TSRTCHeaderBlockAttributeValues();

		THBAV.AttributevaluesofTSRTC();

	}

}
