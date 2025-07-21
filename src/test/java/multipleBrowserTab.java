import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class multipleBrowserTab {
    public WebDriver driver;
    @BeforeAll
    public void startBrowser(){
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
    }
    @Test
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
    }
    @AfterAll
    public void closeBrowser() {
//        driver.quit();
    }
}
