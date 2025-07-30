import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class tabHandleNewClass {

    public WebDriver driver;

    @BeforeAll
    public void startBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

    }

    //    @Test
//    public void getTabHandle() throws InterruptedException {
//        driver.get("https://demoqa.com/browser-windows");
//        WebElement windowClick=driver.findElement(By.id("tabButton"));
//        windowClick.click();
//        ArrayList<String> allTab=new ArrayList<>(driver.getWindowHandles());
//        driver.switchTo().window(allTab.get(1));
//        Thread.sleep(3000);
//        driver.close();
//
//
//    }
    @Test
//    public void getNewWindowHandle() throws InterruptedException {
//        driver.get("https://demoqa.com/browser-windows");
//        driver.findElement(By.id("windowButton")).click();
//        String mainWindow = driver.getWindowHandle();
//        Set<String> getWindowHandleAll = driver.getWindowHandles();
//        for (String getAllWindow : getWindowHandleAll) {
//            if (!getAllWindow.equals(mainWindow)) {
//                driver.switchTo().window(getAllWindow);
//                Thread.sleep(2000);
//                String TextExpected = driver.findElement(By.id("sampleHeading")).getText();
//                String TextActual = "This is a sample page";
//                Assertions.assertTrue(TextActual.contains(TextExpected));
//                Thread.sleep(2000);
//                break;
//
//            }
//        }
//        driver.close();
//        driver.switchTo().window(mainWindow);
//
//
//    }
    public void alertHandle() throws InterruptedException {
        driver.get("https://demoqa.com/buttons");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,10)");
        Actions action=new Actions(driver);
        action.doubleClick(driver.findElement(By.id("doubleClickBtn"))).perform();

//
        Thread.sleep(3000);


    }


    @AfterAll
    public void closeBrowser() {
        driver.quit();
    }
}
