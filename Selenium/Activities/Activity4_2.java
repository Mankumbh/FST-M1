import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Activity4_2 {

    @Test
    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();
            driver.get("https://www.training-support.net/selenium/simple-form");
            String TitleOfPage = driver.getTitle();
            System.out.println(TitleOfPage);

        WebElement fname = driver.findElement(By.xpath("//input[@id='firstName']"));
        WebElement lname = driver.findElement(By.xpath("//input[@id='lastName']"));

        WebElement mail = driver.findElement(By.xpath("//input[@id='email']"));
        WebElement number = driver.findElement(By.xpath("//input[@id='number']"));

        fname.sendKeys("TestUser");
        lname.sendKeys("testUserLastName");
        mail.sendKeys("test1232@gmail.com");
        number.sendKeys("12345678");

        driver.findElement(By.xpath("//input[contains(@class,'green')]")).click();

        driver.close();
    }
}
