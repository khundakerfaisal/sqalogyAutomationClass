import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class accessRolePassword {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("http://192.168.3.226:9090/web/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
        driver.findElement(By.id("login")).sendKeys("Admin");
        driver.findElement(By.id("password")).sendKeys("1234");
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@title=\"Home Menu\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div/a[@data-menu-xmlid=\"base.menu_administration\"]")).click();
        Thread.sleep(1000);

//        List<String> usernames = Arrays.asList(
//                "init.user", "hod.user", "hoit.user", "md.user", "cfo.user",
//                "gm.user", "scm.user", "shod.user", "commercial.user", "mrr.init.user",
//                "mrr.reviewer.user", "mrr.approver.user", "mr.init", "mr.approver",
//                "mi.init", "qc.init.user", "qc.approver.user", "hod.store", "ws.init"
//        );
        List<String> usernames = Arrays.asList(
                "init.user","hod.user", "hoit.user", "md.user"
        );
        for (String username:usernames){
            try {
                driver.findElement(By.xpath("//button[span[text()='Manage Users']]")).click();
                Thread.sleep(2000);
                WebElement toggleSearchBox = driver.findElement(By.xpath("//button/i[@title=\"Toggle Search Panel\"]"));
                toggleSearchBox.click();
                Thread.sleep(1500);
                WebElement inactiveUser = driver.findElement(By.xpath("//span[text()='Inactive Users']"));
                inactiveUser.click();
                Thread.sleep(1500);
                // Filter/search the user
                WebElement searchBox = driver.findElement(By.xpath("//input[@placeholder='Search...']"));
                searchBox.click();
                Thread.sleep(1000);
                searchBox.clear();
                searchBox.sendKeys(username);
                searchBox.sendKeys(Keys.ENTER);
                Thread.sleep(1500);
//                searchBox.sendKeys(Keys.ENTER);
//                Thread.sleep(1500);

                // Click the user from the list
                WebElement userLink = driver.findElement(By.xpath("//table//tr/td[@data-tooltip='" + username + "']"));
                userLink.click();
                Thread.sleep(1500);

                // Click on "Action" > Change Password (may differ based on view/layout)
                driver.findElement(By.xpath("//button/i[@data-tooltip='Actions']")).click();
                Thread.sleep(500);
                driver.findElement(By.xpath("//span[@role='menuitem' and text()='Unarchive']")).click();
                Thread.sleep(2000);

                WebElement allowedDepartment=driver.findElement(By.xpath("//div/input[@placeholder='Allowed Department']"));
                allowedDepartment.click();
                Thread.sleep(500);
                allowedDepartment.sendKeys(Keys.ARROW_DOWN);
                allowedDepartment.sendKeys(Keys.ARROW_DOWN);
                allowedDepartment.sendKeys(Keys.ARROW_DOWN);
                allowedDepartment.sendKeys(Keys.ARROW_DOWN);
                Thread.sleep(1000);
                allowedDepartment.sendKeys(Keys.ENTER);
                Thread.sleep(2000);

                WebElement Department=driver.findElement(By.xpath("//div/input[@placeholder='Department']"));
                Department.click();
//                Department.sendKeys("Administration:Operations - CCL");
                Thread.sleep(1000);
                Department.sendKeys(Keys.ENTER);
                Thread.sleep(2000);


                JavascriptExecutor js = (JavascriptExecutor) driver;
                js.executeScript("window.scrollBy(0,800)");
                Thread.sleep(500);
                if (username.contains("init.user")){
                    WebElement initiatorCheckbox = driver.findElement(By.id("in_group_192_1"));

                    // Check if it's not already selected before clicking
                    if (!initiatorCheckbox.isSelected()) {
                        initiatorCheckbox.click();
                    }
                }
                Thread.sleep(1000);
                if (username.contains("hod.user")){
                    WebElement hOdCheckbox = driver.findElement(By.id("in_group_194_1"));

                    // Check if it's not already selected before clicking
                    if (!hOdCheckbox.isSelected()) {
                        hOdCheckbox.click();
                    }
                }
                Thread.sleep(1000);
                if (username.contains("hoit.user")){
                    WebElement hoITCheckbox = driver.findElement(By.id("in_group_195_1"));

                    // Check if it's not already selected before clicking
                    if (!hoITCheckbox.isSelected()) {
                        hoITCheckbox.click();
                    }
                }
                Thread.sleep(1000);
                if (username.contains("md.user")){
                    WebElement mDCheckbox = driver.findElement(By.id("in_group_202_1"));

                    // Check if it's not already selected before clicking
                    if (!mDCheckbox.isSelected()) {
                        mDCheckbox.click();
                    }
                }
                Thread.sleep(1000);

                driver.findElement(By.xpath("//button/i[@data-tooltip='Actions']")).click();
                Thread.sleep(500);
                driver.findElement(By.xpath("//span[@role='menuitem' and text()='Change Password']")).click();
                Thread.sleep(1000);

                // Enter new password
                WebElement PasswordInputClick = driver.findElement(By.xpath("//td[@name='new_passwd']"));
                PasswordInputClick.click();
                Thread.sleep(1000);
                WebElement newPasswordInput = driver.findElement(By.xpath("//div/input[@type='password']"));
                newPasswordInput.click();
                Thread.sleep(500);
                newPasswordInput.clear();
                Thread.sleep(500);
                newPasswordInput.sendKeys("1234");
                Thread.sleep(500);

                // Confirm
                WebElement confirmButton = driver.findElement(By.xpath("//footer//button/span[text()='Change Password']"));
                confirmButton.click();

                // Go back to users list
                Thread.sleep(2000);
                driver.navigate().back();
                Thread.sleep(1000);
                driver.navigate().back();
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("Failed to update password for: " + username);
            }
        }

    }

}
