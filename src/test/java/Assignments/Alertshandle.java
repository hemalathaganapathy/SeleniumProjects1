package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;

public class Alertshandle {
    public static void main(String[] args) throws InterruptedException {
        String url="http://www.leafground.com";
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[9]/a/img")).click();
        System.out.println("Alert Image is clicked");
       /* driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/button")).click();
        driver.switchTo().alert().accept();*/
      //driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button")).click();
        //driver.switchTo().alert().dismiss();
        driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/button")).click();
        driver.switchTo().alert().sendKeys("Hello im Hema");
        Thread.sleep(2000);
        driver.switchTo().alert().accept();

        String actualText=driver.findElement(By.id("result1")).getText();
        System.out.println("Result--->"+actualText);


    }
}
