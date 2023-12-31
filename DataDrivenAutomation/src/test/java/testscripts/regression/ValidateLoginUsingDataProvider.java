package testscripts.regression;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;

public class ValidateLoginUsingDataProvider extends BaseTest {

	@Test(dataProvider="getData")
	public void validateLoginTest(String un,String pwd,String expTitle)
	{
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(un);
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);
		
		driver.findElement(By.xpath("//input[@name='login']")).click();
		
		Assert.assertEquals(driver.getTitle(), expTitle);
	}
	
	@DataProvider
	
	public Object[][] getData()
	{
		Object[][] data=new Object[4][3];
		
		        data[0][0]="jaydeep99";
				data[0][1]="jaydeep123";
				data[0][2]="Adactin.com - Search Hotel";
				
			    data[1][0]="jaydeep99";
				data[1][1]="jaydeep456";
				data[1][2]="Adactin.com - Hotel Reservation System";
					
				data[2][0]="jaydeep1212";
				data[2][1]="jaydeep12";
				data[2][2]="Adactin.com - Hotel Reservation System";
						
			   data[3][0]="jaydeep1212";
			   data[3][1]="jaydeep456";
			   data[3][2]="Adactin.com - Hotel Reservation System";
			   
return data;
		
	}
}
