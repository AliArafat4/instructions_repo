package testPackage.Week3;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class C29ScrollPage extends TestBase {
    //Go to "https://linkedin.com"

//Scroll page down with 'page down' key

//Scroll page down with 'down arrow' key

//Scroll page up with 'up arrow' key

//Scroll page up with 'page up' key

//Scroll page down with 'space' key

//Scroll to buttom of the page

//Scroll to view of an elemet

//Scroll to top of the page

//Scroll with moveToElemet

    //Scroll by some amount down

    //Scroll by some amount up

    @Test
    void scrollTest() {
        driver.get("https://linkedin.com");
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).perform();

        actions.sendKeys(Keys.PAGE_DOWN).perform();

        actions.sendKeys(Keys.PAGE_UP).perform();

        actions.sendKeys(Keys.SPACE).perform();


        actions.scrollByAmount( 0, 1500).perform();


        actions.scrollToElement( driver.findElement(By.xpath("//a[@class='btn-md babybear:btn-sm mb-1.5 mr-1 flex items-center w-fit float-left btn-primary']"))).perform();



    }
}