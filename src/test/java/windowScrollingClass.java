import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowScrollingClass {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        //Windows scrolling
        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();
        Thread.sleep(500);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,600)"); // Scroll down by 600 pixels
        Thread.sleep(500);
        js.executeScript("window.scrollTo(0,0)");   // Scroll to top by 0 pixels
        Thread.sleep(500);
        WebElement currentAddress=driver.findElement(By.xpath("//input[@placeholder=\"Full Name\"]")); // Scroll to the focus element
        js.executeScript("arguments[0].scrollIntoView(true)",currentAddress);




    }
}
