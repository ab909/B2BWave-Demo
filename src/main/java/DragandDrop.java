

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;


public class DragandDrop {

	public static void main(String[] args) throws InterruptedException{
		
		 System.setProperty("webdriver.gecko.driver","C:\\Users\\abhib\\Documents\\Selenium\\libs\\geckodriver.exe");
		 WebDriver driver= new FirefoxDriver ();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get("https://jqueryui.com/droppable/");
			
			driver.switchTo().frame(0);// switch to frame if it is present
			
			Actions action= new Actions(driver);
			
			action.clickAndHold(driver.findElement(By.xpath("/html/body/div[1]/p"))).moveToElement(driver.findElement(By.xpath("//*[@id=\"droppable\"]")))
			.release().
			build().
			perform();
	}

}
