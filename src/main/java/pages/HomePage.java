package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    private final By homeTabLocator = By.cssSelector("a[style=\"color: orange;\"]");
    private final By registerOrLoginTabLocator = By.cssSelector("a[href=\"/login\"]");

    public boolean isHomeTabDisplayed(){
        return isDisplayed(homeTabLocator);
    }

    public SignupLoginPage clickOnRegisterLoginTab(){
        myClick(registerOrLoginTabLocator);

        return new SignupLoginPage(driver);
    }

}

// extend
// ctor
// locators
// methods (actions)