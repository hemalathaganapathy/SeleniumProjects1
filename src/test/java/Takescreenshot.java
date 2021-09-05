import com.google.common.io.Files;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class Takescreenshot {

    public static void main(String[] args) throws IOException {

        String url = "http://WWW.google.com";
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);

        //Take screenshot

        TakesScreenshot Camera= ((TakesScreenshot) driver);
        File Screenshot = Camera.getScreenshotAs(OutputType.FILE);
        System.out.println(Screenshot.getAbsolutePath());
        Files.move(Screenshot, new File("src/main/resources/samplescreen.png"));



    }




}
