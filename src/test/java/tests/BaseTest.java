package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

public class BaseTest {

    public WebDriver driver;
    public SoftAssert soft;

    @BeforeMethod
    public void start(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        soft = new SoftAssert();
//        driver.get("https://www.automationexercise.com/");
//        driver.get("https://demowebshop.tricentis.com/");
//        driver.get("https://the-internet.herokuapp.com/drag_and_drop");
        driver.get("https://the-internet.herokuapp.com/context_menu");
    }

    // Test

    @AfterMethod
    public void finish(){
        soft.assertAll();
        driver.quit();
    }

}
