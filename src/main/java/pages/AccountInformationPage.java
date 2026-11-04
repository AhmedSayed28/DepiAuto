package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountInformationPage extends BasePage {
    public AccountInformationPage(WebDriver driver) {
        super(driver);
    }

    private final By registerFormText2Locator = By.cssSelector("div[class=\"login-form\"] h2[class=\"title text-center\"]:nth-child(1) b");
    private final By mrGenderLocator = By.cssSelector("input[id=\"id_gender1\"]");
    private final By passwordInputLocator = By.cssSelector("input[data-qa=\"password\"]");
    private final By daysDropDownLocator = By.cssSelector("select[data-qa=\"days\"]");
    private final By monthsDropDownLocator = By.cssSelector("select[data-qa=\"months\"]");
    private final By yearsDropDownLocator = By.cssSelector("select[data-qa=\"years\"]");
    private final By newsletterOptionLocator = By.cssSelector("input[id=\"newsletter\"]");
    private final By receiveUpdatesLocator = By.cssSelector("input[id=\"optin\"]");


    public String getRegisterFormText2(){
        return getText(registerFormText2Locator);
    }

    public void fillForm2(String password , String day , String month , String year){
        selectCheckBox(mrGenderLocator);
        type(passwordInputLocator, password);
        selectByText(daysDropDownLocator , day);
        selectByText(monthsDropDownLocator , month);
        selectByText(yearsDropDownLocator , year);
        selectCheckBox(newsletterOptionLocator);
        selectCheckBox(receiveUpdatesLocator);
    }




}





