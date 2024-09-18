package webdrivermethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicitwaitdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));//implicit wait
		//maximize
		driver.manage().window().maximize();
		String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		driver.get(url);
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.close();
		
		/*it will not wait untill the max time (if the element found in 3 sec it will execute next statment)
		 * dis-advantage: if the element is taking more than the given time it will through exception
		 * specify only one time after creating the driver instance
		 * this is alive till you close your browser
		 * it will be applicable for all over the program
		 * */
	}

}
