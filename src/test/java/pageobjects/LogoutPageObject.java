package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogoutPageObject {
    WebDriver ldriver;

    public LogoutPageObject(WebDriver driver) {
        ldriver = driver;
        PageFactory.initElements(ldriver,  this);
    }
    @FindBy(xpath = "//a[text()='Welcome Admin']")
    WebElement welcome;

    @FindBy(linkText = "Logout")
    WebElement logout;


        public void logOut(){
            welcome.click();
            WebDriverWait wait=new WebDriverWait(ldriver,5);
            wait.until(ExpectedConditions.visibilityOf(logout));
            logout.click();
        }
    }