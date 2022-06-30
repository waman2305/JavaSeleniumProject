import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class SeleniumApp {


    public String URL = "URL: ";
    public String Title = "Title: ";


    @Test
    public void test() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/chromeDriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.my-picture.co.uk");
        WebElement login = driver.findElement(By.xpath("/html/body/header/div[1]/div[1]/div/div[4]/a"));
        login.click();

        Thread.sleep(2000);

        WebElement emailAddress = driver.findElement(By.xpath("//input [@id = 'loginForm:username']"));
        emailAddress.sendKeys("Test");

        WebElement password = driver.findElement(By.xpath("//input [@id = 'loginForm:password']"));
        password.sendKeys("12345");

        WebElement loginButton = driver.findElement(By.xpath("//input [@id = 'loginForm:loginButton']"));
        loginButton.click();

        Thread.sleep(1000);


        WebElement errorMessage = driver.findElement(By.xpath("//ul//li [@class = '-error']"));

        String expertResult = "Login failed.";
        String actualResult = errorMessage.getText().trim();


        assertEquals(expertResult, actualResult);


        WebElement wallDecore = driver.findElement(By.xpath("//div [@class ='page-head-row']//ul//a[@href = '/wall-decor/']"));
        wallDecore.click();


        Thread.sleep(1000);

        String nameUrl = driver.getCurrentUrl();
        System.out.println(URL + nameUrl);

        String title = driver.getTitle();
        System.out.println(Title + title);

        WebElement mixpix = driver.findElement(By.xpath("//div//h2//a[text() = 'MIXPIX']"));
        mixpix.click();
        String mixpixUrl = driver.getCurrentUrl();
        System.out.println(URL + mixpixUrl);
        String mixpixTitle = driver.getTitle();
        System.out.println(Title + mixpixTitle);


        driver.quit();


    }


}
