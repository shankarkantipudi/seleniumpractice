package dropdown;

import java.time.Duration;

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
		WebElement btdd=driver.findElement(By.xpath(""));
		btdd.click();
		
		
	}
}
