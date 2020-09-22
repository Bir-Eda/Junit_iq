package TestClasses;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import pageobjects.AddEmployeePageObject;
import pageobjects.HomePageObject;
import pageobjects.LoginPageObject;
import pageobjects.LogoutPageObject;
import resource.Base;

/**
 * @author: Birsen
 */

import java.util.List;

public class JunitExample extends Base {
    HomePageObject homePageObject;
    LoginPageObject loginPageObject;
    AddEmployeePageObject addEmployeePageObject;
    LogoutPageObject logoutPageObject;


    @Test
    public void login() {

        loginPageObject = new LoginPageObject(driver);
        loginPageObject.loginCredentials();

    }

    @Test
    public void addEmployee() throws InterruptedException {
        homePageObject = new HomePageObject(driver);
        homePageObject.navigatetoAddEmployee();
        addEmployeePageObject = new AddEmployeePageObject(driver);
        addEmployeePageObject.saveEmployee();
        logoutPageObject = new LogoutPageObject(driver);
        logoutPageObject.logOut();

    }
}

