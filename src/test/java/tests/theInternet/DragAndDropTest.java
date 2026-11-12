package tests.theInternet;

import org.testng.annotations.Test;
import pages.theInternet.DragAndDropPage;
import tests.BaseTest;

public class DragAndDropTest extends BaseTest {

    @Test
    public void verifyDragAndDrop() throws InterruptedException {
        DragAndDropPage drag = new DragAndDropPage(driver);
        drag.dragAndDrop();
    }
}
