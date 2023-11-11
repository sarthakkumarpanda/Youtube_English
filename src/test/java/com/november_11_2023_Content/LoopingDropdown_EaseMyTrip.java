package com.november_11_2023_Content;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoopingDropdown_EaseMyTrip {

	public WebDriver driver;
	
	@Test
	public void easeMyTrip() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://easemytrip.com");
		
		String preSelectionTravellers = driver.findElement(By.id("spnDrpNo")).getText();
		System.out.println("Total passengers before selection : " + preSelectionTravellers);
		
		driver.findElement(By.id("ptravlrNo")).click();
		
		int Adults = 1;
		while(Adults < 4) {
			driver.findElement(By.xpath("//button[@id = 'add' and @class = 'add plus_box1']")).click();
			Adults++;
		}
		Thread.sleep(1000);
		
		int Children = 0;
		while(Children < 3) {
			driver.findElement(By.xpath("//button[@id = 'add' and @class = 'add plus_boxChd']")).click();
			Children++;
		}
		Thread.sleep(1000);
		
		int infants = 0;
		while(infants < 2) {
			driver.findElement(By.xpath("//button[@id = 'add' and @class = 'add plus_box1Inf']")).click();
			infants++;
		}
		Thread.sleep(1000);
		
		String postSelectionTravellers = driver.findElement(By.id("spnDrpNo")).getText();
		System.out.println("Total passengers before selection : " + postSelectionTravellers);
		
		
		driver.findElement(By.id("traveLer")).click();
	}
	
	
}
