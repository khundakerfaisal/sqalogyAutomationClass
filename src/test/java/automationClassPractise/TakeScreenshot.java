package automationClassPractise;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import java.io.File;
import java.io.IOException;
import java.util.Random;

public class TakeScreenshot {
    public static void main(String[] args) throws IOException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com");

        File sorceFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        Random randNumber=new Random();
        int generateNumber=randNumber.nextInt(9999)+1111;
        String filePath="./src/test/resources/screenshots"+generateNumber+".jpg";
        File destFile=new File(filePath);
        FileUtils.copyFile(sorceFile,destFile);
    }
}
