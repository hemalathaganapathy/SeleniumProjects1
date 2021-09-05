package SampleAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class irctcAssignment {
    public static void main(String[] args) throws InterruptedException{


        String url = "https://www.irctc.co.in/nget/train-search";
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.findElement(By.xpath("/html/body/app-root/app-home/div[1]/app-header/p-dialog[2]/div/div/div[2]/div/form/div[2]/button")).click();

       /* Select fromdropdown=new Select(driver.findElement(By.xpath("/html/body/app-root/app-home/div[3]/div/app-main-page/div/div/div[1]/div[1]/div[1]/app-jp-input/div/form/div[2]/div[1]/div[1]/p-autocomplete/span/input")));
        List<WebElement> dropdownlist = fromdropdown.getOptions();
        for (WebElement i:dropdownlist)
        {
            System.out.println(i.getText());
        }*/
        WebElement fromdropdown=driver.findElement(By.xpath("//input[@type='text']"));
        fromdropdown.sendKeys("MAS");

        WebElement todropdown=driver.findElement(By.xpath("//input[@class='ng-tns-c58-9 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted']"));
        todropdown.sendKeys("PUNE");

        WebElement checkbox=driver.findElement(By.xpath("//*[@id=\"divMain\"]/div/app-main-page/div/div/div[1]/div[1]/div[1]/app-jp-input/div/form/div[4]/div/span[3]/label"));
        checkbox.click();

    }
}