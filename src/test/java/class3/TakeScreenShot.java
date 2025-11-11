package class3;

import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.Random;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TakeScreenShot {
    @Test
    public void takeScreenShot() throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com");
        driver.manage().window().maximize();
        TakesScreenshot ts=(TakesScreenshot)driver;
        File screenShotFile = ts.getScreenshotAs(OutputType.FILE);

        Random random=new Random();
        int generateNumber=random.nextInt(9999)+1111;

        String filePath="./src/test/resources/screenshots/"+generateNumber+".jpg";
        File destFile=new File(filePath);

        FileUtils.copyFile(screenShotFile,destFile);




    }
}
