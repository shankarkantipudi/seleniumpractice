package frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

@Test
public class Nestedframes {
	static WebDriver driver = new ChromeDriver();

	public static void nestedFrames() {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		String url = "https://www.hyrtutorials.com/p/frames-practice.html";
		driver.get(url);
		WebElement textbox = driver.findElement(By.xpath("//input[@id='name'][1]"));
		textbox.sendKeys("shankar");
		driver.switchTo().frame(driver.findElement(By.id("frm3")));
		System.out.println("inside the frame3");
		WebElement textbox2 = driver.findElement(By.xpath("//input[@class='frmTextBox' and @id='name'][1]"));
		textbox2.sendKeys("sai");
		driver.switchTo().frame(driver.findElement(By.id("frm1")));
		WebElement frmlinf3 = driver.findElement(By.id("selectnav1"));
		Select dd = new Select(frmlinf3);
		System.out.println("inside the frame3 in framel");
		dd.selectByVisibleText("Menu");

	}

}
