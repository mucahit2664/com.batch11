package day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HomeworkLoginTestUsingCss {
    /*
    1. Bir class oluşturun : Locators_css
2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
a
. Verilen web sayfasına gidin. http://a.testaddressbook.com/sign_in
b
. Locate email textbox
c
. Locate password textbox ve
d
. Locate signin button
e
. Asagidaki kullanıcı adını ve şifreyi girin ve sign in düğmesini tıklayın
i
. Username : testtechproed@gmail.com

. Password : Test1234
NOT: cssSelector kullanarak elementleri locate ediniz.
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\pc\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        //2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
        //a. Verilen web sayfasına gidin. http://a.testaddressbook.com/sign_in
        driver.get("http://a.testaddressbook.com/sign_in");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        //b. Locate email textbox
        WebElement emailTextBox=driver.findElement(By.cssSelector("input[placeholder='Email']"));
        //c. Locate password textbox ve
        WebElement passwordTextBox=driver.findElement(By.cssSelector("input[placeholder='Password']"));

        //d. Locate signin button

        WebElement signInButonu=driver.findElement(By.cssSelector("input[name='commit']"));


        //e. Asagidaki kullanıcı adını ve şifreyi girin ve sign in düğmesini tıklayın
        //i. Username : testtechproed@gmail.com
        //ii. Password : Test1234

        emailTextBox.sendKeys("testtechproed@gmail.com");
        passwordTextBox.sendKeys("Test1234!");
        signInButonu.click();
    }
}
