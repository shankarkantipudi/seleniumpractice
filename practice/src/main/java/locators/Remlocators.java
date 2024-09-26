package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Remlocators {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//maximize
		driver.manage().window().maximize();
		String url="https://demo.opencart.com/";
		driver.get(url);
		/*it is for both tag name and class name
		 * to get the group of web elements
		 *  scenario : how many web elements are present in the web page 
		 *  example: to count num of links; to count num of images
		 */
		// Tag name
		List<WebElement>links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		//class name
		List<WebElement>headerlinks=driver.findElements(By.className("d-none d-md-inline"));
		System.out.println(headerlinks.size());
		
		//name
		WebElement search= driver.findElement(By.name("search"));
		search.sendKeys("iphone");
		
		//id
		WebElement logo=driver.findElement(By.id("logo"));
		System.out.println(logo.isDisplayed());
		
		//link text 
		//[only take with anchor tag 'a' and href association 
		//that is also visable in ui page
		WebElement tablets=driver.findElement(By.linkText("Tablets"));
		tablets.click();
		
		//partial link text
		WebElement result =driver.findElement(By.partialLinkText("Samsung "));
		result.click();

		
	}
	
	
	


}
