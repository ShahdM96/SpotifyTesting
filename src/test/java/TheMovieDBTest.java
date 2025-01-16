import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.example.DriverFactory.getDriver;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TheMovieDBTest {

    WebDriver driver;
    private static final String baseURL ="http://localhost:3000";



    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseURL);
    }

/**
    @Test
    void testPageTitle() {
        driver.get(baseURL);
        String pageTitle = driver.getTitle();
        //assertEquals(expectedPageTitle, pageTitle);
    }
**/
    @Test
    void test1() {
            driver.get(baseURL);
            // Wait for the element to load
            driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
            // Locate the <h1> element
            //WebElement element = driver.findElement(By.xpath("//h1[@data-v-inspector='components/media/Hero.vue:47:11']"));
            WebElement element = driver.findElement(By.xpath("(//h1)[1]"));

            String expectedText = "Sonic the Hedgehog 3";
            String actualText = element.getText();
            assertEquals(expectedText,actualText, "Incorrect Text");

    }


    @Test
    void testPopularMoviesTitle() {
        driver.get(baseURL);
        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
        WebElement element = driver.findElement(By.xpath("//div[@data-v-inspector='components/carousel/Base.vue:21:5']"));
        String expectedText = "Popular Movies";
        String actualText = element.getText();
        assertEquals(expectedText,actualText, "Incorrect Title");
    }
    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
