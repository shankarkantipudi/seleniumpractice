package windowhandle;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class NewTabWindowHandle {
	static WebDriver driver = new ChromeDriver();
	static String url = "https://www.hyrtutorials.com/p/window-handles-practice.html";

	public static void newtabWindowHandle() throws InterruptedException {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(url);
		Thread.sleep(5000);
		String parentwindowhandle = driver.getWindowHandle();
		System.out.println(parentwindowhandle + driver.getTitle());
		WebElement newtabbutton = driver.findElement(By.xpath("//button[@id='newTabBtn']"));
		newtabbutton.click();
		Set<String> windowhandles = driver.getWindowHandles();
		for (String window : windowhandles) {
			if (!window.equals(parentwindowhandle)) {
				driver.switchTo().window(window);
				Thread.sleep(5000);
				WebElement clickme = driver.findElement(By.xpath("//button[@id='alertBox']"));
				clickme.click();
				Alert alert = driver.switchTo().alert();
				alert.accept();

				driver.close();

			}

		}
		driver.switchTo().window(parentwindowhandle);
		System.out.println("in parent window");
		WebElement ptextbox = driver.findElement(By.xpath("//input[@id='name']"));
		ptextbox.sendKeys("sai");
		driver.quit();
	}
}
