package alertPopUps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
@Test
public class AuthenticatedPopup {
	static WebDriver driver = new ChromeDriver();
	public void Authentication()
	{
		driver.manage().window().maximize();
		//driver.get("http://the-internet.herokuapp.com/basic_auth*);
		//Syntax:
		//http://username:password@the-internet.herokuapp.com/basic_auth
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
	}
}

