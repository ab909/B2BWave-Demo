

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

public class MouseMovement {

	public static void main(String[] args) throws InterruptedException{
		
        System.setProperty("webdriver.gecko.driver","C:\\Users\\abhib\\Documents\\Selenium\\libs\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver ();
		
		driver.get("https://www.amazon.ca");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	    Actions action = new Actions(driver);
	    
	    action.moveToElement(driver.findElement(By.xpath("//span[contains(text(), 'Hello, Sign in')]"))).build().perform();
	    
	    driver.findElement(By.xpath("//span[contains(text(), 'Hello, Sign in')]")).click();

	}

}
