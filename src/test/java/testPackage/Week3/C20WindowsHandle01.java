package testPackage.Week3;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WindowType;
import utilities.TestBase;

public class C20WindowsHandle01 extends TestBase {
    /*
    Open empty window
    Go to https://www.google.com/ in the open tab
    Create new tab
    Go to https://www.linkedin.com/ in the open tab
    Create new window
    Go to https://clarusway.com/ in the window that opens
    */

    @Test
    void windowHandleTest() throws InterruptedException {
       driver.get("about:blank");
       String firstHandle = driver.getWindowHandle();
       driver.get("https://www.google.com/");
       driver.switchTo().newWindow(WindowType.TAB);
       String secondHandle = driver.getWindowHandle();
       driver.get("https://www.linkedin.com/");
       driver.switchTo().newWindow(WindowType.WINDOW);
       String thirdHandle = driver.getWindowHandle();
       driver.get("https://clarusway.com/");
       String fourthHandle = driver.getWindowHandle();
       System.out.println("firstHandle = " + firstHandle);
       System.out.println("secondHandle = " + secondHandle);
       System.out.println("thirdHandle = " + thirdHandle);
       System.out.println("fourthHandle = " + fourthHandle);
       Thread.sleep(2000);
    }
}