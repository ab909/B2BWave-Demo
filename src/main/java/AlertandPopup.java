
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertandPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\abhib\\Documents\\Selenium\\libs\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		Thread.sleep(5000);

		driver.findElement(By.name("proceed")).click();

		Alert alert = driver.switchTo().alert();

		System.out.println(alert.getText());

		String alerts = alert.getText();

		if (alerts.equals("Please enter a valid user name")) {
			System.out.println("correct alert message");
		} else {
			System.out.println("incorrect display message");
		}

		alert.accept();
		// alert.dismiss();
	}

}
