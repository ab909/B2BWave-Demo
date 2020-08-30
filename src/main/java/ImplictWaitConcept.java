

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

public class ImplictWaitConcept {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\abhib\\Documents\\Selenium\\libs\\geckodriver.exe");
		
		WebDriver m= new FirefoxDriver ();
		
		m.get("https://amazon.ca");
		
		m.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		m.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		

	}

}
