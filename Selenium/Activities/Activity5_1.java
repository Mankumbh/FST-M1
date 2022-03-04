import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Activity5_1 {

    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();

        driver.get("https://training-support.net/selenium/dynamic-controls");
        String title = driver.getTitle();
        System.out.println("Page title is: " + title);

        WebElement checkBox = driver.findElement(By.xpath("//input[@class='willDisappear']"));
//        checkBox.click();
        System.out.println("checkbox value : " + checkBox.isDisplayed());

        driver.findElement(By.id("toggleCheckbox")).click();
        System.out.println("checkbox value : " + checkBox.isDisplayed());

        driver.close();

    }
}
