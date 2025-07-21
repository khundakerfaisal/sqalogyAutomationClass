import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class multipleBrowserTab {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        //Windows scrolling
        driver.get("https://demoqa.com/browser-windows");
        driver.manage().window().maximize();
        driver.findElement(By.id("tabButton")).click();
        ArrayList<String> listOfTab=new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(listOfTab.get(1));
        Thread.sleep(2000);
        driver.close();
    }
}
