package august_30_2023_content;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Video2 {
	public WebDriver driver;
	public ChromeOptions options;
	
	@Test
	public void totalLinksVerifyTest() {
		options = new ChromeOptions();
		options.addArguments("headless");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/mens-formal-shirts/pr?sid=clo,ash,axc,mmk,bk1&fm=neo%2Fmerchandising&iid=M_c55ad86a-ca2a-49ac-9ecd-3038181d80f2_1_372UD5BXDFYS_MC.V795R35ST9K6&otracker=hp_rich_navigation_4_1.navigationCard.RICH_NAVIGATION_Fashion~Men%2527s%2BTop%2BWear~Men%2527s%2BFormal%2BShirts_V795R35ST9K6&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_4_L2_view-all&cid=V795R35ST9K6");
		
		
		List<WebElement> formalShirts = driver.findElements(By.xpath("//a[@class = 'IRpwTa']"));
		//Total formal shirts
		System.out.println(formalShirts.size());
		
		for(WebElement f : formalShirts) {
			System.out.println(f.getText());
		}
		
		
		List<WebElement> formalShirtsPrices = driver.findElements(By.xpath("//div[@class = '_30jeq3']"));
		//Total formal shirts
		System.out.println(formalShirtsPrices.size());
		
		for(WebElement f : formalShirtsPrices) {
			System.out.println(f.getText());
		}
		
		System.out.println("********************");
		
		for(int i=0 ; i<formalShirts.size() ; i++) {
			System.out.println(formalShirts.get(i).getText() + "--------->" + formalShirtsPrices.get(i).getText() );
		}
	}

}
