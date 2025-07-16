import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.text.DateFormat;
import java.time.LocalDate;

public class selectDateClass {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        //Windows scrolling
        driver.get("https://demoqa.com/date-picker");
        driver.manage().window().maximize();
        WebElement dateSelect=driver.findElement(By.id("datePickerMonthYearInput"));
        dateSelect.sendKeys(Keys.CONTROL+"a");
        dateSelect.sendKeys(Keys.BACK_SPACE);
        LocalDate targetDate=LocalDate.now();
       // System.out.println(targetDate);
        dateSelect.sendKeys(targetDate.toString());
        dateSelect.sendKeys(Keys.ENTER);
        Thread.sleep(2000);

    }
}
