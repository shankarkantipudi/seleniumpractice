package webtables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
@Test
public class Dynamicwebtable {
   static WebDriver driver=new ChromeDriver();
   static String url="https://www.ecomdeveloper.com/demo/admin/index.php";
    public static void dynamic() throws InterruptedException {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get(url);
        WebElement username=driver.findElement(By.xpath("//input[@id='input-username']"));
        username.clear();
        username.sendKeys("demoadmin");
        WebElement password=driver.findElement(By.xpath("//input[@id='input-password']"));
        password.clear();
        password.sendKeys("demopass");
        WebElement login=driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
        Thread.sleep(5000);
        login.click();
        WebElement customers=driver.findElement(By.xpath("//a[text()=' Customers']"));
        customers.click();
        WebElement customer=driver.findElement(By.xpath("//ul[@id='collapse9']//a[text()='Customers']"));
        customer.click();
        String text=driver.findElement(By.xpath("//div[@class='col-sm-6 text-right']")).getText();
        System.out.println(text);
        int pages= Integer.parseInt(text.substring(text.indexOf("(")+1,text.indexOf("Pages")-1));
        System.out.println(pages);
        for(int p=1;p<=3;p++){
            if(p>1){
               WebElement actpage= driver.findElement(By.xpath("//ul[@class='pagination']//*[text()="+p+"]"));
               actpage.click();
        System.out.println("hello world");
            }
            int totalRows=driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody/tr")).size();
            for(int r=1;r<=totalRows;r++){
                String custname=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody/tr["+r+"]/td[2]")).getText();
                System.out.println(custname);
                String email= driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody/tr["+r+"]/td[3]")).getText();
                System.out.println(email);
            }
        }



}}
