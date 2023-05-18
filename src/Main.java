import org.junit.Assert;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Test;

public class Main {
    public static WebDriver driver;
    @BeforeClass
    public static void setupChrome() {
        driver = new ChromeDriver();
        driver.get("https://www.fiscal.treasury.gov/");
        driver.manage().window().maximize();
        System.out.println("Loading Chrome Driver");
    }
    @Test
    public void testHomePage() {
        driver.navigate().back();
        System.out.println("Loading testHomePage()");
        String currentUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.fiscal.treasury.gov/";
        Assert.assertEquals(expectedUrl, currentUrl);
    }
    @Test
    public void testSubMenu() throws InterruptedException {
        System.out.println("Loading Sub Menus()");
        driver.findElement(By.xpath("//*[@id=\"header-site\"]/div[3]/content-lock/h-box/v-box[2]/h-box/v-box[1]/button")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"header-site\"]/div[3]/content-lock/h-box/v-box[2]/h-box/v-box[2]/button")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"header-site\"]/div[3]/content-lock/h-box/v-box[2]/h-box/v-box[3]/button")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"header-site\"]/div[3]/content-lock/h-box/v-box[2]/h-box/v-box[1]/button")).click();
        Thread.sleep(500);

        //Checking About


        //Checking Mail
        driver.findElement(By.xpath("//*[@id=\"header-site\"]/div[3]/content-lock/h-box/v-box[2]/h-box/v-box[1]/button")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"header-menu\"]/div[2]/h-box[2]/v-box[2]/a/img")).click();
        Thread.sleep(500);
        String currentMailingUrl = driver.getCurrentUrl();
        String expectedMailUrl = "https://www.fiscal.treasury.gov/mailinglists.html";
        Assert.assertEquals(expectedMailUrl, currentMailingUrl);
        Thread.sleep(500);

        //Checking News
        driver.findElement(By.xpath("//*[@id=\"header-site\"]/div[3]/content-lock/h-box/v-box[2]/h-box/v-box[1]/button")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"header-menu\"]/div[2]/h-box[2]/v-box[3]/a/img")).click();
        Thread.sleep(500);
        String currentNewsUrl = driver.getCurrentUrl();
        String expectedNewsUrl = "https://www.fiscal.treasury.gov/news/";
        Assert.assertEquals(expectedNewsUrl, currentNewsUrl);
        Thread.sleep(500);

        //Checking Reports
        driver.findElement(By.xpath("//*[@id=\"header-site\"]/div[3]/content-lock/h-box/v-box[2]/h-box/v-box[1]/button")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"header-menu\"]/div[2]/h-box[2]/v-box[4]/a/img")).click();
        Thread.sleep(500);
        String currentReportsUrl = driver.getCurrentUrl();
        String expectedReportsUrl = "https://www.fiscal.treasury.gov/reports-statements/";
        Assert.assertEquals(expectedReportsUrl, currentReportsUrl);
        Thread.sleep(500);

        //Checking Forms
        driver.findElement(By.xpath("//*[@id=\"header-site\"]/div[3]/content-lock/h-box/v-box[2]/h-box/v-box[1]/button")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"header-menu\"]/div[2]/h-box[2]/v-box[5]/a/img")).click();
        Thread.sleep(500);
        String currentFormsUrl = driver.getCurrentUrl();
        String expectedFormsUrl = "https://www.fiscal.treasury.gov/forms.html";
        Assert.assertEquals(expectedFormsUrl, currentFormsUrl);
        Thread.sleep(500);

        //Checking References
        driver.findElement(By.xpath("//*[@id=\"header-site\"]/div[3]/content-lock/h-box/v-box[2]/h-box/v-box[1]/button")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"header-menu\"]/div[2]/h-box[2]/v-box[6]/a/img")).click();
        Thread.sleep(500);
        String currentReferenceUrl = driver.getCurrentUrl();
        String expectedReferenceUrl = "https://www.fiscal.treasury.gov/reference-guidance/";
        Assert.assertEquals(expectedReferenceUrl, currentReferenceUrl);
        Thread.sleep(500);

        //Checking Training
        driver.findElement(By.xpath("//*[@id=\"header-site\"]/div[3]/content-lock/h-box/v-box[2]/h-box/v-box[1]/button")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"header-menu\"]/div[2]/h-box[2]/v-box[7]/a/img")).click();
        Thread.sleep(500);
        String currentTrainingUrl = driver.getCurrentUrl();
        String expectedTrainingUrl = "https://www.fiscal.treasury.gov/training/";
        Assert.assertEquals(expectedTrainingUrl, currentTrainingUrl);
        Thread.sleep(500);

        //Checking FAQs
        driver.findElement(By.xpath("//*[@id=\"header-site\"]/div[3]/content-lock/h-box/v-box[2]/h-box/v-box[1]/button")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"header-menu\"]/div[2]/h-box[2]/v-box[8]/a/img")).click();
        Thread.sleep(500);
        String currentFAQUrl = driver.getCurrentUrl();
        String expectedFAQUrl = "https://www.fiscal.treasury.gov/faqs.html";
        Assert.assertEquals(expectedFAQUrl, currentFAQUrl);
        Thread.sleep(500);

        //Checking Events
        driver.findElement(By.xpath("//*[@id=\"header-site\"]/div[3]/content-lock/h-box/v-box[2]/h-box/v-box[1]/button")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"header-menu\"]/div[2]/h-box[2]/v-box[9]/a/img")).click();
        Thread.sleep(500);
        String currentEventUrl = driver.getCurrentUrl();
        String expectedEventUrl = "https://www.fiscal.treasury.gov/events/";
        Assert.assertEquals(expectedEventUrl, currentEventUrl);
        Thread.sleep(500);

        //Checking Careers
        driver.findElement(By.xpath("//*[@id=\"header-site\"]/div[3]/content-lock/h-box/v-box[2]/h-box/v-box[1]/button")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"header-menu\"]/div[2]/h-box[2]/v-box[10]/a/img")).click();
        Thread.sleep(500);
        String currentCareerUrl = driver.getCurrentUrl();
        String expectedCareerUrl = "https://www.fiscal.treasury.gov/careers/";
        Assert.assertEquals(expectedCareerUrl, currentCareerUrl);
        Thread.sleep(500);

        driver.close();
    }
    @Test
    public void businessInstitutions() {
        driver.findElement(By.xpath("//*[@id=\"main\"]/section[1]/content-lock/h-box[1]/v-box[3]/a/h-box/chooser-text/h2")).click();
        System.out.println("Loading businessInstitutions");
        String currentUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.fiscal.treasury.gov/business/";
        Assert.assertEquals(expectedUrl, currentUrl);
    }
    @Test
    public void testGeneralPublic() {
        driver.findElement(By.xpath("//*[@id=\"main\"]/section[1]/content-lock/h-box[1]/v-box[1]/a/h-box/chooser-text/h2")).click();
        System.out.println("Loading testGeneralPublic()");
        String currentUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.fiscal.treasury.gov/public/";
        Assert.assertEquals(expectedUrl, currentUrl);
    }
    @Test
    public void testGovernmentAgencies() {
        driver.navigate().back();
        driver.findElement(By.xpath("//*[@id=\"main\"]/section[1]/content-lock/h-box[1]/v-box[2]/a/h-box/chooser-text/h2")).click();
        System.out.println("Loading testGovernmentAgencies()");
        String currentUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.fiscal.treasury.gov/government/";
        Assert.assertEquals(expectedUrl, currentUrl);
    }
    @Test
    public void jenkinsMsg() {
        System.out.println("Jenkins Build Test Deploy");
    }

}