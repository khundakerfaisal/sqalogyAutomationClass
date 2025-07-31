package SecondClass;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class SqalogyClassPractise1 {
    WebDriver driver;
    @BeforeAll
    public void setup() {
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

    }

    @Test
    public void tabHandle() throws InterruptedException {
        driver.get("https://demoqa.com/frames");
        driver.switchTo().frame("frame1");
        Thread.sleep(500);
        driver.switchTo().defaultContent();

    }

    @AfterAll
    public void close() {
        driver.close();
    }
}
