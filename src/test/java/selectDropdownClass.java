import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.sql.Driver;

public class selectDropdownClass {


    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/select-menu");
        driver.manage().window().maximize();
//        Select colurSelect=new Select(driver.findElement(By.id("oldSelectMenu")));
//        colurSelect.selectByVisibleText("Green");
//        colurSelect.selectByIndex(3);

        Select multiSelect= new Select(driver.findElement(By.name("cars")));
        if (multiSelect.isMultiple()){
            multiSelect.selectByVisibleText("Volvo");
            multiSelect.selectByVisibleText("Audi");
        }
        Thread.sleep(5000);

    }
}
