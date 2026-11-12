package pages.theInternet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;

public class DragAndDropPage extends BasePage {
    public DragAndDropPage(WebDriver driver) {
        super(driver);
    }


//    Locators

    private final By sourceLocator = By.xpath("//div[@id='column-a']");
    private final By targetLocator = By.xpath("//div[@id='column-b']");


    // Methods
    public void dragAndDrop(){
        dragAndDrop(sourceLocator,targetLocator);
    }

}
