package adactinHotelAppLogin;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class AdactinHotelApp {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		//System.setProperty("WebDriver.chrome.driver",
				//"C:\\Users\\jayad\\jaideepworkspace\\SeleniumAutomation\\Library\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String ApplicationURLAddress = "https://adactinhotelapp.com/";

		driver.get(ApplicationURLAddress);

		String AdactinHotelApppageTitle = driver.getTitle();

		System.out.println("The Actual Title of the  AdactinHotelApp  Login Page is:-" + AdactinHotelApppageTitle);

		// validating adactinhotelapp application login page title

		String expected_AdactinhotelappTitle = "adactinhotelapp";

		System.out.println("The Expected Title of adactinhotelapp page is:- " + expected_AdactinhotelappTitle);

		String actual_AdactinhotelappTitle = "AdactinHotelApp";
		System.out.println("The Actual Title of the adactinhotelapp page is:-" + actual_AdactinhotelappTitle);

		if (actual_AdactinhotelappTitle.equalsIgnoreCase(expected_AdactinhotelappTitle)) {
			System.out.println("adactinhotelapp title is matched  -  pass");
		} else {
			System.out.println("adactinhotelapp title is Not Matched - fail");
		}

		// Validating adactinhotelapp Application Login Page URL Address

		String expected_adactinhotelappLoginPageURLAddress = "adactinhotelapp.com";

		System.out.println("The Expected URL Addresss of the adactinhotelapp login page is:-"
				+ expected_adactinhotelappLoginPageURLAddress);

		String actual_adactinhotelappLoginPageURLAddress = driver.getCurrentUrl();
		System.out.println("The Actual URL Address of the adactinhotelapp login Page is:-"
				+ actual_adactinhotelappLoginPageURLAddress);

		if (actual_adactinhotelappLoginPageURLAddress.contains(expected_adactinhotelappLoginPageURLAddress)) {
			System.out.println("Expected URL Address is Existing - Pass");
		} else {
			System.out.println("Expected URL Addresss is Not Existing - Fail");
		}

		// Login to Application with Valid TestData

		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("jaydeep99");
		driver.findElement(By.id("password")).sendKeys("jaydeep123");
		driver.findElement(By.id("login")).click();

		// Validating the Home Page

		String Expected_AdactinHotelAppCustomerHomePageTitle = "Adactin.com ";
		System.out.println("The expected adactin hotel app customer home page title is:-"
				+ Expected_AdactinHotelAppCustomerHomePageTitle);

		String Actual_AdactinHotelAppCustomerHomePageTitle = driver.getTitle();
		System.out.println("The actual adactin hotel app customer home page title is:-"
				+ Actual_AdactinHotelAppCustomerHomePageTitle);

		if (Actual_AdactinHotelAppCustomerHomePageTitle.contains(Expected_AdactinHotelAppCustomerHomePageTitle)) {
			System.out.println("The Existing CustomerHomePage Title is  -  pass");
		} else {
			System.out.println("The Existing CustomerHomePage Title is  - fail");
		}

		
		String Expected_WelcomeTitleintheHomePage = "Welcome to Adactin ";
		System.out.println("The expected welcome title home page is:-" + Expected_WelcomeTitleintheHomePage);

		String Actual_WelcomeTitleintheHomePage = "Welcome to Adactin Group of Hotels";
		System.out.println("The actual welcome title home page is:-" + Actual_WelcomeTitleintheHomePage);

		if (Actual_WelcomeTitleintheHomePage.contains(Expected_WelcomeTitleintheHomePage)) {
			System.out.println("The Existing Welcome Title is - pass");
		} else {
			System.out.println("The Existing Welcome Title is - fail");
		}
		
		driver.findElement(By.linkText("Logout")).click();
		
		

		driver.close();

	}

}
