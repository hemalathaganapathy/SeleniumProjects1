package JavaSampleProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LocatorAssignment {

    public static void main(String[] args) throws InterruptedException {
       /* String url = "http://the-internet.herokuapp.com";

        System.setProperty("webserver.chrome.driver","src/main/resources/chromedriver.exe" );
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        //driver.getTitle();
        System.out.println(driver.getTitle());*/

        String url = "http://the-internet.herokuapp.com";
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        //WebDriver driver = new ChromeDriver();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        System.out.println(driver.getTitle());
        Thread.sleep(4000);
        driver.findElement(By.linkText("Shifting Content")).click();
        Thread.sleep(4000);
        driver.findElement(By.linkText(("Example 1: Menu Element"))).click();

        List<WebElement> menu = driver.findElements(By.tagName("li"));
        System.out.println("No.of Menus"+menu.size());
        for (int i=0;i<menu.size();i++)
        {
          //  System.out.printf("menu%s%n", menu.get(i).getText());
            System.out.println("menus"+menu.get(i).getText());
        }

    }
}
