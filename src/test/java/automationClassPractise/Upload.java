package automationClassPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upload {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/upload-download");
        driver.manage().window().maximize();
        Thread.sleep(500);
        WebElement srcFileUpload=driver.findElement(By.id("uploadFile"));
        Thread.sleep(1000);
        srcFileUpload.sendKeys("H:\\MIME\\OneDrive - Confidence Group\\Documents\\Upload.gif");
        Thread.sleep(2000);


    }
}
