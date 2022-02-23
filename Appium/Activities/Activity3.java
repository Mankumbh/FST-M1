package examples;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Activity3 {
    WebDriverWait wait;
    AndroidDriver<MobileElement> driver = null;

    @BeforeClass
    public void setup() throws MalformedURLException {
        // Set the Desired Capabilities
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceId", "11848566");
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appPackage", "com.oneplus.calculator");
        caps.setCapability("appActivity", ".Calculator");
        caps.setCapability("noReset", true);

        // Instantiate Appium Driver
        driver = new AndroidDriver<>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
        wait = new WebDriverWait(driver, 10);
        // Open page in browser

    }

    @Test
    public void addition() {
        //Calculate 5 + 9 and print the result to the console.
        driver.findElementById("digit_5").click();
        driver.findElementById("op_add").click();
        driver.findElementById("digit_9").click();
        driver.findElementById("eq").click();
        String additionResult = driver.findElementById("result").getText();
        System.out.println("Result for 5 + 9 : " + additionResult);
        Assert.assertEquals(additionResult, "14");
    }

    @Test
    public void substraction() {
        //Calculate 10 - 5 and print the result to the console.
        driver.findElementById("clr");
        driver.findElementById("digit_1").click();
        driver.findElementById("digit_0").click();
        driver.findElementById("op_sub").click();
        driver.findElementById("digit_5").click();
        driver.findElementById("eq").click();
        String subResult = driver.findElementById("result").getText();
        System.out.println("Result for 10 - 5 : " + subResult);
        Assert.assertEquals(subResult, "5");
    }

    @Test
    public void multiplication() {
        //Calculate 5 * 100 and print the result to the console.
        driver.findElementById("clr");
        driver.findElementById("digit_5").click();
        driver.findElementById("op_mul").click();
        driver.findElementById("digit_1").click();
        driver.findElementById("digit_0").click();
        driver.findElementById("digit_0").click();
        driver.findElementById("eq").click();
        String mulResult = driver.findElementById("result").getText();
        System.out.println("Result for 5 * 100 : " + mulResult);
        Assert.assertEquals(mulResult, "500");
    }

        @Test
        public void division(){
        //Calculate 50 / 2 and print the result to the console.
        driver.findElementById("clr");
        driver.findElementById("digit_5").click();
        driver.findElementById("digit_0").click();
        driver.findElementById("op_div").click();
        driver.findElementById("digit_2").click();
        driver.findElementById("eq").click();
        String divResult = driver.findElementById("result").getText();
        System.out.println("Result for 50/2 : "+ divResult);
        Assert.assertEquals(divResult,"25");

    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }

}
