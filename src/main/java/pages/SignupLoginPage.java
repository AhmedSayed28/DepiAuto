package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignupLoginPage extends BasePage{


    public SignupLoginPage(WebDriver driver) {
        super(driver);
    }

    private final By registerFormTextLocator = By.cssSelector("div[class=\"signup-form\"] h2");
    private final By nameInputLocator = By.cssSelector("input[data-qa=\"signup-name\"]");
    private final By emailInputLocator = By.cssSelector("input[data-qa=\"signup-email\"]");
    private final By submitBtnLocator = By.cssSelector("button[data-qa=\"signup-button\"]");

    public String returnRegisterFormText(){
        return getText(registerFormTextLocator);
    }

    public void fillFirstRegisterForm(String name , String email){
        type(nameInputLocator,name);
        type(emailInputLocator,email);
    }

    public AccountInformationPage submitFirstForm(){
        myClick(submitBtnLocator);
        return new AccountInformationPage(driver);
    }

}
