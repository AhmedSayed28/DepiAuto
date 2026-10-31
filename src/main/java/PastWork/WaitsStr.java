package PastWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitsStr {
    static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(10));

        driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");

        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div[id=\"start\"] button"))).click();

        // Loading ........ -> sec
        //5 sec -> sleep    ->  1 - 2 - 3 - 4 - 5 -> Find -> ex
        //5 sec -> ex wait  ->  1 -> find -> 2 -> Find -> 3 -> Find -> 4 Find -> 5 Find -> Ex

//        WebElement loading = driver.findElement(By.cssSelector("div[id=\"loading\"]"));

        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div[id=\"loading\"]")));
        WebElement helloWorldText = driver.findElement(By.cssSelector("div[id=\"finish\"] h4"));


        if (helloWorldText.isDisplayed()){
            System.out.println("PASSED");
        }else {
            System.out.println("FAILED");
        }
    }
}
