package TestNGSampleProgram;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class ExcelReaderSample {

    private static WebDriver driver;
    @BeforeMethod
    public void launchingBrowser() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        String url = "https://www.google.com/";

        driver.get(url);
        System.out.println("Launching The Browser");

        //driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
    @Test
public void validationExcelFile() throws IOException, InvalidFormatException {
        String searchText = readFile("Sheet1",1,1);
        driver.findElement(By.name("q")).sendKeys(searchText);
        driver.findElement(By.name("btnK")).click();
        System.out.println("Fetching Data From Excel File");

    }
    public static String readFile(String sheetName,int rowNum,int colNum) throws IOException, InvalidFormatException {
        File file=new File("src/main/resources/Testdata.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(file);

        XSSFSheet sheet=workbook.getSheet(sheetName);
        XSSFRow row=sheet.getRow(rowNum);
        String cellData=row.getCell(colNum).getStringCellValue();

        return cellData;

    }

    @AfterMethod
    public void CloseBrowser(){
        System.out.println("closing the page");
        driver.close();
    }
}
