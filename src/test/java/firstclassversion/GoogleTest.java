package firstclassversion;

import DriverMngr.DriverManager2;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class GoogleTest {
    static WebDriver driver;
    @BeforeAll
    public static void setUp() throws IOException {
        // we can put the url here as well.
        driver=DriverManager2.initilazingDriver();

    }
    @Test
    public void googleTitle(){
        String title=driver.getTitle();
        //String a=title.getText();


        Assertions.assertEquals("Goooogle", title, "not equal");


   /**
      *  // validate googleTitle();
       */
        //img[@id='hplogo']


    }

    @AfterAll
    public static void tearDown(){

    }
    //TODO: validate googleTitle

}
