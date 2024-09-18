package org.checkbox.elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {
	WebDriver driver = new ChromeDriver();

	public void launchURL() {
		driver.manage().window().maximize();
		String url = "https://testautomationpractice.blogspot.com/";
		driver.get(url);

	}

	public void handleSingleCheckBox() {
		WebElement sundaycb = driver.findElement(By.xpath("//input[@id='sunday']"));
		sundaycb.click();
	}

	public void handleMultipleCheckBoxes() {
		List<WebElement> checkboxs = driver
				.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		for (WebElement checkbox : checkboxs) {
			checkbox.click();

		}
	}

	public void closeBrowser() {
		driver.close();
	}

}
