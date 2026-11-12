package pages.theInternet;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class ContextMenuAndAlertPage extends BasePage {

    public ContextMenuAndAlertPage(WebDriver driver) {
        super(driver);
    }

    private final By contextArea = By.xpath("//div[@id='hot-spot']");

    public void RightClickOnArea(){
        contextClick(contextArea);
    }

    public void acceptAlert(){
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
}
