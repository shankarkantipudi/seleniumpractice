package frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingFrame {
	static WebDriver driver = new ChromeDriver();

	public static void frame() {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		String url = "https://www.hyrtutorials.com/p/frames-practice.html";
		driver.get(url);
		WebElement textbox = driver.findElement(By.xpath("//input[@id='name'][1]"));
		textbox.sendKeys("shankar");
		WebElement f1 = driver.findElement(By.id("frm1"));

		driver.switchTo().frame(f1);

		System.out.println("inside framel");

		Select dropdown = new Select(driver.findElement(By.id("course")));

		dropdown.selectByVisibleText("Java");

		driver.switchTo().defaultContent();

		textbox.clear();

		driver.switchTo().frame(driver.findElement(By.id("frm2")));

		WebElement firstname = driver.findElement(By.id("firstName"));

		firstname.sendKeys("sai");

	}

}
