package automationClassPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllElement {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
//        driver.get("https://demoqa.com/broken");
        driver.get("https://demoqa.com/upload-download");
        driver.manage().window().maximize();
//        JavascriptExecutor js=(JavascriptExecutor)driver;
//        js.executeScript("window.scrollBy(0,200)");

//        driver.findElement(By.partialLinkText("Valid Link")).click();
        WebElement downloadButton = driver.findElement(By.tagName("a"));

        // Click the button to download
        downloadButton.click();

        Thread.sleep(2000);
    }
}
