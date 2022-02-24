package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Activity8 {
    WebDriverWait wait;
    WebDriver driver;

    @Test
    public void loginTestCase() {
         System.out.println("Parralel execution added in testng.xml");
    }


    @AfterTest(alwaysRun = true)
    public void afterMethod() {
        driver.quit();
    }
}
