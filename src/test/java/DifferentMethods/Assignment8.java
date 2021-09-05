package DifferentMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Assignment8 {
    public static void main(String[] args) {
       String url="https://www.naukri.com/";

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        String firstwindow = driver.getWindowHandle();
       Set<String> windows = driver.getWindowHandles();
        System.out.println(windows.size());
        System.out.println("Windows opened: ");



        windows.forEach(System.out::println);

        for(String window: windows){
            System.out.println("Switching to window: "+window);
            driver.switchTo().window(window);
           // driver.close();
        }
        System.out.println("Current window title : "+driver.getTitle());
      //  driver.close();


        System.out.println("Switching to parent Windows" +firstwindow);
        driver.switchTo().window(firstwindow);



    }
}
