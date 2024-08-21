package browserlaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Allbrowserlaunch {
	static WebDriver driver;

	public static void chromebrowser() {
		WebDriver driver = new ChromeDriver();

	}
    public static void Edgebrowser() {
    	WebDriver driver = new EdgeDriver();
    	
    }
    public static void Firefoxbrowser() {
    	WebDriver driver = new FirefoxDriver();
    	
    }
	public static void spicejeturl() {
		String url = "https://www.spicejet.com/";
		driver.get(url);

	}
	public static void close() {
		driver.close();
	}

	public static void main(String[] args) {
		Allbrowserlaunch.chromebrowser();
		Allbrowserlaunch.spicejeturl();
		Allbrowserlaunch.close();

	}

}
