package POMpage.page1;

import POMpage.POMBaseClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageGoibibo extends POMBaseClass {

    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/header/ul/li[2]/a")
    WebElement Hotellink;

    public HomePageGoibibo(){
              PageFactory.initElements(driver,this);
    }

    public void Clickhotel(){
        System.out.println("Hotel link is selected");
        Hotellink.click();
    }
}
