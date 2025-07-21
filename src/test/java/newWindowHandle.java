import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class newWindowHandle {
    public WebDriver driver;
    @DisplayName("Configure the browser")
    @BeforeAll
    public void startBrowser(){
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
    }
    @DisplayName("Start Browser Tab handle")
    @Test
    public void browserTabHandle() throws InterruptedException {
        driver.get("https://demoqa.com/browser-windows");
        driver.findElement(By.id("windowButton")).click();

        String mainWindow=driver.getWindowHandle();
        Set<String> allChildWindow=driver.getWindowHandles();
        for (String getAllWindowHandle:allChildWindow){
            if (!getAllWindowHandle.equals(mainWindow)){
                driver.switchTo().window(getAllWindowHandle);
                String textActual=driver.findElement(By.id("sampleHeading")).getText();
                Assertions.assertTrue(textActual.contains("This is a sample page"));
                break;
            }
        }

        driver.close();
        driver.switchTo().window(mainWindow);
    }
    @DisplayName("Close the browser")
    @AfterAll
    public void closeBrowser() {
//        driver.quit();
    }
}
