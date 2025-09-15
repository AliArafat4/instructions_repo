package testPackage.Week4;

import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class C42TakeScreenShot01 extends TestBase {
/*
    Go to https://opensource-demo.orangehrmlive.com/
    Take full page screenshot
    Take a specific element's screenshot
*/

    @Test
    public void screenShotTest() throws IOException, InterruptedException {
        //       Go to opensource-demo
        driver.get("https://opensource-demo.orangehrmlive.com/");

        //       Take full page screenshot
        Thread.sleep(2000);
        TakesScreenshot ts = (TakesScreenshot) driver;
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd-HH-mm-ss"));
        File screenShot = ts.getScreenshotAs(OutputType.FILE);
        Path path= Path.of(System.getProperty("user.dir"),"screenShot","lastScreenshot " + timestamp + ".png");
        FileUtils.copyFile(screenShot,path.toFile());
        //FileUtils.copyFile(screenShot,new File("./target/test-output/googleSs.png"));

        //       Take a specific element's screenshot
    }
}