package webdrivermethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Conditionalmethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		//maximize
		driver.manage().window().maximize();
		String url="https://demoqa.com/automation-practice-form";
		driver.get(url);
		/*
		 * Conditional methods -access these commands through WebElement
		 * returns boolean value(true/false)
		 * isDisplayed();
		 * isEnabled()
		 * isSelected()
		 */
		//isDisplayed()-we can check display status of the element
		
		WebElement maintitle=driver.findElement(By.xpath("//a/img[@src='/images/Toolsqa.jpg']"));
		System.out.println(maintitle.isDisplayed());
		
		Thread.sleep(2000);
		
		//isEnabled() -we can check enable/disable status of the element /operational element
		WebElement email=driver.findElement(By.xpath("//label[text()='Email']"));
		System.out.println(email.isEnabled());
		Thread.sleep(2000);
		
		//isSelected()- we can use to check the element is selected or not (radio boxes check boxes)
		
		WebElement gender= driver.findElement(By.xpath("//input[@id='gender-radio-1']"));
		gender.click();
		System.out.println(gender.isSelected());
		
		
		
		

	}

}
