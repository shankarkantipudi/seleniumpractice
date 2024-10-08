package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

@Test
public class SelectDropDown {
	static WebDriver driver = new ChromeDriver();
	static String url = "https://testautomationpractice.blogspot.com";

	public static void dropdown() {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(url);
		WebElement countryDD = driver.findElement(By.xpath("//select[@id='country']"));
		Select dd = new Select(countryDD);
		//dd.selectByIndex(1);
		//dd.selectByValue("uk");
		//dd.selectByVisibleText("Australia");
		// capture the number of options from dropdown
		List<WebElement> options = dd.getOptions();
		System.out.println(options.size());

		// printing all the values in the dropdown
		for (WebElement option : options) {
			System.out.println(option.getText());

		}

	}

}
