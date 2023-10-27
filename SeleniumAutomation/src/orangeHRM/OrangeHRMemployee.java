package orangeHRM;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRMemployee {
        WebDriver driver;
    	FileInputStream TestData;
    	
	public static void main(String[] args) throws IOException {
		   
		WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 
			String ApplicationURL = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

			driver.get(ApplicationURL);
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS) ;
			
			
			
			//By username = By.xpath("//input[@placeholder='Username']");
			By username = By.name("username");
			WebElement usernamebox = driver.findElement(username);
			usernamebox.sendKeys("Admin");

			//By password = By.xpath("//input[@type='password']");
			By password = By.name("password");
			WebElement passwordbox = driver.findElement(password);
			passwordbox.sendKeys("admin123");

			By login = By.xpath("//button[@type='submit']");
			WebElement loginbutton = driver.findElement(login);
			loginbutton.click();
			
			String titleofpage = driver.getTitle();
			System.out.println("the title of the page is" +titleofpage);
			
			By pim = By.linkText("PIM");
			WebElement selectpim = driver.findElement(pim);
			selectpim.click();
			
			
			By employeelist = By.linkText("Employee List");
			WebElement emplist= driver.findElement(employeelist);
			emplist.click();
			
			//FileInputStream TestData = new FileInputStream("C:\\Users\\jayad\\Downloads\\employeListOrangeHRM.xlsx");
			
			//XSSFWorkbook   workbook = new XSSFWorkbook("TestData");
			
			//XSSFSheet sheet = ExcelBook.getSheet("Sheet1");
			
			//div[@class='oxd-table-body']
			
			//div[@class='oxd-table-card']
			
			//div[@class='oxd-table-card']/div[1]/div[2]
			//div[@class='oxd-table-body']/div[1]

			
			
			 By OHRMTable = By.xpath("//div[@class='oxd-table-body']");
			 WebElement emplyTable= driver.findElement(OHRMTable);
			int rows =  emplyTable.findElements(By.xpath("//div[@class='oxd-table-card']")).size();
			 
			 for (int i = 1; i <=rows ; i++)
			 {
				 
				String Id                         = emplyTable.findElement(By.xpath("//div[@class='oxd-table-body']/div["+i+"]/div[1]/div[2]")).getText();
				String firstname             = emplyTable.findElement(By.xpath("//div[@class='oxd-table-body']/div["+i+"]/div[1]/div[3]")).getText();
				String lastName              = emplyTable.findElement(By.xpath("//div[@class='oxd-table-body']/div["+i+"]/div[1]/div[4]")).getText();
				String JobTitle               = emplyTable.findElement(By.xpath("//div[@class='oxd-table-body']/div["+i+"]/div[1]/div[5]")).getText();
				String EmployeeStatus   = emplyTable.findElement(By.xpath("//div[@class='oxd-table-body']/div["+i+"]/div[1]/div[6]")).getText();
				String SubUnit                = emplyTable.findElement(By.xpath("//div[@class='oxd-table-body']/div["+i+"]/div[1]/div[7]")).getText();
				String SuperVisor           = emplyTable.findElement(By.xpath("//div[@class='oxd-table-body']/div["+i+"]/div[1]/div[8]")).getText();


				System.out.println(Id +"    "+ firstname +"    "+ lastName+ "    "+ JobTitle +"     "+ EmployeeStatus+"      " +SubUnit+ "     "  +SuperVisor);
				 
		 
			 }
			 
			
	}
	
	

}
