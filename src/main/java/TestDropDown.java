import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestDropDown {
    public static void main(String[] args) {

        WebDriver driver = null;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/newtours/register.php\n");

        Select Country = new Select(driver.findElement(By.name("country")));
        //Country.selectByVisibleText("AUSTRIA");
        //Country.selectByIndex(2);
        Country.selectByValue("INDIA");
        WebElement firstname = driver.findElement(By.xpath("//input[@name='firstName']"));
        firstname.sendKeys("Reetwika");

        WebElement lastname = driver.findElement(By.xpath("//input[@name='lastName']"));
        lastname.sendKeys("Bandyopadhyay");

        WebElement phone = driver.findElement(By.xpath("//input[@name='phone']"));
        phone.sendKeys("9874350494");

        WebElement userName = driver.findElement(By.xpath("//input[@name='userName']"));
        userName.sendKeys("abc@gmail.com");

        WebElement address1 = driver.findElement(By.xpath("//input[@name='address1']"));
        address1.sendKeys("Nabagram,Konnagar");

        WebElement city = driver.findElement(By.xpath("//input[@name='city']"));
        city.sendKeys("Konnagar");

        WebElement state = driver.findElement(By.xpath("//input[@name='state']"));
        state.sendKeys("WB");

        WebElement postalCode = driver.findElement(By.xpath("//input[@name='postalCode']"));
        postalCode.sendKeys("712246");

        WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
        email.sendKeys("abc@gmail.com");

        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        password.sendKeys("12345678");

        WebElement confirmPassword = driver.findElement(By.xpath("//input[@name='confirmPassword']"));
        confirmPassword.sendKeys("12345678");

        WebElement submit = driver.findElement(By.xpath("//input[@name='submit']"));
        submit.click();

    }
}





