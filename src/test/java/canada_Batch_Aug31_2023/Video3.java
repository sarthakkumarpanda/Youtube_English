package canada_Batch_Aug31_2023;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Video3 {
	public WebDriver driver;

	@Test
	public void verifyStaleElementReeferenceException() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		List<WebElement> footerLinks = driver.findElements(By.xpath("//div[@class = 'footer alignC']/a"));
		System.out.println("Total footer links are: " + footerLinks.size());
		
		for(int i=0 ; i<footerLinks.size() ; i++) {
			//System.out.println(footerLinks.get(i).getText());
			String url = footerLinks.get(i).getAttribute("href");
			System.out.println(footerLinks.get(i).getText()+ "---> " + url);
			
			footerLinks.get(i).click();
			System.out.println("The title of this webpage is: " + driver.getTitle());
			
			driver.navigate().back();
			footerLinks = driver.findElements(By.xpath("//div[@class = 'footer alignC']/a"));
			
			
		}
		

	}

}
