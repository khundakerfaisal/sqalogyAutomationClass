import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class windowClass {
    WebDriver driver;

    @BeforeAll
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

    }

    @Test
    public void doWindowHandle() throws InterruptedException {
        driver.get("https://demoqa.com/browser-windows");
        driver.findElement(By.id("windowButton")).click();

        String mainWindow = driver.getWindowHandle();
        Set<String> allWindow = driver.getWindowHandles();
        for (String getAllWindow : allWindow) {
            if (!getAllWindow.equals(mainWindow)) {
                driver.switchTo().window(getAllWindow);
                String textActual = driver.findElement(By.id("sampleHeading")).getText();
                Assertions.assertTrue(textActual.contains("This is a sample page"));
                break;
            }
        }

        driver.close();
        driver.switchTo().window(mainWindow);

    }

    @AfterAll
    public void close() {
        driver.quit();
    }
}
