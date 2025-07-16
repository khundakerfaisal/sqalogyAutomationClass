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
        Thread.sleep(1000);
//        driver.findElement(By.id(("alertButton"))).click();
//        driver.switchTo().alert().accept();
//        //driver.switchTo().alert().dismiss();
//        driver.findElement(By.id(("promtButton"))).click();
//        driver.switchTo().alert().sendKeys("Fahim");
//        Thread.sleep(2000);
//        driver.switchTo().alert().accept();
//        String text= driver.findElement(By.id("promptResult")).getText();
//        Assertions.assertTrue(text.contains("Fahim"));
    }
}
