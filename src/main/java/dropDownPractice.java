

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class dropDownPractice {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\abhib\\Desktop\\chromedriver_win32 (7)\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.spicejet.com/default.aspx");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
//		driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
			System.out.println("its enabled");
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
		driver.close();
	}

//		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
//		driver.findElement(By.xpath("//a[@text='Ahmedabad (AMD)']")).click();
//
//		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
//
//		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active.ui-state-hover"))
//				.click();
//
//		driver.findElement(By.xpath("//a[contains(@class,'ui-state-default ui-state-active')]")).click();
//
//		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
//
//		WebElement adult = driver.findElement(By.name("ctl00$mainContent$ddl_Adult"));
//
//		Select select = new Select(adult);
//
//		select.selectByIndex(4);
//
//////		for(int i=1;i<6;i++) {
//////			driver.findElement(By.cssSelector(".fill-path")).click();
//////		}

		public static void selectDate(WebElement element, String Date) {
			
		}
		
	}


