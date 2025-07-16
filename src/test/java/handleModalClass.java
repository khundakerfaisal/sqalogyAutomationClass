import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handleModalClass {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/modal-dialogs");
        driver.manage().window().maximize();
        WebElement handleLargeModal= driver.findElement(By.id("showLargeModal"));
        handleLargeModal.click();
        Thread.sleep(500);
        WebElement closeLargeModal= driver.findElement(By.id("closeLargeModal"));
        closeLargeModal.click();
        Thread.sleep(500);

    }
}
