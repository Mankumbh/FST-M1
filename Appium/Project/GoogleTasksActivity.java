package Project;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class GoogleTasksActivity {

    AndroidDriver<MobileElement> driver;
    WebDriverWait wait;

    @BeforeClass
    public void setup() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceId", "11848566");
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appActivity", "com.google.android.apps.tasks");
        caps.setCapability("appActivity", ".ui.TaskListsActivity");
        caps.setCapability("noReset", true);

        URL remoteUrl = new URL("http://localhost:4723/wd/hub");

        driver = new AndroidDriver<>(remoteUrl, caps);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 30);
    }

    @Test
    public void testGoogleTasks() {
        //create new list to add expected tasks
        List<String> expectedTasks = new ArrayList<>();
        //add the expected tasks to the list
        expectedTasks.add("Complete Activity with Google Tasks");
        expectedTasks.add("Complete Activity with Google Keep");
        expectedTasks.add("Complete the second Activity Google Keep");

        for(String taskName : expectedTasks) {

            driver.findElementById("tasks_fab").click();

            wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.id("add_task_title")));

            driver.findElementById("add_task_title").sendKeys(taskName);

            driver.findElementById("add_task_done").click();
        }

        List<MobileElement> tasks = driver.findElementsById("com.google.android.apps.tasks:id/task_name");

        for(MobileElement task : tasks) {
            String taskName = task.getText();
            if(!taskName.isEmpty()) {
                Assert.assertTrue(expectedTasks.contains(taskName));
            }
        }
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}