import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Activity4_3 {

    @Test
    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();
            driver.get("https://www.training-support.net/selenium/target-practice");
            String TitleOfPage = driver.getTitle();
            System.out.println(TitleOfPage);

        String thirdHeader = driver.findElement(By.xpath("//*[@id='third-header']")).getText();
        System.out.println("Value of Third Header is : " + thirdHeader);

        String fifthHeader = driver.findElement(By.xpath("//h5[contains(text(),'Fifth header')]")).getCssValue("color");
        System.out.println("Color of Fifth Header is : " + fifthHeader);

        String violetButton = driver.findElement(By.xpath("//button[contains(@class,'violet')]")).getAttribute("class");
        System.out.println("class property of Violet Button : "+ violetButton);

        String greyButton = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[3]/button[2]")).getText();
        System.out.println("The grey button : " + greyButton);

        driver.close();
    }
}
