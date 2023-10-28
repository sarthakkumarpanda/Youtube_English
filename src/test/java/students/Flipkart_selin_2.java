package students;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Flipkart_selin_2 {

	@Test
	
	public void flipkartLinks() {
	
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/home-decor/paintings-posters/paintings/pr?sid=arb,bga,mmf&otracker=nmenu_sub_Home%20%26%20Furniture_0_Paintings");
	
	List <WebElement> paintings = driver.findElements(By.xpath("//div[@class='CXW8mj _21_khk']"));
	
	System.out.println("the total number of paintings are "+paintings.size());
	
	for (int i = 0; i < paintings.size(); i++) {
		System.out.println(paintings.get(i).getText());
	}
	driver.quit();
		
		
	}
	
}
