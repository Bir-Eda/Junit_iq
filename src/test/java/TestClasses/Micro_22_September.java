package TestClasses;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.DriverManager;
import java.util.concurrent.TimeUnit;

public class Micro_22_September {
    static WebDriver driver;
    static JavascriptExecutor jse;
    @BeforeAll
        public static void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        jse=(JavascriptExecutor) driver;
        // jse.executeScript("window.location='https://www.bankofamerica.com/");
       // jse.executeScript("window.location=arguments[0]",baseUrl);
        System.out.println("@beforeAll-initiated and navigated to web page");
    }

    @Test
    public void test1() throws InterruptedException {
        WebElement element=driver.findElement(By.xpath("//*[text()='Infinite Scroll']"));
        element.click();
        Thread.sleep(2000);
//        WebDriverWait wait=new WebDriverWait(driver, 5);  // Explisit wait
//        WebElement hoverBtn;
//        hoverBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Infinite Scroll']")));



        // WebElement agree = driver.findElement(By.xpath("//a[text()='Online Banking Service Agreement']"));

         WebElement agree =(WebElement) jse.executeScript("return document.getElementByxpath(arguments[1])","//a[@href='/online-banking/service-agreement.go?request_locale=en_US']");
        // jse.executeScript("arguments[1].scrollIntoView(true)",agree);

        Thread.sleep(10000);
        jse.executeScript("window.scrollBy(0,1800)"); //scroll down
        Thread.sleep(5000);
        jse.executeScript("window.scrollBy(0,-1000)"); //scroll up
        Thread.sleep(5000);
        System.out.println("@Test3 - executed test");

    }


    @AfterAll
    public static void tearDown(){
        driver.quit();
    }

}










