import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class srapDataFromTable {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/webtables");
        driver.manage().window().maximize();
        WebElement tableData = driver.findElement(By.className("rt-tbody"));
        List<WebElement> tableRowAllData = tableData.findElements(By.cssSelector("[role=rowgroup]"));
        for (WebElement rows : tableRowAllData) {
            List<WebElement> tableAllCell = rows.findElements(By.className("rt-td"));
            for (WebElement cell : tableAllCell) {
                System.out.println(cell.getText());
            }
        }
    }
}
