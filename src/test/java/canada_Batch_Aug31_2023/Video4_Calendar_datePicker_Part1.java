package canada_Batch_Aug31_2023;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Video4_Calendar_datePicker_Part1 {

	public WebDriver driver;

	@Test(priority = 1)
	public void verifyWithHardCodedDateSelection() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.findElement(By.id("datepicker")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ui-datepicker-div")));
		String monthYear = driver.findElement(By.className("ui-datepicker-title")).getText();
		System.out.println(monthYear);

		// now we need to seggregate month and year

		String month = monthYear.split(" ")[0];
		String year = monthYear.split(" ")[1];

		while (!(month.equals("January") && year.equals("2024"))) {
			driver.findElement(By.xpath("//a[@title = 'Next']")).click();
			monthYear = driver.findElement(By.className("ui-datepicker-title")).getText();
			month = monthYear.split(" ")[0];
			year = monthYear.split(" ")[1];
		}

		driver.findElement(By.xpath("//td[@data-handler = 'selectDay']/a[text() = '9']")).click();

	}
	
	@Test(priority=2)
	public void verifyWithCustomizedDateSelection() {
		cutomizedDate("32", "January", "2026");
		cutomizedDate("32", "February", "2026");
		
	}
	
	public void cutomizedDate(String selectDay, String selectMonth, String selectYear) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.findElement(By.id("datepicker")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ui-datepicker-div")));
		
		if(Integer.parseInt(selectDay) > 31) {
			System.out.println("Invalid Date : " + selectDay + "-->" + selectMonth + "-->" + selectYear);
			return;
		}
		
		if(selectMonth.equals("February") && Integer.parseInt(selectDay)>29) {
			System.out.println("Invalid Date : " + selectDay + "-->" + selectMonth + "-->" + selectYear);
			return;	
		}
		
		
		String monthYear = driver.findElement(By.className("ui-datepicker-title")).getText();
		System.out.println(monthYear);
		String month = monthYear.split(" ")[0];
		String year = monthYear.split(" ")[1];

		while (!(month.equals(selectMonth) && year.equals(selectYear))) {
			driver.findElement(By.xpath("//a[@title = 'Next']")).click();
			monthYear = driver.findElement(By.className("ui-datepicker-title")).getText();
			month = monthYear.split(" ")[0];
			year = monthYear.split(" ")[1];
		}
        String xpathDayText = "//td[@data-handler = 'selectDay']/a[text() = \'"+selectDay+"\']";
		try {
			driver.findElement(By.xpath(xpathDayText)).click();
		} catch (Exception e) {
			System.out.println("Invalid Date : " + selectDay + "-->" + selectMonth + "-->" + selectYear);
		}

	}

}
