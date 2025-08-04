package automationClassPractise;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.Set;


public class browserHandleNew {

    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options=new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.EAGER);
        WebDriver driver=new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.get("https://demoqa.com/browser-windows");
        driver.findElement(By.id("windowButton")).click();
        String mainWindow=driver.getWindowHandle();
        Set<String> getAllWindow=driver.getWindowHandles();
        for (String getAllChildWindow:getAllWindow){
            if (!getAllChildWindow.equals(mainWindow)){
                driver.switchTo().window(getAllChildWindow);
                String ExpectedResult=driver.findElement(By.id("sampleHeading")).getText();
                String ActualResult="This is a sample page";
                Assertions.assertTrue(ExpectedResult.contains(ActualResult));
                Thread.sleep(2000);

            }

        }
        driver.close();
        driver.switchTo().window(mainWindow);

    }
}
