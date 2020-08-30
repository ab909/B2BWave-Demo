


import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class WebTableHandle{

	public static void main(String[] args) throws IOException{
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhib\\Desktop\\chromedriver_win32 (7)\\chromedriver.exe");
		
		WebDriver web= new ChromeDriver();
		
		web.get("https://www.w3schools.com/html/html_tables.asp");
		
		
		//*[@id="customers"]/tbody/tr[2]/td[1]
		//*[@id="customers"]/tbody/tr[3]/td[1]
		//*[@id="customers"]/tbody/tr[4]/td[1]
		
		//*[@id="customers"]/tbody/tr[7]/td[1]
		
		//*[@id="customers"]
		
		List <WebElement> rows= web.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		int rowCount = rows.size();
		System.out.println("Total rows in web table :  "  + (rows.size()-1));
		
		String beforeXpath = "//*[@id='customers']/tbody/tr[";
		String afterXpath = "]/td[1]";
		
		xlsreader reader = new xlsreader("C:\\Users\\abhib\\eclipse-workspace\\test\\src\\com\\testdata\\RTM-TravelMedicare (Final).xlsx");
		reader.addSheet("TableData");
		reader.addColumn("TableData", "CompanyName");
		
		for(int i=2; i<=7;i++) {
			String actualxpath = beforeXpath+i+afterXpath;
			String company =web.findElement(By.xpath(actualxpath)).getText();
			System.out.println(company);
			reader.setCellData("TableData", "CompanyName", i, company);
			
			}
	}
	}
		



