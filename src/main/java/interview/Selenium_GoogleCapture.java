package interview;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Selenium_GoogleCapture {
	
	public WebDriver driver;
	
	@Test
	public void check() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("Selenium");
		List<WebElement> searchResults = driver.findElements(By.tagName("span"));
		
		System.out.println(searchResults.size());
	}

}
