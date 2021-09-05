package JavaSampleProgram;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowsHandle {


    public static class WindowHandles {
        static WebDriver driver;

        public static void launchBrowser() {
            System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
            driver = new ChromeDriver();
        }

        public static void goToURL(String url) {
            driver.get(url);
        }

        public static void clickButtonById(String locator) {
            driver.findElement(By.id(locator)).click();
        }

        public static void main(String[] args) {
//        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://demoqa.com/browser-windows");
//        driver.findElement(By.id("windowButton")).click();
//        Set<String> windows= driver.getWindowHandles();
//        System.out.println(windows.size());
//        System.out.println("Window handles");
////        windows.forEach(System.out::println);
//        for(String window: windows){
//            System.out.println("Switching to window: "+window);
//            driver.switchTo().window(window);
//        }
//        System.out.println("Current window title : "+driver.getTitle());
//        System.out.println(driver.findElement(By.id("sampleHeading")).getText());
//        driver.quit();

            launchBrowser();
            goToURL("https://demoqa.com/browser-windows");
            String mainWindow = driver.getWindowHandle();
            clickButtonById("windowButton");
            clickButtonById("tabButton");
//        clickButtonById("messageWindowButton");
            Set<String> windows = driver.getWindowHandles();
            System.out.println(windows.size());
            System.out.println("Windows opened: ");
            windows.forEach(System.out::println);


            for (String window : windows) {
                System.out.println("Switching to the next tab");
                System.out.println(window);
                driver.switchTo().window(window);
//            System.out.println(driver.findElement(By.id("sampleHeading")).isDisplayed());
            /*if(driver.findElement(By.id("sampleHeading")).isDisplayed()) {
                System.out.println(driver.findElement(By.id("sampleHeading")).getText());
            }
            else{
                System.out.println("Element not present in this page");
            }*/
//            if(driver.getTitle().equals("")){
//                break;
//            }
            }

            driver.switchTo().window(mainWindow);
//        driver.close();
           // driver.quit();
        }

    }
}
