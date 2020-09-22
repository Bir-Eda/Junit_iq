package TestClasses;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.DriverManager;

public class Micro_22_September {
    static WebDriver driver;
    @BeforeAll
        public static void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://www.javatpoint.com/");
    }

    @Test
    public void test1(){
        WebElement element=driver.findElement(By.xpath("//*[@id='link']/div[1]/ul/li[10]/a"));
        element.click();


    }

    @AfterAll
    public static void tearDown(){
        driver.quit();
    }

}










