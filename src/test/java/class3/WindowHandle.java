package class3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Set;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class WindowHandle {
    @Test
    public void whindowHandle(){
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/browser-windows");
        driver.findElement(By.id("windowButton")).click();

        String mainWindow=driver.getWindowHandle();
        Set<String> allChildHandle=driver.getWindowHandles();
        for (String getAllWindowHandle:allChildHandle){
            if (!getAllWindowHandle.equals(mainWindow)){
                driver.switchTo().window(getAllWindowHandle);
                String textActual=driver.findElement(By.id("sampleHeading")).getText();
                Assertions.assertTrue(textActual.contains("This is a sample page"));
                break;
            }

        }
        driver.close();
        driver.switchTo().window(mainWindow);




    }
}
