package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HomeworkSerachTest {
    /*  1. Bir class oluşturun : GoogleSearchTest
  2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
      a.google web sayfasına gidin. https://www.google.com/
              b. Search(ara) “city bike”
      c. Google'da görüntülenen ilgili sonuçların sayısını yazdırın
      d. “Shopping” e tıklayın.
      e. Sonra karşınıza çıkan ilk sonucun resmine tıklayın.
  */
    public static void main(String[] args) {
        // 1. Bir class oluşturun : GoogleSearchTest
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\pc\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // 2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
        //        a.google web sayfasına gidin. https://www.google.com/

        driver.navigate().to("https://www.google.com/");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //    b. Search(ara) “city bike”
        WebElement searchYapma = driver.findElement(By.name("q"));
        searchYapma.sendKeys("city bike");
        searchYapma.submit();
        // c. Google'da görüntülenen ilgili sonuçların sayısını yazdırın
        WebElement GORUNTULENLERINsAYISI = driver.findElement(By.id("result-stats"));
        System.out.println(GORUNTULENLERINsAYISI.getText());
//  d. “Shopping” e tıklayın.
        WebElement alisverisLinki = driver.findElement(By.linkText("Alışveriş"));
        alisverisLinki.click();
        //		e. Sonra karşınıza çıkan ilk sonucun resmine tıklayın.

        driver.findElement(By.id("srpresultimg_15970114592076028408_1_0")).click();

    }
}