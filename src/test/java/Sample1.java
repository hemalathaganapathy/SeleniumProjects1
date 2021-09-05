import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class Sample1 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Firefox browser
//        System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");
//        WebDriver driver = new FirefoxDriver();

        //IE browser
//        System.setProperty("webdriver.ie.driver", "src/main/resources/IEDriverServer.exe");
//        DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
//        caps.setCapability("ignoreZoomSetting", true);
//        WebDriver driver = new InternetExplorerDriver(caps);


        //Maximise window

//        Step2: Navigate to https://www.google.com
        driver.manage().deleteAllCookies(); //To delete all cookies
//
        driver.manage().window().maximize(); //To maximize the window
        Dimension dim = driver.manage().window().getSize(); //To get the size of the window
        System.out.println(dim.getHeight()+ " " +dim.getWidth());
        System.out.println(dim.toString());
        driver.get("https://www.google.com");

//        Step3: Get window title and check whether window title matches "Google"
        String title = driver.getTitle(); //To get window title
        System.out.println("Title of the page:" + title);
        //Assertion
        if (title.equals("Google1")) {
            System.out.println("Title matches");
        } else {
            System.out.println("Title doesn't match");
        }
        //Step4: Close the browser
       // driver.quit(); //Quit the browser window
          driver.close();

    }

    }


