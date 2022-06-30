import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class test {


    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/chromeDriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().window().maximize();

        driver.get("https://www.my-picture.co.uk/photo-prints/canvas-prints.jsf");



                                                                      //div [@class='upload-button -fullbleed']//input[@id = 'uploadInputId533']
        WebElement upload = driver.findElement(By.xpath("//div[@class = 'upload-button -absolute']//input[@id='uploadInputId533']"));
        String filePass = "C:\\java project\\JavaSeleniumProject\\src\\pictures\\167776.jpg";

        upload.sendKeys(filePass);







    }



}
