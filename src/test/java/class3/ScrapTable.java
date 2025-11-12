package class3;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ScrapTable {
    @Test
    public void ScrapData() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/webtables");
        driver.manage().window().maximize();

        WebElement totalData = driver.findElement(By.className("rt-tbody"));

        List<WebElement> totalRowData = totalData.findElements(By.className("rt-tr-group"));
        System.out.println("==== TABLE DATA Start ====");
        for (WebElement row:totalRowData){
            List<WebElement> cellData=row.findElements(By.className("rt-td"));
            StringBuilder rowText = new StringBuilder();
            for (WebElement cell:cellData){
//                rowText.append(cell.getText()).append("|");
//                System.out.println(cell.getText());
            }
            System.out.println(rowText.toString().trim());
        }
        System.out.println("==== TABLE DATA END ====");
    }
}
