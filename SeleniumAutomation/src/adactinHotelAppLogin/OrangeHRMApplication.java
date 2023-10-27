package adactinHotelAppLogin;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;





public class OrangeHRMApplication {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jayad\\jaideepworkspace\\SeleniumAutomation\\Drivers\\chromedriver.exe");
	//WebDriverManager.chromedriver().setup();
	ChromeOptions options= new ChromeOptions();
	options.setBinary("C:\\Users\\jayad\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
		
		WebDriver driver = new ChromeDriver(options);

		String ApplicationURLAddress = "http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";

		driver.get(ApplicationURLAddress);

		String orangehrmTitle = driver.getTitle();

		System.out.println("The Actual Title of the orangehrm Login Page is:-" +orangehrmTitle );
		
		
		
		//Validating URL Address of OrangeHRM Application
		
		String Expected_URLAddressoftheorangehrmApplication="orangehrm-4.2.0.1";
		        System.out.println("The expected orange URL Address is:-"+Expected_URLAddressoftheorangehrmApplication);
		        
		        String Actual_URLAddressoftheorangehrmApplication="OrangeHRM-4.2.0.1";
		                 System.out.println("The actual orangehrm URL Address is:-"+Actual_URLAddressoftheorangehrmApplication);
		                 
		                 if(Actual_URLAddressoftheorangehrmApplication.equalsIgnoreCase(Expected_URLAddressoftheorangehrmApplication))
		                 {
		                	 System.out.println("The Exisiting OrangeHRM URL Address is  -  pass");
		                 }
		                 else
		                 {
		                	 System.out.println("The Existing OrangeHRM URL Address is  -  fail");
		                 }
		                 
		           
		   
		driver.close();

	}

}
