package pages.demowebshop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    // Locators
    private final By computersMenuLocator = By.xpath("//ul[@class='top-menu']//a[normalize-space()='Computers']");
    private final By notebooksOptionLocator = By.xpath("//ul[@class='sublist firstLevel active']//a[normalize-space()='Notebooks']");


    // Methods

    public void openComputersMenu(){
        hover(computersMenuLocator);
    }

    public void selectNotebooksOption(){
        myClick(notebooksOptionLocator);
    }


}
