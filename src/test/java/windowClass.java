import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class windowClass {
    WebDriver driver;
    @BeforeAll
    public void setup() {
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

    }

    @Test
    public void tabHandleClass() throws InterruptedException {
        driver.get("https://demoqa.com/browser-windows");
        driver.findElement(By.id("tabButton")).click();
        Thread.sleep(1000);
        ArrayList<String> allTab=new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(allTab.get(1));
        driver.close();

    }

    @AfterAll
    public void close() {
        driver.close();
    }
}
