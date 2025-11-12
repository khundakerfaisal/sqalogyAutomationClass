package class3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class handleBrowserProject {
    @Test
    public void browserSelect(){
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/browser-windows");
        driver.findElement(By.id("windowButton")).click();

        String mainWindow=driver.getWindowHandle();
        Set<String> allWindow=driver.getWindowHandles();

        for (String getWindowHandle : allWindow){
            if (!getWindowHandle.equals(mainWindow)){
              driver.switchTo().window(getWindowHandle);
                String textActual=driver.findElement(By.id("sampleHeading")).getText();
                Assertions.assertTrue(textActual.contains("This is a sample page"));
                break;

            }
        }
        driver.close();
        driver.switchTo().window(mainWindow);

    }
}
