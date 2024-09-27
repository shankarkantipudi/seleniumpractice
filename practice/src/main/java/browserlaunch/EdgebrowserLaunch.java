package browserlaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgebrowserLaunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		String url = "https://www.spicejet.com/";
		driver.get(url);
		driver.close();

	}

}
