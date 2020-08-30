

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_Part3 {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\abhib\\Documents\\Selenium\\libs\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://facebook.com");
		
		String year_xpath= "//select[@id='year']//option";
		
		selectDropDownValues(year_xpath, "1991");
		
		
	}

        
        
     
      	

	

public static void selectDropDownValues(String xapth, String value) {
	
	
}
}