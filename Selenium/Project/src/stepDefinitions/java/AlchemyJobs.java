import com.google.common.collect.Iterables;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class AlchemyJobs {
    WebDriver driver;

    @Given("^User is on Google Home Page$")
    public void userIsOnGooglePage() throws Throwable {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MICROSECONDS);
    }

    @When("User is navigate to URL")
    public void userIsNavigateToURL() {
        driver.get("https://alchemy.hguy.co/jobs");
    }

    @And("User Get the {string} of the website")
    public void userGetTheTitleOfTheWebsite(String Field) {
        String fieldToRead = null;

        switch (Field.toLowerCase()) {
            case "title":
            case "second page title":
                fieldToRead = driver.getTitle();
                System.out.println("Title of Page: " + fieldToRead);
                break;
            case "heading":
                fieldToRead = driver.findElement(By.xpath("//*[@class='entry-title']")).getText();
                System.out.println("Text on Page: " + fieldToRead);
                break;
            case "second heading":
                fieldToRead = driver.findElement(By.xpath("//div[@class='entry-content clear']//following-sibling::h2")).getText();
                System.out.println("Text on Page: " + fieldToRead);
                break;
            default:
                Assert.fail("please check case should be in lower");

        }
    }

    @And("User verifies {string} match exactly {string}")
    public void userVerifiesTitleMatchExactly(String Field, String pageContent) {
        String content = null;
        switch (Field.toLowerCase()) {
            case "title":
            case "second page title":
                content = driver.getTitle();
                if (content.equals(pageContent)) {
                    System.out.println("Page Content are correct :" + content);
                } else
                    System.out.println("Page Content are not as expected :" + content + "expected" + pageContent);
                break;
            case "heading":
                content = driver.findElement(By.xpath("//*[@class='entry-title']")).getText();
                if (content.equals(pageContent)) {
                    System.out.println("Page Content are correct :" + content);
                } else
                    System.out.println("Page Content are not as expected :" + content + "expected" + pageContent);
                break;
            case "second heading":
                content = driver.findElement(By.xpath("//div[@class='entry-content clear']//following-sibling::h2")).getText();
                if (content.equals(pageContent)) {
                    System.out.println("Page Content are correct :" + content);
                } else
                    System.out.println("Page Content are not as expected :" + content + "expected" + pageContent);
                break;
            default:
                Assert.fail("please check case should be in lower");
        }
    }

    @And("User get the URL of Header image")
    public void userGetTheURLOfHeaderImage() {
        WebElement srcURL = driver.findElement(By.xpath("//img[contains(@class,'attachment')]"));
        String value = srcURL.getAttribute("srcset");
        //  System.out.println("This is URL set : " + value);
    }

    @And("User print the URL on console")
    public void userPrintTheURLOnConsole() {
        WebElement imgURL = driver.findElement(By.xpath("//img[contains(@class,'attachment')]"));
        System.out.println("URL for Image is : " + imgURL.getAttribute("src"));
    }

    @And("User click on {string}")
    public void userClickOnJobs(String fieldToBeClick) throws InterruptedException {
        switch (fieldToBeClick.toLowerCase()) {
            case "jobs":
                driver.findElement(By.id("menu-item-24")).click();
                break;
            case "search jobs":
                WebElement jobsearch = driver.findElement(By.xpath("//input[@type='submit']"));
                jobsearch.click();
                Thread.sleep(500);
                break;
            case "select job":
                List<WebElement> firstJobInList = driver.findElements(By.xpath("//*[@class='job_listings']/li[1]/a"));
                for (WebElement value : firstJobInList) {
                    System.out.println("Total listed jobs are: " + value.getSize());
                    value.click();
                    Thread.sleep(500);
                }
                break;
            case "apply for job":
                WebElement applyFor = driver.findElement(By.xpath("//input[@value='Apply for job']"));
                applyFor.click();
                break;
            case "post job":
                WebElement postJob = driver.findElement(By.id("menu-item-26"));
                postJob.click();
                break;
            case "preview":
                WebElement preview = driver.findElement(By.xpath("//input[@name='submit_job']"));
                preview.click();
                Thread.sleep(100);
                break;
            case "submit listing":
                WebElement submitlisting = driver.findElement(By.xpath("//input[@name='continue']"));
                submitlisting.click();
                Thread.sleep(100);
                break;
            case "log in":
                WebElement loginButtton = driver.findElement(By.id("wp-submit"));
                loginButtton.click();
                Thread.sleep(500);
                break;
            case "job listing":
                WebElement listinJob = driver.findElement(By.xpath("//div[contains(text(),'Job Listing')]"));
                listinJob.click();
                Thread.sleep(500);
                break;
            case "add new":
                WebElement newjob = driver.findElement(By.xpath("//div[@class='wrap']/a[text()='Add New']"));
                newjob.click();
                Thread.sleep(500);
                break;
            default:
                Assert.fail("Case Not Found for : " + fieldToBeClick);

        }
    }

    @And("User enter {string} in search job field")
    public void userEnterInSearchJobField(String jobNameToSearch) {
        WebElement jobName = driver.findElement(By.name("search_keywords"));
        jobName.sendKeys(jobNameToSearch);
        System.out.println("Search Job name is: " + jobNameToSearch);
    }

    @And("User print the details on console")
    public void userPrintTheDeatilsOnConsole() {
        WebElement emailDetails = driver.findElement(By.className("job_application_email"));
        String emailfromPage = emailDetails.getText();
        System.out.println("Details from Page is : " + emailfromPage);
    }

    @And("^User close the browser$")
    public void closeTheBrowser() throws Throwable {
        driver.close();
    }


    @And("User enter {string} in {string} field")
    public void userEnterInField(String input, String Field) {
        WebElement field = null;
        switch (Field) {
            case "Your email":
                field = driver.findElement(By.xpath("//input[@name='create_account_email']"));
                field.clear();
                field.sendKeys(input);
                break;
            case "Job Title":
                field = driver.findElement(By.xpath("//input[@name='job_title']"));
                field.clear();
                field.sendKeys(input);
                break;
            case "Description":
                driver.switchTo().frame("job_description_ifr");
                field = driver.findElement(By.xpath("//*[@data-id='job_description']"));
                field.sendKeys(input);
                driver.switchTo().defaultContent();
                break;
            case "Application email":
                field = driver.findElement(By.xpath("//input[@name='application']"));
                field.clear();
                field.sendKeys(input);
                break;
            case "Company name":
                field = driver.findElement(By.xpath("//input[@name='company_name']"));
                field.clear();
                field.sendKeys(input);
                break;
            case "Username":
                field = driver.findElement(By.id("user_login"));
                field.sendKeys(input);
                break;
            case "Password":
                field = driver.findElement(By.id("user_pass"));
                field.sendKeys(input);
                break;
            default:
                Assert.fail("Please check the input and field:" + Field);
        }
    }

    @And("User fills below {string}")
    public void publicvoiduserFillsBelow(String type, Map<String, String> keyValueMap) {
        for (Map.Entry<String, String> entry : Iterables.skip(keyValueMap.entrySet(), 1)) {
            try {

                if (entry.getValue().equalsIgnoreCase(""))
                    continue;
                WebElement field = null;
                switch (entry.getKey()) {
                    case "Your email":
                        field = driver.findElement(By.xpath("//input[@name='create_account_email']"));
                        field.clear();
                        field.sendKeys(entry.getValue());
                        break;
                    case "JobTitle":
                        field = driver.findElement(By.xpath("//input[@name='job_title']"));
                        field.clear();
                        field.sendKeys(entry.getValue());
                        break;
                    case "Description":
                        driver.switchTo().frame("job_description_ifr");
                        field = driver.findElement(By.xpath("//*[@data-id='job_description']"));
                        field.clear();
                        field.sendKeys(entry.getValue());
                        driver.switchTo().defaultContent();
                        break;
                    case "Applicationemail":
                        field = driver.findElement(By.id("//input[@name='application']"));
                        field.clear();
                        field.sendKeys(entry.getValue());
                        break;
                    case "Companyname":
                        field = driver.findElement(By.id("//input[@name='company_name']"));
                        field.clear();
                        field.sendKeys(entry.getValue());
                        break;
                    default:
                        Assert.fail("Pleasechecktheinputandfield:" + entry.getValue());

                }
            } catch (NullPointerException e) {
                continue;
            }
        }
    }

    @When("User is navigate to dashboard URL")
    public void userIsNavigateToDashboardURL() {
        driver.get("https://alchemy.hguy.co/jobs/wp-login.php?redirect_to=https%3A%2F%2Falchemy.hguy.co%2Fjobs%2Fwp-admin%2F&reauth=1");
        System.out.println("Title of the Dashboard Page : " + driver.getTitle());
    }
}
