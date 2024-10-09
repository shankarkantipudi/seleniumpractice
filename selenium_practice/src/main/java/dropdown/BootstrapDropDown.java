package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
@Test
public class BootstrapDropDown {
	static WebDriver driver = new ChromeDriver();
	static String url = "https://www.jquery-az.com/boots/demo.php?ex=63.0_2";
	public static void dropdown() {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(url);
		WebElement btdd=driver.findElement(By.xpath("//span[@class='multiselect-selected-text']"));
		btdd.click();
		//select single option
		WebElement ele=driver.findElement(By.xpath("//input[@value='Java']"));
		ele.click();
		//capture all the options and then find out the size
		List<WebElement>ddoptions=driver.findElements(By.xpath("//ul[@class='multiselect-container dropdown-menu']//label"));
		for (WebElement ddoption : ddoptions) {
			System.out.println(ddoption.getSize());
			System.out.println(ddoption.getText());
			
		}
		//select multiple option from dropdown
		for (WebElement op : ddoptions) {
			if(op.getText().equalsIgnoreCase("Java") || op.getText().equalsIgnoreCase("Python")) {
				op.click();
			}
			
		}
	
		
	}
}
