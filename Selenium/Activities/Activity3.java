import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity3 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://training-support.net/selenium/simple-form");

        String title = driver.getTitle();

        System.out.println("Page title is: " + title);

        WebElement fname = driver.findElement(By.id("firstName"));
        WebElement lname = driver.findElement(By.id("lastName"));

        WebElement mail = driver.findElement(By.id("email"));
        WebElement number = driver.findElement(By.id("number"));

        fname.sendKeys("TestUser");
        lname.sendKeys("testUserLastName");
        mail.sendKeys("test1232@gmail.com");
        number.sendKeys("12345678");

        driver.findElement(By.xpath("//*[@type='submit']")).click();

        driver.close();

    }
}
