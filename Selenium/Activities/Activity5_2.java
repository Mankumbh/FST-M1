import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity5_2 {

    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();

        driver.get("https://training-support.net/selenium/dynamic-controls");
        String title = driver.getTitle();
        System.out.println("Page title is: " + title);

        WebElement checkBox = driver.findElement(By.xpath("//input[@class='willDisappear']"));

        System.out.println("checkbox value : " + checkBox.isSelected());

        checkBox.click();

        System.out.println("checkbox value : " + checkBox.isSelected());

        driver.close();

    }
}
