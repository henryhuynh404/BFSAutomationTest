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
        System.out.println("Jenkins Build Test Version 5");
    }

}