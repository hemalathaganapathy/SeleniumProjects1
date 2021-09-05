package Day15;
import BoxesProgram.BaseClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class WebTable {
    public static void main(String[] args) {
        WebDriver driver;
        String url = "http://the-internet.herokuapp.com/tables";
        BaseClass baseClass = new BaseClass();
        baseClass.LaunchBrowser();
        baseClass.openUrl(url);
        baseClass.windowMaximise();
        baseClass.implicitlyWait();
        driver = baseClass.driver1;

        WebElement table=driver.findElement(By.xpath("//*[@id=\"table1\"]/thead"));
        System.out.println(table.getText());

        List<WebElement> columns=driver.findElements(By.xpath("//*[@id=\"table1\"]/thead/tr/td"));
        System.out.println("Total column size: "+columns.size());

    }

}
