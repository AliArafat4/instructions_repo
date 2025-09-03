package testPackage;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstJUnitJupiterTest {
    WebDriver driver;
    @Test
    public void myPssingTest()  {
        driver.get("https://www.google.com");

        String actualTitle = driver.getTitle();
        System.out.println("Title: " + actualTitle);
        Assertions.assertEquals("Google", actualTitle, "Title does not match!");


    }
    @Test
    public void myFailingTest()  {
        driver.get("https://www.google.com");

        String actualTitle = driver.getTitle();
        System.out.println("Title: " + actualTitle);
        Assertions.assertEquals("GoogleX", actualTitle, "Title does not match!");
    }

    @BeforeEach
    public void beforeEachTest(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterEach
    public void afterEachTest(){
        driver.quit();
    }
}