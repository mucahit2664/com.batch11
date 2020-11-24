package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\pc\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
//youtube anasayfasina gitmeliyim
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.youtube.com/");
//Amazo sayfasina gidelim
        driver.navigate().to("https://www.amazon.com/");
        //Tekrar Youtube sayfasina gidelim
        driver.navigate().back();
        //Yeniden Amazon sayfasina gidelim
        driver.navigate().forward();
        //Sayfayi refresh yapalim
        driver.navigate().refresh();
        //5.sayfayi tam ekran yapalim
        driver.manage().window().maximize();
        Thread.sleep(5000);//boyle yazinca 5 saniye bekler

        driver.close();




    }

}
