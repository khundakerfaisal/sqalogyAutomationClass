package class3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class FrameHandle {
    @Test
    public void handleFrame() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/frames");
        driver.manage().window().maximize();
        driver.switchTo().frame("frame1");
        String textExpected=driver.findElement(By.id("sampleHeading")).getText();
        String textActual="This is a sample page";
        Assertions.assertTrue(textExpected.contains(textActual));
        driver.switchTo().defaultContent();
        Thread.sleep(5000);


    }
}
