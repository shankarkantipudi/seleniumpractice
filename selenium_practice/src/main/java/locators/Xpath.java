package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		//maximize
		driver.manage().window().maximize();
		String url="https://demo.opencart.com/";
		driver.get(url);
		//xpath with single attribute
		
		WebElement search = driver.findElement(By.xpath("//input[@placeholder='Search']"));
		search.sendKeys("MACBOOK");
		Thread.sleep(4000);
		
		//xpath with multiple attributes
		
		WebElement doubleattri=driver.findElement(By.xpath("//input[@name='search'][@placeholder='Search']"));
		doubleattri.clear();
		
		
		//xpath with "and","or" operators
		
		//and means both left and right should be currect, it will able to locate the element
		//or means and one is right it will able to locate the element
		
		WebElement withand=driver.findElement(By.xpath("//input[@name='search' and @placeholder='Search']"));
		withand.sendKeys("IPHONE");
		
		WebElement withor=driver.findElement(By.xpath("//input[@name='search' or @placeholder='search']"));
		withor.clear();
		Thread.sleep(4000);
		
		//xpath with text()-Inner text
		
		WebElement macbook=driver.findElement(By.xpath("//a[text()='Desktops']"));
		macbook.click();
		Thread.sleep(2000);
		
		//xpath with contains
		WebElement contains=driver.findElement(By.xpath("//input[contains(@placeholder,'Search')]"));
		contains.sendKeys("iphone");
		
		//xpath for start-with
		WebElement startwith= driver.findElement(By.xpath("//input[starts-with(@placeholder,'Sea')]"));
		startwith.clear();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
