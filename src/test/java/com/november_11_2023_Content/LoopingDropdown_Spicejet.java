package com.november_11_2023_Content;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoopingDropdown_Spicejet {
	
	//Class Assignment
	public WebDriver driver;

	@Test
	public void easeMyTrip() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://easemytrip.com");
		
	}
}
