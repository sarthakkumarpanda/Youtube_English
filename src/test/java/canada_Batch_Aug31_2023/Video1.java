package canada_Batch_Aug31_2023;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Video1 {
	
	public WebDriver driver;
	public ChromeOptions options;
	
	@Test
	public void totalLinksVerifyTest() {
		options = new ChromeOptions();
		options.addArguments("headless");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://bbc.com");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		// List<WebElement> links = driver.findElements(By.xpath("//a"));
		//Total links
		System.out.println(links.size());
		
		//to select a particular link
		 WebElement thirdLink = links.get(2);
		
		//how to determine the name or text of the link
		 System.out.println(thirdLink.getText());
		//how to determine the url of that link 
		 System.out.println(thirdLink.getAttribute("href"));
		 //how to determine the x and y coordinate of that link
		 System.out.println(thirdLink.getLocation().x + "---" + thirdLink.getLocation().y);
		 //how to click on this link
		 //thirdLink.click();
		 //System.out.println(driver.getTitle());
		 
		 //print all the links in the List
		 for(int i=0 ; i<links.size() ; i++) {
			 WebElement totalLinks = links.get(i);
			 System.out.println(totalLinks.getText()+"------------"+totalLinks.isDisplayed());
		 }
		 
		
	}

}
