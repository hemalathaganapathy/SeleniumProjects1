package BoxesProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseClass {
    public static WebDriver driver1;

    public  void LaunchBrowser(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver1= new ChromeDriver();
        driver1.manage().window().maximize();
    }
    public void openUrl(String url){
        driver1.get(url);
    }

    public void windowMaximise(){
        driver1.manage().window().maximize();
    }

    public void implicitlyWait(){
        driver1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public void enterTextByName(String locator, String text){
        driver1.findElement(By.name(locator)).sendKeys(text);
    }
    public void enterTextById(String locator, String text){
        driver1.findElement(By.id(locator)).sendKeys(text);
    }

    public void clickButtonByXpath(String locator){
        driver1.findElement(By.xpath(locator)).click();
    }
}

