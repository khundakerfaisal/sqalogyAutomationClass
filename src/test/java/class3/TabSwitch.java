package class3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TabSwitch {
    @Test
    public void tabSelect() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        //Windows scrolling
        driver.get("https://demoqa.com/browser-windows");
        driver.manage().window().maximize();

        driver.findElement(By.id("tabButton")).click();
        ArrayList<String> mainTab=new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(mainTab.get(1));
        Thread.sleep(4000);
        String ActualText=driver.findElement(By.id("sampleHeading")).getText();
        String ExpectedText="This is a sample page";
        Assertions.assertEquals(ExpectedText,ActualText);
        Thread.sleep(4000);
        driver.close();

    }
}
