package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class AutoSuggestiveDropDowns {
	static WebDriver driver = new ChromeDriver();
	static String url = "https://www.google.com/";

	public static void autosuggestivedropdown() {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(url);
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("MumbaiIndians");
		List<WebElement> options = driver.findElements(By.xpath("//div[@class='wM6W7d' and @role='presentation']"));
		int count = options.size();
		System.out.println(count);
		for (WebElement option : options) {
			System.out.println(option.getText());
			if (option.getText().equalsIgnoreCase("Mumbai Indians")) {
				option.click();
			}

		}
		driver.close();
	}

}
