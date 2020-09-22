package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObject {
    WebDriver ldriver;

   public LoginPageObject(WebDriver driver){
       ldriver=driver;
       PageFactory.initElements(ldriver, this);
   }


    @FindBy(id = "txtUsername")  //        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
    WebElement userName;
    @FindBy(id = "txtPassword")  //         driver.findElement(By.id("txtPassword")).sendKeys("admin123");
    WebElement password;
    @FindBy(id = "btnLogin")  //          driver.findElement(By.id("btnLogin")).click();
    WebElement loginButton;

    public void loginCredentials(){
        userName.sendKeys("Admin");
        password.sendKeys("admin123");
        loginButton.click();

    }


}



