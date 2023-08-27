package applyingDateTimeStampAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import date_Class_Concepts.DateDemo;

public class RediffLoginParameterizedDataFromExcel {
	
	public WebDriver driver;
	
	@Test(priority=1, dataProvider = "REDIFFDATA", dataProviderClass=DataProviderWithExcelCode.class)
	public void rediffLoginData(String username, String password) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.id("login1")).sendKeys(DateDemo.customizedEmailWithDateTimeStamp());
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.name("proceed")).click();
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
