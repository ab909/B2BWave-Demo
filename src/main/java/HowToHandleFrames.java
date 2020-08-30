

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;

import org.openqa.selenium.By;

public class HowToHandleFrames {

	public static void main(String[] args) throws InterruptedException{
        
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhib\\abc\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver q= new ChromeDriver ();
		
	
		
		q.get("https://www.crmpro.com");
		q.findElement(By.name("username")).sendKeys("hello999");
		q.findElement(By.name("password")).sendKeys("welltodo");
		Thread.sleep(5000);
		
		q.findElement(By.xpath("//input[@value='Login']")).click();
		
		q.switchTo().frame("mainpanel"); // use .switchTo and .frame in order to switch from the page to the frame. 
		
	    Thread.sleep(3000);
	    
	    q.findElement(By.xpath("//a[@title='Contacts']")).click();
	}

}
