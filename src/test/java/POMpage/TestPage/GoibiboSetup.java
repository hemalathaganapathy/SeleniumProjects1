package POMpage.TestPage;

import POMpage.POMBaseClass;
import POMpage.page1.HomePageGoibibo;
import POMpage.page1.HotelPageGoibibo;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoibiboSetup extends POMBaseClass {
    public GoibiboSetup(){
        PageFactory.initElements(driver,this);
    }



    @Test(priority = 1)
    public void navigate_to_hotelpage(){
        new HomePageGoibibo()
                 . Clickhotel();
        new HotelPageGoibibo()
                .Enableinternational();
        new HotelPageGoibibo().selectlocation("Amsterdam, Netherlands");
        new HotelPageGoibibo().guestroomclick();
        new HotelPageGoibibo().selectaddroom();
        new HotelPageGoibibo().selectdone();
    }



    //  @Test(priority = 2)
   // public void enter_search_hoteldetail(){
    //    new HotelPageGoibibo()
      //         .Enableinternational();
              // .selectlocation("Vienna")
               //.selectcheckindate(27)
               //.selectcheckoutdate(28)
                //.guestroomclick()
                //.selectaddroom()
                //.selectdone()
                //.selectsearchhotel();


    //}

}
