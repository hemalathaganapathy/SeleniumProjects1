package BoxesProgram;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.ui.Select;



public class TamilCalender {
    public static void main(String[] args) {
        WebDriver driver;
        String url = "https://www.tamildailycalendar.com/tamil_daily_calendar.php";
        BaseClass baseClass = new BaseClass();
        baseClass.LaunchBrowser();
        baseClass.openUrl(url);
        baseClass.windowMaximise();
        baseClass.implicitlyWait();
         driver=BaseClass.driver1;
         Select dropdown= new Select(driver.findElement(By.id("day")));
         Select monthdropdown=new Select(driver.findElement(By.id("month")));
         Select yeardropdown=new Select(driver.findElement(By.name("year")));


         dropdown.selectByIndex(22);
         monthdropdown.selectByValue("2021");
         yeardropdown.selectByVisibleText("June");
         System.out.println(monthdropdown.getFirstSelectedOption().getText());
         driver.findElement(By.xpath("/html/body/div/div/div/table[1]/tbody/tr[4]/td/div/input")).click();
    }
}
