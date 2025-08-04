package automationClassPractise;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.ArrayList;


public class browserTabHandleNew {

    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options=new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.EAGER);
        WebDriver driver=new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.get("https://demoqa.com/browser-windows");
        driver.findElement(By.id("tabButton")).click();
        ArrayList<String> getWindowHandleTab=new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(getWindowHandleTab.get(1));
        String ExpectedResult=driver.findElement(By.id("sampleHeading")).getText();
        String ActualResult="This is a sample page";
        Assertions.assertTrue(ExpectedResult.contains(ActualResult));
        Thread.sleep(2000);
        driver.close();
    }
}
