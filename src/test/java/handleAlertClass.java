import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handleAlertClass {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();
        driver.findElement(By.id("alertButton")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();

        driver.findElement(By.id("timerAlertButton")).click();
        Thread.sleep(7000);
        driver.switchTo().alert().accept();

        driver.findElement(By.id("confirmButton")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();

        driver.findElement(By.id("promtButton")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().sendKeys("Prince");
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        String textActual=driver.findElement(By.id("promptResult")).getText();
        Assertions.assertTrue(textActual.contains("Prince"));
//        String text= driver.findElement(By.id("promptResult")).getText();
//        Assertions.assertTrue(text.contains("Fahim"));
    }
}
