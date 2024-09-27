package webdrivermethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getmethods {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * get methods - we can access these methods through webdriver instance
		 *  get(url) - opens the url on the browser 
		 *  getTitle() - returns title of the page
         *  getCurrentUrl() - retuns URL of the page 
         *  getPageSource() - returns source code of the page 
         *  getWindowHandle() - returns ID of the single Browser window 
         *  getWindowHandles() - retuns ID's of the multiple browser windows
		 */
		WebDriver driver=new ChromeDriver();
		//maximize
		driver.manage().window().maximize();
		String url="https://demoqa.com/automation-practice-form";
		//get()-it will not return any thing
		
		driver.get(url);
		
		//get-title()
		
		String expectedtitle="DEMOQA";
		String title=driver.getTitle();
		System.out.println(title);
		System.out.println(expectedtitle.equals(title));
		
		//getCurrentUrl()
		String currenturl=driver.getCurrentUrl();
		System.out.println(currenturl);
		
		//getPageSource()
		String pagesource=driver.getPageSource();
		System.out.println(pagesource);
		
		//getWindowHandle()
		String windowid=driver.getWindowHandle();
		System.out.println("window id : "+windowid);
		
		//getWindowHandles()
		WebElement elementstab= driver.findElement(By.xpath("//div[text()='Elements']"));
		elementstab.click();
		Thread.sleep(2000);
		WebElement textbox=driver.findElement(By.xpath("//span[text()='Text Box']"));
		textbox.click();
	Set<String>	windowids =driver.getWindowHandles();
	System.out.println(windowids);
	
	
		
		
		
		
		
		
		
		

	}

}
