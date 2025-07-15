import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class checkboxClass {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        //Windows scrolling
        driver.get("https://demoqa.com/checkbox");
        driver.manage().window().maximize();
        Thread.sleep(500);
        List<WebElement> homeCheckbox=driver.findElements(By.cssSelector(".rct-checkbox"));
        homeCheckbox.get(0).click();
        Thread.sleep(2000);
    }
}
