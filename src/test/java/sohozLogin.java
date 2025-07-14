import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.List;
import java.util.Scanner;

public class sohozLogin {
    public static void main(String[] args) throws InterruptedException {
//        WebDriver driver=new ChromeDriver();
//        driver.get("https://www.shohoz.com/contact-us");
//        driver.manage().window().maximize();
//        WebElement bus=driver.findElement(By.id("purpose"));
//        bus.click();
//        Thread.sleep(5000);
//        WebDriver driver=new FirefoxDriver();
//        driver.get("https://www.guru99.com/");

        WebDriver driver=new ChromeDriver();
//        driver.get("https://demoqa.com/text-box");
//        driver.manage().window().maximize();
//        Thread.sleep(5000);
//        driver.findElement(By.id("userName")).sendKeys("Faisal");
//        driver.findElement(By.id("userEmail")).sendKeys("a@yopmail.com");
//        driver.findElement(By.id("currentAddress")).sendKeys("Dhaka");
//        driver.findElement(By.id("permanentAddress")).sendKeys("Dhaka");
//        driver.findElement(By.id("submit")).click();
//        Thread.sleep(5000);
//        driver.get("https://demo.automationtesting.in/Register.html");
        //Using Locator ------ID-------
                //            driver.get("https://demoqa.com/text-box");
                //            driver.manage().window().maximize();
                //            Thread.sleep(5000);
                //            driver.findElement(By.id("userName")).sendKeys("Faisal");
        //Using Locator ------link text-------
                //        driver.get("https://demoqa.com/links");
                //        driver.manage().window().maximize();
                //        Thread.sleep(500);
                //        WebElement homeClick=driver.findElement(By.linkText("Home"));
                //        homeClick.click();
                //        Thread.sleep(4000);
        //Using Locator ------Partial link text-------
                //        driver.get("https://demoqa.com/links");
                //        driver.manage().window().maximize();
                //        Thread.sleep(500);
                //        WebElement partialHomeClick=driver.findElement(By.partialLinkText("Ho"));
                //        partialHomeClick.click();
                //        Thread.sleep(4000);
//Using Locator ------class name-------
                //        driver.get("https://demoqa.com/text-box");
                //        driver.manage().window().maximize();
                //        Thread.sleep(500);
                //        WebElement Name=driver.findElement(By.className("form-control"));
                //        Name.sendKeys("Dhaka");
                //        Thread.sleep(4000);
//Using Locator ------css selector name-------
                //        driver.get("https://demoqa.com/text-box");
                //        driver.manage().window().maximize();
                //        Thread.sleep(500);
                //        List<WebElement> Email=driver.findElements(By.cssSelector(".form-control"));
                //        Email.get(1).sendKeys("a@yopmail.com");
                //        Thread.sleep(4000);
//Using Locator ------tag name-------
        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();
        Thread.sleep(500);
        List<WebElement> Email=driver.findElements(By.cssSelector(".form-control"));
        Email.get(1).sendKeys("a@yopmail.com");
        Thread.sleep(4000);



    }
}
