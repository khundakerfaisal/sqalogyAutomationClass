import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.security.Key;
import java.sql.Driver;
import java.time.LocalDate;

public class selectDropdownClass {


    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
//        driver.get("https://demoqa.com/date-picker");
        driver.get("https://demoqa.com/select-menu");
        driver.manage().window().maximize();


            //Select Dropdown Value
//        Select colurSelect=new Select(driver.findElement(By.id("oldSelectMenu")));
//        colurSelect.selectByVisibleText("Green");
//        colurSelect.selectByIndex(3);
            //Select MultiDropdown
//        Select multiSelect= new Select(driver.findElement(By.name("cars")));
//        if (multiSelect.isMultiple()){
//            multiSelect.selectByVisibleText("Volvo");
//            multiSelect.selectByVisibleText("Audi");
//        }
            //select value from data
//        driver.findElements(By.cssSelector(".css-1hwfws3")).get(0).click();
//        Actions action=new Actions(driver);
//        action.sendKeys(Keys.ARROW_DOWN).perform();
//        action.sendKeys(Keys.ENTER).perform();
//        Thread.sleep(5000);
        Select oldColurSelect=new Select(driver.findElement(By.id("oldSelectMenu")));
        oldColurSelect.selectByIndex(2);
        oldColurSelect.selectByIndex(3);
        Thread.sleep(500);
        String actualText=driver.findElement(By.id("oldSelectMenu")).getText();
        Assertions.assertTrue(actualText.contains("Yellow"));
        Thread.sleep(1000);

    }
}
