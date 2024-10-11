package dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
@Test
public class HiddenDropDown {
	static WebDriver driver = new ChromeDriver();
	static String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	public static void dropdown() {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(url);
		WebElement username= driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys("Admin");
		WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("admin123");
		WebElement login=driver.findElement(By.xpath("//button[text()=' Login ']"));
		login.click();
		WebElement pim=driver.findElement(By.xpath("//span[text()='PIM']"));
		pim.click();
		WebElement jobtitle=driver.findElement(By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[position()=3]"));
		jobtitle.click();
		//hidden dropdown
		/*
		 * press fn+f12
		 * then ctrl+shift+p
		 * then search for focus
		 * click on emulate a focused page
		 * then click on dropdown
		 * 
		 * */
		WebElement option=driver.findElement(By.xpath("//span[text()='Chief Executive Officer']"));
		option.click();
		
		
	}

	
	}


