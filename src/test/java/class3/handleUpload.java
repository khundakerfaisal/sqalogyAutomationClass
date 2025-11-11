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
        String choosenFile="H:\\MIME\\OneDrive - Confidence Group\\Desktop\\Essential tools for automation.jpg";
        uploadElement.sendKeys(choosenFile);
        Thread.sleep(4000);

    }
}
