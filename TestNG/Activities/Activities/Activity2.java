package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity2 {

    WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {
        driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/target-practice");
    }

    @Test
    public void firstTest() {
        String title = driver.getTitle();
        System.out.println("Title of the page :" + title);
        Assert.assertEquals("Target Practice", title);
    }

    @Test
    public void secondTest() {

        WebElement blackButton = driver.findElement(By.xpath("//*[@class='ui black button']"));
        Assert.assertTrue(blackButton.isDisplayed());
        Assert.assertEquals(blackButton.getText(), "Black");
    }

    @Test(enabled = false)
    public void thirdTest() {
        System.out.println("case skipped");
    }

    @Test
    public void fourTest() {
        //This test will be skipped and will be be shown as skipped
        throw new SkipException("Skip this test case");
    }


    @AfterMethod
    public void afterMethod() {
        driver.quit();
    }
}
