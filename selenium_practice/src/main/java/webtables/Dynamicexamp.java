package webtables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

@Test
public class Dynamicexamp {
    static WebDriver driver= new ChromeDriver();
    static String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
    public static void example(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        driver.get(url);
        WebElement username= driver.findElement(By.xpath("//input[@name='username']"));
        username.sendKeys("Admin");
        WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
        password.sendKeys("admin123");
        WebElement login=driver.findElement(By.xpath("//button[text()=' Login ']"));
        login.click();
        WebElement admin= driver.findElement(By.xpath("//span[text()='Admin']"));
        admin.click();
        List<WebElement> rows=driver.findElements(By.xpath("//div[@class='oxd-table-card']"));
        System.out.println(rows.size());
        List<WebElement> cols=driver.findElements(By.xpath("//div[@class='oxd-table-header']//div[@role='columnheader']"));
        System.out.println(cols.size());
        //To findout a specefic element
        WebElement specele=driver.findElement(By.xpath("//div[@class='oxd-table-card'][1]//div[@role='cell'][4]"));
        System.out.println(specele.getText());
        //to find out all table contents
        for(int r=1;r<= rows.size();r++){
            for(int c=1;c<=cols.size();c++){
                WebElement table_cont=driver.findElement(By.xpath("//div[@class='oxd-table-card']["+r+"]//div[@role='cell']["+c+"]"));
                System.out.print(table_cont.getText() +"\t");

            }
            System.out.println( );
        }




    }
}
