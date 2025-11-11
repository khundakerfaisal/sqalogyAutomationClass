package class3;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class handleUpload {
    @Test
    public void upload() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/upload-download");
        driver.manage().window().maximize();
        Thread.sleep(500);

        WebElement uploadElement=driver.findElement(By.id("uploadFile"));

        String filePath="\\src\\test\\resources\\screenshots\\68555.png";
        String uploadFile=System.getProperty("user.dir")+filePath;
        Thread.sleep(4000);
        uploadElement.sendKeys(uploadFile);


//        String choosenFile="H:\\MIME\\OneDrive - Confidence Group\\Desktop\\Essential tools for automation.jpg";
//        uploadElement.sendKeys(choosenFile);
         Thread.sleep(4000);
//        WebElement downloadElement=driver.findElement(By.id("downloadButton"));
//        downloadElement.click();
//        Thread.sleep(4000);



    }
}
