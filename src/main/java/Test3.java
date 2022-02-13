import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Test3 {
    public static void main(String[] args) {

        WebDriver driver = null;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://demo.guru99.com/test/upload/");


//DELAY IN TIME
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id=\"uploadfile_0\"]")));


//UPLOADING FILE
        WebElement chooseFile = driver.findElement(By.xpath("//input[@id=\"uploadfile_0\"]"));
        chooseFile.sendKeys("C:\\Users\\REETWIKA\\OneDrive\\Documents\\Prolog");

        //SELECTING CHECKBOX
       WebElement Terms = driver.findElement(By.xpath("//input[@type=\"checkbox\"]"));
       Terms.click();

       //SELECTING SUBMIT BUTTON
        WebElement submit = driver.findElement(By.xpath("//button[@id='submitbutton']"));
        submit.click();

        //ASSERTION






    }
}
