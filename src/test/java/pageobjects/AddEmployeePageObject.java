package pageobjects;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddEmployeePageObject {
    WebDriver adriver;

    public AddEmployeePageObject(WebDriver driver) {
        adriver = driver;
        PageFactory.initElements(adriver, this);
    }

    @FindBy(id = "firstName")
    WebElement firstName;


    @FindBy(id = "lastName")
    WebElement lastName;

    @FindBy(id = "btnSave")
    WebElement btnSave;

    @Test
    public void saveEmployee() {
        firstName.sendKeys("Birsen");
        lastName.sendKeys("Yildirim");
        btnSave.click();


    }
}
