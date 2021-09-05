package DifferentMethods;

//import com.sun.org.apache.xpath.internal.operations.String;
import com.google.common.io.Files;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;


public class ReusableMethods {

    public static WebDriver driver ;



    public void PropertySet(){

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver= new ChromeDriver();
        driver.manage().window().maximize();
    }
    public void GetUrl() {
        String url = "http://WWW.Amazon.in";
        driver.get(url);
    }
    public void GetUrl1(){
        String url="https://www.naukri.com/";
        driver.get(url);
    }
    public void BrowserQuit(){

        driver.quit();
    }
    public void AlertAccept(){
        //driver.findElement(By.linkText("Today's Deals")).click();
        System.out.println("Enter in to alertaccept method");
        driver.findElement(By.xpath("//*[@id=\"nav-signin-tooltip\"]/div/a")).click();
        System.out.println("Entered the start here link");


    }
    public void Screenshot() throws IOException {
        TakesScreenshot Camera= ((TakesScreenshot) driver);
        File Screenshot = Camera.getScreenshotAs(OutputType.FILE);
        System.out.println(Screenshot.getAbsolutePath());
        Files.move(Screenshot, new File("src/main/resources/samplescreen1.png"));
    }
    public void PageNavigation(){
        driver.findElement(By.linkText("Today's Deals")).click();
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();

    }
   /* public void ClickLink(java.lang.String locator){

        driver.findElement(By.xpath(locator)).click();
    }*/

    public static void main(String[] args) throws IOException {
        ReusableMethods obj = new ReusableMethods();
        obj.PropertySet();
        obj.GetUrl();
        obj.Screenshot();


       /*obj.ClickLink("//*[@id=\"nav-xshop\"]/a[2]");
       obj.ClickLink("//*[@id=\"nav-xshop\"]/a[4]");
        Set<java.lang.String> window=driver.getWindowHandles();
        System.out.println(window.size());
        System.out.println("Windows opened: ");
        window.forEach(System.out::println);*/




       obj.AlertAccept();
      // obj.PageNavigation();


       // obj.BrowserQuit();


    }



}
