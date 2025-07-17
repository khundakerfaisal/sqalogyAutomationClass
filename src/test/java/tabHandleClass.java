import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tabHandleClass {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/tabs");
        driver.manage().window().maximize();
        Thread.sleep(500);
        driver.findElement(By.id("demo-tab-origin")).click();
        Thread.sleep(500);
        driver.findElement(By.id("demo-tab-use")).click();
        Thread.sleep(500);

    }
}
