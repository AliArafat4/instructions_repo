package testPackage;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class C12Dropdown02 {

    WebDriver driver;

    String url = "https://the-internet.herokuapp.com/dropdown";
    By dropdown = By.id("dropdown");


    @Test
    void oldDropDownMenuTest() {

    //Go to URL: https://the-internet.herokuapp.com/dropdown
        driver.get(url);
        Select select = new Select(driver.findElement(dropdown));

    //Create method selectByIndexTest and Select Option 1 using index .
        selectByIndexTest(select,1);

    //Create method selectByValueTest Select Option 2 by value.
        selectByValueTest(select,"2");

    //Create method selectByVisibleTextTest Select Option 1 value by visible text.
        selectByVisibleTextTest(select,"Option 1");

    //Create method printAllTest Print all dropdown value.
        printAllTest(select);

    //Verify the dropdown has Option 2 text.
        for (WebElement opt: select.getOptions()){
            if (opt.getText().equals("Option 2")){
                System.out.println("Option 2 is selected. Test is PASSED");
                break;
            }
        }

    //Create method printFirstSelectedOptionTest Print first selected option.
        printFirstSelectedOptionTest(select);

    //Find the size of the dropdown, Print "Expected Is Not Equal Actual" if there are not 3 elements in the dropdown.
        int optionsSize = select.getOptions().size();
        Assertions.assertEquals(3, optionsSize,"Expected Is Not Equal Actual");


    //Assertions.assertEquals(2,options.size(),"Expected Is Not Equal Actual");


    }
    private void selectByIndexTest(Select select, int index) {
        select.selectByIndex(index);
    }
    private WebElement selectByValueTest(Select select, String value) {
        select.selectByValue(value);
        return select.getFirstSelectedOption();
    }

    private void selectByVisibleTextTest(Select select, String option) {
        select.selectByVisibleText(option);
    }
    private void printAllTest(Select select) {
        select.getOptions().forEach(t-> System.out.println(t.getText()));
    }
    private void printFirstSelectedOptionTest(Select select) {
        System.out.println("First selected option: " + select.getFirstSelectedOption().getText());
    }
    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    @AfterEach
    void tearDown() {
        driver.quit();
    }
}