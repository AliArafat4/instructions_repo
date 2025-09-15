package testPackage.Week3;


import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class C26DragAndDropBy extends TestBase {
    /*
    Go to URL: https://rangeslider.js.org/
    Shift 100 units to the right and 100 units to the left on the horizontal axis.

     */

    By sliderHandleByXpath = By.xpath("//div[@id='js-rangeslider-0']//div[@class='rangeslider__handle']");
    String url = "https://rangeslider.js.org/";

    @Test
    public void dragAndDropByTest() {

        //Go to URL: https://rangeslider.js.org/

        //Shift 100 units to the right and 100 units to the left on the horizontal axis.

    }

}