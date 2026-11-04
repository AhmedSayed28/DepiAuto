package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AccountInformationPage;
import pages.HomePage;
import pages.SignupLoginPage;

public class RegistrationTest extends BaseTest{

    @Test
    public void VerifyUserCanRegisterSuccessfullyWithValidData(){
        HomePage home = new HomePage(driver);

        // Verify
        Assert.assertEquals(home.isHomeTabDisplayed(),true);

        SignupLoginPage signup = home.clickOnRegisterLoginTab();

        // Verify
        Assert.assertEquals(signup.returnRegisterFormText(),"New User Signup!");

        signup.fillFirstRegisterForm("Ahmed","Ahmed@ahmeddd.com");

        AccountInformationPage info = signup.submitFirstForm();

        Assert.assertEquals(info.getRegisterFormText2(),"ENTER ACCOUNT INFORMATION");

        info.fillForm2("12345678","3","November","2015");

    }
}
