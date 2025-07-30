import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class tabHandleNewClass {

    public WebDriver driver;
    @BeforeAll
    public void startBrowser(){
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

    }
    @Test
    public void getTabHandle() throws InterruptedException {
        driver.get("https://demoqa.com/browser-windows");
        WebElement windowClick=driver.findElement(By.id("tabButton"));
        windowClick.click();
        ArrayList<String> allTab=new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(allTab.get(1));
        Thread.sleep(3000);
        driver.close();


    }
    @AfterAll
    public void closeBrowser(){
        driver.quit();
    }
}
