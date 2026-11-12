package tests.theInternet;

import org.testng.annotations.Test;
import pages.BasePage;
import pages.theInternet.ContextMenuAndAlertPage;
import tests.BaseTest;

public class ContextMenuAndAlertTest extends BaseTest {

    @Test
    public void verifyRightClick() throws InterruptedException {
        ContextMenuAndAlertPage context = new ContextMenuAndAlertPage(driver);
        context.RightClickOnArea();

        context.acceptAlert();

    }
}
