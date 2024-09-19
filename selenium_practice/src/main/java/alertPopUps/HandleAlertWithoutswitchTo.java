package alertPopUps;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
@Test
public class HandleAlertWithoutswitchTo {
	static WebDriver driver = new ChromeDriver();
	public void usingExplicitwait() {
		driver.manage().window().maximize();
		WebDriverWait mywait=new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		String url = "https://the-internet.herokuapp.com/";
		driver.get(url);
		WebElement js=driver.findElement(By.xpath("//a[text()='JavaScript Alerts']"));
		js.click();
		WebElement na=driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']"));
		na.click();
		Alert myalert=mywait.until(ExpectedConditions.alertIsPresent());
		System.out.println(myalert.getText());
		myalert.accept();
	}

}
