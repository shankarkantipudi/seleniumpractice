package typesOfWaits;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import browserlaunch.Allbrowserlaunch;

public class Implicitwait extends Allbrowserlaunch {
	static WebDriver driver;

	public static void main(String[] args) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Allbrowserlaunch.chromebrowser();
        Allbrowserlaunch.spicejeturl();
		Allbrowserlaunch.close();

	}

}
