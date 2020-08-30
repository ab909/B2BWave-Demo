

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;

public class ExplictWaitReview {

	public static void main(String[] args)  throws InterruptedException{
		
        System.setProperty("webdriver.gecko.driver","C:\\Users\\abhib\\Documents\\Selenium\\libs\\geckodriver.exe");
		
		WebDriver web= new FirefoxDriver();
		
		web.manage().window().maximize();
		web.manage().deleteAllCookies();
	    web.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		web.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		web.get("https:\\www.amazon.ca");
		
		clickOn(web, web.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/div[2]/div/a[2]/span[1]")), 20);
		
		WebDriverWait wait = new WebDriverWait(web, 30);
		
		
		

	}
	public static void clickOn(WebDriver web, WebElement locator, int timeout) {
		new WebDriverWait(web, timeout).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(locator));
		locator.click();
	}

}
