import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Test {
    public static void main(String[] args) {

        WebDriver driver = null;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/test/radio.html");


        System.out.println("Title:" + driver.getTitle());
        System.out.println("current_URL:" + driver.getCurrentUrl());


        //ASSERTION
        Assert.assertEquals(driver.getTitle(), "Radio Button & Check Box Demo");
        //Assert.assertEquals(checkboxButtonList.size(),3);



        //MAXIMIZE THE WINDOW
        driver.manage().window().maximize();


        //SEARCHING FOR ELEMENT
        //WebElement radio2ndbutton = driver.findElement(By.xpath("//input[@id='vfb-7-2']"));
        // radio2ndbutton.click();
        //WebElement checkbox2ndbutton = driver.findElement(By.xpath("//input[@id='vfb-6-1']"));
        //checkbox2ndbutton.click();


        //COUNTING THE NO OF CHECK BOXES
        List<WebElement> checkboxButtonList = driver.findElements(By.xpath("//input[@type='checkbox']"));
        for (int i = 0; i < checkboxButtonList.size(); i++) {
            System.out.println(checkboxButtonList.get(i).getAttribute("value"));
        }
        System.out.println("Count of checkbox Buttons  " + checkboxButtonList.size());



        //driver.get("https://www.amazon.in/");
        // WebElement search = driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
        //search.sendKeys("mobile");
    }
    }

