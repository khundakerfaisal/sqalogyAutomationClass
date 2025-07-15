import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.awt.*;
import java.time.Duration;
import java.util.List;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class clickOnDiffButton {
    WebDriver driver;

    @BeforeAll
    public void setup(){

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
    }

    @Test
    public void visitUrl() throws InterruptedException {

        driver.get("https://demoqa.com/buttons");
        driver.manage().window().maximize();
        Thread.sleep(500);

        Actions action = new Actions(driver);
        List<WebElement> doubleClickButton = driver.findElements(By.cssSelector("button"));
        action.doubleClick(doubleClickButton.get(1)).perform();
        Thread.sleep(500);
        String text= driver.findElement(By.id("doubleClickMessage")).getText();
        Assertions.assertTrue(text.contains("You have done a double click"));

        List<WebElement> RightClickButton = driver.findElements(By.cssSelector("button"));
        action.contextClick(RightClickButton.get(2)).perform();
        Thread.sleep(500);
        String text2= driver.findElement(By.id("rightClickMessage")).getText();
        Assertions.assertTrue(text2.contains("You have done a right click"));

        List<WebElement> clickButton = driver.findElements(By.cssSelector("button"));
        action.click(clickButton.get(3)).perform();
        Thread.sleep(2000);
        String text3= driver.findElement(By.id("dynamicClickMessage")).getText();
        Assertions.assertTrue(text3.contains("You have done a dynamic click"));
    }

    @AfterAll
    public void close() {
        driver.quit();

    }
}
