package testNGprogrammes;






	import java.io.FileInputStream;

	import java.io.IOException;
	import java.time.Duration;


	import org.apache.poi.xssf.usermodel.XSSFRow;
	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	import org.openqa.selenium.By;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;

import org.testng.annotations.Test;



	public class OHRM {  
		
		   FileInputStream file;
		   XSSFWorkbook workbook;
		  XSSFRow currentRow;
		  int rowCount;
          WebDriver driver;
	      String user_name;
	      String pasword;
	      By OHRMUsername;
	      WebElement userid;
	      By OHRMPassword;
	      WebElement userpassword ;
	      By OHRMLogin;
		  WebElement loginbutton;
		  String currentURLAfterLogin;
		  By Admin;
		  WebElement Adminclick;
	      
@Test(priority=1)
		public void LoginOHRM() throws IOException, InterruptedException
		{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jayad\\jaideepworkspace\\SeleniumAutomation\\Drivers\\chromedriver.exe");
		ChromeOptions options= new ChromeOptions();
		options.setBinary("C:\\Users\\jayad\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
		
			this. driver = new ChromeDriver(options);
			
			String ApplicationUrlAddress = "http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
			driver.get(ApplicationUrlAddress);
		   //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		       
	         
	         FileInputStream file =new FileInputStream("C:\\Users\\jayad\\Downloads\\OHRMLogindata.xlsx");
	         XSSFWorkbook workbook = new XSSFWorkbook(file);
	         
	       XSSFSheet sheet =  workbook.getSheet("Sheet1");
	       
	        int rowCount = sheet.getLastRowNum();
	        		
	        
	        
	        
	//Loop for Validate TestData from ExcelSheet
	        for(int i = 1;  i<=rowCount; i++)
	        {
	        	
	         XSSFRow currentRow= sheet.getRow(i);
	          
	          String user_name = currentRow.getCell(0).getStringCellValue();  
	          String pasword     = currentRow.getCell(1).getStringCellValue(); 


	         By OHRMUsername = By.id("txtUsername");
	        WebElement userid = driver.findElement(OHRMUsername);
	        userid. sendKeys(user_name);
	        
	        
	       By OHRMPassword = By.id("txtPassword");
	        WebElement userpassword = driver.findElement(OHRMPassword);
	        userpassword .sendKeys(pasword);
	        Thread.sleep(2000);
	       
	   
	         
	        By OHRMLogin = By.id("btnLogin");
			WebElement loginbutton = driver.findElement(OHRMLogin);
			loginbutton.click();
			
			String actualtitle = driver.getCurrentUrl();
			
			
			
			  String Expected_Element = "http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";
			  String Actual_Element = "http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";
				
				
				String Expected_Element2 ="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/validateCredentials";
				String Actual_Element2 = "http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/validateCredentials";
				
				
				if(actualtitle.equals(Expected_Element))
				{
					if(Expected_Element.equals(Actual_Element))
					{
						Admin = By.id("welcome");
						  Adminclick = driver.findElement(Admin);
						  Adminclick.click();
							By LogoutOHRM = By.partialLinkText("Logout");
							WebElement logoutEle = driver.findElement(LogoutOHRM);
							logoutEle.click();
							System.out.println("pass");
					}
					else
					{
						
						System.out.println("fail");
					}
					
				}
				else if(actualtitle.equals(Expected_Element2))
				{
					if(Expected_Element2.equals(Actual_Element2))
					{
						
							System.out.println("invalid credeentials");
						
					}
				else
				{
					Admin = By.id("welcome");
					  Adminclick = driver.findElement(Admin);
					  Adminclick.click();
						By LogoutOHRM = By.partialLinkText("Logout");
						WebElement logoutEle = driver.findElement(LogoutOHRM);
						logoutEle.click();
					System.out.println("pass");
				}
			
	        }		
				 
				 
		}
	      
		
			workbook.close();
		
		}

		
		@Test(priority=2)
	
		public void OHRMApplicationClose()
	    {
			driver.quit();
		}
		
		

	

	}



