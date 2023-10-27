package testNGprogrammes;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class OrangeHRM {

	

	FileInputStream file ;
	XSSFWorkbook ExcelBook ;
	XSSFSheet sheet;
	WebDriver driver;

	@Test(priority = 1, description = "Login functionality")
	public void validatingOHRM( ) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver",
			//	"C:\\Users\\jayad\\jaideepworkspace\\SeleniumAutomation\\Drivers\\chromedriver.exe");
		//ChromeOptions options = new ChromeOptions();
		//options.setBinary("C:\\Users\\jayad\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
          // WebDriver driver= new ChromeDriver();
		// For use with ChromeDriver:
        this.driver = new ChromeDriver();

		

		String ApplicationURL = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

		driver.get(ApplicationURL);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
		By username = By.xpath("//input[@placeholder='Username']");
		WebElement usernamebox = driver.findElement(username);
		usernamebox.sendKeys("Admin");

		By password = By.xpath("//input[@type='password']");
		WebElement passwordbox = driver.findElement(password);
		passwordbox.sendKeys("admin123");

		By login = By.xpath("//button[@type='submit']");
		WebElement loginbutton = driver.findElement(login);
		loginbutton.click();

		Thread.sleep(3000);
	}
	
	
           @Test(priority= 5)
           public void logoutorangeHRM() throws InterruptedException
           {
		    // welcome
		
		  By welcomeHome = By.xpath("//span[@class='oxd-userdropdown-tab']");
		  WebElement welcomeadmin= driver.findElement(welcomeHome);
		  welcomeadmin.click();
		 
		 By logout = By.linkText("Logout");
		  
		  Thread.sleep(3000); 
		  WebElement logoutbutton= driver.findElement(logout);
		 logoutbutton.click( );
		 
		 Thread.sleep(3000);
		 
		//driver.quit();

           }

	@Test(priority = 2 , description = "AddEmployee functionality")
	public void addemployee() {

		By pim = By.linkText("PIM");
		WebElement selectpim = driver.findElement(pim);
		selectpim.click();

		By addemp = By.linkText("Add Employee");
		WebElement addemployee = driver.findElement(addemp);
		addemployee.click();

	}

	@Test(priority = 3 , description = "AddEmployee Data from Excel Sheet")
	public void addemployeedata() throws IOException {

		FileInputStream file = new FileInputStream("C:\\Users\\jayad\\Downloads\\OHRMLogindata.xlsx");
		XSSFWorkbook ExcelBook = new XSSFWorkbook(file);

		XSSFSheet sheet = ExcelBook.getSheet("Sheet2");
		int rowCount = sheet.getLastRowNum();

		for (int i = 1; i <= rowCount; i++) {

			XSSFRow currentRow = sheet.getRow(i);

			String FirstName = currentRow.getCell(0).getStringCellValue();
			String MiddleName = currentRow.getCell(1).getStringCellValue();
			String LastName = currentRow.getCell(2).getStringCellValue();

			By empfirstname = By.xpath("//input[@placeholder='First Name']");
			WebElement addemployefirstname = driver.findElement(empfirstname);
			addemployefirstname.sendKeys(FirstName);

			By empmiddlename = By.xpath("//input[@name='middleName']");
			WebElement addemployemiddlename = driver.findElement(empmiddlename);
			addemployemiddlename.sendKeys(MiddleName);

			By emplastname = By.xpath("//input[@name='lastName']");
			WebElement addemployelastname = driver.findElement(emplastname);
			addemployelastname.sendKeys(LastName);

		}
	}
	@Test(priority = 4)
	public void photoUpload() throws IOException, InterruptedException
	{
		 By setpropertytouploadphoto= By.xpath("//div[@class='oxd-file-div oxd-file-div--active']");
		 WebElement photoupload= driver.findElement(setpropertytouploadphoto);
		 photoupload.click();
		 Thread.sleep(5000); 
		 java.lang.Runtime.getRuntime().exec("C:\\Users\\jayad\\OneDrive\\Desktop\\photo3.exe");
		 //Thread.sleep(3000);
		 
		  By createlogindetailsbutton= By.xpath("//span[@class='oxd-switch-input oxd-switch-input--active --label-right']");
		  WebElement loginbutton = driver.findElement(createlogindetailsbutton);
		  loginbutton.click();
		  
	}

	@Test(priority = 6, description = "Application close")
	public void applicationclose() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}

}