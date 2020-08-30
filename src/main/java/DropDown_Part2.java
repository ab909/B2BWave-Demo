

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_Part2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\abhib\\Documents\\Selenium\\libs\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://facebook.com");
		
		WebElement month = driver.findElement(By.id("month"));
		WebElement day = driver.findElement(By.id("day"));
		WebElement year = driver.findElement(By.id("year"));
		
		Select select = new Select(day);
		select.selectByIndex(10);
		
		System.out.println(select.isMultiple());
		
        List <WebElement> listdays=select.getOptions();
        System.out.println(listdays.size());
        int TotalDays = listdays.size()-1;
        System.out.println("total days are:  "+ TotalDays);
        
        for(int i=0;i<listdays.size();i++) {
        	String dayVal=listdays.get(i).getText();
        	System.out.println(dayVal);
        	if(dayVal.equals("15")) {
        		listdays.get(i).click();
        		break;
        	}
        	
        }
	}

}
