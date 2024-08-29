package webdrivermethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browsermethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		//maximize
		driver.manage().window().maximize();
		String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		driver.get(url);
		Thread.sleep(1000);
		 WebElement hyperlink=driver.findElement(By.linkText("OrangeHRM, Inc"));
		 hyperlink.click();
		 driver.close();//it will close the main tab on the browser that is the main url page
		 driver.quit();//it will close the entire browser session
		

	}

}
