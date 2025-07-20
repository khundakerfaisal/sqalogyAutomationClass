import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class uploadAndDownloadClass {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/upload-download");
        driver.manage().window().maximize();
        Thread.sleep(500);
        WebElement srcFileUpload=driver.findElement(By.id("uploadFile"));
        Thread.sleep(500);
//        srcFileUpload.sendKeys("H:\\Desktop\\1752385269986.jpg");     //Upload from directory

//        String filePath="\\src\\test\\resources\\1752385269986.jpg";    //Upload from project root directory
//        String uploadData=System.getProperty("user.dir")+filePath;      //Create  Absolute path
//        System.out.println(uploadData);
//        srcFileUpload.sendKeys(uploadData);
//        Thread.sleep(500);
//        WebElement clickDownloadButton=driver.findElement(By.id("downloadButton"));
//        clickDownloadButton.click();
//        Thread.sleep(500);
        String filePath="\\src\\test\\resources\\1752385269986.jpg";
        String uploadFile=System.getProperty("user.dir")+filePath;
        srcFileUpload.sendKeys(uploadFile);
        Thread.sleep(500);




    }
}
