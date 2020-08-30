

import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleWindowPopUp {

	public static void main(String[] args) throws InterruptedException {
		
		// Different ways of handling pop-ups:\\\\\\\\\\\\\\\\\\\\\
		//1. alerts -- JavaScript Pop Up -- Alert API (accept, dismiss)
		//2. File Upload pop up -- Browse Button (type--file, sendKeys(path)
		//3. Browser Window Pop Up -- Advertisement pop up (windowHandler API - getWindowHandles())
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\abhib\\Documents\\Selenium\\libs\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver (); 
		
		driver.get("http://www.popuptest.com/goodpopups.html");

		driver.findElement(By.xpath("//a[contains(text(), 'Good PopUp #3')]")).click();
		
		Thread.sleep(2000);
		
		Set<String> handler=driver.getWindowHandles();
		
		Iterator<String> it=handler.iterator();
		
		String parentWindowId=it.next();
		System.out.println("parent window id: " + parentWindowId);
		
		String childWindowId=it.next();
		System.out.println("Child window Id:" + childWindowId);
		
		Thread.sleep(2000);
		
		driver.switchTo().window(childWindowId);
		System.out.println("Child window pop-up title:" + driver.getTitle());
		
		driver.close();
		
		Thread.sleep(2000);
		
		driver.switchTo().window(parentWindowId);
		System.out.println("Parent window title:" + driver.getTitle());
		
	}

}
