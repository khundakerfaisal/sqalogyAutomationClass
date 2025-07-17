import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Random;

public class takeScreenShotClass {
    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com");
        File screenShotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        Random rand = new Random();
        int autoNumber = rand.nextInt(99999999) + 10000000;
        String filePath = "./src/test/resources/screenshots/" + autoNumber + ".png";
        File destFile = new File(filePath);
        FileUtils.copyFile(screenShotFile, destFile);
    }
}
