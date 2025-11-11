package class3;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class handleAlert {
    @Test
    public void handleAlerts() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();
        driver.findElement(By.id("alertButton")).click();		 //Click on Alert button
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        Thread.sleep(2000);
        driver.findElement(By.id("promtButton")).click();		 //Click on Alert button
        driver.switchTo().alert().sendKeys("Atiq");
        driver.switchTo().alert().accept();
        Thread.sleep(2000);

    }
}
