package DriverMngr;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DriverManager2 {
   static WebDriver driver;
    static Properties prop;
    static FileInputStream fis;
    static String urlName;
    public static WebDriver initilazingDriver() throws IOException {
        prop = new Properties();  // properties filedan url cektik
        fis = new FileInputStream("/Users/Eda/Junit_iq/src/test/java/DriverMngr/browser.properties");
        // FileInputStream get the data from browser.properties
        // DriverManager2 yebagli bir file
        prop.load(fis);
        String browserName = prop.getProperty("browser");
        urlName=prop.getProperty("url");
        switch (browserName) {
            case "chrome": {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                driver.manage().window().maximize();
                driver.manage().deleteAllCookies();
                driver.get(urlName);
                break;
            }
            case "firefox": {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                driver.manage().window().maximize();
                driver.manage().deleteAllCookies();
                driver.get(urlName);
                break;

            }
            case "edge" :{
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                driver.manage().window().maximize();
                driver.manage().deleteAllCookies();
                driver.get(urlName);
                break;
            }
        }
        return driver;
    }
}
