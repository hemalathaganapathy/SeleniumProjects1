import com.google.common.io.Files;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;

public class AlertsWait {
     // public static WebDriver driver = new ChromeDriver();

    public static void main(String[] args) throws InterruptedException, IOException,WebDriverException {
        //PropertySet();
        String url="https://demoqa.com/alerts";
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
     driver.findElement(By.id("timerAlertButton")).click();



        WebDriverWait wait= new WebDriverWait(driver,5);

       Alert alert = wait.until(ExpectedConditions.alertIsPresent());



        //Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        //driver.switchTo().alert().accept();
       /* TakesScreenshot Camera= ((TakesScreenshot) driver);
        File Image = Camera.getScreenshotAs(OutputType.FILE);
        System.out.println(Image.getAbsolutePath());
        Files.move(Image,new File("src/main/resources/Image1.png"));*/

        driver.close();



   }

   /* private static void PropertySet() {
         String url="https://demoqa.com/alerts";
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        driver.get(url);
    }*/
}
