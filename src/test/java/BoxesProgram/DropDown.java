package BoxesProgram;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDown {

    public static void main(String[] args) {
        WebDriver driver;
        String url = "  ";
        BaseClass baseClass = new BaseClass();
        baseClass.LaunchBrowser();
        baseClass.openUrl(url);
        baseClass.windowMaximise();
        baseClass.implicitlyWait();
        baseClass.clickButtonByXpath("//a[text()='Create New Account']");
        baseClass.enterTextByName("firstname","Firstname");
        baseClass.enterTextByName("lastname","Lastname");
        baseClass.enterTextByName("reg_email__","email@abc.com");
        baseClass.enterTextById("password_step_input","admin");
        driver = BaseClass.driver1;
        Select dayDropDown = new Select(driver.findElement(By.id("day")));

        Select selectDropDown = new Select(driver.findElement(By.id("year")));
        List<WebElement> dropDownList = dayDropDown.getOptions(); //To get the drop down values/options
        //Iterate thro the list
        for(WebElement dropDown:dropDownList){
            System.out.println(dropDown.getText());
        }
        /**
         * Select by index
         * Select by value
         * Select by visible text
         */
        dayDropDown.selectByIndex(27);
        selectDropDown.selectByValue("2012");
        Select monthDropDown = new Select(driver.findElement(By.id("month")));
        monthDropDown.selectByVisibleText("Aug");
        //For validation purpose
        System.out.println(monthDropDown.getFirstSelectedOption().getText()); //To view the selected option


        WebElement radioBtn = baseClass.driver1.findElement(By.xpath("(//input[@name='sex'])[3]"));
        if(radioBtn.isDisplayed()) {
            System.out.println("Radio button is displayed");
            radioBtn.click();
        }
        else{
            System.out.println("Radio button not displayed");
        }
        WebElement radioBtnFemale = baseClass.driver1.findElement(By.xpath("(//input[@name='sex'])[1]"));
        if(radioBtnFemale.isSelected()){
            System.out.println("Radio button is selected after the click event");
        }
        else
        {
            System.out.println("Radio button is not selected after the click event");
        }

        if(radioBtnFemale.isEnabled()){
            radioBtnFemale.click();
            System.out.println(radioBtnFemale.getText());
        }

    }
}
