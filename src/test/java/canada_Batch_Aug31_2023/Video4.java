package canada_Batch_Aug31_2023;

import java.io.IOException;
import java.util.List;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.fluent.Request;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Video4 {
	// BBC Links and Response Code
	//need to add fluent-hc and commons-io dependencies in pom.xml file

	public WebDriver driver;

	@Test
	public void bbcNewsWebsite() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://bbc.com");
		List<WebElement> bbcTopLinks = driver.findElements(By.xpath("//*[@id=\"orb-header\"]/div/nav[2]/ul/li/a"));
		System.out.println("Total top links are :" + bbcTopLinks.size());
		
		for(int i=0 ; i<bbcTopLinks.size() ; i++) {
		//	System.out.println(bbcTopLinks.get(i).getText() + "---" + bbcTopLinks.get(i).isDisplayed());
			String url = bbcTopLinks.get(i).getAttribute("href");
			System.out.println(bbcTopLinks.get(i).getText() + "---" + bbcTopLinks.get(i).isDisplayed()+ "---> " + url);
			
			boolean result = validateResponseCode(url);
			Assert.assertTrue(result, "invalid response code");
			
		   bbcTopLinks.get(i).click();
		   System.out.println("the title of the url is : " + driver.getTitle());
		   
		   driver.navigate().back();
		   
		   bbcTopLinks = driver.findElements(By.xpath("//*[@id=\"orb-header\"]/div/nav[2]/ul/li/a"));
		}
	}
	
	public boolean validateResponseCode(String url) throws ClientProtocolException, IOException {
		int response_Code = 0;
		response_Code = Request.Get(url).execute().returnResponse().getStatusLine().getStatusCode();
		System.out.println("Response code for the url :"+ url +  "is:---> " + response_Code);
		if(response_Code == 200) {
			return true;
		}
		return false;
	}
}
