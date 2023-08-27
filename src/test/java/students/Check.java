package students;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Check {

	public WebDriver driver;

	@Test

	public void loginTest() {

		driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://tutorialsninja.com/demo");
driver.findElement(By.linkText("My Account")).click();
driver.findElement(By.linkText("Register")).click();
driver.findElement(By.xpath("//input[@type='submit' and @value='Continue']")).click();

       //String actualWM=driver.findElement(By.cssSelector("div.alert.alert-danger.alert-dismissible i")).getText();
       String actualWM = driver.findElement(By.xpath("//div[contains(@class, 'alert-dismissible')]")).getText();
       String expectedWMString = "Warning: You must agree to the Privacy Policy!";

       Assert.assertEquals(actualWM, expectedWMString,"The assertion is working for general warning");

		/*
		 * String fNameWM=driver.findElement(By.xpath(
		 * "//input[@name='firstname']/following-sibling::div")).getText();
		 * 
		 * String expectedFNWMString="Warning: You must agree to the Privacy Policy!";
		 * 
		 * 
		 * 
		 * Assert.assertEquals(fNameWM,
		 * expectedFNWMString,"The assertion is working for First Name warning");
		 * 
		 * 
		 * 
		 * 
		 * 
		 * String lNameWM=driver.findElement(By.xpath(
		 * "//input[@name='lasttname']/following-sibling::div")).getText();
		 * 
		 * String expectedLNWMString="Warning: You must agree to the Privacy Policy!";
		 * 
		 * 
		 * 
		 * Assert.assertEquals(lNameWM,
		 * expectedLNWMString,"The assertion is working for Last Name warning");
		 * 
		 * 
		 * 
		 * 
		 * 
		 * String emailWM=driver.findElement(By.xpath(
		 * "//input[@name='email']/following-sibling::div")).getText();
		 * 
		 * String
		 * expectedemailWMString="Warning: You must agree to the Privacy Policy!";
		 * 
		 * 
		 * 
		 * Assert.assertEquals(emailWM,
		 * expectedemailWMString,"The assertion is working for email warning");
		 * 
		 * 
		 * 
		 * 
		 * 
		 * String phoneWM=driver.findElement(By.xpath(
		 * "//input[@name='telephone']/following-sibling::div")).getText();
		 * 
		 * String
		 * expectedphoneWMString="Warning: You must agree to the Privacy Policy!";
		 * 
		 * 
		 * 
		 * Assert.assertEquals(phoneWM,
		 * expectedphoneWMString,"The assertion is working for email warning");
		 * 
		 * 
		 * 
		 * 
		 * 
		 * String passWM=driver.findElement(By.xpath(
		 * "//input[@name='password']/following-sibling::div")).getText();
		 * 
		 * String expectedpassWMString="Warning: You must agree to the Privacy Policy!";
		 * 
		 * 
		 * 
		 * Assert.assertEquals(passWM,
		 * expectedpassWMString,"The assertion is working for email warning");
		 * 
		 */

	}

}
