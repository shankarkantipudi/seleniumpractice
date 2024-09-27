package alertPopUps;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
@Test
public class HandleAlerts {
static WebDriver driver = new ChromeDriver();
    
	public void launchURL() {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		String url = "https://the-internet.herokuapp.com/";
		driver.get(url);
		
	}
	public void normalAlert() {
		WebElement js=driver.findElement(By.xpath("//a[text()='JavaScript Alerts']"));
		js.click();
		WebElement na=driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']"));
		na.click();
		Alert myalert= driver.switchTo().alert();
		System.out.println(myalert.getText());
		myalert.accept();
		
	}
	
/*	public void closeBrowser() {
		driver.close();
	}
	*/

	
}
