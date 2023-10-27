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
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class OrangeHRMApp{
	WebDriver driver;
	By Admin;
	WebElement Adminclick;
	@Test(priority = 1)
	public void LaunchOrangeHRM() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		String ApplicationUrlAddress = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		driver.get(ApplicationUrlAddress);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		By username = By.name("username");
		WebElement usernamebox = driver.findElement(username);
		usernamebox.sendKeys("Admin");

		By password = By.name("password");
		WebElement passwordbox = driver.findElement(password);
		passwordbox.sendKeys("admin123");

		By login = By.xpath("//button[@type='submit']");
		WebElement loginbutton = driver.findElement(login);
		loginbutton.click();

	}
	
	@Test(priority = 2)
	public void AddEmployee() throws IOException, InterruptedException {
         
		By pim = By.linkText("PIM");
		WebElement selectpim = driver.findElement(pim);
		selectpim.click();

		By addemp = By.linkText("Add Employee");
		WebElement addemployee = driver.findElement(addemp);
		addemployee.click();

		FileInputStream file = new FileInputStream("C:\\Users\\jayad\\Downloads\\OHRMLogindata.xlsx");
		XSSFWorkbook ExcelBook = new XSSFWorkbook(file);

		XSSFSheet sheet = ExcelBook.getSheet("Sheet2");
		int rowCount = sheet.getLastRowNum();

		for (int i = 1; i <= rowCount; i++) {

			XSSFRow currentRow = sheet.getRow(i);

			String FirstName = currentRow.getCell(0).getStringCellValue();
			String MiddleName = currentRow.getCell(1).getStringCellValue();
			String LastName = currentRow.getCell(2).getStringCellValue();

			Thread.sleep(3000);
			By empfirstname = By.name("firstName");
			WebElement addemployefirstname = driver.findElement(empfirstname);
			addemployefirstname.sendKeys(FirstName);
			System.out.println("The FirstName of employee is:-" + FirstName);

			Thread.sleep(3000);
			By empmiddlename = By.name("middleName");
			WebElement addemployemiddlename = driver.findElement(empmiddlename);
			addemployemiddlename.sendKeys(MiddleName);
			System.out.println("The FirstName of employee is:-" + MiddleName);

			Thread.sleep(3000);
			By emplastname = By.name("lastName");
			WebElement addemployelastname = driver.findElement(emplastname);
			addemployelastname.sendKeys(LastName);
			System.out.println("The FirstName of employee is:-" + LastName);

			Thread.sleep(3000);
			By saveBtn = By.xpath("//button[@type='submit']");
			WebElement saveButton = driver.findElement(saveBtn);
			saveButton.click();
			System.out.println("The AddEmployee is Name is Saved Successfully");

		}

	}

	@Test(priority = 3)
	public void EmployeeList() {

		String titleofpage = driver.getTitle();
		System.out.println("the title of the page is" + titleofpage);

		By pim = By.linkText("PIM");
		WebElement selectpim = driver.findElement(pim);
		selectpim.click();

		By employeelist = By.linkText("Employee List");
		WebElement emplist = driver.findElement(employeelist);
		emplist.click();

		// FileInputStream TestData = new
		// FileInputStream("C:\\Users\\jayad\\Downloads\\employeListOrangeHRM.xlsx");

		// XSSFWorkbook workbook = new XSSFWorkbook("TestData");

		// XSSFSheet sheet = ExcelBook.getSheet("Sheet1");

		// div[@class='oxd-table-body']

		// div[@class='oxd-table-card']

		// div[@class='oxd-table-card']/div[1]/div[2]
		// div[@class='oxd-table-body']/div[1]

		By OHRMTable = By.xpath("//div[@class='oxd-table-body']");
		WebElement emplyTable = driver.findElement(OHRMTable);
		int rows = emplyTable.findElements(By.xpath("//div[@class='oxd-table-card']")).size();

		for (int i = 1; i <= rows; i++) {

			String Id = emplyTable.findElement(By.xpath("//div[@class='oxd-table-body']/div[" + i + "]/div[1]/div[2]"))
					.getText();
			String firstname = emplyTable
					.findElement(By.xpath("//div[@class='oxd-table-body']/div[" + i + "]/div[1]/div[3]")).getText();
			String lastName = emplyTable
					.findElement(By.xpath("//div[@class='oxd-table-body']/div[" + i + "]/div[1]/div[4]")).getText();
			String JobTitle = emplyTable
					.findElement(By.xpath("//div[@class='oxd-table-body']/div[" + i + "]/div[1]/div[5]")).getText();
			String EmployeeStatus = emplyTable
					.findElement(By.xpath("//div[@class='oxd-table-body']/div[" + i + "]/div[1]/div[6]")).getText();
			String SubUnit = emplyTable
					.findElement(By.xpath("//div[@class='oxd-table-body']/div[" + i + "]/div[1]/div[7]")).getText();
			String SuperVisor = emplyTable
					.findElement(By.xpath("//div[@class='oxd-table-body']/div[" + i + "]/div[1]/div[8]")).getText();

			System.out.println(Id + "    " + firstname + "    " + lastName + "    " + JobTitle + "     "
					+ EmployeeStatus + "      " + SubUnit + "     " + SuperVisor);

		}

	}
	@Test(priority = 4)
	public void LogoutOrangeHRM() throws InterruptedException {
		
		Admin = By.xpath("//span[@class='oxd-userdropdown-tab']");
		Adminclick = driver.findElement(Admin);
		Adminclick.click();
		Thread.sleep(4000);
		By LogoutOHRM = By.linkText("Logout");
		WebElement logoutEle = driver.findElement(LogoutOHRM);
		logoutEle.click();
		driver.quit();
		
		
		
	}

}
