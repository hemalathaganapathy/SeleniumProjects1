package JavaSampleProgram;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Locators {

    public static void main(String[] args) throws InterruptedException {
        String url = "http://WWW.google.com";
        //String url = "http://the-internet.herokuapp.com";
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        //WebDriver driver = new ChromeDriver();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        System.out.println(driver.getTitle());

       List<WebElement> links = driver.findElements(By.tagName("a"));

       System.out.println("No.of links" +links.size());

        for ( int i=0;i<links.size();i++)
        {
            System.out.println("links" + links.get(i).getText());
        }

        driver.findElement(By.linkText("Privacy")).click();
      /*  links = driver.findElements(By.tagName("a"));
        System.out.println("The No.of Links in this page" +links.size());
        for(int i=0;i<= links.size();i=i+1)
        {
            System.out.println("No of links " + i +links.get(i).getText());
        }
      */








       // driver.manage().deleteAllCookies();
      //  driver.quit();
      // driver.findElement(By.linkText("url")).click();

        //System.out.println(driver.findElementsByTagName("a").length);

      /* List<WebElement>  links;
        links = driver.findElements(By.tagName("a"));
        System.out.println(+links.size());
        for(int i=0; i< links.size();i++)
            System.out.println(links.get(i).gettext());*/



    }
}

