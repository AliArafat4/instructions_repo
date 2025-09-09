package testPackage;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C11Dropdown {
    WebDriver driver;
    String url = "";


    @Test
    void oldDropDownMenuTest() {


        // Select 2nd option from dropdown:

        // Select option which has value of "red":

        // Select according to visible text:

        // Check if the dropdown is multi-select

    }

    @Test
    void multiSelectTest() {

        // Select 2nd option from dropdown:

        // Select option which has value of "volvo"

        // Select according to visible text:

    }

    @BeforeEach
    void setUp() {
        driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    @AfterEach
    void tearDown() {
        driver.quit();
    }
}