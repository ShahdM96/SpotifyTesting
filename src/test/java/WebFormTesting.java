import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

import static org.example.DriverFactory.getDriver;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class WebFormTesting {
    /**
    WebDriver driver;
    private static final String baseURL = "https://www.selenium.dev/selenium/web/web-form.html";


    @BeforeEach
    public void setup() {
        driver = getDriver();

        //driver = new ChromeDriver();
    }
    @Test
    void testTextInput() {
        driver.get(baseURL);
        WebElement testInput = driver.findElement(By.cssSelector("#my-text-id"));
        String inputText = "test1";
        testInput.sendKeys(inputText);
        String result = testInput.getDomProperty("value");
        assertEquals(inputText,result);
    }
    @Test
    void testTextarea() {
        WebElement testInput = driver.findElement(By.xpath("//testarea"));
        testInput.sendKeys("Test Textarea");
        assertEquals("Test Textarea", testInput.getDomProperty("value"),"Textarea validation failed");
    }

    @Test
    void testDisabledInputField() {
        WebElement testInput = driver.findElement(By.name("my-disabled"));
        assertFalse(testInput.isEnabled(),"Disabled input is interactable");

    }
    @Test
    void testReadOnlyField() {
        WebElement testInput = driver.findElement(By.name("my-readonly"));
        assertEquals("Readonly input", testInput.getDomProperty("value"),"Readonly input value mismatch");
    }
    @AfterEach
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
**/
}


