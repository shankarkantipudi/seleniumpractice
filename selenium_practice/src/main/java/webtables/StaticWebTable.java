package webtables;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class StaticWebTable {

	static WebDriver driver = new ChromeDriver();
	static String url = "https://testautomationpractice.blogspot.com/";

	public static void staticwebtable() {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(url);
		
		// number of rows in the table
		List<WebElement> rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
		System.out.println(rows.size());
		
		// total number of columns in the table
		List<WebElement> cols = driver.findElements(By.xpath("//table[@name='BookTable']//th"));
		System.out.println(cols.size());
		
		// read data from specefic row and specific column (ex 5th row and 3 coloumn)
		WebElement specelement = driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]/td[3]"));
		System.out.println(specelement.getText());
		for (int r = 2; r <= rows.size(); r++) {
			for (int c = 1; c <= cols.size(); c++) {
				WebElement tableele = driver
						.findElement(By.xpath("//table[@name='BookTable']//tr[" + r + "]/td[" + c + "]"));
				System.out.print(tableele.getText() + "\t");

			}
			System.out.println();
		}
		
		// print book names whose author is mukesh
		for (int r = 2; r <= rows.size(); r++) {
			String author = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + r + "]/td[2]")).getText();
			System.out.println(author);
			if (author.equals("Mukesh")) {
				String bookname = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + r + "]/td[1]"))
						.getText();
				System.out.println(bookname);

			}

		}
		// find total price of all books
		int total = 0;
		for (int r = 2; r <= rows.size(); r++) {
			String price = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + r + "]/td[4]")).getText();
			total = total + Integer.parseInt(price);

		}
		System.out.println(total);

	}

}
