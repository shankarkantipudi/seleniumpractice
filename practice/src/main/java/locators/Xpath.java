package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		// maximize
		driver.manage().window().maximize();
		String url = "https://demoqa.com/automation-practice-form";
		driver.get(url);
		Thread.sleep(2000);
		// xpath with tag name
		WebElement email = driver.findElement(By.xpath("//input[@class='mr-sm-2 form-control']"));
		email.sendKeys("shankar.kantipudi@gmail.com");

	}

}
