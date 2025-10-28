package automationClassPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.LocalDate;

public class HandleDate {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        //Windows scrolling
        driver.get("https://demoqa.com/date-picker");
        driver.manage().window().maximize();
        WebElement dateSelect=driver.findElement(By.id("datePickerMonthYearInput"));
        dateSelect.sendKeys(Keys.CONTROL+"a");
        dateSelect.sendKeys(Keys.BACK_SPACE);
        LocalDate date=LocalDate.now();
        dateSelect.sendKeys(date.toString());
        dateSelect.sendKeys(Keys.ENTER);

    }
}
