import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class radioSelectionClass {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        //Windows scrolling
        driver.get("https://demoqa.com/radio-button");
        driver.manage().window().maximize();
        Thread.sleep(500);
        List<WebElement> radioSelectionx=driver.findElements(By.cssSelector(".custom-radio"));
        radioSelectionx.get(1).click();
        Thread.sleep(2000);

    }
}
