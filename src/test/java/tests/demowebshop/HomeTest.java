package tests.demowebshop;

import org.testng.annotations.Test;
import pages.BasePage;
import pages.demowebshop.HomePage;
import tests.BaseTest;

public class HomeTest extends BaseTest {

    @Test
    public void VerifyOpenComputersMenu(){
        HomePage home = new HomePage(driver);

        home.openComputersMenu();
        home.selectNotebooksOption();
    }

}
