package webdrivermethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Waitmethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		//maximize
		driver.manage().window().maximize();
		String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		driver.get(url);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		//Element not found means-locator is incorrect
		//NOSuchElement-Element is not present on the page Synchronization
		/*ADV of thread.sleep()
		 * easy to use
		 * Dis-advantages
		 * if the time is not sufficient then you will get exception
		 * it will take maximum timeout this will reduce the perfomance of the script
		 * multiple times
		 * even though the element is less time also it will take max time*/
		
		

	}

}
