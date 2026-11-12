package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    public WebDriver driver;
    public WebDriverWait wait;
    public Actions action;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver,Duration.ofSeconds(15));
        this.action = new Actions(driver);
    }

    // Custom Methods
    public void myClick(By locator){
        wait.until(
                ExpectedConditions.elementToBeClickable(locator)
        ).click();
    }

    public void type(By locator , String value){
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(locator)
        ).sendKeys(value);
    }

    // Func GetText()
    public String getText(By locator){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).getText();
    }

    // isDisplayed
    public boolean isDisplayed(By locator){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).isDisplayed();
    }

    // SelectByText()
    public void selectByText(By locator , String text){

        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

        Select dropdown = new Select(element);

        dropdown.selectByVisibleText(text);
    }

    // selectCheckBox
    public void selectCheckBox(By locator){
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));

        if (!element.isSelected()){
            element.click();
        }
    }

    public void hover(By locator){
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        action.moveToElement(element).perform();
    }

    public void dragAndDrop(By sourceLocator , By distLocator){
        WebElement source = wait.until(ExpectedConditions.visibilityOfElementLocated(sourceLocator));
        WebElement dist = wait.until(ExpectedConditions.visibilityOfElementLocated(distLocator));

        action.dragAndDrop(source,dist).perform();

    }

    public void contextClick(By locator){
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        action.contextClick(element).perform();
    }



}
