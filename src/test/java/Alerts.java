import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts{
    public static void main(String[] args) throws InterruptedException {
        String url = "http://the-internet.herokuapp.com/";
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
      /*  // Sweet alert
        driver.findElement(By.linkText("JavaScript Alerts")).click();
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).click();
        driver.switchTo().alert().accept();*/

        //Confirmation alert
        //accept

       /* driver.findElement((By.linkText("JavaScript Alerts"))).click();
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button")).click();
        driver.switchTo().alert().accept();

        String actualText = driver.findElement(By.id("result")).getText();
        System.out.println(""+actualText);*/

        //Dismiss
       /* driver.findElement(By.linkText("JavaScript Alerts")).click();
        driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
        driver.switchTo().alert().dismiss();
        String actualText = driver.findElement(By.id("result")).getText();
        System.out.println(""+actualText);*/


        //prompt
       driver.findElement(By.linkText("JavaScript Alerts")).click();
        driver.findElement((By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button"))).click();
       /* driver.switchTo().alert().sendKeys("hello");
        Thread.sleep((2000));
        driver.switchTo().alert().accept();*/

        driver.switchTo().alert().dismiss();

        String actualText = driver.findElement(By.id("result")).getText();
        String expectedText = " Entered null";

        if(actualText.equals(expectedText))
        {
            System.out.println("Alert Clicked successfully");
        }
        else {
            System.out.println("you clicked wrongly");
        }











    }
}
