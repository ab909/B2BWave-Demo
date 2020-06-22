package Utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class CalendarPicker {

	static WebDriver driver;
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\abhib\\Desktop\\chromedriver_win32 (7)\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.spicejet.com/default.aspx");
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement date = driver.findElement(By.id("ctl00_mainContent_txt_Fromdate"));
		WebElement date1 = driver.findElement(By.id("ctl00_mainContent_txt_Todate"));
		
		String dayVal= "30-12-2020";
		String dayVal1= "30-01-2021";
		
		selectDateByJS(driver, date, dayVal);
		selectDateByJS(driver, date1, dayVal1);

	}

	public static void selectDateByJS(WebDriver driver, WebElement element, String dateVal) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].setAttribute('value','"+dateVal+"');", element);
	}
	
}
 