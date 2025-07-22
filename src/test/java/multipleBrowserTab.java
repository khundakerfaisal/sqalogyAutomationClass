import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class multipleBrowserTab {
    public WebDriver driver;
    @DisplayName("Configure Browser")
    @BeforeAll
    public void startBrowser(){
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
    }
    @DisplayName("Browser Tab handle")
    @Test
    @Order(1)
    public void browserTabHandle() throws InterruptedException {
        driver.get("https://demoqa.com/browser-windows");
        driver.findElement(By.id("tabButton")).click();
        ArrayList<String> listOfTab=new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(listOfTab.get(1));
        String textActual=driver.findElement(By.id("sampleHeading")).getText();
        String textExpected="This is a sample page";
        Assertions.assertTrue(textActual.contains(textExpected));
        Thread.sleep(2000);
        driver.close();
//        driver.quit();
    }
    @DisplayName("Close The browser")
    @AfterAll
    public void closeBrowser() {
        driver.quit();
    }
}
