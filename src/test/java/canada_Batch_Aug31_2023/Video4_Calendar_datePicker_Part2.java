package canada_Batch_Aug31_2023;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Video4_Calendar_datePicker_Part2 {
	public WebDriver driver;
	
	@Test
	public void dateUsingJavaScriptExecutor() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		
		//go to console tab in chrome
		//clear it with the circle and line symbol
		//document.getElementById('datepicker')
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("document.getElementById('datepicker').value='01/09/2024'");
	}

}
