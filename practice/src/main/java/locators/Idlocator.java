package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Idlocator {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		//maximize
		driver.manage().window().maximize();
		String url="https://demoqa.com/automation-practice-form";
		driver.get(url);
		Thread.sleep(2000);
		//id
		WebElement firstname=driver.findElement(By.id("firstName"));
		firstname.sendKeys("shankar");
		WebElement lastname=driver.findElement(By.id("lastName"));
		lastname.sendKeys("kantipudi");
		
		
		
		

	}

}
