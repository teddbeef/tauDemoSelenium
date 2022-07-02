package taudemo2;

import browser.BrowserGetter;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.TestInstance.Lifecycle.PER_CLASS;

@TestInstance(PER_CLASS)
public class SeleniumTest {
    private final BrowserGetter browserGetter = new BrowserGetter();
    private WebDriver driver;

    @BeforeAll
    public void beforAll() {
        driver = browserGetter.getChromeDriver();
    }

    @AfterAll
    public void afterAll() {
        driver.quit();
    }


    //Shift + F6 is rename the function
    @Test
    public void openTheComPageAndCheckTheTitle() {
        String expectedComTitle = "Example title";
        driver.get("https://www.example.com");
        assertEquals(expectedComTitle, driver.getTitle());
        Assertions.assertEquals(1, 2);
    }
    @Test
    public void openTheOrgPageAndCheckTheTitle() {
        String expectedOrgTitle = "Example title";
        driver.get("https://www.example.org");
        assertEquals(expectedOrgTitle, driver.getTitle());
        Assertions.assertEquals(1, 2);
    }
}
