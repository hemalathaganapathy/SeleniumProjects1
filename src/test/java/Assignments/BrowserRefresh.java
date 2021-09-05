package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.event.KeyEvent;

public class BrowserRefresh {
    public static void main(String[] args) throws AWTException {
        String url="https://www.google.com/";
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        driver.findElement(By.name("q")).sendKeys("agni" + Keys.ENTER);
       // driver.navigate().refresh();

        //driver.get(driver.getCurrentUrl());

        /*JavascriptExecutor executor=(JavascriptExecutor)driver;
        executor.executeScript("history.go(0)");*/

        /*Robot robot=new Robot();
        robot.keyPress(KeyEvent.VK_5);
        robot.keyRelease(KeyEvent.VK_5);*/

        driver.manage().window().maximize();
        Dimension dimension=new Dimension(1366,768);
        driver.manage().window().setSize(dimension);


    }
}
