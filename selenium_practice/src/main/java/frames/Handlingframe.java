package frames;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingframe {
	static WebDriver driver= new ChromeDriver();
	private static  void frame() {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		String url = "https://demoqa.com/frames";
		driver.get(url);
		
		
		
	}
	

}
