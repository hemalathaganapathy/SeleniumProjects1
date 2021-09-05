package DifferentMethods;

import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

import static DifferentMethods.ReusableMethods.driver;

public class  CallingMethods {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("main method entry");
        ReusableMethods methods=new ReusableMethods();
        methods.PropertySet();
        methods.GetUrl();
        //driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.findElement(By.linkText("Today's Deals")).click();
        driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
        driver.navigate().back();
        driver.manage().timeouts().setScriptTimeout(30,TimeUnit.SECONDS);
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.navigate().refresh();
       // methods.BrowserQuit();
    }
}
