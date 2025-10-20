package NtechClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class ButtonClick {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/buttons");
        driver.manage().window().maximize();
        Thread.sleep(500);
        Actions actions=new Actions(driver);
        List<WebElement> doubleClickButtons=driver.findElements(By.cssSelector(".btn-primary"));
        actions.doubleClick(doubleClickButtons.get(0)).perform();
        actions.contextClick(doubleClickButtons.get(1)).perform();
        actions.click(doubleClickButtons.get(2)).perform();



    }
}
