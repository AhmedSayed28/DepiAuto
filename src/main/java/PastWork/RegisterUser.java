package PastWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegisterUser {
    static void main(String[] args) {

        // Global setting
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://www.automationexercise.com/");


        // Locators
        By homeTabLocator = By.cssSelector("a[style=\"color: orange;\"]");
        By registerOrLoginTabLocator = By.cssSelector("a[href=\"/login\"]");
        By registerFormTextLocator = By.cssSelector("div[class=\"signup-form\"] h2");
        By nameInputLocator = By.cssSelector("input[data-qa=\"signup-name\"]");
        By emailInputLocator = By.cssSelector("input[data-qa=\"signup-email\"]");
        By submitBtnLocator = By.cssSelector("button[data-qa=\"signup-button\"]");
        By registerFormText2Locator = By.cssSelector("div[class=\"login-form\"] h2[class=\"title text-center\"]:nth-child(1) b");
        By mrGenderLocator = By.cssSelector("input[id=\"id_gender1\"]");
        By passwordInputLocator = By.cssSelector("input[data-qa=\"password\"]");
        By daysDropDownLocator = By.cssSelector("select[data-qa=\"days\"]");
        By monthsDropDownLocator = By.cssSelector("select[data-qa=\"months\"]");
        By yearsDropDownLocator = By.cssSelector("select[data-qa=\"years\"]");
        By newsletterOptionLocator = By.cssSelector("input[id=\"newsletter\"]");
        By receiveUpdatesLocator = By.cssSelector("input[id=\"optin\"]");

        // actions // Assertions

        if (driver.findElement(homeTabLocator).isDisplayed()){
            System.out.println("PASSED - 1");
        }else{
            System.out.println("FAILED - 1");
        }

        wait.until(ExpectedConditions.elementToBeClickable(registerOrLoginTabLocator)).click();

        if (driver.findElement(registerFormTextLocator).isDisplayed()){
            System.out.println("PASSED - 2");
        }else {
            System.out.println("FAILED - 2");
        }

        wait.until(ExpectedConditions.visibilityOfElementLocated(nameInputLocator)).sendKeys("Ahmed");
        wait.until(ExpectedConditions.visibilityOfElementLocated(emailInputLocator)).sendKeys("ahmedd@ahmedd.com");
        wait.until(ExpectedConditions.elementToBeClickable(submitBtnLocator)).click();

        String registerText = wait.until(ExpectedConditions.visibilityOfElementLocated(registerFormText2Locator)).getText();

        if (registerText.equals("ENTER ACCOUNT INFORMATION")){
            System.out.println("PASSED - 3");
        }else {
            System.out.println("FAILED - 3");
        }

        wait.until(ExpectedConditions.elementToBeClickable(mrGenderLocator)).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(passwordInputLocator)).sendKeys("12345678");

        // How To Handle <Select>
        Select days = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(daysDropDownLocator)));
        Select months = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(monthsDropDownLocator)));
        Select years = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(yearsDropDownLocator)));

        days.selectByVisibleText("3");
        months.selectByVisibleText("November");
        years.selectByVisibleText("1998");

        wait.until(ExpectedConditions.elementToBeClickable(newsletterOptionLocator)).click();
        wait.until(ExpectedConditions.elementToBeClickable(receiveUpdatesLocator)).click();

    }
}
