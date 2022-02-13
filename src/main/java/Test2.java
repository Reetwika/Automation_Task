import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Test2 {
    public static void main(String[] args) {

        WebDriver driver = null;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        //WebElement search = driver.findElement(By.cssSelector("input#twotabsearchtextbox"));
        //WebElement search1 = driver.findElement(By.cssSelector("input#nav-search-submit-button"));
        // search1.click();


        // List<WebElement> mobileList = driver.findElements(By.xpath("//span[@class ='a-size-medium a-color-base a-text-normal']\n"));
        // for (int i =0; i<mobileList.size();i++){
        //    System.out.println(mobileList.get(i).getText("value"));


        //System.out.println("Count of mobiles  " + mobileList.size());


        // }
        // System.out.println("Count of mobiles  " + mobileList.size());

        //SCROLL UPTO END
        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement scrollUpto = driver.findElement(By.xpath("//span[contains(text(),'Back')]"));
        js.executeScript("arguments[0].scrollIntoView();", scrollUpto);



    }
    }


