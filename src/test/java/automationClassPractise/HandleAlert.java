package automationClassPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlert {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();
        driver.findElement(By.id("timerAlertButton")).click();		 //Click on Alert button
        Thread.sleep(7000);
        driver.switchTo().alert().accept();
        driver.findElement(By.id("confirmButton")).click();		 //Click on Alert button
        Thread.sleep(7000);
        driver.switchTo().alert().accept();

        driver.findElement(By.id("promtButton")).click();               //click on button and input data
        Thread.sleep(2000);
        driver.switchTo().alert().sendKeys("Prince");
        Thread.sleep(2000);
        driver.switchTo().alert().accept();

    }
}
