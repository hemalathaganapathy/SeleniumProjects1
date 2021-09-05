package Excelproject;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class OrangeHRMClass  {

        /**
         * search User
         --- Precondition -
         * launch browser
         * NAvigate to application
         * Login
         * Navigate to users tab
         -- Test - searchUser
         --- Post condition - Logout, Quit application
         */

        private WebDriver driver;
        private String url;
        private String username;
        private String password;
        private WebDriverWait wait;

        By locUserName = By.id("txtUsername");
        By locPassword = By.id("txtPassword");
        By locLoginBtn = By.id("btnLogin");

        By locAdminCollapse = By.xpath("//span[normalize-space() = 'Admin']");
        By locUserManagementCollapse = By.xpath("//span[normalize-space() = 'User Management']");
        By locUsersCollapse = By.xpath("//span[normalize-space() = 'Users']");

        //Users locators
        By locUsersTable = By.xpath("//table[@class='highlight bordered']");
        By locFilterBtn = By.xpath("//a[@class='tooltipped circle']/i[@class='material-icons']");

        //Modal locators
        By locModalTitle = By.xpath("//div[@id='systemUser_list_search_modal']/h4");
        By locModalUsername = By.id("systemuser_uname_filter");

        By locSearchButton = By.xpath("//div[@class='modal-footer']/a[normalize-space()='Search']");

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        @BeforeSuite
        public void setProperties(){
            System.out.println("Setting the properties");
            System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
            setUrl("https://orangehrm-demo-6x.orangehrmlive.com/auth/login");
            setUsername("admin");
            setPassword("admin123");
        }

        @BeforeTest
        public void openBrowser(){
            System.out.println("OPening the browser");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }

        @BeforeClass
        public void launchApp(){
            System.out.println("Launching the application ....");
            driver.get(getUrl());

        }

        @BeforeMethod
        public void login(){
            System.out.println("Logging into application ....");
            driver.findElement(locUserName).clear();
            driver.findElement(locUserName).sendKeys(getUsername());
            driver.findElement(locPassword).clear();
            driver.findElement(locPassword).sendKeys(getPassword());
            driver.findElement(locLoginBtn).click();
        }

        public void navigateToUsers(){
            driver.findElement(locAdminCollapse).click();
            driver.findElement(locUserManagementCollapse).click();
            driver.findElement(locUsersCollapse).click();
        }

        @Test
        public void searchUser(){
            navigateToUsers();
            wait = new WebDriverWait(driver,60);
            wait.until(ExpectedConditions.visibilityOfElementLocated(locUsersTable));
            wait.until(ExpectedConditions.presenceOfElementLocated(locFilterBtn));
            driver.findElement(locFilterBtn).click();
            String expectedText="Filter Users";
            String actualModalTitle = driver.findElement(locModalTitle).getText();
        /*if(actualModalTitle.equalsIgnoreCase("Filter Users")) {
        //One way of writing assertion
        }*/
            Assert.assertEquals(actualModalTitle,expectedText,"Modal title doesn't macth");

            String searchText = "alice";
            driver.findElement(locModalUsername).sendKeys(searchText);
            driver.findElement(locSearchButton).click();
        }

        @Test
        public void addUser(){
            System.out.println("Another add user test");
            //Write your code
        }

        @AfterMethod
        public void logout(){
            //Write your code
        }


}
