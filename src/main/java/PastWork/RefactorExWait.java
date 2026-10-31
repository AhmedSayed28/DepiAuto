package PastWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RefactorExWait {
    static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");

        // Locators
        By startBtnLocator = By.cssSelector("div[id=\"start\"] button");
        By helloWorldText = By.cssSelector("div[id=\"finish\"] h4");

        wait.until(ExpectedConditions.elementToBeClickable(startBtnLocator)).click();

        if (wait.until(ExpectedConditions.visibilityOfElementLocated(helloWorldText)).isDisplayed()){
            System.out.println("PASSED");
        }else {
            System.out.println("FAILED");
        }




    }
}
