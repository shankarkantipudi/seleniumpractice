package windowhandle;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class SingleBrowserWindowHandle {
	static WebDriver driver = new ChromeDriver();
	static String url = "https://www.hyrtutorials.com/p/window-handles-practice.html";

	public static void windowHandle() throws InterruptedException {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(url);
		String parentwindowhandle = driver.getWindowHandle();
		System.out.println(parentwindowhandle + driver.getTitle());
		Thread.sleep(5000);
		
		WebElement opennewwindow = driver.findElement(By.xpath("//button[@id='newWindowBtn']"));
		opennewwindow.click();
		Set<String> windowhandles = driver.getWindowHandles();
		for (String window : windowhandles) {
			if (!window.equals(parentwindowhandle)) {
				driver.switchTo().window(window);
				driver.manage().window().maximize();
				WebElement textbox = driver.findElement(By.xpath("//input[@id='firstName']"));
				textbox.sendKeys("shankar");
				Thread.sleep(5000);
				driver.close();

			}
			// System.out.println(window + driver.getTitle());

		}
		driver.switchTo().window(parentwindowhandle);
		System.out.println("in parent window");
		WebElement ptextbox = driver.findElement(By.xpath("//input[@id='name']"));
		ptextbox.sendKeys("sai");
		driver.quit();

	}

}
