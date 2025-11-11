package class3;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class browserTab {
    @Test
    public void browserTabHandle() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        //Windows scrolling
        driver.get("https://demoqa.com/browser-windows");
        driver.manage().window().maximize();

        driver.findElement(By.id("tabButton")).click();

        ArrayList<String> windowTab=new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(windowTab.get(1));
        Thread.sleep(2000);
        driver.close();
        Thread.sleep(2000);






    }
}
