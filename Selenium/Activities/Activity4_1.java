import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Activity4_1 {

    @Test
    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();
            driver.get("https://www.training-support.net");
            String TitleOfPage = driver.getTitle();
            System.out.println(TitleOfPage);

            driver.findElement(By.xpath("//a[@id='about-link']")).click();

            String secondpagetitle = driver.getTitle();

            System.out.println("Second Page Title: " + secondpagetitle);

            driver.close();
    }
}
