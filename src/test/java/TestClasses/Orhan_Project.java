package TestClasses;
import DriverMngr.DriverManager2;
import io.github.bonigarcia.wdm.WebDriverManager;


import org.junit.Assert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
    public class Orhan_Project {
        static WebDriver driver;

        @BeforeAll
        public static void setUp() throws IOException {
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
            //We can put the url here as well.
            //driver=DriverManager2.initilazingDriver();
            driver.get("https://gmail.com");
        }
        @Test
        public void testLoginFormPresent() {
            // below you can find already setup webDriver
            //driver.get("https://gmail.com");
            WebElement element=driver.findElement(By.xpath("//*[@class='VfPpkd-RLmnJb']"));
            element.click();

        }
        @Test
        public void validatingEmailandPasswordFields(){
           // driver.get("https://gmail.com");
            WebElement emailField;
            WebElement passwordField;
            emailField = driver.findElement(By.xpath("//*[@id='identifierId']"));
            emailField.sendKeys("eliza@gmail.com");
         //   passwordField = driver.findElement(By.id("password-input"));
            Assert.assertEquals(true,emailField.isDisplayed());
          //  Assert.assertEquals(true,passwordField.isDisplayed());
        }
        @Test
        public void login(){
        }
        @AfterAll
        public static void tearDown(){
            driver.quit();
        }
    }

