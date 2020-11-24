package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IlkSeleniumTesti {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\pc\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.youtube.com");
        //navigate kullandigimiz zaman o yolu aklinda tututuyor
        driver.manage().window().maximize();//pencereyi tam sayfa yapiyor
        driver.navigate().refresh();//sayfayi aciyor daha sonra sayfayi yeniliyor
        driver.navigate().to("https://www.google.com");//sayfayi aciyor youtube gidiyor sayfayi yeniliyor sonra gogle gerigdiyor
        driver.navigate().back();//youtube geri donyor
        //driver.close();//sadece calisilan browseri  kapatir
             driver.quit();//acik olan tum browser`leri  kapatir

        }
    }

