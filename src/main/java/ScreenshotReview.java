

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class ScreenshotReview {

	public static void main(String[] args) throws IOException{
        
		System.setProperty("webdriver.gecko.driver","C:\\Users\\abhib\\Documents\\Selenium\\libs\\geckodriver.exe");
		 
		WebDriver web= new FirefoxDriver();
		web.manage().window().maximize();
		web.manage().deleteAllCookies();
		web.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		web.get("https://google.ca");
		
		//Take screenshot and store as file format
		File screen = ((TakesScreenshot)web).getScreenshotAs(OutputType.FILE);
		//copy the screenshot to the desired location using copyFile method
		FileUtils.copyFile(screen, new File("C:\\Users\\abhib\\Desktop/google.png"));
	}  

}
