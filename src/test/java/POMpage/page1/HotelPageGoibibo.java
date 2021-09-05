package POMpage.page1;

import POMpage.POMBaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class HotelPageGoibibo extends POMBaseClass {


     @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div/section[1]/div[1]/div/div[1]/div[2]/input")
    public static WebElement international;

    @FindBy(xpath = "//*[@class=\"HomePageAutosuggeststyles__SearchInputStyles-sc-1v6s32j-1 euhecC\"]")
    public static WebElement location;

     @FindBy(xpath = " //*[@id=\"root\"]/div[2]/div/section[1]/div[1]/div/div[3]/div/div[1]/div/h4")
     public static WebElement checkindate;

    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div/section[1]/div[1]/div/div[3]/div/div[4]/div/h4")
    public static WebElement checkoutdate;

    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div/section[1]/div[1]/div[2]/div[4]/span")
    public static WebElement guestroom;

    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div/section[1]/div[1]/div[2]/div[4]/div/div/div/div[1]/div/span[2]")
    public static WebElement addroom;

    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div/section[1]/div[1]/div[2]/div[4]/div/div/div/div[2]/div/span[2]")
    public static WebElement addadult;

    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div/section[1]/div[1]/div[2]/div[4]/div/div/div/div[4]/button")
    public static WebElement donebutton;

    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div/section[1]/div[1]/div/button")
    public static WebElement searchhotel;

    public HotelPageGoibibo() {
                PageFactory.initElements(driver, this);
    }

    public void Enableinternational() {
        international.isDisplayed();
        international.click();
       // location.sendKeys("Amsterdam, Netherlands");
       // searchhotel.click();


    }

    public void selectlocation(String arg1){
        location.sendKeys(arg1);
    }

    public void selectcheckindate(int arg1){
        Select checkindate1;
        checkindate1 = new Select(checkindate);
        //Select checkindate1 = new Select(driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/section[1]/div[1]/div[2]/div[3]/div/div[1]/div[1]/h4")));
        checkindate1.selectByIndex(arg1);

    }
    public void selectcheckoutdate(int arg1){
        Select chechoutdate1 = new Select(driver.findElement((By.xpath("//*[@id=\"root\"]/div[2]/div/section[1]/div[1]/div/div[3]/div/div[4]/div/h4"))));
        chechoutdate1.selectByIndex(arg1);
    }
    public void guestroomclick(){
        guestroom.click();
    }
    public void selectaddroom(){
        addroom.click();
    }
    public void selectdone(){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        donebutton.click();
    }
    public void selectsearchhotel(){
        searchhotel.click();

    }
}
