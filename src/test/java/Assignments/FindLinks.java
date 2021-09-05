package Assignments;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class FindLinks {
    public static void main(String[] args) throws InterruptedException, IOException, AWTException {
       //String url="https://www.google.com/";
        //System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
      //  String url="https://the-internet.herokuapp.com/";
        String url="http://www.leafground.com/pages/Alert.html";
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/button")).click();

        /*----------------------------------------------------*/
       /* Finding no of links in google page
        List<WebElement> links=driver.findElements(By.tagName("a"));
        System.out.println("No Of Links"+links.size());
        for(int i=0;i<links.size();i++)
        {
            System.out.println("links" +links.get(i).getText());
        }
        driver.findElement(By.linkText("Terms")).click();*/
        /*----------------------------------------------------*/

        /* finding links in search box*/

    /* WebElement searchbox=driver.findElement(By.name("q"));
        searchbox.sendKeys("Agni");
        Thread.sleep(2000);
        List<WebElement> searchlinks=driver.findElements(By.xpath("//ul[@role=\"listbox\"]"));*/


        /* Print the no of links in search box
       for(WebElement i:searchlinks) {
            System.out.println("No of Links are:" + i.getText());
        }*/


       /*Click the selected link in search box
       for(WebElement i:searchlinks) {
            String text=i.getText();
            System.out.println("Text:"+text);
            if(text.equals("Agnisakshi"));
            {
                i.click();
                break;
            }
        }*/
        /*-----------------------------------------*/

        /*Take Screen Shots
        TakesScreenshot screenshot=(TakesScreenshot)driver;
        File sourcefile=screenshot.getScreenshotAs(OutputType.FILE);
        File destinationfile=new File("C:\\Users\\Thirumal\\IdeaProjects\\DemoDay1\\src\\main\\resources\\screen1.png");
        //FileHandler.copy(sourcefile,destinationfile);
        FileUtils.copyFile(sourcefile,destinationfile);*/

        /*Take screen shot using Robot class*/

        Robot robot=new Robot();
        Dimension screenSize=Toolkit.getDefaultToolkit().getScreenSize();
        Rectangle rectangle=new Rectangle(screenSize);
        BufferedImage source= robot.createScreenCapture(rectangle);
        File destination=new File("C:\\Users\\Thirumal\\IdeaProjects\\DemoDay1\\src\\main\\resources\\screen11.png");
        ImageIO.write(source,"png",destination);

        driver.switchTo().alert().accept();
        driver.close();




    }

}
