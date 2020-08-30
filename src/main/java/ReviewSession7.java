

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

public class ReviewSession7 {

	public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.gecko.driver","C:\\Users\\abhib\\Documents\\Selenium\\libs\\geckodriver.exe");
		
		WebDriver web= new FirefoxDriver();
		web.manage().window().maximize();
		web.manage().deleteAllCookies();
		web.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		web.get("https://google.ca");
		
		web.navigate().to("https://amazon.ca");
		
		web.navigate().back();
		
		Thread.sleep(2000);
		
		web.navigate().forward();
		
		Thread.sleep(2000);
		
		web.navigate().back();
		
		web.navigate().refresh();
		
		web.close();

	}

}
