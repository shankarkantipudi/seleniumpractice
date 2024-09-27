package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cssselector {

	public static void main(String[] args) {
		/*
		 * CSS selector----

1.tag with id                  tag#id
2.tag with class               tag.classname
3.tag with attribute           tag[attribute='value']
4.tag with class attribute     tag.classname[attribute='value']
		 */
		WebDriver driver=new ChromeDriver();
		//maximize
		driver.manage().window().maximize();
		String url="https://demoqa.com/automation-practice-form";
		driver.get(url);
		
		//tag with id 
		
		// --firstmethod
		WebElement firstname=driver.findElement(By.cssSelector("input#firstName"));
		firstname.sendKeys("shankar");
		//second method
		WebElement  lastname=driver.findElement(By.cssSelector("#lastName"));
		lastname.sendKeys("kantipudi");
		
		
		//tag with class
		
		WebElement submit=driver.findElement(By.cssSelector("button.btn.btn-primary"));
		String text=submit.getText();
		System.out.println(text);
		
	//	WebElement submitbutt=driver.findElement(By.cssSelector(".btn.btn-primary"));
		//submitbutt.click();
		
		//tag with attribute
		WebElement email=driver.findElement(By.cssSelector("input[placeholder='name@example.com']"));
		email.sendKeys("shankar.kantipudi@gmail.com");
		WebElement email2=driver.findElement(By.cssSelector("[placeholder='name@example.com']"));
		email2.clear();
		
		//tag with class attribute 
		WebElement Mobilenumber=driver.findElement(By.cssSelector("input.mr-sm-2.form-control[placeholder='Mobile Number']"));
		Mobilenumber.sendKeys("9234598765");
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
