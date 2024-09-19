package org.Alert.elements;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class ConfirmationAlert {
	static WebDriver driver = new ChromeDriver();

	public void launchURL() throws InterruptedException {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		String url = "https://the-internet.herokuapp.com/";
		driver.get(url);
		WebElement js = driver.findElement(By.xpath("//a[text()='JavaScript Alerts']"));
		js.click();
		WebElement na = driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
		na.click();
		Thread.sleep(5000);
		// driver.switchTo().alert().accept();//close alert using okay button
		//driver.switchTo().alert().dismiss();// close the alert by using cancel button
		Alert myalert=driver.switchTo().alert();
		System.out.println(myalert.getText());
		myalert.accept();
		
	}
}
