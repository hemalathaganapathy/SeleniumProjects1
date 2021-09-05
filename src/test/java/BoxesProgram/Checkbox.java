package BoxesProgram;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class  Checkbox {


        public static void main(String[] args) {

            WebDriver driver;
            String url = "http://the-internet.herokuapp.com/checkboxes";
            BaseClass baseClass = new BaseClass();
            baseClass.LaunchBrowser();
            baseClass.openUrl(url);
            baseClass.windowMaximise();
            baseClass.implicitlyWait();
            driver = BaseClass.driver1;
            WebElement checkbox1 =driver.findElement(By.xpath("//input[@type='checkbox'][1]"));
            WebElement checkbox2 =driver.findElement(By.xpath("//input[@type='checkbox'][2]"));
            //To select the checkbox
            if(checkbox2.isDisplayed() && checkbox2.isEnabled()){
                checkbox2.click();
            }
            else
            {
                System.out.println("Check box is either disabled or not displayed");
            }
//To deselect the option
            if(checkbox1.isSelected()){
                checkbox1.click();
            }




        }
    }


