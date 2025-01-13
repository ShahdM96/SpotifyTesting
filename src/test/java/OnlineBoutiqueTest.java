import org.example.HomePage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.example.DriverFactory.getDriver;
import static org.junit.jupiter.api.Assertions.*;

public class OnlineBoutiqueTest {

    WebDriver driver;

    @BeforeEach
    public void setUp() {
        driver = getDriver();

//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
        driver.get("https://cymbal-shops.retail.cymbal.dev/");
    }
    @Test
    public void test() {
        assertTrue(true);
        assertFalse(false);
        assertEquals(1,1);
    }



    @AfterEach
    public void tearDown() {
        driver.quit();
    }

}